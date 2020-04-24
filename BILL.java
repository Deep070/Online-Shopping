import java.io.*;
import java.util.*;
public class BILL extends ShoppingMarket
{
    public static void bill()throws IOException
{
    Scanner bill=new Scanner(System.in);
     System.out.print('\u000c');
     System.out.println("NOW TIME TO AVAIL DISCOUNTS!!!!");
    System.out.println("_____________________________________________________________________________________");
    System.out.println("PLATINUM CARD\t\t1");
    System.out.println("GOLD CARD\t\t2");
    System.out.println("SILVER CARD\t\t3");
    System.out.print("PLEASE ENTER THE CORRECT OPTION:");
    opt=bill.nextInt();
    
    System.out.print('\u000c');
    
    System.out.println("\t\tMISTLETOE MARKET-LET YOUR FINGERS DO THE WALKING");
        System.out.println("\t\t_______________________________________");
        System.out.println("\nDATTAPADA ROAD,BORIVALI(E)");
        System.out.println("MUMBAI-400 097");
        System.out.println("LICENSE NUMBER:0101/16106/H/G/");
        System.out.println("SUBJECT TO BANGALORE JURISDICTION");
    
    System.out.println("_______________________________________________________________");
   System.out.println("\t\t\tBILL ACCOUNT");
  
    System.out.println("_______________________________________________________________");
    System.out.println("COMMODITY\t\tQUANTITY\tAMOUNT");
    System.out.println("_________\t\t________\t_______");
    
    if(rqk>0)
    System.out.println("KOHINOOR RICE\t\t"+rqk+"\t\t"+rpk);
     if(rqd>0)
    System.out.println("DAAWAT RICE\t\t"+rqd+"\t\t"+rpd);
     if(rqo>0)
    System.out.println("MISTLETOE SPECIAL RICE\t"+rqo+"\t\t"+rpo);
    if(wqs>0)
    System.out.println("SUNRISE WHEAT\t\t"+wqs+"\t\t"+wps);
     if(wqa>0)
    System.out.println("AMBIKA WHEAT\t\t"+wqa+"\t\t"+wpa);
     if(wqo>0)
    System.out.println("MISTLETOE SPECIAL WHEAT\t"+wqo+"\t\t"+wpo);
    if(jqa>0)
    System.out.println("ARUN JOWAR\t\t"+jqa+"\t\t"+jpa);
     if(jqp>0)
    System.out.println("PRAFULLA JOWAR\t\t"+jqp+"\t\t"+jpp);
     if(jqo>0)
    System.out.println("MISTLETOE SPECIAL JOWAR\t"+jqo+"\t\t"+jpo);
    if(bqa>0)
    System.out.println("ANNAPURNA BAJRA\t\t"+bqa+"\t\t"+bpa);
     if(bqk>0)
    System.out.println("KATHWADI BAJRA\t\t"+bqk+"\t\t"+bpk);
     if(bqo>0)
    System.out.println("MISTLETOE SPECIAL BAJRA\t"+bqo+"\t\t"+bpo);
    if(ebpc>0)
    System.out.println("EAR BUDS\t\t\t"+ebpc+"\t\t\t"+ebcost);
     if(ncpc>0)
    System.out.println("NAIL CUTTERS\t\t"+ncpc+"\t\t"+nccost);
    if(bspc>0)
    System.out.println("BATHING SOAPS\t\t"+bspc+"\t\t"+bscost);
     if(mkpc>0)
    System.out.println("MEDICAL KITS\t\t"+mkpc+"\t\t"+mkcost);
     if(hpc>0)
    System.out.println("HANDKERCHIEFS\t\t"+hpc+"\t\t"+hcost);
    if(pepc>0)
    System.out.println("PENCIL BOXES\t\t"+pepc+"\t\t"+pecost);
     if(ppc>0)
    System.out.println("PENS\t\t\t"+ppc+"\t\t\t"+pcost);
    if(npc>0)
    System.out.println("NOTEBOOKS\t\t"+npc+"\t\t"+ncost);
     if(bpc>0)
    System.out.println("BAGS\t\t\t"+bpc+"\t\t\t"+bcost);
     if(gbpc>0)
    System.out.println("GEOMETRY BOXES\t\t"+gbpc+"\t\t"+gbcost);
    if(gpc>0)
    System.out.println("GOOGLES\t\t\t"+gpc+"\t\t"+gcost);
     if(wpc>0)
    System.out.println("WATCHES\t\t\t"+wpc+"\t\t"+wcost);
    if(kpc>0)
    System.out.println("KAJAL\t\t\t"+kpc+"\t\t\t"+kcost);
     if(epc>0)
    System.out.println("EYE LINER\t\t"+epc+"\t\t"+ecost);
    if(lpc>0)
    System.out.println("LIPSTICKS\t\t"+lpc+"\t\t"+lcost);
     if(mupc>0)
    System.out.println("MAKEUP KITS\t\t"+mupc+"\t\t"+mucost);
     if(fpc>0)
    System.out.println("FOOTWEAR\t\t"+fpc+"\t\t"+fcost);
    if(msq>0)
    System.out.println("MALE SHIRT\t\t"+msq+"\t\t"+mscost);
    if(mtsq>0)
    System.out.println("MALE T-SHIRT\t\t"+mtsq+"\t\t"+mtscost);
    if(mdtq>0)
    System.out.println("MALE TROUSERS\t\t"+mdtq+"\t\t"+mdtcost);
    if(mfpq>0)
    System.out.println("MALE FORMAL PANT\t\t"+mfpq+"\t\t"+mfpcost);
    if(mjq>0)
    System.out.println("MALE JACKET\t\t"+mjq+"\t\t"+mjcost);
    if(fsq>0)
    System.out.println("SAREE\t\t\t"+fsq+"\t\t\t"+fscost);
    if(ftsq>0)
    System.out.println("FEMALE T-SHIRT\t\t"+ftsq+"\t\t"+ftscost);
    if(fskq>0)
    System.out.println("SALWAR KAMEEZ\t\t"+fskq+"\t\t"+fskcost);
    if(fdtq>0)
    System.out.println("FEMALE TROUSERS\t\t"+fdtq+"\t\t"+fdtcost);
    if(ksq>0)
    System.out.println("KID SHIRT\t\t"+ksq+"\t\t"+kscost);
    if(ktsq>0)
    System.out.println("KID T-SHIRT\t\t"+ktsq+"\t\t"+ktscost);
    if(kdtq>0)
    System.out.println("KID TROUSER\t\t"+kdtq+"\t\t"+kdtcost);
    if(kjq>0)
    System.out.println("KID JACKET\t\t"+kjq+"\t\t"+kjcost);
    if(kshq>0)
    System.out.println("KID SHORTS\t\t"+kshq+"\t\t"+kshcost);
    if(cq>0)
    System.out.println("CHOCOLATES\t\t"+cq+"\t\t"+ccost);
    if(nq>0)
    System.out.println("NOODLES\t\t\t"+nq+"\t\t"+nocost);
    if(sq>0)
    System.out.println("SOYA SAUCE\t\t"+sq+"\t\t"+scost);
    if(pq>0)
    System.out.println("PICKLES\t\t\t"+pq+"\t\t"+picost);
    if(kq>0)
    System.out.println("KETCHUP\t\t\t"+kq+"\t\t"+kecost);
    
    
    
    System.out.println("_____________________________________________________________________________________");
    total_amount=rpk+rpd+rpo+wps+wpa+wpo+jpa+jpp+jpo+bpa+bpk+bpo+ebcost+nccost+bscost+mkcost+hcost+pecost+pcost+ncost+bcost+gbcost+gcost+wcost+kcost+ecost+lcost+mucost+fcost+mscost+mtscost+mdtcost+mfpcost+mjcost+fscost+ftscost+fskcost+fdtcost+kscost+kshcost+ktscost+kdtcost+kjcost+kecost+scost+picost+nocost+ccost;
    
    System.out.println("TOTAL ITEMS:"+count);
    System.out.println("TOTAL AMOUNT:"+total_amount);
    vat=0.05*total_amount;
    switch(opt)
    {
        case 1:dis=0.15*total_amount;break;
        case 2:dis=0.10*total_amount;break;
        case 3:dis=0.05*total_amount;break;
        default:System.out.println("WRONG OPTION");
    }
   
    
    System.out.println("SALES TAX CHARGED:"+vat);
    System.out.println("DISCOUNT OFFERED:"+dis);
    System.out.println("NET AMOUNT:"+(total_amount+vat-dis));
    System.out.println("_____________________________________________________________________________________");
     payable=Math.rint(total_amount+vat-dis);
    System.out.println("AMOUNT PAYABLE:"+Math.rint((total_amount+vat-dis)));
    System.out.println("_____________________________________________________________________________________");
    
    System.out.println("\t\t\t\t\t\tTHANK YOU SHOPPING");
    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tT&C APPLY");
    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tENFORCED VAT TAX ACT,2002");
    System.out.print("PRESS 1 TO PROCEED TO PAYMENT:");
    
 
    int st=bill.nextInt();
    if(st==1)
    {
        payment();
    }
    
      
    
     
    
    
}
public static void payment()throws IOException
{
    Scanner bill2=new Scanner(System.in);
    paid=0.0;
    System.out.print('\u000c');
    
    System.out.println("YOUR TOTAL AMOUNT IS INR "+payable);
    System.out.print("\nDO YOU WANT TO CASH OR THROUGH CARD?");
    String pay=bill2.nextLine();
    if(pay.equalsIgnoreCase("CARD"))
    {
        System.out.print("ENTER THE AMOUNT:");
        paid=bill2.nextDouble();
        if(paid==payable)
        {
        System.out.println("\nTHANK YOU");
        System.out.println("VISIT AGAIN!!");
    }
    else
    
    {
        payment();
    }
}
    else if(pay.equalsIgnoreCase("CASH"))
    {
        
    
        System.out.print("\nENTER 1000 RUPEE NOTES:");
    r1000=bill2.nextInt();
    if(r1000*1000==payable)
    {
        System.out.println("\nTHANK YOU");
        System.out.println("VISIT AGAIN!!");
    }
    else if(r1000*1000>payable)
    {
        System.out.println("YOU WILL SHORTLY RECEIVE BACK "+((r1000*1000)-payable));
        System.out.println("\nTHANK YOU");
        System.out.println("VISIT AGAIN!!");
    }
    else if(r1000*1000<payable)
    {
        
    System.out.print("\nENTER 500 RUPEE NOTES:");
    r500=bill2.nextInt();
    if(r1000*1000+r500*500==payable)
    {
        System.out.println("\nTHANK YOU");
        System.out.println("VISIT AGAIN!!");
    }
    else if(r1000*1000+r500*500>payable)
    {
        System.out.println("YOU WILL SHORTLY RECEIVE BACK "+((r1000*1000+r500*500)-(payable)));
        System.out.println("\nTHANK YOU");
        System.out.println("VISIT AGAIN!!");
    }
    else if(r1000*1000+r500*500<payable)
    {
        
    System.out.print("\nENTER 100 RUPEE NOTES:");
    r100=bill2.nextInt();
    if(r1000*1000+r500*500+r100*100==payable)
        {
            System.out.println("\nTHANK YOU");
        System.out.println("VISIT AGAIN!!");
    }
    else if(r1000*1000+r500*500+r100*100>payable)
    {
        System.out.println("YOU WILL SHORTLY RECEIVE BACK "+((r1000*1000+r500*500+r100*100)-(payable)));
        System.out.println("\nTHANK YOU");
        System.out.println("VISIT AGAIN!!");
    }
    else if(r1000*1000+r500*500+r100*100<payable)
    {
        
    System.out.print("\nENTER 50 RUPEE NOTES:");
    r50=bill2.nextInt();
    if(r1000*1000+r500*500+r100*10+r50*50==payable)
    {
        System.out.println("\nTHANK YOU");
        System.out.println("VISIT AGAIN!!");
    } 
    else if(r1000*1000+r500*500+r100*10+r50*50<payable)
    {
        payment();
    }
    else if(r1000*1000+r500*500+r100*10+r50*50>payable)
    {
        System.out.println("YOU WILL SHORTLY RECEIVE BACK "+((r1000*1000+r500*500+r100*10+r50*50)-payable));
        System.out.println("\nTHANK YOU");
        System.out.println("VISIT AGAIN!!");
    }
    
    }
  }
}}

    
}
}