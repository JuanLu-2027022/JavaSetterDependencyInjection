import java.util.ArrayList;
import java.util.List;

/**
 * @author Juan Lu 2027022
 *
 */
public class LaunchGameLocal implements ILaunchGame{
	
	public List<Object[]> launchFromLocal() {
        List<Object[]> gameFromLocal = new ArrayList<Object[]>();
        //Logic to access local game; 
        System.out.println("Local game is launched!");
        return gameFromLocal;
    }

	@Override
	public List<Object[]> setLaunchGame(ILaunchGame launchGame) {
		// TODO Auto-generated method stub
		return launchFromLocal();
	}


}
