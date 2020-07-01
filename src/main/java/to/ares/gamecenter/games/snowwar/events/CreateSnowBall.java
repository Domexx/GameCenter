package to.ares.gamecenter.games.snowwar.events;
/*
 * ****************
 * @author capos *
 * ****************
 */
import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;
import to.ares.gamecenter.games.snowwar.objects.SnowBallGameObject;

public class CreateSnowBall extends Event {
	public SnowBallGameObject ball;
	public HumanGameObject player;
	public int x;
	public int y;
	public int type;

	public CreateSnowBall(final SnowBallGameObject ball, final HumanGameObject player, final int x, final int y, final int type) {
		EventType = CREATESNOWBALL;
		this.ball = ball;
		this.player = player;
		this.x = x;
		this.y = y;
		this.type = type;
	}

	@Override
	public void apply() {
		ball.initialize(player.location3D().x(), player.location3D().y(), type, x, y, player);
		ball.GenerateCHECKSUM(player.currentSnowWar, 1);
		player.currentSnowWar.addGameObject(ball);
	}
}
