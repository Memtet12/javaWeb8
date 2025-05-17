package org.example.beans;


public class Client {
    String id;
    String fullname;

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
}
