 
import java.io.*;
import java.util.*;
public class ShoppingMarket
{
   public static int ch,ch1,ch1r,ch1w,ch1j,ch1b,chb,ch2,ch3,ch4,ch5,chc,chf,chfm,chff,st,mch,fch,kch,opt,count,opt1=0;
    public static double rqk,rqd,rqo,rpk,rpd,rpo,wqs,wps,wqa,wpa,wpo,wqo,jpa,jpp,jpo,jqp,jqa,jqo,bqa,bqk,bqo,bpa,bpk,bpo,cq,pq,nq,sq,kq=0;
    public static double ebpc,ebcost,ncpc,nccost,bspc,bscost,mkpc,mkcost,hpc,hcost,ccost,nocost,scost,kecost,picost=0;
    public static double pepc,pecost,ppc,pcost,npc,ncost,bpc,bcost,gbpc,gbcost,payable=0;
    public static double gpc,gcost,wpc,wcost,kpc,kcost,epc,ecost,lpc,lcost,mupc,mucost,fpc,fcost=0;
    public static double msq,mtsq,mdtq,mfpq,mjq,mscost,mtscost,mdtcost,mfpcost,mjcost,fsq,ftsq,fdtq,fscost,ftscost,fdtcost=0;
    public static double fskq,fskcost,ksq,ktsq,kdtq,kjq,kshq,kshcost,kscost,ktscost,kdtcost,kjcost=0;
    public static double total_amount,vat,dis,paid=0;
    public static String name;
    public static int age=0;
    public static int r1000,r500,r100,r50,r20,r10,r5,r2,r1=0;
    public static void customer()throws IOException
    {
        System.out.print('\u000c');
        ch=ch1=ch1r=ch1w=ch1j=ch1b=chb=ch2=ch3=ch4=ch5=chc=chf=chfm=chff=st=mch=fch=kch=opt=count=opt1=0; 
    rqk=rqd=rqo=rpk=rpd=rpo=wqs=wps=wqa=wpa=wpo=wqo=jpa=jpp=jpo=jqp=jqa=jqo=bqa=bqk=bqo=bpa=bpk=bpo=cq=pq=nq=sq=kq=0;
      ebpc=ebcost=ncpc=nccost=bspc=bscost=mkpc=mkcost=hpc=hcost=ccost=nocost=scost=kecost=picost=0;
   pepc=pecost=ppc=pcost=npc=ncost=bpc=bcost=gbpc=gbcost=payable=0;
      gpc=gcost=wpc=wcost=kpc=kcost=epc=ecost=lpc=lcost=mupc=mucost=fpc=fcost=0;
      msq=mtsq=mdtq=mfpq=mjq=mscost=mtscost=mdtcost=mfpcost=mjcost=fsq=ftsq=fdtq=fscost=ftscost=fdtcost=0;
      fskq=fskcost=ksq=ktsq=kdtq=kjq=kshq=kshcost=kscost=ktscost=kdtcost=kjcost=0;
      total_amount=vat=dis=paid=0;
    
      age=0;
      r1000=r500=r100=r50=r20=r10=r5=r2=r1=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\tMISTLETOE MARKET-LET YOUR FINGERS DO THE WALKING");
        System.out.println("\t\t_______________________________________");
        System.out.println("\nDATTAPADA ROAD,BORIVALI(E)");
        System.out.println("MUMBAI-400 097");
        System.out.println("LICENSE NUMBER:0101/16106/H/G/");
        System.out.println("SUBJECT TO BANGALORE JURISDICTION");
        System.out.print("\nPLEASE ENTER NAME:");
        name=sc.nextLine();
       
        System.out.print("PLEASE ENTER YOUR AGE(SHOULD BE ABOVE 18):");
        age=sc.nextInt();
        if (age<18||age>200)
        {
            
        System.out.println("SORRRY! YOU CAN NOT PURCHASE ANYTHING!!\nPLEASE COME WITH YOUR PARENTS");
        
}
else
{
    


menu();
}
}
       
public static void menu()throws IOException
    {
        
        System.out.print('\u000c');
        System.out.println("\t\tMISTLETOE MARKET-LET YOUR FINGERS DO THE WALKING");
        System.out.println("\t\t_______________________________________");
        System.out.println("\nDATTAPADA ROAD,BORIVALI(E)");
        System.out.println("MUMBAI-400 097");
        System.out.println("LICENSE NUMBER:0101/16106/H/G/");
        System.out.println("SUBJECT TO BANGALORE JURISDICTION");
        
        System.out.println("\nMAIN MENU\n");
        System.out.println("__________________________________");
        System.out.println("1\tCEREALS");
        System.out.println("2\tPACKAGED FOOD ITEMS");
        System.out.println("3\tPERSONAL CARE");
        System.out.println("4\tSTATIONARY");
        System.out.println("5\tACCESSORIES");
        System.out.println("6\tCLOTHING");
        
      
        Scanner sc=new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR CHOICE:");
        
        
        ch=sc.nextInt();
        switch(ch)
        {
        
        
            case 1:CEREALS.cereals();break;
            case 2:PFI.pfi();break;
            case 3:PC.pc();break;
            case 4:STATIONARY.stationary();break;
            case 5:ACC.acc();break;
            case 6:CLOTHING.clothing();break;
           
            
            
            
            default:System.out.println("WRONG NUMBER ENTERED,TRY AGAIN");
            System.out.print("PLEASE ENTER YOUR CHOICE:");
            ch=sc.nextInt();
            switch(ch)
            {
                
                 case 1:CEREALS.cereals();break;
            case 2:PFI.pfi();break;
            case 3:PC.pc();break;
            case 4:STATIONARY.stationary();break;
            case 5:ACC.acc();break;
            case 6:CLOTHING.clothing();break;
           
           
    }
}
  } 
 } 
 
 
 
 
    
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     