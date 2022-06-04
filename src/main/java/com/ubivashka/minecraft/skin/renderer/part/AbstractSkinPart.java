package com.ubivashka.minecraft.skin.renderer.part;

import com.ubivashka.minecraft.skin.renderer.part.math.Coordinates;

import java.awt.image.BufferedImage;

public abstract class AbstractSkinPart implements SkinPart {
    protected final BufferedImage source;

    public AbstractSkinPart(BufferedImage source) {
        this.source = source;
    }

    protected BufferedImage getImagePart(int x1, int y1, int width, int height) {
        return source.getSubimage(x1, y1, width, height);
    }

    protected BufferedImage getImagePart(Coordinates coordinates) {
        return getImagePart(coordinates.getX1(),coordinates.getY1(),coordinates.getWidth(),coordinates.getHeight());
    }
}
