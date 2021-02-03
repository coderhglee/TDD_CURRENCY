### 요구사항

- 통화가 다른 두 금액을 더해서 주어진 환율에 맞게 변한 금액을 결과로 얻을 수 있어야 한다.
- 어떤 금액(주가)을 어떤 수(주식의 수)에 곱한 금액을 결과로 얻을 수 있어야 한다.

### 기능

[] $5 + 10CHF = $10(환율이 2:1일 경우)

- [x] $5 * 2 = $10
- [x] amount를 private으로 만들기
- [x] Dollar 부작용(side effect)?
    - Dollar에 대해 연산을 수행한 후에 해당 Dollar의 값이 바뀌는 부작용
- [ ] Money 반올림?
- [x] equals()
- [x] hashCode()
- [ ] Equal null
- [ ] Equal object
- [x] 5CHF * 2 = 10CHF
- [x] 공용 equals