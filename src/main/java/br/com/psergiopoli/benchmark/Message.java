package br.com.psergiopoli.benchmark;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;

@XmlRootElement(name = "message")
public class Message {

    private String message;

    @JsonView(JsonViews.Private.class)
    private String privateMessage;

    @JsonView(JsonViews.Public.class)
    private String publicMessage;

    @JsonIgnoreProperties({"messages"})
    private List<Message> messages;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @XmlTransient
    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public String getPublicMessage() {
        return publicMessage;
    }

    public void setPublicMessage(String publicMessage) {
        this.publicMessage = publicMessage;
    }

    public String getPrivateMessage() {
        return privateMessage;
    }

    public void setPrivateMessage(String privateMessage) {
        this.privateMessage = privateMessage;
    }

}