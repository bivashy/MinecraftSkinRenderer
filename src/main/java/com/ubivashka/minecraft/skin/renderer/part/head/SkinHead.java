package com.ubivashka.minecraft.skin.renderer.part.head;

import com.ubivashka.minecraft.skin.renderer.part.AbstractSkinPart;
import com.ubivashka.minecraft.skin.renderer.part.math.Coordinates;

import java.awt.image.BufferedImage;

public class SkinHead extends AbstractSkinPart {

    public static final Coordinates TOP = new Coordinates(8, 0, 16, 8);
    public static final Coordinates BOTTOM = new Coordinates(16, 0, 24, 8);
    public static final Coordinates RIGHT = new Coordinates(0, 8, 8, 16);
    public static final Coordinates FRONT = new Coordinates(8, 8, 16, 16);
    public static final Coordinates LEFT = new Coordinates(16, 8, 24, 16);
    public static final Coordinates BACK = new Coordinates(24,8,32,16);

    public SkinHead(BufferedImage source) {
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
