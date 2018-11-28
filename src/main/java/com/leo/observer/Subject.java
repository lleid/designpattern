package com.leo.observer;

/**
 * 观察者模式  1 定义主题
 */
public interface Subject {
    public void addObserver(Obsever obsever);

    public void removeObserver(Obsever obsever);

    public void notifyObservers();
}
