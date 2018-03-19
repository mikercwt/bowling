package agile.engineering.test;

import agile.engineering.BowlingScore;
import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BowlingScoreTest
{
    private BowlingScore bowlingScore = new BowlingScore();

    @Before
    public void beforeEachTest()
    {

    }

    @After
    public void afterEachTest()
    {

    }

    @Test
    public void allGutterBalls()
    {
        List<Integer> frameResults = new ArrayList<Integer>();
        Collections.addAll(frameResults, 0,0, 0,0, 0,0, 0,0, 0,0,
            0,0, 0,0, 0,0, 0,0, 0,0);
        int score = bowlingScore.sumGame(frameResults);
        assertEquals("Score should be zero",0,score);
    }

    @Test
    public void allOpenFrames() {
        List<Integer> frameResults = new ArrayList<Integer>();
        Collections.addAll(frameResults, 0,1, 1,2, 2,3, 3,4, 4,5,
            0,6, 1,7, 1,8, 2,7, 3,6, 0,0);

        int score = bowlingScore.sumGame(frameResults);
        assertEquals("Score equals 66",66,score);
    }

    @Test
    public void oneSpareFrame() {
        List<Integer> frameResults = new ArrayList<Integer>();
        Collections.addAll(frameResults, 0,1, 8,2, 2,3, 3,4, 4,5,
            0,6, 1,7, 1,8, 2,7, 3,6, 0,0);

        int score = bowlingScore.sumGame(frameResults);
        assertEquals("Score equals 75",75,score);

        // blah blah blah !!!
    }
}
