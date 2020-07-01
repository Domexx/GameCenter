package to.ares.gamecenter.games.fastfood;

import com.eu.habbo.Emulator;
import com.eu.habbo.habbohotel.users.Habbo;
import com.eu.habbo.habbohotel.users.HabboInfo;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import to.ares.gamecenter.Game;
import to.ares.gamecenter.messages.outgoing.gamecenter.GameCenterGameFrameURLComposer;

import javax.net.ssl.HttpsURLConnection;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;

public class FastFoodGame extends Game {
    private final Logger LOGGER = LoggerFactory.getLogger(Emulator.class);

    public FastFoodGame(int gameId) {
        super(gameId);
    }

    @Override
    public String getCode() {
        return "basejump";
    }

    @Override
    public String getBackgroundColor() {
        return "68bbd2";
    }

    @Override
    public String getTextColor() {
        return "";
    }

    @Override
    public String getAssetPath() {
        return Emulator.getConfig().getValue("gamecenter.fastfood.assets");
    }

    @Override
    public Boolean getStatus() {
        return Emulator.getConfig().getBoolean("gamecenter.fastfood.enabled");
    }

    @Override
    public int getGamesLeftCount(Habbo habbo) {
        return 3;
    }

    @Override
    public void onPlay(int gameId, Habbo habbo) {
        String url = "https://api.thefastfoodgame.com/api";
        HabboInfo habboInfo = habbo.getHabboInfo();

        try {
            String postData = "";
            postData += "api-key=" + URLEncoder.encode(Emulator.getConfig().getValue("gamecenter.fastfood.apiKey"), "UTF-8") + "&";
            postData += "user-id=" + URLEncoder.encode(habboInfo.getId() + "", "UTF-8") + "&";
            postData += "user-name=" + URLEncoder.encode(habboInfo.getUsername(), "UTF-8") + "&";
            postData += "user-avatar=" + URLEncoder.encode(habboInfo.getLook(), "UTF-8") + "&";
            postData += "theme=" + URLEncoder.encode(Emulator.getConfig().getValue("gamecenter.fastfood.theme", "default"), "UTF-8");

            URL obj = new URL(url);

            HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("User-Agent", "arcturus");
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            con.setRequestProperty("Content-Length", "" + postData.getBytes().length);
            con.setDoOutput(true);

            DataOutputStream wr = new DataOutputStream(con.getOutputStream());

            wr.write(postData.getBytes());
            wr.flush();
            wr.close();

            int responseCode = con.getResponseCode();

            if(responseCode != 200) {
                throw new Exception("FastFood - Invalid http response code " + responseCode);
            }

            InputStream stream = con.getInputStream();

            byte[] d = new byte[stream.available()];
            stream.read(d, 0, d.length);
            String responseBody = new String(d);

            stream.close();
            con.disconnect();

            Gson gson = new Gson();
            JsonObject apiResponse = gson.fromJson(responseBody, JsonObject.class);

            if(apiResponse.get("status").getAsString().equals("success")) {
                habbo.getClient().sendResponse(new GameCenterGameFrameURLComposer(apiResponse.get("url").getAsString(), gameId));
            }
        }
        catch(Exception ex) {
            LOGGER.error("FastFood", ex.toString());
        }
    }
}
