package com.ubivashka.minecraft.skin.renderer.part.leg;

import com.ubivashka.minecraft.skin.renderer.part.AbstractSkinPart;
import com.ubivashka.minecraft.skin.renderer.part.math.Coordinates;

import java.awt.image.BufferedImage;

public class SkinRightLegLayer extends AbstractSkinPart {
    public static final Coordinates TOP = new Coordinates(4, 48, 8, 36);
    public static final Coordinates BOTTOM = new Coordinates(8, 48, 12, 36);
    public static final Coordinates RIGHT = new Coordinates(0, 36, 4, 48);
    public static final Coordinates FRONT = new Coordinates(4, 36, 8, 48);
    public static final Coordinates LEFT = new Coordinates(8, 36, 12, 48);
    public static final Coordinates BACK = new Coordinates(12, 36, 16, 48) 	;

    public SkinRightLegLayer(BufferedImage source) {
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
