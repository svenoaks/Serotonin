package teshlya.com.serotonin.model;

import java.io.Serializable;

public class ArticleData implements Serializable {
    private String title;
    private String text;
    private String url;
    private String author;
    private String date;
    private String score;
    private String subreddit;
    private String commentCount;
    private Media mediaImage;
    private Media mediaVideo;
    private MediaType mediaType;

    public ArticleData() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Media getMediaImage() {
        return mediaImage;
    }

    public void setMediaImage(Media mediaImage) {
        this.mediaImage = mediaImage;
    }

    public MediaType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaType mediaType) {
        this.mediaType = mediaType;
    }

    public Media getMediaVideo() {
        return mediaVideo;
    }

    public void setMediaVideo(Media mediaVideo) {
        this.mediaVideo = mediaVideo;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }
}
