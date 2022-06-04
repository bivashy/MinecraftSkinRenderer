package com.ubivashka.minecraft.skin.renderer.part.torso;

import com.ubivashka.minecraft.skin.renderer.part.AbstractSkinPart;
import com.ubivashka.minecraft.skin.renderer.part.math.Coordinates;

import java.awt.image.BufferedImage;

public class SkinTorso extends AbstractSkinPart {
    public static final Coordinates TOP = new Coordinates(20, 16, 28, 20);
    public static final Coordinates BOTTOM = new Coordinates(28, 16, 36, 20);
    public static final Coordinates RIGHT = new Coordinates(16, 20, 20, 32);
    public static final Coordinates FRONT = new Coordinates(20, 20, 28, 32);
    public static final Coordinates LEFT = new Coordinates(28, 20, 32, 32);
    public static final Coordinates BACK = new Coordinates(32, 20, 40, 32);

    public SkinTorso(BufferedImage source) {
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
