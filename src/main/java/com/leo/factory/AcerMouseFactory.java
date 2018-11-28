package com.leo.factory;

import com.leo.factory.beans.AcerMouse;
import com.leo.factory.beans.Mouse;

public class AcerMouseFactory implements MouseFactory {
    public Mouse buildMouse() {
        return new AcerMouse();
    }
}
