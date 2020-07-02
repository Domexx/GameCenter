package to.ares.gamecenter.games.snowwar.events;

import to.ares.gamecenter.games.snowwar.objects.HumanObject;

public class BallThrowToHumanEvent extends BaseEvent {
	public HumanObject attacker;
	public HumanObject victim;

	public int type;

	public BallThrowToHumanEvent(final HumanObject attacker, final HumanObject victim, final int type) {
		eventType = BALLTHROWHUMAN;
		this.attacker = attacker;
		this.victim = victim;
		this.type = type;
	}

	@Override
	public void onApply() {
		attacker._vs(victim.location3D().x(), victim.location3D().y());
		attacker._w1();
	}
}
