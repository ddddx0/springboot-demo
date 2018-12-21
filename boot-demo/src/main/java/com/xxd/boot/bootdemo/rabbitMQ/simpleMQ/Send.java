package com.xxd.boot.bootdemo.rabbitMQ.simpleMQ;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class Send {
    private final static String QUEUE_NAME = "hello";
    private final static String QUEUE1 = "que1";

    public static void main(String[] argv) throws Exception {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("192.168.30.97");
        factory.setPort(5672);
        factory.setUsername("admin");
        factory.setPassword("admin");
        try (Connection connection = factory.newConnection();
             Channel channel = connection.createChannel()) {

            channel.queueBind(QUEUE1,null,null);
//            channel.queueDeclare(QUEUE1, false, false, false, null);
            String message = "Hello World1111";
            channel.basicPublish("", QUEUE1, null, message.getBytes());
            System.out.println(" [x] Sent '" + message + "'");
        }
    }
}
