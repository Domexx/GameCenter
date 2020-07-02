package to.ares.gamecenter.games.snowwar.events;

import to.ares.gamecenter.games.snowwar.objects.HumanObject;

public class UserMoveEvent extends BaseEvent {
	public HumanObject player;
	public int x;
	public int y;

	public UserMoveEvent(final HumanObject player, final int x, final int y) {
		eventType = MOVE;
		this.player = player;
		this.x = x;
		this.y = y;
	}

	@Override
	public void onApply() {
		player.setMove(x, y);
	}
}
