package window;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;

import view.ISprite;
import view.IView;


public class GameCanvas extends JComponent {
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = -370745726688992561L;

	  public void paintComponent(Graphics g){
		  
		super.paintComponents(g);		
		Graphics2D g2d=(Graphics2D)g;
	 
		//�������� ����. �� ������ �������. ���� �� ������� ���������...
		Font currentFont = g2d.getFont();
		Font newFont = currentFont.deriveFont(currentFont.getSize() * 1.5F);
		g2d.setFont(newFont);
		
		view.forEarch(sprite->paintSprite(g2d, sprite));

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
}