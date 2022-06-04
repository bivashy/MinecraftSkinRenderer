package com.ubivashka.minecraft.skin.renderer.part;

import java.awt.image.BufferedImage;

public interface SkinPart {
    BufferedImage topPart();

    BufferedImage bottomPart();

    BufferedImage rightPart();

    BufferedImage frontPart();

    BufferedImage leftPart();

    BufferedImage backPart();
}
