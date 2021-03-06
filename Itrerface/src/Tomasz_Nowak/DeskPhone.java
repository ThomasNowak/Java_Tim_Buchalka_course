package Tomasz_Nowak;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("no action taken, the phon has no powet on.");
    }

    @Override
    public void dail(int phoneNumber) {
        System.out.println("now ringing " + phoneNumber + "on deskPhone.");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("answering the desk phone.");
        }
        isRinging = false;

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("ring ring");
        }else
            isRinging = false;

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    public static class MobilePhone {
    }
}
