package com.example.chat.demo;

//import com.example.chat.demo.handler.MessageHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.reactive.HandlerMapping;
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.server.WebSocketService;
import org.springframework.web.reactive.socket.server.support.HandshakeWebSocketService;
import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter;
import org.springframework.web.reactive.socket.server.upgrade.ReactorNettyRequestUpgradeStrategy;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class MessageApplication {
	public static void main(String[] args) {
		SpringApplication.run(com.example.chat.demo.MessageApplication.class, args);
	}

//	@Bean
//	public MessageHandler messageHandler() {
//		return new MessageHandler();
//	}
//
//	@Bean
//	public HandlerMapping handlerMapping() {
//		Map<String, WebSocketHandler> map = new HashMap<>();
//		map.put("/message", messageHandler());
//		SimpleUrlHandlerMapping mapping = new SimpleUrlHandlerMapping();
//		mapping.setUrlMap(map);
//		mapping.setOrder(Ordered.HIGHEST_PRECEDENCE);
//		return mapping;
//	}
//
//	@Bean
//	public WebSocketHandlerAdapter handlerAdapter() {
//		return new WebSocketHandlerAdapter(webSocketService());
//	}
//
//	@Bean
//	public WebSocketService webSocketService() {
//		return new HandshakeWebSocketService(new ReactorNettyRequestUpgradeStrategy());
//	}
}
