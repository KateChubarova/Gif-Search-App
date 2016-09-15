package com.ekaterinachubarova.gifsearchapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.ekaterinachubarova.gifsearchapp.R;
import com.ekaterinachubarova.gifsearchapp.activity.GifActivity;
import com.ekaterinachubarova.gifsearchapp.adapter.RVAdapter;
import com.ekaterinachubarova.gifsearchapp.adapter.RecyclerItemClickListener;
import com.ekaterinachubarova.gifsearchapp.rest.model.Gif;
import com.ekaterinachubarova.gifsearchapp.rest.model.GifsLab;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


import com.ekaterinachubarova.gifsearchapp.rest.api.GifService;
import com.koushikdutta.ion.Ion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ekaterinachubarova on 13.09.16.
 */
public class RecyclerViewFragment extends Fragment{
    @BindView(R.id.rv)
    RecyclerView recyclerView;
    private RVAdapter rvAdapter;
    private GifsLab gifsLab = new GifsLab();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.recyclerview_fragment, parent, false);
        ButterKnife.bind(this, v);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {

                        Intent intent = new Intent(getActivity(), GifActivity.class);
                        intent.putExtra(GifFragment.GIF_PARS, gifsLab.getData().get(position));
                        startActivity(intent);
                    }

                    @Override public void onLongItemClick(View view, int position) {
                    }
                })
        );

        return v;
    }


    @Override
    public void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GifService gifService = GifService.retrofit.create(GifService.class);
        Call<GifsLab> call = gifService.repoGifs();

        call.enqueue(new Callback<GifsLab>() {
            @Override
            public void onResponse(Call<GifsLab> call, Response<GifsLab> response) {
                gifsLab.setData(response.body().getData());
                rvAdapter = new RVAdapter(gifsLab.getData(), getActivity());
                recyclerView.setAdapter(rvAdapter);

            }
            @Override
            public void onFailure(Call<GifsLab> call, Throwable t) {
                Toast.makeText(getActivity(), "Please, try again", Toast.LENGTH_LONG).show();
            }
        });
        setHasOptionsMenu(true);

    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu, menu);


        final MenuItem item = menu.findItem(R.id.action_search);
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                newText = newText.toLowerCase();

                final List<Gif> filteredList = new ArrayList<>();

                for (int i = 0; i < gifsLab.getData().size(); i++) {

                    final String text = gifsLab.getData().get(i).getUsername().toLowerCase();
                    if (text.contains(newText)) {

                        filteredList.add(gifsLab.getData().get(i));

                    }
                }
                rvAdapter = new RVAdapter(filteredList, getContext());
                recyclerView.setAdapter(rvAdapter);
                return true;
            }
        });
//
    }


}
