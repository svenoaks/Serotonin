package teshlya.com.serotonin.model;

import java.io.Serializable;
import java.util.ArrayList;

public class CommunityData implements Serializable {
    private ArrayList<ArticleData> articles;
    private String after;
    private String subreddit;

    public ArrayList<ArticleData> getArticles() {
        if (articles == null)
            articles = new ArrayList<>();
        return articles;
    }

    public void setArticles(ArrayList<ArticleData> articles) {
        this.articles = articles;
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public String getSubreddit() {
        return subreddit;
    }

    public void setSubreddit(String subreddit) {
        this.subreddit = subreddit;
    }
}
