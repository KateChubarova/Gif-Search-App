package com.ekaterinachubarova.gifsearchapp.rest.model;

/**
 * Created by ekaterinachubarova on 13.09.16.
 */
import android.os.Parcel;
import android.os.Parcelable;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Generated("org.jsonschema2pojo")
public class Images implements Serializable{


    @SerializedName("original")
    @Expose
    private Original original;



    /**
     *
     * @return
     * The original
     */
    public Original getOriginal() {
        return original;
    }

    /**
     *
     * @param original
     * The original
     */
    public void setOriginal(Original original) {
        this.original = original;
    }





}
