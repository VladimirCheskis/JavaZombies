package entities;

import java.awt.Point;
import java.util.function.Consumer;

import view.ISprite;

public interface IEntity {
	String getName();	
	Point getPoint();

	void setName(String name);	
	void setPoint(Point point);
}
