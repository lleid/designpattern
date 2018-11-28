package com.leo.observer;

import java.util.Date;

/**
 * 观察者模式-自说自话
 * 被观察者和观察者的关系为1:n，当1发生变更的时候，把参数传给n
 * 1 创建观察者接口，添加处理方法
 * 2 创建被观察接口，添加注册，删除，通知方法
 * 3 实现被观察者接口，添加和管1：n
 */
public class Main {
    public static void main(String[] args) {
        RssBlog blog = new RssBlog();

        RssUser user1 = new RssUser(blog);
        RssUser user2 = new RssUser(blog);
        RssUser user3 = new RssUser(blog);

        blog.setTitle("大年初一");
        blog.setDate(new Date());
        blog.setContent("正月1好风光");

        blog.push();

        blog.setTitle("大年十五");
        blog.setDate(new Date());
        blog.setContent("正月15好风光");

        blog.push();
    }
}
