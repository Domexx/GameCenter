package to.ares.gamecenter.games.snowwar.events;

import to.ares.gamecenter.games.snowwar.objects.HumanObject;

public class MakeSnowBallEvent extends BaseEvent {
	public HumanObject player;

	public MakeSnowBallEvent(final HumanObject player) {
		eventType = MAKESNOWBALL;
		this.player = player;
	}

	@Override
	public void onApply() {
		player.makeSnowBall();
	}
}
