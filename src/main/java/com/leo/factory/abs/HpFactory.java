package com.leo.factory.abs;

import com.leo.factory.beans.HpKeybo;
import com.leo.factory.beans.HpMouse;
import com.leo.factory.beans.Keybo;
import com.leo.factory.beans.Mouse;

public class HpFactory implements PcFactory {
    public Mouse buildMouse() {
        return new HpMouse();
    }

    public Keybo buildKeybo() {
        return new HpKeybo();
    }
}
