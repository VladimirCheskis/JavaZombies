package entities;

import java.awt.Point;
import java.util.ArrayList;

public class Game implements IGame {

	@Override
	public Iterable<IEntity> entities() {
		return allEntities;
	}

	ArrayList<IEntity> allEntities = new ArrayList<IEntity>();

	@Override
	public void add(IEntity entity) {
		allEntities.add(entity);
		
	}

	@Override
	public void remove(IEntity entity) {
		allEntities.remove(entity);
	}

	@Override
	public void step(float dtSec) {
		allEntities.forEach(ent->{
			Point p = ent.getPoint();
			if (p.x > 0)
				ent.setPoint(new Point(p.x-1, p.y));
		});
		
	}
}
