import java.io.*;
import java.util.*;
public class PC extends BILL
{
    public static void pc()throws IOException
{ 
    System.out.print('\u000c');
    Scanner sc2=new Scanner(System.in);
   
   System.out.println("EAR BUDS\t\t1");
    System.out.println("NAIL CUTTERS\t\t2");
    System.out.println("BATHING SOAPS\t\t3");
    System.out.println("MEDICAL KIT(DETTOL+BANDAGES+FEVER PILLS)\t4");
    System.out.println("HANKERCHIEFS\t\t5");
    
    System.out.print("PLEASE ENTER YOUR CHOICE:");
    ch2=sc2.nextInt();
    switch(ch2)
    {
        case 1:System.out.println("EAR BUDS---------------->55.0 PER PACKET");
        System.out.print("PLEASE ENTER THE NUMBER OF PACKETS:");
        ebpc=sc2.nextInt();
        ebcost=ebpc*55.0;count++;
        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc2.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
        case 2:System.out.println("NAIL CUTTER---------------->10.0 PER PIECE");
        System.out.print("PLEASE ENTER THE NUMBER OF PIECES:");
        ncpc=sc2.nextInt();
        nccost=ncpc*10.0;count++;
        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc2.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
         case 3:System.out.println("BATHING SOAPS---------------->35.0 PER PACKET");
        System.out.print("PLEASE ENTER THE NUMBER OF PACKETS:");
        bspc=sc2.nextInt();
        bscost=bspc*35.0;count++;
        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc2.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
      case 4:System.out.println("MEDICAL KIT---------------->255.0 PER KIT");
        System.out.print("PLEASE ENTER THE NUMBER OF KITS:");
        mkpc=sc2.nextInt();
        mkcost=mkpc*255.0;count++;
        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc2.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
        case 5:System.out.println("HANDKERCHIEFS---------------->29.0 PER PACKET");
        System.out.print("PLEASE ENTER THE NUMBER OF PACKETS:");
        hpc=sc2.nextInt();
        hcost=hpc*29.0;count++;
        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc2.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  default:System.out.println("WRONG CHOICE ENTERED,TRY AGAIN");
                  pc();break;
                }
            }
        }
            
            
            
            
 
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
     
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            