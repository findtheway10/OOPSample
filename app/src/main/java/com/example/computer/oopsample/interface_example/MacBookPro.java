package com.example.computer.oopsample.interface_example;

/**
 * Created by computer on 2017. 4. 5..
 */

public class MacBookPro implements ComputerInterface {

    boolean isMacBook = true;

    boolean isVeryExpensive = true;

    boolean isMacOS = true;

    @Override
    public int getDisplay() {
        return 0;
    }

    @Override
    public void setMouse(int mouse) {

    }

    @Override
    public void setKeyboard(int keyboard) {

    }

    @Override
    public void setPower(int power) {

    }
}
