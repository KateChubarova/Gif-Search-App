package com.ekaterinachubarova.gifsearchapp.activity;



import android.support.v4.app.Fragment;

import com.ekaterinachubarova.gifsearchapp.fragment.GifFragment;
import com.ekaterinachubarova.gifsearchapp.rest.model.Gif;

/**
 * Created by ekaterinachubarova on 13.09.16.
 */
public class GifActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        Gif gif = getIntent().getParcelableExtra(GifFragment.GIF_PARS);
        return new GifFragment().newInstance(gif);
    }
}
