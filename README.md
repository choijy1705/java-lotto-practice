# 우아한 프리코스 3주차
> 본 프로젝트는 우아한 형제들의 프리코스, 3주차 미션인 로또 프로젝트 입니다.	
한다. 
* 수익률은 소수점 3자리까지 구한다.

## 프로그램 요구사항

* 자바 코드 컨벤션을 지키면서 프로그래밍 한다.
* else 예약어를 쓰지 않는다.
* public/protected/private/package 접근 제어자를 용도에 적합하게 사용해 구현한다.
* 함수의 길이가 10라인을 넘어가지 않도록 구현한다.
* indent depth를 2가 넘어가지 않도록 구현한다. 1까지만 허용한다.
* 함수의 인자 수를 3개까지만 허용한다. 

* 추가 요구사항

```java
import java.util.List;

/**
 * 로또 한장을 의미하는 객체
 */
public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        this.numbers = numbers;
    }

    // 추가 기능 구현
}
```
* 다음 Lotto 객체를 활용해 구현해야 한다. 
* Lotto 기본 생성자를 추가할 수 없다. 
* numbers 변수의 접근 제어자인 private을 변경할 수 없다. 
* Lotto에 필드(인스턴스 변수)를 추가할 수 없다.

```java
/**
 * 당첨 번호를 담당하는 객체
 */
public class WinningLotto {
    private final Lotto lotto;
    private final int bonusNo;

    public WinningLotto(Lotto lotto, int bonusNo) {
        this.lotto = lotto;
        this.bonusNo = bonusNo;
    }

    public Rank match(Lotto userLotto) {
        // TODO 로직 구현
        return null;
    }
}
```
* 다음 WinningLotto 객체를 활용해 구현해야 한다. 
* match() 메소드의 반환 값인 Rank는 저장소에서 제공한다. 
* WinningLotto 기본 생성자를 추가할 수 없다. 
* lotto, bonusNo 변수의 접근 제어자인 private을 변경할 수 없다. 
* WinningLotto에 필드(인스턴스 변수)를 추가할 수 없다.

## 정상적인 게임 실행 화면

```
구입금액을 입력해주세요.
8000
8개를 구매했습니다.
[6, 13, 25, 27, 30, 38]
[13, 16, 19, 24, 33, 43]
[2, 7, 13, 21, 23, 28]
[3, 4, 13, 17, 23, 41]
[11, 12, 22, 24, 31, 34]
[3, 5, 17, 28, 35, 37]
[6, 9, 15, 17, 34, 37]
[2, 5, 6, 26, 34, 43]
지난 주 당첨번호를 입력해 주세요.
2,5,6,8,10,21
보너스 볼을 입력해 주세요.
38
당첨 통계
---------
3개 일치 (5000원)-1개
4개 일치 (50000원)-0개
5개 일치 (1500000원)-0개
5개 일치 (30000000원)-0개
6개 일치 (2000000000원)-0개
총 수익률은 0.625입니다.
```

## 각 입력별 예외 케이스들

#### 문자입력
```
구입금액을 입력해주세요.
woowa
64비트 정수입력 범위를 벗어났습니다.
```

#### 음수 입력
```
구입금액을 입력해주세요.
-10
돈은 음수가 될 수 없습니다.
```

#### 매우 큰 수 입력
```
구입금액을 입력해주세요.
999999999999999999999999999999
64비트 정수입력 범위를 벗어났습니다.
```
#### 로또 한장 가격 이하 입력
```
구입금액을 입력해주세요.
10
구매할 돈이 부족이 부족합니다.
```

### 지난 주 당첨번호 입력

#### 정상 입력
```
지난 주 당첨번호를 입력해 주세요.
1,2,3,4,5,6
보너스 볼을 입력해 주세요.
```

#### 6개 숫자가 아닌 입력
```
지난 주 당첨번호를 입력해 주세요.
1,2,3,4,5
로또는 6개의 숫자가 필요합니다.
```

#### 로또 숫자 범위 벗어난 입력
```
지난 주 당첨번호를 입력해 주세요.
1,2,3,4,5,66
로또 숫자 범위는 1~45 입니다.
```

#### 중복된 로또 번호 입력
```
지난 주 당첨번호를 입력해 주세요.
1,1,2,3,4,5
로또 숫자는 서로 중복될 수 없습니다.
```

#### 문자 입력
```
지난 주 당첨번호를 입력해 주세요.
가,나,다,라,마,바
32비트 정수입력을 벗어났습니다.
```

### 보너스 볼 입력

#### 로또 숫자 범위 벗어난 입력
```
보너스 볼을 입력해 주세요.
100
로또 숫자 범위가 아닙니다.
```

#### 지난 주 로또 번호와 중복된 입력
```
지난 주 당첨번호를 입력해 주세요.
1,2,3,4,5,6
보너스 볼을 입력해 주세요.
1
보너스볼은 당첨 로또 번호 6개 숫자와 중복될 수 없습니다.
```

#### 문자 입력
```
보너스 볼을 입력해 주세요.
hi
32비트 정수입력 범위를 벗어났습니다.
```