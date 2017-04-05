package com.example.computer.oopsample.interface_example;

/**
 * Created by computer on 2017. 4. 5..
 */

public class ComputerTest {

    DeskTopComputer deskTopComputer = new DeskTopComputer();
    MacBookPro macBookPro = new MacBookPro();
    ServerComputer serverComputer = new ServerComputer();

    public void testComputer(){

        deskTopComputer.getDisplay();

        macBookPro.getDisplay();

        serverComputer.getDisplay();

    }

}
