package br.com.jhonfaccin.factorymethod;


public class MessageFactory {
    public static Message getMessage (String typeMessage){
        if (typeMessage.equalsIgnoreCase("email")) {
            return new MessageEmail();
        } else if (typeMessage.equalsIgnoreCase("sms")) {
            return new MessageSMS();
        } else {
            throw new IllegalArgumentException("Type message invalid");
        }
    }
}
