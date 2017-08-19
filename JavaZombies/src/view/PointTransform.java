package view;

import java.awt.Point;

public class PointTransform implements IPointTransform {

	@Override
	public Point transform(Point p) {
		return new Point((int)(x0 + dx * p.x),
						 (int)(y0 + dy * p.y));
	}

	public PointTransform(double x0, double y0, double dx, double dy) {
		super();
		this.x0 = x0;
		this.y0 = y0;
		this.dx = dx;
		this.dy = dy;
	}

	double x0, y0, dx, dy;
}
