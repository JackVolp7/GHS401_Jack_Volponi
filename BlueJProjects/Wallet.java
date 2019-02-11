
/**
 * phat wallet
 * 
 * @author (Jack "tha cracka" Volponi
 * @version Nadav Build
 */
public class Wallet
{
   private Money[] moneyArray;
   public Wallet(Money[] m)
   {
       this.moneyArray=m;
   }
   public double getAverageAmount()
   {
       double total=0;
       for(int i=0;i<moneyArray.length;i++)
       {
           total+=moneyArray[i].getAmount();
       }
       return (int)total/(moneyArray.length);
   }
}
