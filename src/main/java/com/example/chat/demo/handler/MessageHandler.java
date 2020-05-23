package com.example.chat.demo.handler;

import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketMessage;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;

//public class MessageHandler implements WebSocketHandler {
//
//	@Override
//	public Mono<Void> handle(WebSocketSession session) {
//		return session.send(session.receive()
//						.map(WebSocketMessage::getPayloadAsText)
//						.map(session::textMessage)
//					);
//	}
//}
