import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RPSTest {

    RPS rps;

    public RPSTest() {
    }

    @BeforeEach
    void setUp() {this.rps = new RPS();}

    @Test
    void RPSFunctionPlayerOneWins() {
        String expectedResult = "Player 1 wins";
        String actualResult = RPS.rpsFunction("rock","scissors");
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void RPSFunctionPlayerTwoWins() {
        String expectedResult = "Player 2 wins";
        String actualResult = RPS.rpsFunction("rock","paper");;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void RPSFunctionPlayerTies() {
        String expectedResult = "TIE";
        String actualResult = RPS.rpsFunction("rock","rock");;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void RPSFunctionError() {
        String expectedResult = "Invalid input, try again";
        String actualResult = RPS.rpsFunction("rock","apple");;
        Assertions.assertEquals(expectedResult, actualResult);
    }
}