/**
 * @author Juan Lu 2027022
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GameApp gameApp = new GameApp();
		 gameApp.setConsoleobj(new SwitchConsole());
		 gameApp.setGameobj( new LaunchGameCloud());
		 gameApp.Play();
	}

}
