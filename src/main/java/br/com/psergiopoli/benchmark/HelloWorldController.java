package br.com.psergiopoli.benchmark;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private MessageRepository messageRepository;

    @Autowired
    public HelloWorldController(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    @RequestMapping("/hello")
    public Message getHelloMessageJSON() {
        Message message = Util.messageBuilder();
        return message;
    }

    @RequestMapping("/hello/all")
    @JsonView(JsonViews.All.class)
    public Message getHelloMessageJSONAll() {
        Message message = Util.messageBuilder();
        return message;
    }

    @RequestMapping("/hello/private")
    @JsonView(JsonViews.Private.class)
    public Message getHelloMessageJSONPrivate() {
        Message message = Util.messageBuilder();
        return message;
    }

    @RequestMapping("/hello/public")
    @JsonView(JsonViews.Public.class)
    public Message getHelloMessageJSONPublic() {
        Message message = Util.messageBuilder();
        return message;
    }

    @RequestMapping("/hello/db/all")
    @JsonView(JsonViews.DB.class)
    public List<Message> getHelloMessageJSONDatabase() {
        Iterable<Message> messages = this.messageRepository.findAll();
        List<Message> messagesList = new ArrayList<Message>();

        messages.forEach(messagesList::add);

        return messagesList;
    }

    @RequestMapping(value = "/hello/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public Message getHelloMessageXML() {
        Message message = Util.messageBuilder();
        return message;
    }

}