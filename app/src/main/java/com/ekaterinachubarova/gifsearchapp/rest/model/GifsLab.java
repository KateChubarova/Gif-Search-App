package com.ekaterinachubarova.gifsearchapp.rest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

/**
 * Created by ekaterinachubarova on 13.09.16.
 */
@Generated("org.jsonschema2pojo")
public class GifsLab {

    @SerializedName("data")
    @Expose
    private List<Gif> data = new ArrayList<Gif>();

    /**
     *
     * @return
     * The data
     */
    public List<Gif> getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(List<Gif> data) {
        this.data = data;
    }



}