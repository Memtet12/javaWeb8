package org.example;

public class Main {
    public static void main(String[] args)
    {
        App app = new App();
        app.client = new Client("1","John Smith");
        app.eventLogger = new ConsoleEventLogger();

        app.logEvent("Some event foe user 1");
    }
}
