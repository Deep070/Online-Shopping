import java.io.*;
import java.util.*;
public class STATIONARY extends BILL
{
           public static void stationary()throws IOException
 {
      System.out.print('\u000c');
     Scanner sc3=new Scanner(System.in);
     System.out.println("PENCILS         1");
    System.out.println("PENS             2");
    System.out.println("NOTEBOOKS        3");
    System.out.println("BAGS             4");
    System.out.println("GEOMETRY BOXES   5");
    
    System.out.print("PLEASE ENTER YOUR CHOICE:");
    ch3=sc3.nextInt();
    switch(ch3)
    {
        case 1:System.out.println("PENCIL BOX---------------->30.0 PER BOX");
        System.out.print("PLEASE ENTER THE NUMBER OF BOXES:");
        pepc=sc3.nextInt();
        pecost=pepc*30.0;count++;
        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc3.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
        case 2:System.out.println("PENS---------------->15.0 PER PIECE");
        System.out.print("PLEASE ENTER THE NUMBER OF PIECES:");
        ppc=sc3.nextInt();
        pcost=ppc*15.0;count++;
        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc3.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
         case 3:System.out.println("NOTEBOOKS---------------->50.0 PER PIECE");
        System.out.print("PLEASE ENTER THE NUMBER OF PACKETS:");
        npc=sc3.nextInt();
        ncost=npc*50.0;count++;
        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc3.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
      case 4:System.out.println("BAGS---------------->400.0 PER PIECE");
        System.out.print("PLEASE ENTER THE NUMBER OF BAGS:");
        bpc=sc3.nextInt();
        bcost=bpc*400.0;count++;
        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc3.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
        case 5:System.out.println("GEOMETRY BOXES---------------->110.0 PER PIECE");
        System.out.print("PLEASE ENTER THE NUMBER OF PIECES:");
        gbpc=sc3.nextInt();
        gbcost=gbpc*110.0;count++;
        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc3.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  default:System.out.println("WRONG CHOICE ENTERED,TRY AGAIN");
                  stationary();break;
                }
            }
        }