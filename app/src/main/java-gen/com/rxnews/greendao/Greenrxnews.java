package com.rxnews.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "GREENRXNEWS".
 */
public class Greenrxnews {

    private Long id;
    private String newslist;
    private String type;

    public Greenrxnews() {
    }

    public Greenrxnews(Long id) {
        this.id = id;
    }

    public Greenrxnews(Long id, String newslist, String type) {
        this.id = id;
        this.newslist = newslist;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNewslist() {
        return newslist;
    }

    public void setNewslist(String newslist) {
        this.newslist = newslist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
