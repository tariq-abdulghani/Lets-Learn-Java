package ch3_OOP.abstraction_encapsulation;

public class RemoteControl {

    protected static final int ON_SIGNAL = 1;
    protected static final int OFF_SIGNAL = 0;
    protected static final int VOLUME_UP_SIGNAL = 2;
    protected static final int VOLUME_DOWN_SIGNAL = 3;
    protected static final int CHANNEL_CHANGE_SIGNAL= 4;

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
    protected void sendSignal(int signalType){
        System.out.println("doing some hardware work");
    }

    protected void sendSignal(int signalType, int signalValue){
        System.out.println("doing some hardware work");
    }

}
