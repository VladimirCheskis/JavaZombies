package entities;

import java.awt.Point;

public interface IEntity {
	String getName();	
	Point getPoint();
	String getImageName();

	void setName(String name);	
	void setPoint(Point point);
}
