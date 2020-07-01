package to.ares.gamecenter.games.snowwar.events;
/*
 * ****************
 * @author capos *
 * ****************
 */

import to.ares.gamecenter.games.snowwar.objects.HumanGameObject;

public class MakeSnowBall extends Event {
    public HumanGameObject player;

    public MakeSnowBall(final HumanGameObject player) {
        EventType = Event.MAKESNOWBALL;
        this.player = player;
    }

    @Override
    public void apply() {
        player.makeSnowBall();
    }
}
