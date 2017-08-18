package entities;

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
}
