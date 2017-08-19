package actions;

import java.awt.Point;

import entities.IEntity;
import entities.IGame;

public class MoveAllAction implements IAction {

	@Override
	public void step(float dtSec) {
		timeLeft -= dtSec;
		if (timeLeft <= 0)
		{
			apply();
			timeLeft = deltaT;
		}
	}

	private void apply() {
		game.entities().forEach(this::applyToEntity);
	}
	
	void applyToEntity(IEntity entity)
	{
		Point p = entity.getPoint();
		if (p.x > 0)
			entity.setPoint(new Point(p.x-1, p.y));
	}

	public MoveAllAction(float deltaT, IGame game) {
		super();
		this.deltaT = deltaT;
		this.game = game;
	}
	float deltaT;
	float timeLeft = 0;
	IGame game;
}
