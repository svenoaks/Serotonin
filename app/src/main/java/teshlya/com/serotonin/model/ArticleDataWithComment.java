package teshlya.com.serotonin.model;

import java.util.ArrayList;

public class ArticleDataWithComment {
    private String title;
    private String imageUrl;
    private String text;

    private ArrayList<CommentData> commentData;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ArrayList<CommentData> getCommentData() {
        return commentData;
    }

    public void setCommentData(ArrayList<CommentData> commentData) {
        this.commentData = commentData;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
