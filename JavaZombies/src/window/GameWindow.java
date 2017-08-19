package window;

import java.awt.*;


import javax.swing.*;

import entities.IGame;
import view.IView;
import view.ViewImpl;

 
public class GameWindow {
	  
	public static void showGame(IGame game)
	{
		IView view = new ViewImpl(game);
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
