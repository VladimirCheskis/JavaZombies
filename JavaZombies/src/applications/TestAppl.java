package applications;

import entities.Entity;
import entities.Game;
import window.GameWindow;

public class TestAppl {

	public static void main(String[] args) {
		
		Game game = new Game();
		game.add(new Entity("Jon", 1, 0));
		game.add(new Entity("Sam", 0, 1));
		
		GameWindow.showGame(game);
	}

}
