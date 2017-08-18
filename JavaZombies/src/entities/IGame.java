package entities;

public interface IGame {
	Iterable<IEntity> entities();
	
	void add(IEntity entity);
	void remove(IEntity entity);
}
