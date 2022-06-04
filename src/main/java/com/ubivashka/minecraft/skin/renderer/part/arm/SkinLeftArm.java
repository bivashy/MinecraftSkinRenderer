package com.ubivashka.minecraft.skin.renderer.part.arm;

import com.ubivashka.minecraft.skin.renderer.part.AbstractSkinPart;
import com.ubivashka.minecraft.skin.renderer.part.math.Coordinates;

import java.awt.image.BufferedImage;

public class SkinLeftArm extends AbstractSkinPart {
    public static final Coordinates TOP = new Coordinates(36, 48, 40, 52);
    public static final Coordinates BOTTOM = new Coordinates(40, 48, 44, 52) 	;
    public static final Coordinates RIGHT = new Coordinates(32, 52, 36, 64);
    public static final Coordinates FRONT = new Coordinates(36, 52, 40, 64);
    public static final Coordinates LEFT = new Coordinates(40, 52, 44, 64);
    public static final Coordinates BACK = new Coordinates(44, 52, 48, 64) 	;

    public SkinLeftArm(BufferedImage source) {
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
