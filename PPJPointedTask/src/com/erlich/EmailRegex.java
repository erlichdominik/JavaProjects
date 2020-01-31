package com.erlich;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
    String pattern1 = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    String mail;

    public EmailRegex(String mail) {
        this.mail = mail;
    }

    public void getMail() {
        Pattern pattern = Pattern.compile(pattern1);
        Matcher matcher = pattern.matcher(mail);

        System.out.println(matcher.matches());
    }

}
