import com.coderhglee.currency.Dollar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoneyTest {

    @DisplayName("달러는 곱셈이 가능하다.")
    @Test
    void dollarTimes() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertThat(five.amount()).isEqualTo(10);
    }
}
