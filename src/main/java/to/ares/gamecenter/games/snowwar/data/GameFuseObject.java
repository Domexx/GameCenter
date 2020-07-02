package to.ares.gamecenter.games.snowwar.data;

import to.ares.gamecenter.games.snowwar.arenas.items.Item;

public class GameFuseObject extends Item {
	public int X;
	public int Y;
	public int Rot;
	public int Z;

	public GameFuseObject() {
		extraData = new StringData(null);
	}
}
