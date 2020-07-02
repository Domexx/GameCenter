package to.ares.gamecenter.games.snowwar.events;

import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;

public class MakeSnowBallEvent extends BaseEvent {
	public HumanGameObject player;

	public MakeSnowBallEvent(final HumanGameObject player) {
		eventType = MAKESNOWBALL;
		this.player = player;
	}

	@Override
	public void apply() {
		player.makeSnowBall();
	}
}
