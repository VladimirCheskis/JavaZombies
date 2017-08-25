package entities;

import java.awt.Point;

public class Entity implements IEntity {

	public Entity(String name, Point point) {
		super();
		this.name = name;
		this.point = point;
	}
	
	public Entity(String name, int x, int y) {
		super();
		this.name = name;
		this.point = new Point(x, y);
	}
	
	String name;
	Point  point;
	String imageName;
	
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

	@Override
	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
	
}
