package ch3_OOP.inheritance;

import ch3_OOP.abstraction_encapsulation.RemoteControl;

public class TvRemoteControl extends RemoteControl {

    private static final int MENU_SIGNAL = 6;

    public void onMenu(){
        sendSignal(MENU_SIGNAL);
    }
}
