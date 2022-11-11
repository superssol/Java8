package com.hansol.exercise;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class App {

    public static void main(String[] args) throws InterruptedException {

/*        //java 8이전 날짜 api들은 살짝 네이밍이 맞지 않는 느낌(직관적이지 않음), 선언한 객체의 값을 직접 변화 시키는 thread safe 하지 않다.
        Date date = new Date();
        System.out.println(date);
        //입복시간(기계시간을 가져온다.)
        System.out.println(date.getTime());
        // 2번째 parameter int로 말고 Calendar의 member를 사용해서 선언(이유 : 숫자로 하면 0이 1월이라 헷갈릴 소지가 있다.)
        Calendar myBirthday = new GregorianCalendar(1994, Calendar.OCTOBER, 6);
        System.out.println(myBirthday);
        System.out.println(myBirthday.getTime());
        myBirthday.add(Calendar.DAY_OF_YEAR, 1);
        System.out.println(myBirthday.getTime());*/

        //java8
        //기계시간(UTC, GMT)
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.atZone(ZoneId.of("UTC")));

        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);

        ZonedDateTime zonedDateTime = instant.atZone(zone);
        System.out.println(zonedDateTime);

        //for Human
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now );

        LocalDateTime birthday = LocalDateTime.of(1982, Month.JULY, 15, 0, 0, 0);
        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(nowInKorea);

        //기간(period, duration)
        //period(human)
        LocalDate today = LocalDate.now();
        LocalDate mybirth = LocalDate.of(1994, Month.OCTOBER, 6);
        Period between = Period.between(today, mybirth);
        System.out.println(between);
        System.out.println(between.getDays());
        //duration(machine)
        //Formatter
        LocalDateTime now_formatter = LocalDateTime.now();
        DateTimeFormatter MMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now_formatter.format(MMddyyyy));
        System.out.println(now_formatter.format(MMddyyyy).getClass().getName());
        LocalDate parse = LocalDate.parse("07/15/1982", MMddyyyy);
        System.out.println(parse);

        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());

        //legacy api도 사용가능
    }
}
