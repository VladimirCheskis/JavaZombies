package animationTesting;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import javax.imageio.ImageIO;

public class FrameFromFile implements Iterator<BufferedImage>{
	BufferedImage bigImage;

	int h, w; // frame size input
	//int numberOfFrames; 
	int x = 0;
	int y = 0;

	public FrameFromFile(BufferedImage image, int h, int w) throws ImagingErorException {
		super();
		this.bigImage = image;

		this.h = h;
		this.w = w;
		if (image.getHeight() % h != 0 || image.getWidth() % w != 0) {
			throw new ImagingErorException("size dosent match");
		}
		//this.numberOfFrames = (image.getHeight() / h) * (image.getWidth() / w);
	}

	public FrameFromFile(String imageSource, int h, int w) {
		super();

		try {
			this.bigImage = ImageIO.read(new File(imageSource));
		} catch (IOException e) {
			new ImagingErorException("wrong file source");
		}

		this.h = h;
		this.w = w;
		//this.numberOfFrames = (this.bigImage.getHeight() / h) * (this.bigImage.getWidth() / w);
	}

	public BufferedImage getNextFrame() {
		
			BufferedImage currentFrame = bigImage.getSubimage(x, y, w, h);
			if (x < bigImage.getHeight()) {
				x = x + w;
			} else {
				if(y<bigImage.getWidth()){
				y = y + h;
				}else return null;
			}
			
			return currentFrame;
		
		
	}

	@Override
	public boolean hasNext() {
		
		return x>bigImage.getWidth()&&y>bigImage.getHeight();
	}

	@Override
	public BufferedImage next() {
		BufferedImage currentFrame = bigImage.getSubimage(x, y, w, h);
		if (x < bigImage.getHeight()) {
			x = x + w;
		} else {
			if(y<bigImage.getWidth()){
			y = y + h;
			}
	}
		return currentFrame;
	}
}
