package to.ares.gamecenter.games.snowwar.events;

import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;

public class PlayerLeft extends Event {
	public HumanGameObject player;

	public PlayerLeft(final HumanGameObject player) {
		eventType = PLAYERLEFT;
		this.player = player;
	}

	@Override
	public void apply() {
		player.currentSnowWar.queueDeleteObject(player);
		player.cleanTiles();
	}
}
