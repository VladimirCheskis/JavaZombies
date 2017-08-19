package view;

import java.awt.Point;
import java.awt.image.BufferedImage;

public interface ISprite {

	BufferedImage image();
	Point  imagePoint();	
	
	String getText();
	Point  textPoint();
}
