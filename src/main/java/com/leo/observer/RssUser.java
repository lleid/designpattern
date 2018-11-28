package com.leo.observer;

/**
 * 订阅用户
 */
public class RssUser implements Obsever {
    private Subject subject;

    public RssUser(Subject subject) {
        this.subject = subject;
        subject.addObserver(this);
    }

    public void update(String msg) {
        System.out.println(msg);
    }
}
