package br.com.jhonfaccin.factorymethod;

import javax.swing.*;

public class MainFactoryMethodExample {
    public static void main(String[] args) {
        String sendText = JOptionPane.showInputDialog(null);
        Message message = MessageFactory.getMessage("email");
        message.sendMessage(sendText);

        message = MessageFactory.getMessage("sms");
        message.sendMessage(sendText);
    }
}
