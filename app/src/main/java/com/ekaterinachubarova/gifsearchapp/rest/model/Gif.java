package com.ekaterinachubarova.gifsearchapp.rest.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ekaterinachubarova on 13.09.16.
 */
import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Gif implements Parcelable{

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("url")
    @Expose
    private String url;

    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("content_url")
    @Expose
    private String contentUrl;
    @SerializedName("source_post_url")
    @Expose
    private String sourcePostUrl;
    @SerializedName("import_datetime")
    @Expose
    private String importDatetime;
    @SerializedName("trending_datetime")
    @Expose
    private String trendingDatetime;
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("user")
    @Expose
    private User user;

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }


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

    /**
     *
     * @return
     * The username
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     * The username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     * The rating
     */
    public String getRating() {
        return rating;
    }

    /**
     *
     * @param rating
     * The rating
     */
    public void setRating(String rating) {
        this.rating = rating;
    }

    /**
     *
     * @return
     * The contentUrl
     */
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     *
     * @param contentUrl
     * The content_url
     */
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    /**
     *
     * @return
     * The sourcePostUrl
     */
    public String getSourcePostUrl() {
        return sourcePostUrl;
    }

    /**
     *
     * @param sourcePostUrl
     * The source_post_url
     */
    public void setSourcePostUrl(String sourcePostUrl) {
        this.sourcePostUrl = sourcePostUrl;
    }


    /**
     *
     * @return
     * The importDatetime
     */
    public String getImportDatetime() {
        return importDatetime;
    }

    /**
     *
     * @param importDatetime
     * The import_datetime
     */
    public void setImportDatetime(String importDatetime) {
        this.importDatetime = importDatetime;
    }

    /**
     *
     * @return
     * The trendingDatetime
     */
    public String getTrendingDatetime() {
        return trendingDatetime;
    }

    /**
     *
     * @param trendingDatetime
     * The trending_datetime
     */
    public void setTrendingDatetime(String trendingDatetime) {
        this.trendingDatetime = trendingDatetime;
    }

    /**
     *
     * @return
     * The images
     */
    public Images getImages() {
        return images;
    }

    /**
     *
     * @param images
     * The images
     */
    public void setImages(Images images) {
        this.images = images;
    }

    /**
     *
     * @return
     * The user
     */
    public User getUser() {
        return user;
    }

    /**
     *
     * @param user
     * The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    protected Gif(Parcel in) {
        type = in.readString();
        id = in.readString();
        url = in.readString();
        username = in.readString();
        rating = in.readString();
        contentUrl = in.readString();
        sourcePostUrl = in.readString();
        importDatetime = in.readString();
        trendingDatetime = in.readString();
        images = (Images) in.readValue(Images.class.getClassLoader());
        user = (User) in.readValue(User.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(type);
        dest.writeString(id);
        dest.writeString(url);
        dest.writeString(username);
        dest.writeString(rating);
        dest.writeString(contentUrl);
        dest.writeString(sourcePostUrl);
        dest.writeString(importDatetime);
        dest.writeString(trendingDatetime);
        dest.writeValue(images);
        dest.writeValue(user);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Gif> CREATOR = new Parcelable.Creator<Gif>() {
        @Override
        public Gif createFromParcel(Parcel in) {
            return new Gif(in);
        }

        @Override
        public Gif[] newArray(int size) {
            return new Gif[size];
        }
    };

}