package actions;

import java.awt.Point;

import actions.IAction;
import entities.Entity;

public class RunAction implements IAction {
	float overTime = 0;
	Entity entity;
	Point point;
	float timerun;
	double speedX;
	double speedY;
	double startX;
	double startY;
	

	public RunAction(Entity entity, Point point, float timerun) {
		super();
		this.entity = entity;
		this.point = point;
		this.timerun = timerun;
		Point currentPoint = entity.getPoint();
		double x0 = currentPoint.getX();
		double y0 = currentPoint.getY();
		this.startX=x0;
		this.startY=y0;
		double x1 = point.getX();
		double y1 = point.getY();
		//double path = Math.sqrt(Math.pow(x1-x0, 2)+Math.pow(y1-y0, 2));
		speedX = (x1-x0)/timerun;
		speedY = (y1-y0)/timerun;
		
		
	}

	@Override
	public void step(float dtSec) {
		overTime+=dtSec;
		Point currentPoint = entity.getPoint();
		if(	currentPoint.equals(point))
			return;
		double x = startX + overTime * speedX;
		double y = startY + overTime * speedY;
		currentPoint.setLocation(x, y);
		
		
		

	}
}
