package tols;

import java.util.Scanner;

public class Appmail {
    private String firstname;
    private String lastname;
    private String department;
    private String atltanate;
    private String password;
    public Appmail (String fistname ,String lastname)   
    {
        this.firstname=fistname;
        this.lastname=lastname;
        this.department=setDepartment();
        this.password =passworde(6);
        System.out.println("Your Department is :"  + this.department);
        System.out.println("Email :"+this.firstname +"."+ this.lastname +"@" +this.department);
        
       
        System.out.println("Your Defoult Password is :"+this.passworde(6));

        

    }
    private String setDepartment()
    {
        System.out.println("The Department\n1 for Sales\n2 for Development\n3 for Accounts\n4 for IT\nEnter Code");
        Scanner in = new Scanner(System.in);
        int depend =in.nextInt();
        if (depend==1)
        {
            return "Sales";
        }
        else if (depend==2)
        {
            return "dev";

        }
        else if (depend==3)
        { 
            
            return "accounts";
        }
        else 
        {
            return "IT";
        }
        
    }
    private String passworde(int length)
{
    String cossy ="wqtydjspom@#%$";
    char [] team =new char[length];
    for(int i =0;i<length;i++)
    {
        int kesh =(int) (Math.random()*cossy.length());
        team [i] = cossy.charAt(kesh);


    }
    return new String(team);
}
    



}
