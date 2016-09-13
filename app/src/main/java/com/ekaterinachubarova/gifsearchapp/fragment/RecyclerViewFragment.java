package com.ekaterinachubarova.gifsearchapp.fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.ekaterinachubarova.gifsearchapp.R;
import com.ekaterinachubarova.gifsearchapp.activity.GifActivity;
import com.ekaterinachubarova.gifsearchapp.adapter.RVAdapter;
import com.ekaterinachubarova.gifsearchapp.adapter.RecyclerItemClickListener;
import com.ekaterinachubarova.gifsearchapp.rest.model.GifsLab;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.ekaterinachubarova.gifsearchapp.rest.api.GifService;

/**
 * Created by ekaterinachubarova on 13.09.16.
 */
public class RecyclerViewFragment extends Fragment {
    @BindView(R.id.rv)
    RecyclerView recyclerView;
    private RVAdapter rvAdapter;
    private GifsLab gifsLab = new GifsLab();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.recyclerview_fragment, parent, false);
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

    }

}
