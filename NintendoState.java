import java.util.*;

public class NintendoState implements State {
/**
 * instance variables
 */
private GameConsole gameConsole;
private static List<String> listOfGames;
/**
 * list of games
 */

static {
	listOfGames = new ArrayList<>();
	listOfGames.add("Mario Cart");
	listOfGames.add("Super Mario Bros");
	listOfGames.add("Donkey Kong");
	listOfGames.add("Pokemon Go");
	listOfGames.add("Legend of Zelda");
}
/**
 * gameConsole 
 * @param gameConsole
 */
	public NintendoState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	/**
	 * displays home button
	 */
	public void pressHomeButton() {
		System.out.println("Display Home Screen");
		gameConsole.setState(gameConsole.getHomeState());
		
	}
	/**
	 * displays Nintendo button 
	 */
	public void pressNintendoButton() {
		System.out.println("You are already viewing Nintendo silly");
		gameConsole.setState(gameConsole.getNintendoState());
		
	}
	/**
	 * displays xbox button
	 */
	public void pressXBoxButton() {
		System.out.println("Starting xbox...");
		gameConsole.setState(gameConsole.getXBoxState());
		
	}
	/**
	 * dispays game button with list of games 
	 */
	public void pressGameButton() {
		System.out.println("You have the following games");
		for (String game: listOfGames) {
			System.out.println(listOfGames);
		}
	}
}
