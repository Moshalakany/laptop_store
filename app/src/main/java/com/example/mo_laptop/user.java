package com.example.mo_laptop;

public class user
{
   public String FirstName,Email,Password,LastName;
   final public user arr[]=new user[100];

    public String getName() {
        return FirstName;
    }

    public void setName(String name) {
        FirstName = name;
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
        this.Password = password;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
