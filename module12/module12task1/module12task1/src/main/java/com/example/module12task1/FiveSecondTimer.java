package com.example.module12task1;

import java.util.Timer;

public class FiveSecondTimer extends TimePrinter{


    @Override
    public void showTime() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new FiveSecondTimer(), 5000, 5000);
    }

    @Override
    public void run() {
        System.out.println("Минуло 5 секунд");
    }
}
