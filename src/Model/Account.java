/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author KHOI - LAPTOP
 */
public class Account
{
    private String Username;
    private String Password;

    public Account(String Username, String Password) 
    {
        this.Username = Username;
        this.Password = Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public boolean equals(Object obj) {
        Account acc = (Account) obj;
        
        if ( this.getUsername().equals(acc.getUsername()) && this.getPassword().equals(acc.getPassword()))
        {
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s + %s", this.getUsername(), this.getPassword());
    }
    
}
