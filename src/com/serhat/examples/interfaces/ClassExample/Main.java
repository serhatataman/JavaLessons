package com.serhat.examples.interfaces.ClassExample;


//All interface variables are 'public static final' and all methods are public
public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();
    }
}
