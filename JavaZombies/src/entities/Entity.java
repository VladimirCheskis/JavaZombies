package entities;

import java.awt.Point;

public class Entity implements IEntity {

	@Override
	public Point getPoint() {
		return point;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;	
	}

	@Override
	public void setPoint(Point point) {
		this.point = point;
	}

	String name;
	Point  point;
}
