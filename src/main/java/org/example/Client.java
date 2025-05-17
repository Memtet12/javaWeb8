package org.example;


public class Client {
    String id;
    String fullname;

    public Client(String number, String fullname) {
        id = number;
        this.fullname = fullname;
    }

    public String getId()
    {
        return id;
    }
    public String getFullname()
    {
        return fullname;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public void setFullname(String _fullname)
    {
        fullname = _fullname;
    }
}
