import java.io.*;
import java.util.*;
public class ACC extends BILL
{
    public static void acc() throws IOException
            {
                 System.out.print('\u000c');
                
                Scanner sc4=new Scanner(System.in);
                System.out.println("GOGGLES\t\t\t1");
                System.out.println("WATCHES\t\t\t2");
                
                System.out.println("COSMETICS\t\t3");
                System.out.println("FOOTWEAR\t\t4");
                System.out.print("PLEASE ENTER YOUR CHOICE:");
                ch4=sc4.nextInt();
                switch(ch4)
                {
                    case 1:System.out.println("GOGGLES(MALE OR FEMALE)--------->200.0 PER PIECE");
                    System.out.print("PLEASE ENTER THE QUANTITY:");
                    gpc=sc4.nextDouble();
                    gcost=gpc*200.0;count++;
                    System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc4.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                    
                    
                    
                    case 2:System.out.println("WATCHES(MALE OR FEMALE)----------->450.0 PER PIECE");
                    System.out.print("PLEASE ENTER THE QUANTITY:");
                    wpc=sc4.nextDouble();
                    wcost=wpc*450.0;count++;
                    System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc4.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                    
                    case 3:System.out.println("\nKAJAL\t\t\t1");
                    System.out.println("EYE LINER\t\t2");
                    System.out.println("LIPSTICKS\t\t3");
                    System.out.println("MAKEUP KIT\t\t4");
                    System.out.print("PLEASE ENTER YOUR CHOICE:");
                    chc=sc4.nextInt();
                    switch(chc)
                    {
                        case 1:System.out.println("\nKAJAL----------->100.0 PER PIECE");
                    System.out.print("PLEASE ENTER THE QUANTITY:");
                    kpc=sc4.nextDouble();
                    kcost=kpc*100.0;count++;
                    System.out.println("\nFOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc4.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  
                  
                  case 2:System.out.println("\nEYELINER----------->150.0 PER PIECE");
                    System.out.print("PLEASE ENTER THE QUANTITY:");
                    epc=sc4.nextDouble();
                    ecost=epc*150.0;count++;
                    System.out.println("\nFOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc4.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 3:System.out.println("\nLIPSTICKS----------->180.0 PER PIECE");
                    System.out.print("PLEASE ENTER THE QUANTITY:");
                    lpc=sc4.nextDouble();
                    lcost=lpc*180.0;count++;
                    System.out.println("\nFOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc4.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 4:System.out.println("\nMAKEUP KIT----------->480.0 PER PIECE");
                    System.out.print("PLEASE ENTER THE QUANTITY:");
                    mupc=sc4.nextDouble();
                    mucost=mupc*480.0;count++;
                  System.out.println("\nFOR BILL                    1");
                  System.out.println("FOR MORE SHOPPING           2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc4.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  default:System.out.println("SORRY WRONG ENTRY");
                }break;
                
                case 4:
                System.out.println("\nFOOTWEAR(ALL KIND)----------->400.0 PER PAIR");
                
                    System.out.print("PLEASE ENTER THE QUANTITY:");
                    fpc=sc4.nextDouble();
                    fcost=fpc*400.0;count++;
                    System.out.println("\nFOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc4.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                }
            }
        }
