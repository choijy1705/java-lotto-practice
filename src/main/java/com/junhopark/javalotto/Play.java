package com.junhopark.javalotto;

import com.junhopark.javalotto.view.OutputView;

import java.util.Scanner;

public class Play {
    private final Scanner scanner = new Scanner(System.in);


    void start(){
        saveLottoCount();
    }

    private void saveLottoCount(){
        OutputView.writeBuyMoney();
    }
}
