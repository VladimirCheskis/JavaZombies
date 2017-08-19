package view;

import java.util.function.Consumer;

import entities.IGame;

// Privet
public interface IView {
	
	IGame getGame();
	
	IImageStorage imageStorage();
	
	IPointTransform imagePointTransform();
	IPointTransform textPointTransform();
	
	int defaultWidth();
	int defaultHeight();
	
	void forEarch(Consumer<ISprite> consumer);
}
