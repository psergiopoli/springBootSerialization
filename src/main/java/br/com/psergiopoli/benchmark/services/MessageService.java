package br.com.psergiopoli.benchmark.services;

import org.springframework.stereotype.Service;

import br.com.psergiopoli.benchmark.repository.MessageRepository;

@Service
public class MessageService {

    private MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }
    
    // public Message saveMessage(Message message) {}
    // public Iterable findAll() {}

}

// TODO: Implement this instead using repository directly on controller and app runner