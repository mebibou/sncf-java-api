package com.bibssoftware.libraries.sncf.api;

import com.bibssoftware.libraries.sncf.model.*;

/**
 * 
 * @author bibssoftware
 *
 */
public class TransilienAPI extends BaseAPI {

  private static String API_URL = "http://api.transilien.com/";

  public TransilienAPI() {
    super(API_URL);
  }

  /**
   * Get the next time departures from a starting train station to another.
   * @param startGareId {@link Long} the UIC code of the starting train station
   * @param arrivalGareId {@link Long} the UIC code of the the destination train station
   * @return {@link Passages} containing list of {@link Train}
   */
  public Passages nextTrain(Long startGareId, Long arrivalGareId) {
    return this.doGet("gare/" + startGareId + "/depart/" + arrivalGareId + "/", Passages.class);
  }

  /**
   * Get the next time departures of a train station.
   * @param gareId {@link Long} the UIC code of the train station
   * @return {@link Passages} containing list of {@link Train}
   */
  public Passages nextTrain(Long gareId) {
    return this.doGet("gare/" + gareId + "/depart/", Passages.class);
  }

}
