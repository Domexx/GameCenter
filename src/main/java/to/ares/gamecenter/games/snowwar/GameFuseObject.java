package to.ares.gamecenter.games.snowwar;

import to.ares.gamecenter.games.snowwar.items.Item;
import to.ares.gamecenter.games.snowwar.items.StringStuffData;

public class GameFuseObject extends Item {
	public int X;
	public int Y;
	public int Rot;
	public int Z;

	public GameFuseObject() {
		extraData = new StringStuffData(null);
	}
}
