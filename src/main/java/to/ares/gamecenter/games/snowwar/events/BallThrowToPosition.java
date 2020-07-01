package to.ares.gamecenter.games.snowwar.events;
/*
 * ****************
 * @author capos *
 * ****************
 */
import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;

public class BallThrowToPosition extends Event {
	public HumanGameObject attacker;
	public int x;
	public int y;
	public int type;

	public BallThrowToPosition(final HumanGameObject attacker, final int x, final int y, final int type) {
		eventType = BALLTHROWPOSITION;
		this.attacker = attacker;
		this.x = x;
		this.y = y;
		this.type = type;
	}

	@Override
	public void apply() {
		attacker._vs(x, y);
		attacker._w1();
	}
}
