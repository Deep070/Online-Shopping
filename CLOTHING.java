import java.io.*;
import java.util.*;
public class CLOTHING extends BILL
{
    public static void clothing()throws IOException
            {
                System.out.print('\u000c');
                Scanner sc5=new Scanner(System.in);
                System.out.println("MALE\t\t1");
                System.out.println("FEMALE\t\t2");
                System.out.println("KIDS\t\t3");
                System.out.print("ENTER THE OPTION:");
                st=sc5.nextInt();
                switch(st)
                {
                    
                    case 1:System.out.print('\u000c');
                    System.out.println("SHIRTS             1");
                    System.out.println("T-SHIRTS           2");
                    System.out.println("DENIM TROUSERS     3");
                    System.out.println("FORMAL PANTS       4");
                    System.out.println("JACKETS            5");
                    System.out.print("PLEASE ENTER YOUR CHOICE:");
                    mch=sc5.nextInt();
                    switch(mch)
                    {
                        case 1:System.out.println("SHIRTS\t\t500.0 PER PIECE");
                        System.out.print("ENTER THE QUANTITY:");
                        msq=sc5.nextInt();
                        mscost=msq*500.0;count++;
                        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc5.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 2:System.out.println("T-SHIRTS\t\t400.0 PER PIECE");
                        System.out.print("ENTER THE QUANTITY:");
                        mtsq=sc5.nextInt();
                        mtscost=mtsq*400.0;count++;
                        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc5.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 3:System.out.println("DENIM TROUSERS\t\t800.0 PER PIECE");
                        System.out.print("ENTER THE QUANTITY:");
                        mdtq=sc5.nextInt();
                        mdtcost=mdtq*800.0;count++;
                        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc5.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 4:System.out.println("FORMAL PANTS\t\t1000.0 PER PIECE");
                        System.out.print("ENTER THE QUANTITY:");
                        mfpq=sc5.nextInt();
                        mfpcost=mfpq*500.0;count++;
                        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc5.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 5:System.out.println("JACKETS\t\t700.0 PER PIECE");
                        System.out.print("ENTER THE QUANTITY:");
                        mjq=sc5.nextInt();
                        mjcost=mjq*700.0;count++;
                        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc5.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                 default:System.out.println("WRONG CHOICE ENTERED");
                }break;
                case 2:System.out.print('\u000c');
                    System.out.println("SAREES               1");
                    System.out.println("T-SHIRTS             2");
                    System.out.println("DENIM TROUSERS       3");
                    
                    System.out.println("SALWAR KAMEEZ        4");
                    System.out.print("PLEASE ENTER YOUR CHOICE:");
                    fch=sc5.nextInt();
                    switch(fch)
                    {
                        case 1:System.out.println("SAREES\t\t8000.0 PER PIECE");
                        System.out.print("ENTER THE QUANTITY:");
                        fsq=sc5.nextInt();
                        fscost=fsq*8000.0;count++;
                        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc5.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 2:System.out.println("T-SHIRTS\t\t350.0 PER PIECE");
                        System.out.print("ENTER THE QUANTITY:");
                        ftsq=sc5.nextInt();
                        ftscost=ftsq*350.0;count++;
                        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc5.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 3:System.out.println("DENIM TROUSERS\t\t700.0 PER PIECE");
                        System.out.print("ENTER THE QUANTITY:");
                        fdtq=sc5.nextInt();
                        fdtcost=fdtq*700.0;count++;
                        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc5.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 4:System.out.println("SALWAR KAMMEZ\t\t2500.0 PER PIECE");
                        System.out.print("ENTER THE QUANTITY:");
                        fskq=sc5.nextInt();
                        fskcost=fskq*2500.0;count++;
                        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc5.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  
                  
                 default:System.out.println("WRONG CHOICE ENTERED");
                }break;
                case 3:System.out.print('\u000c');System.out.println("SHIRTS\t\t1");
                    System.out.println("T-SHIRTS\t\t2");
                    System.out.println("DENIM TROUSERS\t\t3");
                    System.out.println("SHORTS\t\t4");
                    System.out.println("JACKETS\t\t5");
                    System.out.print("PLEASE ENTER YOUR CHOICE:");
                    kch=sc5.nextInt();
                    switch(kch)
                    {
                        case 1:System.out.println("SHIRTS\t\t300.0 PER PIECE");
                        System.out.print("ENTER THE QUANTITY:");
                        ksq=sc5.nextInt();
                        kscost=ksq*300.0;count++;
                        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc5.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 2:System.out.println("T-SHIRTS\t\t250.0 PER PIECE");
                        System.out.print("ENTER THE QUANTITY:");
                        ktsq=sc5.nextInt();
                        ktscost=ktsq*250.0;count++;
                        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc5.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 3:System.out.println("DENIM TROUSERS\t\t600.0 PER PIECE");
                        System.out.print("ENTER THE QUANTITY:");
                       kdtq=sc5.nextInt();
                        kdtcost=kdtq*600.0;count++;
                        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc5.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 4:System.out.println("SHORTS\t\t200.0 PER PIECE");
                        System.out.print("ENTER THE QUANTITY:");
                        kshq=sc5.nextInt();
                        kshcost=kshq*200.0;count++;
                        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc5.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                  case 5:System.out.println("JACKETS\t\t500.0 PER PIECE");
                        System.out.print("ENTER THE QUANTITY:");
                        kjq=sc5.nextInt();
                        kjcost=kjq*500.0;count++;
                        System.out.println("FOR BILL                               1");
                  System.out.println("FOR MORE SHOPPING                      2");
                  System.out.print("ENTER YOUR CHOICE:");
                  chb=sc5.nextInt();
                  if(chb==1)bill();
                  else if(chb==2)menu();
                  else System.out.println("WRONG CHOICE ENTERED");break;
                  
                 default:System.out.println("WRONG CHOICE ENTERED");
                }break;
            }
        }
    }