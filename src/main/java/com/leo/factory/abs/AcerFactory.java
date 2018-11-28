package com.leo.factory.abs;

import com.leo.factory.beans.AcerKeybo;
import com.leo.factory.beans.AcerMouse;
import com.leo.factory.beans.Keybo;
import com.leo.factory.beans.Mouse;

public class AcerFactory implements PcFactory {
    public Mouse buildMouse() {
        return new AcerMouse();
    }

    public Keybo buildKeybo() {
        return new AcerKeybo();
    }
}
