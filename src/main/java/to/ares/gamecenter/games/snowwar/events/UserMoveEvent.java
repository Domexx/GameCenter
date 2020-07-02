package to.ares.gamecenter.games.snowwar.events;

import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;

public class UserMoveEvent extends Event {
	public HumanGameObject player;
	public int x;
	public int y;

	public UserMoveEvent(final HumanGameObject player, final int x, final int y) {
		eventType = MOVE;
		this.player = player;
		this.x = x;
		this.y = y;
	}

	@Override
	public void apply() {
		player.setMove(x, y);
	}
}
