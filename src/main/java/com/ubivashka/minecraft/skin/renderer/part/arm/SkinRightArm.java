package com.ubivashka.minecraft.skin.renderer.part.arm;

import com.ubivashka.minecraft.skin.renderer.part.AbstractSkinPart;
import com.ubivashka.minecraft.skin.renderer.part.math.Coordinates;

import java.awt.image.BufferedImage;

public class SkinRightArm extends AbstractSkinPart {
    public static final Coordinates TOP = new Coordinates(44, 16, 48, 20);
    public static final Coordinates BOTTOM = new Coordinates(48, 16, 52, 20);
    public static final Coordinates RIGHT = new Coordinates(40, 20, 44, 32);
    public static final Coordinates FRONT = new Coordinates(44, 20, 48, 32);
    public static final Coordinates LEFT = new Coordinates(48, 20, 52, 32);
    public static final Coordinates BACK = new Coordinates(52, 20, 56, 32);

    public SkinRightArm(BufferedImage source) {
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
