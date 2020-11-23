import java.util.*;

public class XBoxState implements State {
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
	listOfGames.add("Assasins Creed");
	listOfGames.add("Skyrim: The Elder Scrolls");
	listOfGames.add("Left 4 Dead");
	listOfGames.add("GTA 5");
	listOfGames.add("Apex Legends");
}

public XBoxState(GameConsole gameConsole) {
	this.gameConsole = gameConsole;
}
/**
 * displays home button
 */
	
	public void pressHomeButton() {
		System.out.println("Display Home Screen...");
		gameConsole.setState(gameConsole.getHomeState());
	}
	/**
	 * displays Nintendo
	 */
	public void pressNintendoButton() {
		System.out.println("Starting Nintendo...");
		gameConsole.setState(gameConsole.getNintendoState());

		
	}
	/**
	 * displays xbox
	 */
	public void pressXBoxButton() {
		System.out.println("you are already view Xbox");
		gameConsole.setState(gameConsole.getXBoxState());

	}
	/**
	 * displays games 
	 */
	public void pressGameButton() {
		System.out.println("you have the following games: ");
			System.out.println(listOfGames);
		

	}

}
