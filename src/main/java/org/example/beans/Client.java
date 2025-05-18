package org.example.beans;


public class Client {
    private String id;
    private String fullname;
    private String greeting;

    public Client(String id, String fullname) {
        this.id = id;
        this.fullname = fullname;
    }

    public String getId()
    {
        return id;
    }
    public String getFullName()
    {
        return fullname;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public void setFullName(String _fullname)
    {
        fullname = _fullname;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
