package to.ares.gamecenter.games.snowwar.events;
/*
 * ****************
 * @author capos *
 * ****************
 */
import to.ares.gamecenter.games.snowwar.objects.MachineGameObject;

public class AddBallToMachine extends Event {
	public MachineGameObject gameItem;

	public AddBallToMachine(final MachineGameObject gameItem) {
		EventType = ADDBALLTOMACHINE;
		this.gameItem = gameItem;
	}

	@Override
	public void apply() {
		gameItem.addSnowBall();
	}
}
