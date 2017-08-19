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
	  
	private static final int TIME_STEP = 1000;
	class GameTimerTask extends TimerTask {

		public GameTimerTask(GameWindow gameWindow) {
			super();
			this.gameWindow = gameWindow;
		}
		@Override
		public void run() {
			gameWindow.step();
		}
		GameWindow gameWindow;
	}
		
	public void showGame(IGame game)
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
        
        timer = new Timer();
        timer.schedule(task, TIME_STEP, TIME_STEP);
	}
	
	void step()
	{
		currentGame.step(TIME_STEP * 1.E-3f);
		w.update(canv.getGraphics());
	}
	
	GameCanvas canv;
	JFrame w;
	Timer timer;
	IGame currentGame;
	GameTimerTask task = new GameTimerTask(this);
}
