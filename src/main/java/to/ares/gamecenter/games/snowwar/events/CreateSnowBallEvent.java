package to.ares.gamecenter.games.snowwar.events;

import to.ares.gamecenter.games.snowwar.objects.HumanObject;
import to.ares.gamecenter.games.snowwar.objects.SnowBallObject;

public class CreateSnowBallEvent extends BaseEvent {
	public SnowBallObject ball;
	public HumanObject player;
	public int x;
	public int y;
	public int type;

	public CreateSnowBallEvent(final SnowBallObject ball, final HumanObject player, final int x, final int y, final int type) {
		eventType = CREATESNOWBALL;
		this.ball = ball;
		this.player = player;
		this.x = x;
		this.y = y;
		this.type = type;
	}

	@Override
	public void onApply() {
		ball.initialize(player.location3D().x(), player.location3D().y(), type, x, y, player);
		ball.GenerateCHECKSUM(player.currentSnowWar, 1);
		player.currentSnowWar.addGameObject(ball);
	}
}
