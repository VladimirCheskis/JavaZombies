package entities;

import java.awt.Point;
import java.util.ArrayList;

import actions.ActionList;
import actions.IAction;

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
		actionList.step(dtSec);
	}
	
	ActionList actionList = new ActionList();

	@Override
	public void add(IAction action) {
		actionList.add(action);
	}	
}
