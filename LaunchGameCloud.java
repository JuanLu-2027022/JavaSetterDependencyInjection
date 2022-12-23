import java.util.ArrayList;
import java.util.List;

/**
 * @author Juan Lu 2027022
 *
 */
public class LaunchGameCloud implements ILaunchGame{
	
	public List<Object[]> launchFromCloud() {
        List<Object[]> gameFromCloud = new ArrayList<Object[]>();
        //Logic to access cloud game;
        System.out.println("Cloud game is launched!");
        return gameFromCloud;
    }

	@Override
	public List<Object[]> setLaunchGame(ILaunchGame launchGame) {
		// TODO Auto-generated method stub
		return launchFromCloud();
	}

}
