package entities;

import java.awt.Point;
import java.util.function.Consumer;

import view.ISprite;

public class Entity implements IEntity {

	String name;
	Point  point;
	ISprite sprite;
	
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
	public void acceptSprites(Consumer<ISprite> consumer) {
		if (sprite != null)
			consumer.accept(sprite);
	}	

	@Override
	public ISprite mainSprite() {
		return sprite;
	}
}
