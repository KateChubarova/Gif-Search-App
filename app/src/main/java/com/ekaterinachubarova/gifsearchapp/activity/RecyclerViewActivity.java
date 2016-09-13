package com.ekaterinachubarova.gifsearchapp.activity;

import android.app.Fragment;

import com.ekaterinachubarova.gifsearchapp.fragment.RecyclerViewFragment;

public class RecyclerViewActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new RecyclerViewFragment();
    }
}
