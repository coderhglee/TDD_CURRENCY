import com.coderhglee.currency.Bank;
import com.coderhglee.currency.Expression;
import com.coderhglee.currency.Money;
import com.coderhglee.currency.Sum;
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

    @DisplayName("통화 단위 동치성 테스트")
    @Test
    void testDifferentClassEquality() {
        assertThat(new Money(10, "CHF")).isEqualTo(new Money(10, "CHF"));
    }

    @DisplayName("$5 + $5 = $10")
    @Test
    void testSimpleAddition() {
        Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertThat(reduced).isEqualTo(Money.dollar(10));
    }

    @Test
    void testPlusReturnsSum() {
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertThat(five).isEqualTo(sum.augend());
        assertThat(five).isEqualTo(sum.addend());
    }

    @Test
    void testReduceSum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertThat(result).isEqualTo(Money.dollar(7));
    }
}
