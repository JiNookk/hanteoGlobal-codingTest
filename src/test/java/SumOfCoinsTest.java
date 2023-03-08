import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfCoinsTest {
    SumOfCoins sumOfCoins;

    @BeforeEach
    void setup() {
        sumOfCoins = new SumOfCoins();
    }

    @Test
    void getCombination() {
        assertEquals(sumOfCoins.countCoinCombinations(new int[]{1, 2, 3}, 2), 2);
        assertEquals(sumOfCoins.countCoinCombinations(new int[]{1, 2, 3}, 4), 4);
        assertEquals(sumOfCoins.countCoinCombinations(new int[]{2, 5, 3, 6}, 10), 5);
    }
}
