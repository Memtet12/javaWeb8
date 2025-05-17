package org.example.loggers;

import org.example.beans.Event;

public class ConsoleEventLogger implements EventLogger {
    public void logEvent(Event event)
    {
        System.out.println(event.toString());
    }
}
