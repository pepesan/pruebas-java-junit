package com.mycompany.app;


public class Calculator {
    public int evaluate(String s) {
        String []cadenas=s.split("\\+");
        int i=0;
        for (String c: cadenas) {
            int j=Integer.parseInt(c);
            i+=j;
        }
        return i;
    }
}
