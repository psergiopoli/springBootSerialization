package br.com.psergiopoli.benchmark;

import com.fasterxml.jackson.annotation.JsonView;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

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

    @RequestMapping(value = "/hello/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public Message getHelloMessageXML() {
        Message message = Util.messageBuilder();
        return message;
    }

}