package to.ares.gamecenter.games.snowwar.events;

import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;

public class PlayerLeftEvent extends BaseEvent {
	public HumanGameObject player;

	public PlayerLeftEvent(final HumanGameObject player) {
		eventType = PLAYERLEFT;
		this.player = player;
	}

	@Override
	public void apply() {
		player.currentSnowWar.queueDeleteObject(player);
		player.cleanTiles();
	}
}
