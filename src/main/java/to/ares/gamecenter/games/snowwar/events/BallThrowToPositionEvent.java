package to.ares.gamecenter.games.snowwar.events;

import to.ares.gamecenter.games.snowwar.objects.HumanObject;

public class BallThrowToPositionEvent extends BaseEvent {
	public HumanObject attacker;

	public int x;
	public int y;
	public int type;

	public BallThrowToPositionEvent(final HumanObject attacker, final int x, final int y, final int type) {
		eventType = BALLTHROWPOSITION;
		this.attacker = attacker;
		this.x = x;
		this.y = y;
		this.type = type;
	}

	@Override
	public void onApply() {
		attacker._vs(x, y);
		attacker._w1();
	}
}
