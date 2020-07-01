package to.ares.gamecenter.games.snowwar.events;

import to.ares.gamecenter.games.snowwar.objects.MachineGameObject;

public class AddBallToMachine extends Event {
	public MachineGameObject gameItem;

	public AddBallToMachine(final MachineGameObject gameItem) {
		eventType = ADDBALLTOMACHINE;
		this.gameItem = gameItem;
	}

	@Override
	public void apply() {
		gameItem.addSnowBall();
	}
}
