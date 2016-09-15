package com.ekaterinachubarova.gifsearchapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.ekaterinachubarova.gifsearchapp.R;
import com.ekaterinachubarova.gifsearchapp.rest.model.Gif;
import com.koushikdutta.ion.Ion;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ekaterinachubarova on 13.09.16.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {

    private List<Gif> gifs;
    private Context context;

    public RVAdapter(List<Gif> gifs, Context context) {
        this.gifs = gifs;
        this.context = context;
    }


    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item1, parent, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {

        Gif gif = gifs.get(position);
        Ion.with(context)
                .load(gif.getImages().getOriginal().getUrl())
                .intoImageView(holder.gifView);
        holder.date.setText(gif.getImportDatetime());
        holder.userName.setText(gif.getUsername());
        holder.progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    public int getItemCount() {
        return gifs.size();
    }

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.gif_view_item) ImageView gifView;
        @BindView(R.id.cover_progress) ProgressBar progressBar;
        @BindView(R.id.import_datetime) TextView date;
        @BindView(R.id.user_name) TextView userName;
        public PersonViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
