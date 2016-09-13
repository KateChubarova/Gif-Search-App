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
    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("bitly_gif_url")
    @Expose
    private String bitlyGifUrl;
    @SerializedName("bitly_url")
    @Expose
    private String bitlyUrl;
    @SerializedName("embed_url")
    @Expose
    private String embedUrl;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("content_url")
    @Expose
    private String contentUrl;
    @SerializedName("source_tld")
    @Expose
    private String sourceTld;
    @SerializedName("source_post_url")
    @Expose
    private String sourcePostUrl;
    @SerializedName("is_indexable")
    @Expose
    private Integer isIndexable;
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
     * The slug
     */
    public String getSlug() {
        return slug;
    }

    /**
     *
     * @param slug
     * The slug
     */
    public void setSlug(String slug) {
        this.slug = slug;
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
     * The bitlyGifUrl
     */
    public String getBitlyGifUrl() {
        return bitlyGifUrl;
    }

    /**
     *
     * @param bitlyGifUrl
     * The bitly_gif_url
     */
    public void setBitlyGifUrl(String bitlyGifUrl) {
        this.bitlyGifUrl = bitlyGifUrl;
    }

    /**
     *
     * @return
     * The bitlyUrl
     */
    public String getBitlyUrl() {
        return bitlyUrl;
    }

    /**
     *
     * @param bitlyUrl
     * The bitly_url
     */
    public void setBitlyUrl(String bitlyUrl) {
        this.bitlyUrl = bitlyUrl;
    }

    /**
     *
     * @return
     * The embedUrl
     */
    public String getEmbedUrl() {
        return embedUrl;
    }

    /**
     *
     * @param embedUrl
     * The embed_url
     */
    public void setEmbedUrl(String embedUrl) {
        this.embedUrl = embedUrl;
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
     * The source
     */
    public String getSource() {
        return source;
    }

    /**
     *
     * @param source
     * The source
     */
    public void setSource(String source) {
        this.source = source;
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
     * The sourceTld
     */
    public String getSourceTld() {
        return sourceTld;
    }

    /**
     *
     * @param sourceTld
     * The source_tld
     */
    public void setSourceTld(String sourceTld) {
        this.sourceTld = sourceTld;
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
     * The isIndexable
     */
    public Integer getIsIndexable() {
        return isIndexable;
    }

    /**
     *
     * @param isIndexable
     * The is_indexable
     */
    public void setIsIndexable(Integer isIndexable) {
        this.isIndexable = isIndexable;
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
        slug = in.readString();
        url = in.readString();
        bitlyGifUrl = in.readString();
        bitlyUrl = in.readString();
        embedUrl = in.readString();
        username = in.readString();
        source = in.readString();
        rating = in.readString();
        contentUrl = in.readString();
        sourceTld = in.readString();
        sourcePostUrl = in.readString();
        isIndexable = in.readByte() == 0x00 ? null : in.readInt();
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
        dest.writeString(slug);
        dest.writeString(url);
        dest.writeString(bitlyGifUrl);
        dest.writeString(bitlyUrl);
        dest.writeString(embedUrl);
        dest.writeString(username);
        dest.writeString(source);
        dest.writeString(rating);
        dest.writeString(contentUrl);
        dest.writeString(sourceTld);
        dest.writeString(sourcePostUrl);
        if (isIndexable == null) {
            dest.writeByte((byte) (0x00));
        } else {
            dest.writeByte((byte) (0x01));
            dest.writeInt(isIndexable);
        }
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