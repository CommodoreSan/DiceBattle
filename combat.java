import java.util.*;
class combat
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter names of attacker and defender.");
        String nA=sc.nextLine();
        String nB=sc.nextLine();
        System.out.println("Enter army size of either combatant.");
        double sA=sc.nextDouble();
        double sB=sc.nextDouble();
        int D,i,cA=0,cB=0;
        System.out.println("Troops engaging..."+"\n"+"Battle commenced!");
        for(i=1;i<=5;i++)
        {
            D=dice();
            System.out.println("Dice roll = "+D);
            if(D<=(9))
            {
                if(D>=7)
                {
                    System.out.println("Bare win for "+nA);
                    sA=(sA*10-3)/10; sB=(sB*10-5)/10;
                }
                else if(D>=3&&D<7)
                {
                    System.out.println("Normal win for "+nA);
                    sA=(sA*10-2)/10; sB=(sB*10-8)/10;
                }
                else
                {
                    System.out.println("Decisive win for "+nA);
                    sA=(sA*10-1)/10; sB=sB-1.0;
                }
                System.out.println(sA+" troops vs "+sB+" troops");
                System.out.println((++cA)+" - "+cB);
            }
            if(D>=(10))
            {
                if(D<=12)
                {
                    System.out.println("Bare win for "+nB);
                    sB=(sB*10-3)/10; sA=(sA*10-5)/10;
                }
                else if(D>12&&D<=18)
                {
                    System.out.println("Normal win for "+nB);
                    sB=(sB*10-2)/10; sA=(sA*10-8)/10;
                }
                else
                {
                    System.out.println("Decisive win for "+nB);
                    sB=(sB*10-1)/10; sA=sA-1.0;
                }
                System.out.println(sA+"troops vs "+sB+" troops");
                System.out.println(cA+" - "+(++cB));
            }        
        }
        if(cA>cB)
            System.out.println(nA+" wins the war.");
        else
            System.out.println(nB+" wins the war.");
    }
    static int dice()
    {
        Random r = new Random();
        int a=r.nextInt(20)+1;
        return a;
    }
}
