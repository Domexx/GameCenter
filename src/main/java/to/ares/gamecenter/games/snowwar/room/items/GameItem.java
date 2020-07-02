package to.ares.gamecenter.games.snowwar.room.items;

import to.ares.gamecenter.games.snowwar.data.StringData;

public class GameItem extends BaseItem {
	public int X;
	public int Y;
	public int Rot;
	public int Z;

	public GameItem() {
		extraData = new StringData(null);
	}
}
