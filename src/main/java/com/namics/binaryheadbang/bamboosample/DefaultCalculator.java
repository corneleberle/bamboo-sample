package com.namics.binaryheadbang.bamboosample;

/**
 * Created by ceberle on 18/03/15.
 */
public class DefaultCalculator implements Calculator {

    @Override
    public int add(int summand1, int summand2) {
        return summand1 - summand2;
    }

    public static void main(String[] args) {
        System.out.println(new DefaultCalculator().add(4, 9));
    }
}
