package br.com.jhonfaccin.factorymethod;

import javax.swing.*;

public class MessageSMS extends Message {
    @Override
    public void sendMessage(String message) {
        JOptionPane.showMessageDialog(null,"SMS:" + message);
    }
}
