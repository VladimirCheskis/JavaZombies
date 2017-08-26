package actions;

import java.awt.Point;

import entities.Entity;

public class ProjectileFlyAction implements IAction {
	
	Entity entity;
	float deltaT;
	float timeLeft = 0;
	Point point;
	Point point0;
	int radius;
	double fi;
	double deltaFi;
	
	public ProjectileFlyAction(Entity entity, Point point, int koef, float deltaT) {
		super();
		this.entity = entity;
		this.point = point;		
		this.deltaT = deltaT;
//		int halfX = Math.abs(point.x - entity.getPoint().x)/2;
//		int x0 = (point.x + entity.getPoint().x)/2;
//		int y0 = point.y - koef;	
//		this.radius = (int) Math.sqrt((point.x - x0)*(point.x - x0) + (point.y - y0)*(point.y - y0));
//		this.point0 = new Point (x0, y0);
//		this.fi = Math.asin(halfX/(2*radius));
//		this.deltaFi = Math.asin(halfX/(2*radius))/halfX;
	}
	
	public ProjectileFlyAction(Entity entity, int x, int y, int radius, float deltaT) {
		this(entity, new Point(x, y), radius, deltaT);
	}

	@Override
	public void step(float dtSec) {
		timeLeft -= dtSec;
		if (timeLeft <= 0) {
			apply();
			timeLeft = deltaT;
		}
	}
	
	private void apply() {
		Point p = entity.getPoint();
		if (p.x <= point.x){
//			fi -= deltaFi;
//			int dx = (int) (radius*Math.cos(Math.PI/2. - fi));
//			int dy = (int) (radius*Math.sin(Math.PI/2. - fi));
//			entity.setPoint(new Point(p.x + dx, p.y + dy));
			entity.setPoint(new Point(p.x + 1, p.y));
		}
	}
	
}
