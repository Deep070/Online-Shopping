import java.io.*;
import java.util.*;
public class CEREALS extends BILL
{
    public static void cereals()throws IOException
    {
         System.out.print('\u000c');
        
        Scanner sc1=new Scanner(System.in);
        
          System.out.println("RICE\t\t1");
          System.out.println("WHEAT\t\t2");
          System.out.println("JOWAR\t\t3");
          System.out.println("BAJRA\t\t4");
          System.out.print("PLEASE ENTER YOUR CHOICE:");
          
          ch1=sc1.nextInt();
          switch(ch1)
          {
               
              case 1:System.out.print('\u000c');System.out.println("\nRICE MENU\n");
             
              System.out.println("QUALITY\t\tPRICE PER KG");
              
              System.out.println("1.KOHINOOR\t\t50.0");
              System.out.println("2.DAAWAT\t\t45.0");
              System.out.println("3.MISTLETOE SPECIAL\t40.0");
              
              System.out.print("ENTER YOUR CHOICE:");
              ch1r=sc1.nextInt();
              switch(ch1r)
              {
                  case 1:System.out.print("PLEASE ENTER THE QUANTITY:");
                  rqk=sc1.nextDouble();
                  rpk=50.0*rqk;
                  count++;
                  
                  System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc1.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 2:System.out.print("PLEASE ENTER THE QUANTITY:");
                  rqd=sc1.nextDouble();
                  rpd=45.0*rqd;count++;
                 
                  System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc1.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 3:System.out.print("PLEASE ENTER THE QUANTITY:");
                  rqo=sc1.nextDouble();
                  rpo=40.0*rqo;count++;
                 
                  System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc1.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                 default:System.out.println("SORRY,WRONG CHOICE ENTERED");
                }break;
                 
   case 2:System.out.print('\u000c');System.out.println("\nWHEAT MENU\n");
  
              System.out.println("QUALITY\t\tPRICE PER KG");
             
              System.out.println("1.SUNRISE\t\t78.0");
              System.out.println("2.AMBIKA\t\t67.0");
              System.out.println("3.MISTLETOE SPECIAL\t50.0");
              System.out.print("ENTER YOUR CHOICE:");
              ch1w=sc1.nextInt();
              switch(ch1w)
              {
                  case 1:System.out.print("PLEASE ENTER THE QUANTITY:");
                  wqs=sc1.nextDouble();
                  wps=78.0*wqs;count++;
                 
                  System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc1.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 2:System.out.print("PLEASE ENTER THE QUANTITY:");
                  wqa=sc1.nextDouble();
                  wpa=67.0*wqa;count++;
                  
                  System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc1.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 3:System.out.print("PLEASE ENTER THE QUANTITY:");
                  wqo=sc1.nextDouble();
                  wpo=50.0*wqo;count++;
                 
                  System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc1.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  default:System.out.println("SORRY,WRONG CHOICE ENTERED");
}break;
 
case 3:System.out.print('\u000c');System.out.println("\nJOWAR MENU\n");

              System.out.println("QUALITY\t\tPRICE PER KG");
              
              System.out.println("1.ARUN\t\t38.0");
              System.out.println("2.PRAFULLA\t\t33.0");
              System.out.println("3.MISTLETOE SPECIAL\t29.0");
              System.out.print("ENTER YOUR CHOICE:");
              ch1j=sc1.nextInt();
              switch(ch1j)
              {
                  case 1:System.out.print("PLEASE ENTER THE QUANTITY:");
                  jqa=sc1.nextDouble();
                  jpa=38.0*jqa;count++;
                  
                  System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc1.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 2:System.out.print("PLEASE ENTER THE QUANTITY:");
                  jqp=sc1.nextDouble();
                  jpp=33.0*jqp;count++;
                  
                  System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc1.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 3:System.out.print("PLEASE ENTER THE QUANTITY:");
                  jqo=sc1.nextDouble();
                  jpo=29.0*jqo;count++;
                 
                  System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc1.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  default:System.out.println("SORRY,WRONG CHOICE ENTERED");
}break;
 
case 4:System.out.print('\u000c');System.out.println("\nBAJRA MENU\n");

              System.out.println("QUALITY\t\tPRICE PER KG");
              
              System.out.println("1.ANNAPURNA\t\t29.0");
              System.out.println("2.KATHWADI\t\t27.0");
              System.out.println("3.MISTLETOE SPECIAL\t24.0");
              System.out.print("ENTER YOUR CHOICE:");
              ch1b=sc1.nextInt();
              switch(ch1b)
              {
                  case 1:System.out.print("PLEASE ENTER THE QUANTITY:");
                  bqa=sc1.nextDouble();
                  bpa=29.0*bqa;count++;
                  
                  System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc1.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 2:System.out.print("PLEASE ENTER THE QUANTITY:");
                  bqk=sc1.nextDouble();
                  bpk=27.0*bqk;count++;
                  
                  System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc1.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 3:System.out.print("PLEASE ENTER THE QUANTITY:");
                  bqo=sc1.nextDouble();
                  bpo=24.0*bqo;count++;
                  
                  System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc1.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  default:System.out.println("SORRY,WRONG CHOICE ENTERED");
}break;
default:System.out.println("SORRY WRONG CHOICE ENTERED");
System.out.print("PLAESE ENTER AGAIN:");
ch1=sc1.nextInt();cereals();
}
}}