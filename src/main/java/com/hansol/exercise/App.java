package com.hansol.exercise;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {

    public static void main(String[] args) throws InterruptedException {
        Calendar myBirthday = new GregorianCalendar(1994, Calendar.OCTOBER, 6);
        System.out.println(myBirthday.getTime());
        myBirthday.add(Calendar.DAY_OF_YEAR, 1);
    }
}
