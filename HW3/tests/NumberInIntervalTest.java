import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
public class NumberInIntervalTest {

    private NumberInInterval numberInInterval;

    @BeforeEach
    void setUp() {
        numberInInterval = new NumberInInterval();
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 100})
    void NumberInInterval(int num) {
        assertThat(numberInInterval.numberInInterval(num)).isTrue();
    }


    @ParameterizedTest
    @ValueSource(ints = {24, 101})
    void NumberOutInterval(int num) {
        assertThat(numberInInterval.numberInInterval(num)).isFalse();
    }

}
