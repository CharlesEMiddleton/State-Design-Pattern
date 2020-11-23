
public class HomeState {
	
	private GameConsole gameConsole;
	public HomeState(GameConsole gameConsole) {
		this.gameConsole = gameConsole;
	}
	/**
	 * displays Home 
	 */
	public void pressHomeButton() {
		System.out.println("You are already on the home Screen");
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
		System.out.println("Starting Nintendo...");
		gameConsole.setState(gameConsole.getNintendoState());
		
	}
	/**
	 * displays games
	 */
	public void pressGameButton() {
		System.out.println("You have the following Games...");
	}

}
