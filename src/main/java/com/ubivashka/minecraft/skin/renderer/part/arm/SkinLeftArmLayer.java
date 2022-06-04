package com.ubivashka.minecraft.skin.renderer.part.arm;

import com.ubivashka.minecraft.skin.renderer.part.AbstractSkinPart;
import com.ubivashka.minecraft.skin.renderer.part.math.Coordinates;

import java.awt.image.BufferedImage;

public class SkinLeftArmLayer extends AbstractSkinPart {
    public static final Coordinates TOP = new Coordinates(52, 48, 56, 52);
    public static final Coordinates BOTTOM = new Coordinates(56, 48, 60, 52);
    public static final Coordinates RIGHT = new Coordinates(48, 52, 52, 64);
    public static final Coordinates FRONT = new Coordinates(52, 52, 56, 64);
    public static final Coordinates LEFT = new Coordinates(56, 52, 60, 64);
    public static final Coordinates BACK = new Coordinates(60, 52, 64, 64);

    public SkinLeftArmLayer(BufferedImage source) {
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
