package to.ares.gamecenter.games.snowwar.room.arenas;

import to.ares.gamecenter.games.snowwar.room.items.AdsBackgroundObjectItem;
import to.ares.gamecenter.games.snowwar.room.SnowWarRoom;
import to.ares.gamecenter.games.snowwar.objects.BaseObject;
import to.ares.gamecenter.games.snowwar.room.pathfinding.SpawnPoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class BaseArena {
	public int arenaHeight;
	public int arenaType;
	public int arenaWidth;

	public String heightMap;

	public List<AdsBackgroundObjectItem> fuseObjects = new ArrayList<AdsBackgroundObjectItem>(200);

	public List<SpawnPoint> spawnsBlue = new ArrayList<SpawnPoint>(5);
	public List<SpawnPoint> spawnsRed = new ArrayList<SpawnPoint>(5);

	public abstract void gameObjects(Map<Integer, BaseObject> gameObjects, SnowWarRoom room);
}
