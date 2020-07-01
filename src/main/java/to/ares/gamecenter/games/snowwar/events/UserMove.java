package to.ares.gamecenter.games.snowwar.events;

import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;

public class UserMove extends Event {
	public HumanGameObject player;
	public int x;
	public int y;

	public UserMove(final HumanGameObject player, final int x, final int y) {
		EventType = MOVE;
		this.player = player;
		this.x = x;
		this.y = y;
	}

	@Override
	public void apply() {
		player.setMove(x, y);
	}
}
