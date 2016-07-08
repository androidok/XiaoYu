package com.scu.charles.xiaoyu.model.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by charles on 2016/7/8.
 */
public class ArticleBean implements Serializable{
    /**
     *id:
     * author:
     * title:
     * content:
     * scancount:浏览次数
     * imglists:插图
     */
    private String id;
    private String author;
    private String title;
    private String content;
    private String scancount;
    private List<String> imglists;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getImglists() {
        return imglists;
    }

    public void setImglists(List<String> imglists) {
        this.imglists = imglists;
    }

    public String getScancount() {
        return scancount;
    }

    public void setScancount(String scancount) {
        this.scancount = scancount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
}
