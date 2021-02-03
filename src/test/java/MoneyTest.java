import com.coderhglee.currency.Dollar;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoneyTest {

    @DisplayName("달러는 곱셈이 가능하다.")
    @Test
    void dollarTimes() {
        Dollar five = new Dollar(5);

        assertThat(five.times(2).amount()).isEqualTo(10);
        assertThat(five.times(3).amount()).isEqualTo(15);
    }
}
