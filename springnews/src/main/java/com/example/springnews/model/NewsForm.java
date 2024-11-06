package com.example.springnews.model;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class NewsForm {
    private int id;
    private String writer;
    private String title;
    private String content;
    private java.sql.Date writedate;
    private int cnt;

    public News toEntity() {
        return new News(id,writer,title,content,writedate,cnt);
    }
}
