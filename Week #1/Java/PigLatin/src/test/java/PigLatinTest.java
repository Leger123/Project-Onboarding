import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PigLatinTest {
    PigLatin pigLatin;

    public PigLatinTest() {
    }

    @BeforeEach
    void setUp(){ this.pigLatin = new PigLatin(); }

    @Test
    void pigLatin() {
        String expectedResult = "evinKay isway ineFay";
        Assertions.assertEquals(expectedResult, this.pigLatin.pigLatin("Kevin is Fine"));
    }

}