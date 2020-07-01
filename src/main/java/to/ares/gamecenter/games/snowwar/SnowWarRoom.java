package to.ares.gamecenter.games.snowwar;

import to.ares.gamecenter.games.snowwar.events.Event;
import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;
import com.eu.habbo.messages.outgoing.MessageComposer;
import io.netty.channel.Channel;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class SnowWarRoom extends SynchronizedGameStage {
	public int[] TeamScore = new int[SnowWar.TEAMS.length];
	public int checksum;
	public int roomId;
	public int Result; // Result. 2 = match scores, 0,1 or other = do the same
	public int STATUS; // 0 = SnowWar.FINDPLAYERS
	public int TimeToStart;
	public int Turn;
	public int Winner;
	public String Name;
	public String Owner;
	public boolean LobbyFull;
	public Arena ArenaType;
	public HumanGameObject MostHits;
	public HumanGameObject MostKills;
	public SnowWarGameStage map;
	private Random rand = new Random();
	public final Map<Integer, Map<Integer, HumanGameObject>> TeamPlayers = new ConcurrentHashMap<Integer, Map<Integer, HumanGameObject>>(SnowWar.TEAMS.length);
	public final Map<Integer, HumanGameObject> players = new ConcurrentHashMap<Integer, HumanGameObject>(SnowWar.MAXPLAYERS);

	public final List<Event> gameEvents = Collections.synchronizedList(new ArrayList<Event>());

	public List<Channel> fullGameStatusQueue;

	public SnowWarRoom(int id) {
		super();

		ArenaType = SnowWar.ArenaTypes[rand.nextInt(SnowWar.ArenaTypes.length)];
		roomId = id;
		Name = "SnowStorm level " + ArenaType.ArenaType;
		map = new SnowWarGameStage();
		map.initialize(ArenaType);
		for (final int TeamId : SnowWar.TEAMS) {
			TeamPlayers.put(TeamId, new ConcurrentHashMap<Integer, HumanGameObject>());
		}
	}

	public void broadcast(final MessageComposer Message) {
		for (final HumanGameObject player : players.values()) {
			if (player.currentSnowWar != null) {
				player.cn.sendResponse(Message);
			}
		}
	}

	private Map<Integer, HumanGameObject> stageLoadedPlayers;

	public Collection<HumanGameObject> getStageLoadedPlayers() {
		if(stageLoadedPlayers == null) {
			return null;
		}

		final Collection<HumanGameObject> result = stageLoadedPlayers.values();
		stageLoadedPlayers = null;

		return result;
	}

	public void stageLoaded(HumanGameObject humanObject) {
		if(stageLoadedPlayers == null) {
			stageLoadedPlayers = new ConcurrentHashMap<Integer, HumanGameObject>();
		}

		stageLoadedPlayers.put(humanObject.objectId, humanObject);
		humanObject.stageLoaded = true;
	}
}