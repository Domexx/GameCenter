package to.ares.gamecenter.games.snowwar.room;

import to.ares.gamecenter.games.snowwar.SnowWar;
import to.ares.gamecenter.games.snowwar.room.arenas.BaseArena;
import to.ares.gamecenter.games.snowwar.events.BaseEvent;
import to.ares.gamecenter.games.snowwar.objects.HumanObject;
import com.eu.habbo.messages.outgoing.MessageComposer;
import io.netty.channel.Channel;
import to.ares.gamecenter.games.snowwar.stages.SnowWarStage;
import to.ares.gamecenter.games.snowwar.stages.SynchronizedStage;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class SnowWarRoom extends SynchronizedStage {
	public int[] teamScore = new int[SnowWar.TEAMS.length];

	public int checksum;
	public int roomId;
	public int result; // Result. 2 = match scores, 0,1 or other = do the same
	public int status; // 0 = SnowWar.FINDPLAYERS
	public int timeToStart;
	public int turn;
	public int winner;

	public String name;
	public String owner;

	public boolean lobbyFull;

	public BaseArena arenaType;

	public HumanObject mostHits;
	public HumanObject mostKills;
	public SnowWarStage map;

	public final Map<Integer, Map<Integer, HumanObject>> teamPlayers = new ConcurrentHashMap<Integer, Map<Integer, HumanObject>>(SnowWar.TEAMS.length);
	public final Map<Integer, HumanObject> players = new ConcurrentHashMap<Integer, HumanObject>(SnowWar.MAXPLAYERS);

	public final List<BaseEvent> gameEvents = Collections.synchronizedList(new ArrayList<BaseEvent>());

	public List<Channel> fullGameStatusQueue;

	public SnowWarRoom(int id) {
		super();

		Random rand = new Random();

		arenaType = SnowWar.ArenaTypes[rand.nextInt(SnowWar.ArenaTypes.length)];
		roomId = id;
		name = "SnowStorm level " + arenaType.arenaType;
		map = new SnowWarStage();
		map.initialize(arenaType);
		for (final int TeamId : SnowWar.TEAMS) {
			teamPlayers.put(TeamId, new ConcurrentHashMap<Integer, HumanObject>());
		}
	}

	public void broadcast(final MessageComposer Message) {
		for (final HumanObject player : players.values()) {
			if (player.currentSnowWar != null) {
				player.cn.sendResponse(Message);
			}
		}
	}

	private Map<Integer, HumanObject> stageLoadedPlayers;

	public Collection<HumanObject> getStageLoadedPlayers() {
		if(stageLoadedPlayers == null) {
			return null;
		}

		final Collection<HumanObject> result = stageLoadedPlayers.values();
		stageLoadedPlayers = null;

		return result;
	}

	public void stageLoaded(HumanObject humanObject) {
		if(stageLoadedPlayers == null) {
			stageLoadedPlayers = new ConcurrentHashMap<Integer, HumanObject>();
		}

		stageLoadedPlayers.put(humanObject.objectId, humanObject);
		humanObject.stageLoaded = true;
	}
}