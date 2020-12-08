package com.junhopark.javalotto.view;

public class OutputView {

    private static final String WRITE_MONEY = "구입금액을 입력해주세요.";

    public static void writeBuyMoney() {
        print(WRITE_MONEY);
    }

    public static void print(String string){
        System.out.println(string);
    }

}
