package SmartParkingSystem;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.SortedMap;

public class AdminLogIn
{
    private static HashMap<String,String> adminLogs=new HashMap<>();
    private static final String file_name="AdminLogs.txt";
    private Scanner sc;
    public AdminLogIn(Scanner sc)
    {
        this.sc=sc;
        AdminLogIn.loadAdminData();
    }
    private static void loadAdminData()
    {
        File file=new File(file_name);
        if(!file.exists())
        {
            System.out.println("No ADMIN LOG IN FILE exists! ");
            return;
        }
        try(BufferedReader br=new BufferedReader(new FileReader(file)))
        {
            String line;
            while((line=br.readLine())!=null)
            {
                String[] parts=line.split(":");
                if(parts.length==2) adminLogs.put(parts[0],parts[1]);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error in loading ADMIN LOGS file!");
            return;
        }
    }

    public void doOperation()
    {
        System.out.println("Enter the User Name :");
        String userName=sc.nextLine();
        System.out.println("Enter the password : ");
        String passWord=sc.nextLine();
        if(!adminLogs.containsKey(userName))
        {
            System.out.println("No Admin found with this data!");
            System.out.println("press 9 to Sign in as user or press any key to exit!");
            int input=sc.nextInt();
            sc.nextLine();
            if(input==9)
            {
                System.out.println("Enter the User Name :");
                userName=sc.nextLine();
                System.out.println("Enter the password : ");
                passWord=sc.nextLine();
                adminLogs.put(userName,passWord);
                storeData(userName,passWord);
                doOperation();
            }
            else return;
        }
        else
        {
            if(!passWord.equals(adminLogs.get(userName)))
            {
                System.out.println("Please enter the correct password!");
                doOperation();
            }
            else
            {
                System.out.println("Loged in successfully! ");
                System.out.println("Enter the mall Name : ");
                String mall=sc.nextLine();
                System.out.println("Enter the parking Slot : ");
                int n=sc.nextInt();
                new Mall(mall,n);
            }
        }
    }
    private static void storeData(String userName,String passWord)
    {
        File file=new File(file_name);
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(file,true)))
        {
            bw.write(userName+":"+passWord);
            bw.newLine();
        }
        catch (IOException e)
        {
            System.out.println("Error in saving the data in local db!");
        }
    }
}
