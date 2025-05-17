package org.example;

import org.example.beans.Client;
import org.example.beans.ConsoleEventLogger;
import org.example.beans.EventLogger;

public class App {

    private Client client;

    private EventLogger eventLogger;

    public static void main(String[] args) {
        App app = new App();

        app.client = new Client("1", "John Smith");

        app.eventLogger = new ConsoleEventLogger();

        app.logEvent("Some event for user 1");
    }

    private void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        eventLogger.logEvent(message);
    }
}
