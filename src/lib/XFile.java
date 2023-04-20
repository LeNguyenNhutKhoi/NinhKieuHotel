/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

//import Demo.Cat;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KHOI - LAPTOP
 */
public class XFile 
{
    public static void writeFile( String path )
    {
        File f = new File( path );
        FileOutputStream fos = null;
        
        try 
        {
            fos = new FileOutputStream(f); ///
            byte[] arr = {10, 20, 30};
            fos.write(arr); ///
            fos.close();
        } 
        catch ( FileNotFoundException e) 
        {
            System.err.println("File not found");
        }
        catch (IOException ex)
        {
            System.err.println("Failed");
        }
    }
    
    public static void readFile( String path)
    {
        File f = new File( path );
        FileInputStream fis = null;
        
        try 
        {
            fis = new FileInputStream(f); ///
            int fileSize = (int) f.length();
            byte[] arr = new byte[fileSize];
            fis.read(arr);
            
            for ( int i = 0; i < fileSize; i++)
            {
                System.out.print(arr[i] + " ");
            }
            
            fis.close();
        } 
        catch ( FileNotFoundException e) 
        {
            System.err.println("File not found");
        }
        catch (IOException ex)
        {
            System.err.println("Failed");
        }
    }
    
    public static void writeDataFile ( String path )
    {
        try 
        {
            FileOutputStream fos = new FileOutputStream(path);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(5);
            dos.writeUTF("NHUT KHOI");
            dos.writeDouble(9.0);
            dos.close();
        } 
        catch (IOException e) 
        {
            System.err.println("Failed");
        }
    }

    public static void readDataFile ( String path )
    {
        try 
        {
            FileInputStream fis = new FileInputStream(path);
            DataInputStream dis = new DataInputStream(fis);
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readDouble());
            dis.close(); 
            System.out.println();
        } 
        catch (IOException e) 
        {
            System.err.println("Failed");
        }
    }
    
    public static void writeBuffer(String path, String text)
    {
        try 
        {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.close();
        } 
        catch (IOException e) 
        {
            System.err.println("Failed");
        }
    }
    
    public static String readBuffer(String path)
    {
        StringBuilder sb = new StringBuilder();
        
        try 
        {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);
            
            String firstLine = br.readLine();
            while(firstLine != null)
            {
                sb.append(firstLine);
                firstLine = br.readLine(); // next line
                if ( firstLine != null ) 
                {
                    sb.append("\n");
                }
            }     
        } 
        catch (IOException e) 
        {
            System.err.println("Failed");
        }
        
        return sb.toString();
    }
    
    // read and write object
    
    public static void writeObject (String path, Object o)
    {
        try 
        {
            ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream(path) );
            oos.writeObject(o);
            oos.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
    public static Object readObject (String path)
    {
        try 
        {
            ObjectInputStream ois = new ObjectInputStream( new FileInputStream(path) );
            Object o = ois.readObject();
            ois.close();
            return o;
        } 
        catch (IOException e) 
        {
            System.err.println("Failed");
        }
        catch (ClassNotFoundException ex)
        {
            System.err.println("Class Not Found");
        }
        return null;
    }
    
    public static void main(String[] args) 
    {
//        String path = "./src/lib/testFile.dat";
//        writeFile(path);
//        readFile(path);
        
//        String path1 = "./src/lib/testFile1.dat";
//        writeDataFile(path1);
//        readDataFile(path1);
        
//        String path2 = "./src/lib/testFile3.dat";
//        writeBuffer(path2, "Lê Nguyễn Nhựt Khôi \n none");
//        readBuffer(path2);
        
//        List<Cat> catList = new ArrayList<>();
//        catList.add( new Cat("Nom", 4.0, Boolean.FALSE, 10000.0 ) );
//        catList.add( new Cat("Nomi", 5.0, Boolean.FALSE, 10000.0 ) );
//        String path3 = "./src/lib/cat.dat";
//        
//        writeObject(path3, catList);
//        
//        List<Cat> readList = (List<Cat>) readObject(path3); // importance and must be execute first
//        for (Cat cat : readList)
//        {
//            System.out.println(cat.getWeight());
//        }
    }
}

// implement -> can have multi super class
