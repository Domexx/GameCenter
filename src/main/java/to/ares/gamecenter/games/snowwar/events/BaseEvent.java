package to.ares.gamecenter.games.snowwar.events;

public abstract class BaseEvent {
	public final static int PLAYERLEFT = 1;
	public final static int MOVE = 2;
	public final static int BALLTHROWHUMAN = 3;
	public final static int BALLTHROWPOSITION = 4;
	public final static int MAKESNOWBALL = 7;
	public final static int CREATESNOWBALL = 8;
	public final static int ADDBALLTOMACHINE = 11;
	public final static int PICKBALLFROMGAMEITEM = 12;

	public int eventType;
	public abstract void apply();
}