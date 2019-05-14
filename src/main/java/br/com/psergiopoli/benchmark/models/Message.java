package br.com.psergiopoli.benchmark.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonView;

import br.com.psergiopoli.benchmark.JsonViews;

@XmlRootElement(name = "message")
@Entity
public class Message {

    @Id
    @JsonView(JsonViews.DB.class)
    private Long id;

    @JsonView(JsonViews.DB.class)
    private String message;

    @JsonView(JsonViews.Private.class)
    private String privateMessage;

    @JsonView(JsonViews.Public.class)
    private String publicMessage;

    @JsonIgnoreProperties({ "messages" })
    @Transient
    private List<Message> messages;

    public String getMessage() {
        return message;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
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