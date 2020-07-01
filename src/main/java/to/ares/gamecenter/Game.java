package to.ares.gamecenter;

import com.eu.habbo.habbohotel.users.Habbo;

/**
 *
 * @author Beny.
 */

public class Game {

    private int gameId;

    public Game(int gameId) {
        this.gameId = gameId;
    }

    public int getId() {
        return gameId;
    }

    /*
     * Returns the short game name, such as basejump, snowwar, slotcar
     */
    public String getCode() {
        return "";
    }

    /*
     * Returns the hex code for gamecenter page background colour
     */
    public String getBackgroundColor() {
        return "";
    }

    /*
     * Returns the hex code for gamecenter text colour
     */
    public String getTextColor() {
        return "";
    }

    /*
     * Returns the URL for where the asset images are stored (_icon.pg, _theme.png, _logo.png)
     */
    public String getAssetPath() {
        return "";
    }

    /*
     * Returns if the game is active or not. Can be used to check if the game servers are online or not.
     */
    public Boolean getStatus() {
        return false;
    };

    /*
     * Returns the number to display next to play button.
     * Could be used as a "Games Left Count" or "Notifications Count".
     */
    public int getGamesLeftCount(Habbo habbo) {
        return 0;
    }

    /*
     * This will be called to every time someone clicks the play button.
     */
    public void onPlay(int gameId, Habbo habbo) {
    }

}
