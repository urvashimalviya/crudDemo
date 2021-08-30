package com.demo;

//File Handling(CRUD Operation)
import java.io.*;
public class AddEmployee
{
  public static void main(String data[])
  {
      if(data.length!=3)
      {
          System.out.println("Invalid use of module : AddEmployee");
          System.out.println("Usage : java AddEmployee code name salary");
          return;
      }
      int code=Integer.parseInt(data[0]);
      String name=data[1];
      int salary=Integer.parseInt(data[2]);
      try
      {
          File f;
          f=new File("employee.data");
          RandomAccessFile raf;
          raf=new RandomAccessFile(f,"rw");
          int vCode;
          String vName;
          int vSalary;
          while(raf.getFilePointer()<raf.length())
          {
              vCode=Integer.parseInt(raf.readLine());
              vName=raf.readLine();
              vSalary=Integer.parseInt(raf.readLine());
              if(vCode==code)
              {
            	  raf.close();
                  System.out.println("That code alloted to :"+vName);
              }
          }
          //valueOf to convert anything to String
          raf.writeBytes(String.valueOf(code));
          raf.writeBytes("\n");
          raf.writeBytes(name);
          raf.writeBytes("\n");
          raf.writeBytes(String.valueOf(salary));
          raf.writeBytes("\n");
          raf.close();
          System.out.println("Employee added........");
      }catch(IOException ioException)
      {
          System.out.println("Problem : "+ioException.getMessage());
      }
  }
}