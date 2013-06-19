package com.bibssoftware.libraries.sncf.model;


public class Gare {
  
  public Long id;
  public String name;
  
  @Override
  public String toString() {
    return this.name+" (" + this.id + ")";
  }

}
