package br.com.jhonfaccin.factorymethod;

import javax.swing.*;

public class MessageEmail extends Message {

    @Override
    public void sendMessage(String message) {
        JOptionPane.showMessageDialog(null,"E-Mail:" + message);
    }
}
