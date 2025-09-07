import java.util.Random;
import java.util.Scanner;

public class Program76 
{
    Scanner s=new Scanner(System.in);
    Random r = new Random();  
    String custName[]={"Harshu","Vatsal","suresh"};
    String accNo[]={"123456789","987654321","012345678"};
    double balance[]={50000,60000,70000};
    String trasf;
    boolean found=false,tfound=false;
    int pos,ch;
    double amt;
    int count=3;


    void getdetails()
    {
        do
        {
            checkData();
            count--;
            
        }while(found==false && count>=1);
        if (count==0)
        System.out.println("Your Account is blocked for next 24 Hours.");
    }

    boolean checkData()
    {
        System.out.println("Enter Customer Name:");
        String name=s.next();

        System.out.println("Enter Customer Account Number:");
        String number=s.next();
        System.out.println("-----------------------------------");
        for (int i = 0; i < accNo.length; i++) 
        {
            if (name.equalsIgnoreCase(custName[i]) && number.equalsIgnoreCase(accNo[i])) 
            {
                System.out.println("Welcome to SBI.");
                found=true;
                pos=i;
                menu();
                break;                
            }    
        }
        if (found==false) 
        {
            System.out.println("Invalid Customer Details."); 
            System.out.println("Attemps left "+count);
            System.out.println("------------------------------------");   
        } 
        return found;   
    }

    void menu()
    {
        System.out.println("Enter your choice:\n1==> Withdraw\n2==> Deposite\n3==> Transfer\n0==> Exit");
        ch=s.nextInt();
        switch (ch) 
        {
            case 1:
                System.out.println("Enter Amount to withdraw:");
                amt=s.nextDouble();
                withdraw();
                break;
            case 2:
                System.out.println("Enter Amount to deposite:");
                amt=s.nextDouble();
                deposite();
                break;
            case 3:
                System.out.println("Enter Amount to transfer:");
                amt=s.nextDouble();
                System.out.println("Enter Account Number to transfer");
                trasf=s.next();
                transfer();
                break;
            
            default:
                System.out.println("Exit");
                break;
        }        
    }

    void withdraw()
    {
        if (amt>balance[pos]) 
        {
            System.out.println("Insufficient Balance.");    
        }    
        else
        {
            balance[pos]-=amt;
            System.out.println("Amount Withdrawn Successfully");
            System.out.println(amt+" RS debited from account number XXXXXX"+accNo[pos].substring(5));
            again();
        }
    }

    void deposite()
    {
        if(amt<=0)
        {
            System.out.println("Enter Valid Amount");
        }
        else
        {
            balance[pos]+=amt;
            System.out.println("Amount Deposited Successfully");
            System.out.println(amt+" RS credited to account number XXXXXX"+accNo[pos].substring(5)); 
            System.out.println("Current Balance:"+balance[pos]);  
            again();
        }
    }

    void transfer()
    {
        if (balance[pos]>=amt && amt>0) 
        {
            for (int i = 0; i < accNo.length; i++) 
            {
                if (trasf.equalsIgnoreCase(accNo[i])) 
                {
                    tfound=true;
                    balance[pos]-=amt;
                    balance[i]+=amt;
                    System.out.println("Amount Transfered to Account Number XXXXXX"+accNo[i]);
                    System.out.println("Your Balance="+balance[pos]);
                    System.out.println("Transfered Account Balance:"+balance[i]);
                    again();
                    break;
                }    
            }
            if (tfound==false) 
            {
                System.out.println("Invalid Customer Details.");       
            }
        }
        else
        {
            System.out.println("Enter valid Amount");
        }
    }

    void again()
    {
        if (balance[pos]<=0) 
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            System.out.println("Do you want to perform another transaction?");
            System.out.println("1. Yes\n2. No");
            int ch=s.nextInt();
            
            if(ch==1)
            {
                int otp;
                do
                {
                    otp=r.nextInt(9999);
                }while(otp<1000);
                System.out.println("Your OTP is: "+otp);
                System.out.println("Enter OTP");
                int otp1=s.nextInt();
                if (otp==otp1)
                menu();
                else
                System.out.println("Invalid OTP");
            }
            else if(ch==2)
            {
                System.out.println("Thank you for using our banking services");
                System.exit(0);
            }
            else
            {
                System.out.println("Invalid choice\n Enter again.");
                again();
            }
        }
    }
}