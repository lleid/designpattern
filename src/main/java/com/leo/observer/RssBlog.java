package com.leo.observer;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 订阅文章信息
 */
public class RssBlog implements Subject {

    public List<Obsever> list = null;

    private Date date = new Date();

    private String title = "";

    private String content = "";

    public void addObserver(Obsever obsever) {
        if (list == null) {
            list = new ArrayList<Obsever>();
        }
        list.add(obsever);
    }

    public void removeObserver(Obsever obsever) {
        if (list != null) {
            if (list.indexOf(obsever) != -1) {
                list.remove(obsever);
            }
        }
    }

    public void notifyObservers() {
        String blog = getTitle() + "\t\n" +
                new SimpleDateFormat("yyyy-MM-dd HH:mm").format(getDate()) + "\t\n" +
                getContent();
        for (Obsever obsever : list) {
            obsever.update(blog);
        }
    }

    /**
     * 发布消息
     */
    public void push() {
        notifyObservers();
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
}
