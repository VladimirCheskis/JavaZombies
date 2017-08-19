package view;

import entities.IGame;

public interface IView {
	
	IGame game();
	
	IImageStorage imageStorge();
	
	IPointTransform imagePointTransform();
	IPointTransform textPointTransform();
	
	int defaultWidth();
	int defaultHeight();
}
