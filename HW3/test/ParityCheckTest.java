import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ParityCheckTest {

    private ParityCheck parityCheck;
    @BeforeEach
    void setUp() {

        parityCheck = new ParityCheck();
    }

    // проверка на четность
    @Test
    void evenOddNumberTestEven(){
        assertThat(parityCheck.evenOddNumber(10)).isTrue();
    }

    // проверка на нечетность
    @Test
    void evenOddNumberTestUnEven(){
        assertThat(parityCheck.evenOddNumber(11)).isFalse();
    }

}
