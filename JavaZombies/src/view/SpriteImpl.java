package view;

import java.awt.Point;
import java.awt.image.BufferedImage;

import entities.IEntity;

public class SpriteImpl implements ISprite {

	@Override
	public BufferedImage image() {
		return view.imageStorage().image(entity.getImageName());
	}

	public SpriteImpl(IEntity entity, IView view) {
		super();
		this.entity = entity;
		this.view = view;
	}

	@Override
	public Point imagePoint() {
		return view.imagePointTransform().transform(entity.getPoint());
	}

	@Override
	public String getText() {
		return entity.getName();
	}

	@Override
	public Point textPoint() {
		return view.textPointTransform().transform(entity.getPoint());
	}

	IEntity entity;
	IView	view;
}
