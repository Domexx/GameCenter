package to.ares.gamecenter.games.snowwar.events;

import to.ares.gamecenter.games.snowwar.objects.MachineObject;

public class AddBallEvent extends BaseEvent {
	public MachineObject gameItem;

	public AddBallEvent(final MachineObject gameItem) {
		eventType = ADDBALLTOMACHINE;
		this.gameItem = gameItem;
	}

	@Override
	public void onApply() {
		gameItem.addSnowBall();
	}
}
