/**
 * 
 */

/**
 * @author Juan Lu 2027022
 *
 */
public class GameApp {
	
	private IConsole consoleobj = null;
	private ILaunchGame gameobj = null;
    
    public void Play(){
    	
    	consoleobj.play();
    	gameobj.setLaunchGame(gameobj);
        System.out.println("You can start playing....");
    }

	public void setConsoleobj(IConsole consoleobj) {
		this.consoleobj = consoleobj;
	}

	public void setGameobj(ILaunchGame gameobj) {
		this.gameobj = gameobj;
	}  
	

}
