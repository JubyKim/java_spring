import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

import java.lang.annotation.Target;
@ExtendWith(MockitoExtension.class)
public class DollarCalculatorTest {

    @Mock
    public MarketAPI marketAPI;

    @BeforeEach
    public void init() {
        Mockito.lenient().when(marketAPI.connnect()).thenReturn(3000);
    }
    @Test
    public void dollarTest() {
        MarketAPI marketAPI = new MarketAPI();
        DollarCalculator dollarCalculator = new DollarCalculator(marketAPI);
        dollarCalculator.init();
//        Calculator calculator = new Calculator(new KrwCalculator());

//        System.out.println(calculator.sum(10,10));
        System.out.println(dollarCalculator.sum(10,10));

        Assertions.assertEquals(22000,dollarCalculator.sum(10,10));

    }

    @Test
    public void mockTest() {
        MarketAPI marketAPI2 = marketAPI;
        DollarCalculator dollarCalculator = new DollarCalculator(marketAPI2);
        dollarCalculator.init();

        System.out.println(dollarCalculator.sum(10,10));

        // Assertions test 확인
        Assertions.assertEquals(60000,dollarCalculator.sum(10,10));
        Assertions.assertEquals(0,dollarCalculator.minus(10,10));

    }

}
