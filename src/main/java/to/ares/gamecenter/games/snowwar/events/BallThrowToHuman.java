package to.ares.gamecenter.games.snowwar.events;

import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;

public class BallThrowToHuman extends Event {
	public HumanGameObject attacker;
	public HumanGameObject victim;
	public int type;

	public BallThrowToHuman(final HumanGameObject attacker, final HumanGameObject victim, final int type) {
		eventType = BALLTHROWHUMAN;
		this.attacker = attacker;
		this.victim = victim;
		this.type = type;
	}

	@Override
	public void apply() {
		attacker._vs(victim.location3D().x(), victim.location3D().y());
		attacker._w1();
	}
}
