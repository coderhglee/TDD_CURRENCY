import com.coderhglee.currency.Dollar;
import com.coderhglee.currency.Franc;
import com.coderhglee.currency.Money;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoneyTest {

    @DisplayName("달러는 곱셈이 가능하다.")
    @Test
    void dollarTimes() {
        Money five = Money.dollar(5);

        assertThat(five.times(2)).isEqualTo(Money.dollar(10));
        assertThat(five.times(3)).isEqualTo(Money.dollar(15));
    }

    @DisplayName("달러의 값을 비교 가능해야한다.")
    @Test
    void dollarEquality() {
        assertThat(Money.dollar(5)).isEqualTo(Money.dollar(5));
        assertThat(Money.dollar(5)).isNotEqualTo(Money.dollar(7));
    }

    @DisplayName("Dollar equals Franc")
    @Test
    void compareDollarAndFranc() {
        assertThat(Money.dollar(5)).isNotEqualTo(Money.franc(5));
    }

    @DisplayName("통화 단위")
    @Test
    void testCurrency() {
        assertThat(Money.dollar(5).currency()).isEqualTo("USD");
        assertThat(Money.franc(5).currency()).isEqualTo("CHF");
    }
}
