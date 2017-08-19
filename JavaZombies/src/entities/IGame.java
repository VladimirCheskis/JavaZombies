package entities;

import actions.IAction;

public interface IGame {
	Iterable<IEntity> entities();
	
	void add(IEntity entity);
	void remove(IEntity entity);
	
	void add(IAction action);
	
	void step(float dtSec);
}
