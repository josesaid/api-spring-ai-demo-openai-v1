package com.mx.development.jose.said.runner;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ChatRunner {

    @Bean
    public CommandLineRunner runner(ChatClient.Builder builder) {
        return args -> {
            System.out.println();
            System.out.println("Provider - OpenAI");
            ChatClient chatClient = builder.build();
            String response = chatClient.prompt("¿Que es Spring AI?").call().content();
			/*
			String response = chatClient.prompt()
					.system("""
            Eres un arquitecto de software especializado
            en Spring Boot y Spring AI.
            Responde siempre en español.
            """)
					.user("""
            Explica qué es Spring AI
            para un desarrollador Java.
            """)
					.call()
					.content();*/
            System.out.println(response);
        };
    }
}
