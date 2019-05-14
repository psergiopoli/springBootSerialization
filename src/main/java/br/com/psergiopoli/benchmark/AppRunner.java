package br.com.psergiopoli.benchmark;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    @Override
    public void run(String... args) throws Exception {
        logger.info("AppRunner is Running :p");
    }

}