package com.ekaterinachubarova.gifsearchapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SearchViewCompat;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ekaterinachubarova.gifsearchapp.R;
import com.ekaterinachubarova.gifsearchapp.rest.model.Gif;
import com.koushikdutta.ion.Ion;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ekaterinachubarova on 13.09.16.
 */
public class GifFragment extends Fragment{
    private Gif gif;
    public static final String GIF_PARS = "GIF";

    @BindView(R.id.user_name)
    TextView name;
    @BindView(R.id.big_gif)
    ImageView filmImage;
    @BindView(R.id.date)
    TextView date;
    @BindView(R.id.description)
    TextView description;


    public static GifFragment newInstance (Gif gif) {
        Bundle args = new Bundle();
        args.putParcelable(GIF_PARS, gif);
        GifFragment gifFragment = new GifFragment();
        gifFragment.setArguments(args);
        return gifFragment;
    }


    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.gif_fragment, parent, false);
        ButterKnife.bind(this, v);

        gif = getArguments().getParcelable(GIF_PARS);

        name.setText(gif.getUsername());
        date.setText(gif.getImportDatetime());

        Ion.with(getActivity())
                .load(gif.getImages().getOriginal().getUrl())
                .intoImageView(filmImage);




        return v;
    }


}

