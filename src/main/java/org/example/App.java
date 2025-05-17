package org.example;

import org.example.beans.Event;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.example.beans.Client;
import org.example.loggers.ConsoleEventLogger;
import org.example.loggers.EventLogger;

public class App {

    private Client client;

    private EventLogger eventLogger;

    public App(Client client, EventLogger eventLogger){
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");

        Event event = ctx.getBean(Event.class);
        app.logEvent(event, "Some event for 1");

        event = ctx.getBean(Event.class);
        app.logEvent(event, "Some event for 2");
    }


    private void logEvent(Event event, String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        event.setMsg(message);
        eventLogger.logEvent(event);
    }
}
