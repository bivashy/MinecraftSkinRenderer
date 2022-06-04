package com.ubivashka.minecraft.skin.renderer.part.leg;

import com.ubivashka.minecraft.skin.renderer.part.AbstractSkinPart;
import com.ubivashka.minecraft.skin.renderer.part.math.Coordinates;

import java.awt.image.BufferedImage;

public class SkinLeftLeg extends AbstractSkinPart {
    public static final Coordinates TOP = new Coordinates(20, 48, 24, 52);
    public static final Coordinates BOTTOM = new Coordinates(24, 48, 28, 52);
    public static final Coordinates RIGHT = new Coordinates(16, 52, 20, 64) 	;
    public static final Coordinates FRONT = new Coordinates(20, 52, 24, 64);
    public static final Coordinates LEFT = new Coordinates(24, 52, 28, 64);
    public static final Coordinates BACK = new Coordinates(28, 52, 32, 64);


    public SkinLeftLeg(BufferedImage source) {
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
