package animationTesting;



import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.*;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.ImageInput;

public class AnimationAppl {

	public static void main(String[] args) throws InterruptedException {
		JFrame frame=new JFrame("Animation Test");
		String imageSource="29488931-ac125920-851d-11e7-8546-39bb34c79cda.png";
		frame.setLayout(new FlowLayout());
		frame.setSize(500,500);
		frame.show(true);
		JLabel lbl=new JLabel();
		frame.add(lbl);
		for(int i=0;i<30;i++){
		lbl.setIcon(new ImageIcon
		(new FrameFromFile(imageSource,1180/5,2604/6).getNextFrame()));
		//size  w= 2604 h=1180; 6/5
		
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Graphics graph=new 
	}

}
