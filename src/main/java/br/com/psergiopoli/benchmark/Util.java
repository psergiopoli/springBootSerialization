package br.com.psergiopoli.benchmark;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static Message messageBuilder() {
        Message message = new Message();
        message.setMessage("Hello World!");
        message.setPrivateMessage("Hello World!<Private>");
        message.setPublicMessage("Hello World!<Public>");

        List<Message> messages = new ArrayList<Message>();
        messages.add(message);

        message.setMessages(messages);

        return message;
    }

}