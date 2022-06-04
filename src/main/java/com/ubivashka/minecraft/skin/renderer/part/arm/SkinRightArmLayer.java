package com.ubivashka.minecraft.skin.renderer.part.arm;

import com.ubivashka.minecraft.skin.renderer.part.AbstractSkinPart;
import com.ubivashka.minecraft.skin.renderer.part.math.Coordinates;

import java.awt.image.BufferedImage;

public class SkinRightArmLayer extends AbstractSkinPart {
    public static final Coordinates TOP = new Coordinates(44, 48, 48, 36);
    public static final Coordinates BOTTOM = new Coordinates(48, 48, 52, 36);
    public static final Coordinates RIGHT = new Coordinates(40, 36, 44, 48);
    public static final Coordinates FRONT = new Coordinates(44, 36, 48, 48);
    public static final Coordinates LEFT = new Coordinates(48, 36, 52, 48);
    public static final Coordinates BACK = new Coordinates(52, 36, 64, 48);

    public SkinRightArmLayer(BufferedImage source) {
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
