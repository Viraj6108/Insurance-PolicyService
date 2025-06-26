package com.policyservice.topic;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;


public class KafkaTopic {

    @Bean
    public NewTopic policyCreated(){return TopicBuilder.name("policy-created").build();}
    
    @Bean
    public NewTopic sendNotification() {return TopicBuilder.name("email-notification").build();}
    }

