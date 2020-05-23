package com.example.chat.demo.controller;

import com.example.chat.demo.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/message")
    @SendTo("/api/chat")
    public Message message(Message message) throws Exception{
        Thread.sleep(1000);
        return new Message(message.getMessage());
    }
}
