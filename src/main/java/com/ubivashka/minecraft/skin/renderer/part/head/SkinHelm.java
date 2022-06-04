package com.ubivashka.minecraft.skin.renderer.part.head;

import com.ubivashka.minecraft.skin.renderer.part.AbstractSkinPart;
import com.ubivashka.minecraft.skin.renderer.part.math.Coordinates;

import java.awt.image.BufferedImage;

public class SkinHelm extends AbstractSkinPart {
    public static final Coordinates TOP = new Coordinates(40, 0, 48, 8);
    public static final Coordinates BOTTOM = new Coordinates(48, 0, 56, 8);
    public static final Coordinates RIGHT = new Coordinates(32, 8, 40, 16) 	;
    public static final Coordinates FRONT = new Coordinates(40, 8, 48, 16) 	;
    public static final Coordinates LEFT = new Coordinates(48, 8, 56, 16);
    public static final Coordinates BACK = new Coordinates(56, 8, 64, 16);

    public SkinHelm(BufferedImage source) {
        super(source);
    }

    @Override
    public BufferedImage topPart() {
        return getImagePart(TOP);
    }

    @Override
    public BufferedImage bottomPart() {
        return getImagePart(BOTTOM);
    }

    @Override
    public BufferedImage rightPart() {
        return getImagePart(RIGHT);
    }

    @Override
    public BufferedImage frontPart() {
        return getImagePart(FRONT);
    }

    @Override
    public BufferedImage leftPart() {
        return getImagePart(LEFT);
    }

    @Override
    public BufferedImage backPart() {
        return getImagePart(BACK);
    }
}
