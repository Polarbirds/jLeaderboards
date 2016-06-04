package com.polarbirds.jleaderboards;

import com.polarbirds.httppost.HttpPoster;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Harald on 03.06.2016.
 */
public class LeaderboardPoster {

  public static void post(String url, Map<?, ?> values) {
    HttpPoster.sendData(url, values);
  }

  /**
   * Takes the given parameters and send them to the given URL as an HTTP POST request
   * @param url URL of where to send
   * @param value Value of the leaderboard-score
   * @param username  Username of who took the score
   * @param time_submitted  The time in which the score was completed
   * @param typename  Type of score
   * @param gamename  Name of game in which the score was taken
   */
  public static void sendScore(String url, String value, String username, String time_submitted,
                               String typename, String gamename) {
    Map<String, String> map = new HashMap<>();
    map.put("value", value);
    map.put("username", username);
    map.put("time_submitted", time_submitted);
    map.put("typename", typename);
    map.put("gamename", gamename);
    HttpPoster.sendData(url, map);
  }
}
