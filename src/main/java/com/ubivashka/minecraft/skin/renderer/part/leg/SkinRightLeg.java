package com.ubivashka.minecraft.skin.renderer.part.leg;

import com.ubivashka.minecraft.skin.renderer.part.AbstractSkinPart;
import com.ubivashka.minecraft.skin.renderer.part.math.Coordinates;

import java.awt.image.BufferedImage;

public class SkinRightLeg extends AbstractSkinPart {
    public static final Coordinates TOP = new Coordinates(4, 16, 8, 20);
    public static final Coordinates BOTTOM = new Coordinates(8, 16, 12, 20);
    public static final Coordinates RIGHT = new Coordinates(0, 20, 4, 32);
    public static final Coordinates FRONT = new Coordinates(4, 20, 8, 32);
    public static final Coordinates LEFT = new Coordinates(8, 20, 12, 32);
    public static final Coordinates BACK = new Coordinates(12, 20, 16, 32);

    public SkinRightLeg(BufferedImage source) {
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
