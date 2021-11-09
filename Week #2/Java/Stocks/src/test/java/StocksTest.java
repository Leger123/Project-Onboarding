import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StocksTest {
    Stocks stocks;

    StocksTest(){

    }

    @BeforeEach
    void setUp() {this.stocks = new Stocks();}

    @Test
    void stocksFunction() {
        int[] array = {14, 12, 70, 15, 99, 65, 21, 90};
        Assertions.assertEquals(87,stocks.stocksFunction(array));
    }
}