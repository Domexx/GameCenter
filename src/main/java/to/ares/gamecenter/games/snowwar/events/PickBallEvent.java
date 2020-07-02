package to.ares.gamecenter.games.snowwar.events;

import to.ares.gamecenter.games.snowwar.objects.HumanObject;
import to.ares.gamecenter.games.snowwar.objects.PickBallsItemObject;

public class PickBallEvent extends BaseEvent {
	public HumanObject player;
	public PickBallsItemObject gameItem;

	public PickBallEvent(final HumanObject player, final PickBallsItemObject gameItem) {
		eventType = PICKBALLFROMGAMEITEM;
		this.player = player;
		this.gameItem = gameItem;
	}

	@Override
	public void onApply() {
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
