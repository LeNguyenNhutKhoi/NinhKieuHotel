/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author KHOI - LAPTOP
 */
public class XDate 
{
    public static String pattern = "dd/MM/yyyy";
    public static SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    
    public static Object stringToDate(String text)
    {
        //return sdf.parse(text);
        // Exception error 
        //  1. Local 
        //  2. Throw to trash
        
        try 
        {
            return sdf.parse(text);
        } 
        catch (Exception e) 
        {
            System.err.println("Parse failed");
        }
        return null;
    }
    
    public static String DateToString(Object o)
    {
        if (o != null)
        {
            Date d = (Date) o;
            return sdf.format(d);
        }
        return "";
    }
}
