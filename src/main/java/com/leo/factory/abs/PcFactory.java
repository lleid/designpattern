package com.leo.factory.abs;

import com.leo.factory.beans.Keybo;
import com.leo.factory.beans.Mouse;

/**
 * 创建抽象工厂类
 */
public interface PcFactory {
    public Mouse buildMouse();

    public Keybo buildKeybo();
}
