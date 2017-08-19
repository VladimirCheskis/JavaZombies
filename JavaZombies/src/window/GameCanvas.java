package window;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.function.Consumer;

import javax.swing.JComponent;

import entities.IEntity;
import view.ISprite;
import view.IView;


public class GameCanvas extends Frame {
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = -370745726688992561L;


	  class PaintConsumer implements Consumer<entities.IEntity>
	  {
	    public PaintConsumer(Graphics2D g2d, GameCanvas canvas) {
			super();
			this.g2d = g2d;
			this.canvas = canvas;
		}

	    GameCanvas canvas;
		Graphics2D g2d;
	    
		@Override
		public void accept(IEntity entity) {
			
			entity.acceptSprites(sprite->canvas.paintSprite(g2d, sprite));
		}
		  
	  }
	
	  public void paintComponent(Graphics g){
		  
		super.paintComponents(g);		
		Graphics2D g2d=(Graphics2D)g;
	 
		//�������� ����. �� ������ �������. ���� �� ������� ���������...
		Font currentFont = g2d.getFont();
		Font newFont = currentFont.deriveFont(currentFont.getSize() * 1.5F);
		g2d.setFont(newFont);
		
		view.game().entities().forEach(new PaintConsumer(g2d, this));

		g2d.setFont(currentFont);
		
		super.repaint();
	  }
	  
	  private void paintSprite(Graphics2D g2d, ISprite sprite) {
	  if (sprite == null)
		  return;
		BufferedImage img = sprite.image();
		if (img != null)
		{
			Point p = sprite.imagePoint();
			g2d.drawImage(img, p.x, p.y, null);
		}
		String text = sprite.getText();
		if (text != null && !text.isEmpty())
		{
			Point p = sprite.textPoint();
			g2d.drawString(text, p.x, p.y);
		}		
	}

	public GameCanvas(IView view) {
		super();
		this.view = view;
	}

	IView view;
/*	
	int dx = 95, dy = 190, dyText = 20;
	int x0 = 10, y0 = 10;
	IZombieImages zombieImages = new ZombieImagesImpl();
	public int defaultWidth() {
		// TODO Auto-generated method stub
		return dx * 8;
	}

	public int defaultHeight() {
		// TODO Auto-generated method stub
		return (dy + dyText) * 4;
	}
*/

}