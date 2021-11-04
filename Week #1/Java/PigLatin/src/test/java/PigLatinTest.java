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
        StringBuilder expectedResult = new StringBuilder("evinKay siay ineFay");
        StringBuilder actualResult = this.pigLatin.pigLatin("Kevin is Fine");
        Assertions.assertEquals(expectedResult, actualResult);
    }

}