[![](https://jitpack.io/v/U61vashka/MinecraftSkinRenderer.svg)](https://jitpack.io/#U61vashka/MinecraftSkinRenderer)


# MinecraftSkinRenderer
Render minecraft skin with BufferedImage and Graphics (plain java).
You can render:
1. Front view of skin
2. Back view of skin
3. Right view of skin
4. Left view of skin
5. Supports legacy skin formats (not tested)
Usage:
```
        BufferedImage bufferedImage = ImageIO.read(new File("/path/to/input.png"));
        File outputFile = new File("/path/to/output.png");
        outputFile.createNewFile();

        BufferedImage skinPartImage = SkinRenderer.frontOfSkin(bufferedImage);
        ImageIO.write(SkinRenderer.resize(skinPartImage, skinPartImage.getWidth() * 16, skinPartImage.getHeight() * 16, Image.SCALE_REPLICATE), "png", outputFile);
```


Example:
***
Input:
![input](https://user-images.githubusercontent.com/85439143/172020014-8f1c5193-35cb-4209-9b24-b1f8cda05f82.png)
***
Output:
![output](https://user-images.githubusercontent.com/85439143/172020021-d3dcce1b-bc7f-48c5-9398-612ce177d900.png)


