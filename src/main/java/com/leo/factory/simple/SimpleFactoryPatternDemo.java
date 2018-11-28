package com.leo.factory.simple;

import com.leo.factory.beans.AcerMouse;
import com.leo.factory.beans.HpMouse;

public class SimpleFactoryPatternDemo {
    public static void main(String[] args) {
        HpMouse hpMouse = (HpMouse) MouseFactory.buildMouse(MouseType.HP);
        hpMouse.build();

        AcerMouse acerMouse = (AcerMouse) MouseFactory.buildMouse(MouseType.ACER);
        acerMouse.build();
    }
}
