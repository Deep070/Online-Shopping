import java.io.*;
import java.util.*;
public class PFI extends BILL
{
    public static void pfi()throws IOException
    {
        Scanner br=new Scanner(System.in);
        System.out.print('\u000c');
        System.out.println("CHOCOLATES      1");
        System.out.println("PICKLES         2");
        System.out.println("NOODLES         3");
        System.out.println("SOYA SAUCE      4");
        System.out.println("KETCHUP         5");
        System.out.print("ENTER YOUR CHOICE:");
        ch5=br.nextInt();
        switch(ch5)
        {
            case 1:System.out.println("\nCHOCOLATES--------100 PER BOX");
            System.out.print("ENTER THE QUANTITY:");
            cq=br.nextInt();
            ccost=cq*100.0;
            count++;
            System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=br.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");
            break;
            
            case 2:System.out.println("\nPICKLES--------125 PER BOTTLE");
            System.out.print("ENTER THE QUANTITY:");
            pq=br.nextInt();
            picost=pq*125.0;
            count++;
            System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=br.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");
            break;
            
            
            case 3:System.out.println("\nNOODLES--------50 PER PACKAGE");
            System.out.print("ENTER THE QUANTITY:");
            nq=br.nextInt();
            nocost=nq*50.0;
            count++;
            System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=br.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");
            break;
            
            case 4:System.out.println("\nSOYA SAUCE--------150 PER BOTTLE");
            System.out.print("ENTER THE QUANTITY:");
            sq=br.nextInt();
            scost=sq*150.0;
            count++;
            System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=br.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");
            break;
            
            case 5:System.out.println("\nKETCHUP--------100 PER PACKAGE");
            System.out.print("ENTER THE QUANTITY:");
            kq=br.nextInt();
            kecost=kq*100.0;
            count++;
            System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=br.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");
            break;
        }
    }
}
            