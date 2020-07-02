package to.ares.gamecenter.messages.outgoing.snowwar;
/*
 * ****************
 * @author capos *
 * ****************
 */
import com.eu.habbo.messages.ServerMessage;
import com.eu.habbo.messages.outgoing.MessageComposer;

public class WeeklyLeaderboardComposer extends MessageComposer {
	
	private int gameid = 0;

	public WeeklyLeaderboardComposer(int gameid) {
		this.gameid = gameid;
	}

	@Override
	public ServerMessage composeInternal()
	{
		this.response.init(2270);
		this.response.appendInt(2013);
		this.response.appendInt(6); // week offset?
		this.response.appendInt(10); // week offset limit?
		this.response.appendInt(0); // 0 = this week, other = prev week
		this.response.appendInt(23); // day
		this.response.appendInt(1);

		this.response.appendInt(2);
		this.response.appendInt(4000);
		this.response.appendInt(1);
		this.response.appendString("devtest");
		this.response.appendString("hr-100-61.hd-180-2.sh-290-91.ch-210-66.lg-270-82");
		this.response.appendString("M");

		this.response.appendInt(0); // position start or end....
		this.response.appendInt(gameid);
		return this.response;
	}


}
