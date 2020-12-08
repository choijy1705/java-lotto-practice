package com.junhopark.javalotto;

import com.junhopark.javalotto.view.OutputView;

import java.util.Scanner;

public class Play {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String WRITE_APPROPRIATE_MONEY = "[ERROR] 적절한 금액을 입력하세요";
    private static final int LOTTO_PRICE = 1000;

    private int lottoCount;

    void start() throws IllegalAccessException {
        saveLottoCount();
    }

    private void saveLottoCount() throws IllegalAccessException {
        OutputView.writeBuyMoney();
        LottoCount(scanner.next());
    }

    private void LottoCount(String money) throws IllegalAccessException {
        checkMoney(money);
        this.lottoCount = (Integer.parseInt(money) / LOTTO_PRICE);
    }

    private void checkMoney(String money) throws IllegalAccessException {
        int length = money.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(money.charAt(i))) {
                throw new IllegalAccessException(WRITE_APPROPRIATE_MONEY);
            }
        }
    }
}
