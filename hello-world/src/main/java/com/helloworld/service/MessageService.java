package com.helloworld.service;

import com.helloworld.model.Message;
import com.helloworld.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public String getHelloMessage() {
        // Fetch the message from the database (id = 1)
        Message message = messageRepository.findById(1L).orElse(null);
        return (message != null) ? message.getMessage() : "No message found";
    }
}
