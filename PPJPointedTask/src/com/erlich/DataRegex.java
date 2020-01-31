package com.erlich;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataRegex {
    String pattern1 = "(^\\d{4}\\-(0[1-9]|1[012])\\-(0[1-9]|[12][0-9]|3[01])$)";
    String date;

    public DataRegex(String date) {
        this.date = date;
    }

    public void getDate() {
        Pattern pattern = Pattern.compile(pattern1);
        Matcher matcher = pattern.matcher(date);

        if (matcher.matches()) {
            System.out.println(matcher.group());
        }
    }



}
