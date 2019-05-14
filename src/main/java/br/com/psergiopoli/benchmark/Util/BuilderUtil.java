package br.com.psergiopoli.benchmark.Util;

import java.util.ArrayList;
import java.util.List;

import br.com.psergiopoli.benchmark.models.Message;

public class BuilderUtil {

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