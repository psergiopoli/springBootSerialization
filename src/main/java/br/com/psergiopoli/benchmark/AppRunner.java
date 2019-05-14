package br.com.psergiopoli.benchmark;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.psergiopoli.benchmark.Util.BuilderUtil;
import br.com.psergiopoli.benchmark.models.Message;
import br.com.psergiopoli.benchmark.repository.MessageRepository;


@Component
public class AppRunner implements CommandLineRunner {

    private MessageRepository messageRepository;

    @Autowired
    public AppRunner(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }


    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    @Override
    public void run(String... args) throws Exception {

        if(!this.messageRepository.findAll().iterator().hasNext()) {
            Message message = BuilderUtil.messageBuilder();
            message.setId(1L);
            this.messageRepository.save(message);
            logger.info("Message table was empty, creating a message on DB success");
        } else {
            logger.info("Message already have elements, skiping creating message");
        }

        logger.info("AppRunner is Running :p");
    }

}