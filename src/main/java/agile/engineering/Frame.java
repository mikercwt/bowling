package agile.engineering;

public class Frame {
  Integer rollOne;
  Integer rollTwo;
  Integer frameScore;

  public Frame(Integer rollOne, Integer rollTwo){
    this.rollOne = rollOne;
    this.rollTwo = rollTwo;

    this.frameScore = rollOne + rollTwo;
  }

  public Integer getFrameScore() {
    return this.frameScore;
  }

  public Integer getRollOne() {
    return this.rollOne;
  }
}
