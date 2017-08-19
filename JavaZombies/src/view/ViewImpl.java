package view;

import java.util.function.Consumer;

import entities.IGame;

public class ViewImpl implements IView {

	@Override
	public IGame getGame() {
		return this.game;
	}

	@Override
	public IImageStorage imageStorage() {
		return this.imageStorage;
	}

	public ViewImpl(IGame game) {
		super();
		this.game = game;
	}

	@Override
	public IPointTransform imagePointTransform() {
		// TODO Auto-generated method stub
		return imageTransform;
	}

	@Override
	public IPointTransform textPointTransform() {
		// TODO Auto-generated method stub
		return textTransform;
	}
	
	IImageStorage imageStorage = new ImageStorageImpl(); 
	IGame game;
	
	// Magic constants. To be refactored.
	int dx = 95, dy = 190, dyText = 20;
	int x0 = 10, y0 = 10;

	IPointTransform imageTransform = new PointTransform(x0, y0 + dyText,     dx, dy + dyText);
	IPointTransform textTransform  = new PointTransform(x0, y0 + dyText - 2, dx, dy + dyText);	

	@Override
	public int defaultWidth() {
		return dx * 8;
	}

	@Override
	public int defaultHeight() {
		return (dy + dyText) * 4;
	}

	@Override
	public void forEarch(Consumer<ISprite> consumer) {

		game.entities().forEach(entity->{
			ISprite sprite = new SpriteImpl(entity, this);
			consumer.accept(sprite);
		});
	}	
}
