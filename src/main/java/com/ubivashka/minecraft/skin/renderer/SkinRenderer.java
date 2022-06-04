package com.ubivashka.minecraft.skin.renderer;

import com.ubivashka.minecraft.skin.renderer.part.arm.SkinLeftArm;
import com.ubivashka.minecraft.skin.renderer.part.arm.SkinRightArm;
import com.ubivashka.minecraft.skin.renderer.part.arm.SkinRightArmLayer;
import com.ubivashka.minecraft.skin.renderer.part.head.SkinHead;
import com.ubivashka.minecraft.skin.renderer.part.leg.SkinLeftLeg;
import com.ubivashka.minecraft.skin.renderer.part.leg.SkinLeftLegLayer;
import com.ubivashka.minecraft.skin.renderer.part.leg.SkinRightLeg;
import com.ubivashka.minecraft.skin.renderer.part.leg.SkinRightLegLayer;
import com.ubivashka.minecraft.skin.renderer.part.torso.SkinTorso;
import com.ubivashka.minecraft.skin.renderer.part.torso.SkinTorsoLayer;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SkinRenderer {
    public static BufferedImage frontOfSkin(BufferedImage bufferedImage) {
        bufferedImage = convertToNewFormat(bufferedImage);
        BufferedImage head = new SkinHead(bufferedImage).frontPart();
        BufferedImage leftArm = new SkinLeftArm(bufferedImage).frontPart();
        BufferedImage rightArm = new SkinRightArm(bufferedImage).frontPart();
        BufferedImage torso = new SkinTorso(bufferedImage).frontPart();
        BufferedImage leftLeg = new SkinLeftLeg(bufferedImage).frontPart();
        BufferedImage rightLeg = new SkinRightLeg(bufferedImage).frontPart();
        BufferedImage leftArmLayer = new SkinLeftLegLayer(bufferedImage).frontPart();
        BufferedImage rightArmLayer = new SkinRightArmLayer(bufferedImage).frontPart();
        BufferedImage torsoLayer = new SkinTorsoLayer(bufferedImage).frontPart();
        BufferedImage leftLegLayer = new SkinLeftLegLayer(bufferedImage).frontPart();
        BufferedImage rightLegLayer = new SkinRightLegLayer(bufferedImage).frontPart();

        BufferedImage skinBodyFrontImage = new BufferedImage(leftArm.getWidth() + rightArm.getWidth() + torso.getWidth(), leftArm.getHeight() + leftLeg.getHeight() + head.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D skinBodyFrontGraphics = skinBodyFrontImage.createGraphics();
        skinBodyFrontGraphics.drawImage(head, rightArm.getWidth(), 0, null);
        skinBodyFrontGraphics.drawImage(rightArm, 0, head.getHeight(), null);
        skinBodyFrontGraphics.drawImage(rightArmLayer, 0, head.getHeight(), null);
        skinBodyFrontGraphics.drawImage(torso, rightArm.getWidth(), head.getHeight(), null);
        skinBodyFrontGraphics.drawImage(torsoLayer, rightArm.getWidth(), head.getHeight(), null);
        skinBodyFrontGraphics.drawImage(leftArm, rightArm.getWidth() + torso.getWidth(), head.getHeight(), null);
        skinBodyFrontGraphics.drawImage(leftArmLayer, rightArm.getWidth() + torso.getWidth(), head.getHeight(), null);
        skinBodyFrontGraphics.drawImage(rightLeg, rightArm.getWidth(), head.getHeight() + torso.getHeight(), null);
        skinBodyFrontGraphics.drawImage(rightLegLayer, rightArm.getWidth(), head.getHeight() + torso.getHeight(), null);
        skinBodyFrontGraphics.drawImage(leftLeg, rightArm.getWidth() + rightLeg.getWidth(), head.getHeight() + torso.getHeight(), null);
        skinBodyFrontGraphics.drawImage(leftLegLayer, rightArm.getWidth() + rightLeg.getWidth(), head.getHeight() + torso.getHeight(), null);
        return skinBodyFrontImage;
    }

    public static BufferedImage backOfSkin(BufferedImage bufferedImage) {
        bufferedImage = convertToNewFormat(bufferedImage);
        BufferedImage head = new SkinHead(bufferedImage).backPart();
        BufferedImage leftArm = new SkinLeftArm(bufferedImage).backPart();
        BufferedImage rightArm = new SkinRightArm(bufferedImage).backPart();
        BufferedImage torso = new SkinTorso(bufferedImage).backPart();
        BufferedImage leftLeg = new SkinLeftLeg(bufferedImage).backPart();
        BufferedImage rightLeg = new SkinRightLeg(bufferedImage).backPart();
        BufferedImage leftArmLayer = new SkinLeftLegLayer(bufferedImage).backPart();
        BufferedImage rightArmLayer = new SkinRightArmLayer(bufferedImage).backPart();
        BufferedImage torsoLayer = new SkinTorsoLayer(bufferedImage).backPart();
        BufferedImage leftLegLayer = new SkinLeftLegLayer(bufferedImage).backPart();
        BufferedImage rightLegLayer = new SkinRightLegLayer(bufferedImage).backPart();

        BufferedImage skinBodyBackImage = new BufferedImage(leftArm.getWidth() + rightArm.getWidth() + torso.getWidth(), leftArm.getHeight() + leftLeg.getHeight() + head.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D skinBodyBackGraphics = skinBodyBackImage.createGraphics();
        skinBodyBackGraphics.drawImage(head, rightArm.getWidth(), 0, null);
        skinBodyBackGraphics.drawImage(leftArm, 0, head.getHeight(), null);
        skinBodyBackGraphics.drawImage(leftArmLayer, 0, head.getHeight(), null);
        skinBodyBackGraphics.drawImage(torso, rightArm.getWidth(), head.getHeight(), null);
        skinBodyBackGraphics.drawImage(torsoLayer, rightArm.getWidth(), head.getHeight(), null);
        skinBodyBackGraphics.drawImage(rightArm, rightArm.getWidth() + torso.getWidth(), head.getHeight(), null);
        skinBodyBackGraphics.drawImage(rightArmLayer, rightArm.getWidth() + torso.getWidth(), head.getHeight(), null);
        skinBodyBackGraphics.drawImage(leftLeg, rightArm.getWidth(), head.getHeight() + torso.getHeight(), null);
        skinBodyBackGraphics.drawImage(leftLegLayer, rightArm.getWidth(), head.getHeight() + torso.getHeight(), null);
        skinBodyBackGraphics.drawImage(rightLeg, rightArm.getWidth() + rightLeg.getWidth(), head.getHeight() + torso.getHeight(), null);
        skinBodyBackGraphics.drawImage(rightLegLayer, rightArm.getWidth() + rightLeg.getWidth(), head.getHeight() + torso.getHeight(), null);
        return skinBodyBackImage;
    }

    public static BufferedImage rightPartOfSkin(BufferedImage bufferedImage){
        bufferedImage = convertToNewFormat(bufferedImage);
        BufferedImage head = new SkinHead(bufferedImage).rightPart();
        BufferedImage rightArm = new SkinRightArm(bufferedImage).rightPart();
        BufferedImage rightLeg = new SkinRightLeg(bufferedImage).rightPart();
        BufferedImage rightArmLayer = new SkinRightArmLayer(bufferedImage).rightPart();
        BufferedImage rightLegLayer = new SkinRightLegLayer(bufferedImage).rightPart();

        BufferedImage skinBodyRightImage = new BufferedImage(head.getWidth(), rightArm.getHeight() + rightLeg.getHeight() + head.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D skinBodyRightGraphics = skinBodyRightImage.createGraphics();
        skinBodyRightGraphics.drawImage(head, 0, 0, null);
        skinBodyRightGraphics.drawImage(rightArm, (skinBodyRightImage.getWidth()-rightArm.getWidth())/2, head.getHeight(), null);
        skinBodyRightGraphics.drawImage(rightArmLayer, (skinBodyRightImage.getWidth()-rightArmLayer.getWidth())/2, head.getHeight(), null);
        skinBodyRightGraphics.drawImage(rightLeg, (skinBodyRightImage.getWidth()-rightLeg.getWidth())/2, head.getHeight()+rightArm.getHeight(), null);
        skinBodyRightGraphics.drawImage(rightLegLayer, (skinBodyRightImage.getWidth()-rightLegLayer.getWidth())/2, head.getHeight()+rightArm.getHeight(), null);
        return skinBodyRightImage;
    }

    public static BufferedImage leftPartOfSkin(BufferedImage bufferedImage){
        bufferedImage = convertToNewFormat(bufferedImage);
        BufferedImage head = new SkinHead(bufferedImage).leftPart();
        BufferedImage leftArm = new SkinLeftArm(bufferedImage).leftPart();
        BufferedImage leftLeg = new SkinLeftLeg(bufferedImage).leftPart();
        BufferedImage leftArmLayer = new SkinLeftLegLayer(bufferedImage).leftPart();
        BufferedImage leftLegLayer = new SkinLeftLegLayer(bufferedImage).leftPart();

        BufferedImage skinBodyLeftImage = new BufferedImage(head.getWidth(), leftArm.getHeight() + leftLeg.getHeight() + head.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D skinBodyLeftGraphics = skinBodyLeftImage.createGraphics();
        skinBodyLeftGraphics.drawImage(head, 0, 0, null);
        skinBodyLeftGraphics.drawImage(leftArm, (skinBodyLeftImage.getWidth()-leftArm.getWidth())/2, head.getHeight(), null);
        skinBodyLeftGraphics.drawImage(leftArmLayer, (skinBodyLeftImage.getWidth()-leftArmLayer.getWidth())/2, head.getHeight(), null);
        skinBodyLeftGraphics.drawImage(leftLeg, (skinBodyLeftImage.getWidth()-leftLeg.getWidth())/2, head.getHeight()+leftArm.getHeight(), null);
        skinBodyLeftGraphics.drawImage(leftLegLayer, (skinBodyLeftImage.getWidth()-leftLegLayer.getWidth())/2, head.getHeight()+leftArm.getHeight(), null);
        return skinBodyLeftImage;
    }

    public static BufferedImage convertToNewFormat(BufferedImage image) {
        if (!isOldSkinFormat(image))
            return image;
        BufferedImage newFormatSkin = new BufferedImage(64, 64, BufferedImage.TYPE_INT_RGB);
        Graphics2D newFormatSkinGraphics = newFormatSkin.createGraphics();
        newFormatSkinGraphics.drawImage(image, 0, 0, null);
        BufferedImage rightArmImage = image.getSubimage(SkinRightArm.RIGHT.getX1(), SkinRightArm.TOP.getY1(), 16, 16);
        BufferedImage leftLegImage = image.getSubimage(SkinRightLeg.RIGHT.getX1(), SkinRightLeg.TOP.getY1(), 16, 16);
        newFormatSkinGraphics.drawImage(rightArmImage, SkinLeftArm.RIGHT.getX1(), SkinLeftArm.TOP.getY1(), null);
        newFormatSkinGraphics.drawImage(leftLegImage, SkinLeftLeg.RIGHT.getX1(), SkinLeftLeg.TOP.getY1(), null);
        newFormatSkinGraphics.dispose();
        return newFormatSkin;
    }

    public static boolean isOldSkinFormat(BufferedImage bufferedImage) {
        return bufferedImage.getHeight() < 50;
    }

    public static BufferedImage resize(BufferedImage target, int width, int height, int hints) {
        Image scaledImage = target.getScaledInstance(width, height, hints);
        BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        outputImage.getGraphics().drawImage(scaledImage, 0, 0, null);
        return outputImage;
    }
}
