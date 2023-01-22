package com.example.module12task1;

import java.util.Timer;

public class OneSecondTimer extends TimePrinter {

    private int counter = 0;
    @Override
    public void showTime() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new OneSecondTimer(), 0, 1000);
    }

    @Override
    public void run() {
        System.out.println(counter);
        counter++;
    }
}
