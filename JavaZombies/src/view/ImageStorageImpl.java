package view;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class ImageStorageImpl implements IImageStorage {

	@Override
	public BufferedImage image(String imageName) {
		if (image == null)
			createImage();
		return image;
	}
	
	void createImage()
	{
		File imageSrc = new File("images/zombie.png");
		try {
			image = ImageIO.read(imageSrc);
			image = setTransparence(image);
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	BufferedImage image;
	
    private static BufferedImage setTransparence(BufferedImage image) {
        final int w = image.getWidth();
        final int h = image.getHeight();
        int[] pixels = new int[w * h];
        image.getRGB(0, 0, w, h, pixels, 0, w);
      
        int transparentPixel = pixels[0];
        final int destAlpha = 0;
        
        for (int i = 0; i < pixels.length; i++) {
        	if (pixels[i] == transparentPixel)
        		pixels[i] = destAlpha | (pixels[i] & 0xFFFFFF);
        }

        image.setRGB(0, 0, w, h, pixels, 0, w);
        return image; 
    }
	
}
