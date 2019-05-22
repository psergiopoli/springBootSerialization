package br.com.psergiopoli.benchmark.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.psergiopoli.benchmark.models.Message;
import br.com.psergiopoli.benchmark.repository.MessageRepository;

@Service
public class MessageService {

    private MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<Message> findAll() {
        Iterable<Message> messages = this.messageRepository.findAll();
        List<Message> messagesList = new ArrayList<Message>();

        messages.forEach(messagesList::add);
        return messagesList;
    }

    public void save(Message message) {
        this.messageRepository.save(message);
    }

}
