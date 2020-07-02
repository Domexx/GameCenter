package to.ares.gamecenter.games.snowwar.events;

import to.ares.gamecenter.games.snowwar.objects.HumanObject;

public class PlayerLeftEvent extends BaseEvent {
	public HumanObject player;

	public PlayerLeftEvent(final HumanObject player) {
		eventType = PLAYERLEFT;
		this.player = player;
	}

	@Override
	public void onApply() {
		player.currentSnowWar.queueDeleteObject(player);
		player.cleanTiles();
	}
}
