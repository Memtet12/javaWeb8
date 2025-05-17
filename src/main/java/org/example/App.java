package org.example;

public class App {
    Client client;
    ConsoleEventLogger eventLogger;

    protected void logEvent(String msg) {
        String message = msg.replaceAll(
          client.getId(), client.getFullname());
        eventLogger.logEvent(message);
    }

}
