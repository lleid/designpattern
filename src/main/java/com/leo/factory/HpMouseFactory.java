package com.leo.factory;

import com.leo.factory.beans.HpMouse;
import com.leo.factory.beans.Mouse;

public class HpMouseFactory implements MouseFactory {
    public Mouse buildMouse() {
        return new HpMouse();
    }
}
