package com.ekaterinachubarova.gifsearchapp.rest.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ekaterinachubarova on 13.09.16.
 */
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Original implements Serializable{

    @SerializedName("url")
    @Expose
    private String url;


    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }


}
