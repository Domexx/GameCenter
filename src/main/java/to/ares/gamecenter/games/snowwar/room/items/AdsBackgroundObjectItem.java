package to.ares.gamecenter.games.snowwar.room.items;

import to.ares.gamecenter.games.snowwar.data.StringData;

public class AdsBackgroundObjectItem extends BaseItem {
	public int X;
	public int Y;
	public int Rot;
	public int Z;

	public AdsBackgroundObjectItem() {
		extraData = new StringData(null);
	}
}
