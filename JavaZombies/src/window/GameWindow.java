package window;

import java.awt.*;
import java.awt.event.MouseListener;

import javax.swing.*;

import view.IView;

 
public class GameWindow {
	  
	public static void showGame(IView view)
	{
		GameCanvas canv= new GameCanvas(view);
		
		/* ������� ��������� ����*/
		JFrame w=new JFrame("JavaZombies");
		/*������� �������� ����*/
		w.setSize(view.defaultWidth(), view.defaultHeight());
	 
	/* 	���� � ���� �� ����� ������� ��������, 
	 *	��� ������� �������� ���� �� ���������.*/
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	/*	�������� ����������
	 *  ����� ������� � ���� ����������� �������.*/
		w.setLayout(new BorderLayout(1,1));		
		
        w.add(canv);		
        w.setVisible(true);				
	}
}
