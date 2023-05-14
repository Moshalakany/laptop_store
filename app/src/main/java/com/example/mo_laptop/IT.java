package com.example.mo_laptop;

public class IT
{
    public String Name,Email,Password;

    public IT(String name, String email, String password) {
        Name = name;
        Email = email;
        Password = password;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
