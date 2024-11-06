package ch3_OOP.polymorphism;

import ch3_OOP.inheritance.TvRemoteControl;

public class SmartTvRemoteControl extends TvRemoteControl {


    @Override
    protected void sendSignal(int signalType) {
        System.out.println("SmartTvRemoteControl hardware sending signal");
    }

    @Override
    protected void sendSignal(int signalType, int signalValue) {
        System.out.println("SmartTvRemoteControl hardware sending signal");
    }
}
