package agile.engineering;

import java.util.ArrayList;
import java.util.List;

public class BowlingScore {

  /** sumGame will total up all the scores that are sent in through frameResults.
   * @param frameResults scores from each frame sent in
   * @return int
   */
  public int sumGame(List<Integer> frameResults) {
    List<Frame> frames = loadFrames(frameResults);
    int score = 0;
    for (int i=0; i<frames.size(); i++) {
      // calculate score
    }
    return score;
  }

  private List<Frame> loadFrames(List<Integer> frameResults) {
    List<Frame> frames = new ArrayList<Frame>();

    for (int i=1; i<=20; i++) {
      if(i%2 != 0){
        frames.add(new Frame(frameResults.get(i-1), frameResults.get(i)));
      }
    }
    return frames;
  }
}
