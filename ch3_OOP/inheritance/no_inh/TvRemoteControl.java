package ch3_OOP.inheritance.no_inh;

public class TvRemoteControl {
    private static final int ON_SIGNAL = 1;
    private static final int OFF_SIGNAL = 0;
    private static final int VOLUME_UP_SIGNAL = 2;
    private static final int VOLUME_DOWN_SIGNAL = 3;
    private static final int CHANNEL_CHANGE_SIGNAL= 4;

    public void changeChannel(int channel){
        sendSignal(CHANNEL_CHANGE_SIGNAL, channel);
    }

    public void volumeUp(){
        sendSignal(VOLUME_UP_SIGNAL);
    }

    public void volumeDown(){
        sendSignal(VOLUME_DOWN_SIGNAL);
    }

    public void turnOn(){
        sendSignal(ON_SIGNAL);
    }

    public void turnOff(){
        sendSignal(OFF_SIGNAL);
    }
    // sending signal is hardware dependent code
    // we don't need to know how it really works, to use remote control.
    private void sendSignal(int signalType){
        System.out.println("doing some hardware work");
    }

    private void sendSignal(int signalType, int signalValue){
        System.out.println("doing some hardware work");
    }


    private static final int MENU_SIGNAL = 6;

    public void onMenu(){
        sendSignal(MENU_SIGNAL);
    }
}
