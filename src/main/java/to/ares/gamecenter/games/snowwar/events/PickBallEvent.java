package to.ares.gamecenter.games.snowwar.events;

import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;
import to.ares.gamecenter.games.snowwar.objects.PickBallsGameItemObject;

public class PickBallEvent extends Event {
	public HumanGameObject player;
	public PickBallsGameItemObject gameItem;

	public PickBallEvent(final HumanGameObject player, final PickBallsGameItemObject gameItem) {
		eventType = PICKBALLFROMGAMEITEM;
		this.player = player;
		this.gameItem = gameItem;
	}

	@Override
	public void apply() {
		int local2;
		final int local1 = player.availableSnowBallSlots();
        if (local1 > 0){
            local2 = gameItem.pickUp(1);
            if (local2 > 0){
                player.addSnowBalls(local2);
            }
        }

        if(gameItem.concurrentUses > 0) {
        	gameItem.concurrentUses--;
        }
	}
}
