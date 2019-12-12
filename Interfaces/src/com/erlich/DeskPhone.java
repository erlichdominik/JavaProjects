package com.erlich;

public class DeskPhone implements ITelephone {
    private int myNuber;
    private boolean isRinging;


    public DeskPhone(int myNuber) {
        this.myNuber = myNuber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskPhone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the deskPhone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNuber) {
            isRinging = true;
            System.out.println("ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
