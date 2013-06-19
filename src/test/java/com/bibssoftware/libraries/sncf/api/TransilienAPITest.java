package com.bibssoftware.libraries.sncf.api;

import org.junit.Test;

import com.bibssoftware.libraries.sncf.model.*;

public class TransilienAPITest {

  @Test
  public void testNextTrain() {
    TransilienAPI api = new TransilienAPI();
    Passages passages = api.nextTrain(87393009L);
    System.out.println(passages);
  }

}
