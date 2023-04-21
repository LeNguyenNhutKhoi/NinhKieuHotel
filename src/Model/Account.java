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
    private String username;
    private String password;

    public Account(String username, String password) 
    {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) 
    {
        Account acc = (Account) obj;
        
        if ( this.getUsername().equals(acc.getUsername()) && this.getPassword().equals(acc.getPassword()) )
        {
            return true;
        }
        
        return false;
    }

    @Override
    public String toString() 
    {
        return String.format("%s+%s", this.getUsername(), this.getPassword());
    } 
}