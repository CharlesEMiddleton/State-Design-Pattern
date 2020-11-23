
public class GameConsole {
	/**
	 * initializes instance variables 
	 */
private State HomeState;
private State NintendoState;
private State xBoxState;
private State state; 
/**
 * sets the state and variables 
 */
public GameConsole() {
	HomeState = new HomeState(this);
	NintendoState = new NintendoState(this);
	xBoxState = new XBoxState(this);
	state = HomeState;
	System.out.println("Starting up the Game Console");
}
/**
 * calls the current state's press home button
 */
public void pressHomeButton() {
	state.pressHomeButton();
	System.out.println();
}
/**
 * calls the current state's press nintendo button
 */
public void pressNintendoButton() {
	state.pressNintendoButton();
	System.out.println();
}
/**
 * calls the current state's press xbox button
 */
public void pressXBoxButton() {
	state.pressXBoxButton(); 
	System.out.println();
}
/**
 * calls the current state's press game button
 */
public void pressGameButton() {
	state.pressGameButton();
	System.out.println();
	
}
public void setState(State state) {
	this.state = state;
	
}
/**
 * getter for homeState
 * @return HomeState
 */
public State getHomeState() {
	return HomeState;
}
/**
 * getter for nintendoState
 * @return NintendoState
 */
public State getNintendoState() {
return NintendoState;	
}
/**
 * getter for xbox state 
 * @return xBoxState
 */
public State getXBoxState() {
	return xBoxState;
}
}
