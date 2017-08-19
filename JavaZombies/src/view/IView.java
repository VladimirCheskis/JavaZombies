package view;

import java.util.function.Consumer;

import entities.IGame;

//All, we need to draw a game
public interface IView {
	
	IGame getGame();
	
	IImageStorage imageStorage();
	
	//transform for images
	IPointTransform imagePointTransform();
	//transform for text
	IPointTransform textPointTransform();
	
	int defaultWidth();
	int defaultHeight();
	
	void forEarch(Consumer<ISprite> consumer);
}
