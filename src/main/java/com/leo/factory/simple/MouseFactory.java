package com.leo.factory.simple;

import com.leo.factory.beans.AcerMouse;
import com.leo.factory.beans.HpMouse;
import com.leo.factory.beans.Mouse;

public class MouseFactory {
    public static Mouse buildMouse(MouseType mouseType) {
        switch (mouseType) {
            case HP:
                return new HpMouse();
            case ACER:
                return new AcerMouse();
            default:
                return null;
        }
    }
}
