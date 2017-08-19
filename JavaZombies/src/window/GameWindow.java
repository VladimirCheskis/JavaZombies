package window;

import java.awt.BorderLayout;

import javax.swing.JFrame;
//import javax.swing.Timer;
import java.util.Timer;
import java.util.TimerTask;

import entities.IGame;
import view.IView;
import view.ViewImpl;
 
public class GameWindow {
	  
	static class GameTimerTask extends TimerTask {

		@Override
		public void run() {
			GameWindow.step();
		}
	}
		
	public static void showGame(IGame game)
	{
		IView view = new ViewImpl(game);
		canv= new GameCanvas(view);
		
		/* ������� ��������� ����*/
		w=new JFrame("JavaZombies");
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
        
        currentGame = game;
        
        //timer= new Timer( 1000 , ent->step() );
        timer = new Timer();
        timer.schedule(task, 1000, 1000);
	}
	
	static void step()
	{
		currentGame.step(0.1f);
		 w.update(canv.getGraphics());
	}
	
	static GameCanvas canv;
	static JFrame w;
	static Timer timer;
	static IGame currentGame;
	static GameTimerTask task = new GameTimerTask();
}
