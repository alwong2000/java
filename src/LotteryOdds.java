import java.util.*;

/**
 * This program demonstrates a <code>for</code> loop.
 * @version 1.21 2020-07-11
 * @author Cay Horstmann and added code by Alan Wong
 */
public class LotteryOdds
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("How many numbers do you need to draw? (e.g. 6 or 7)");
      int k = in.nextInt();

      System.out.print("What is the highest number you can draw? (e.g. 49) ");
      int n = in.nextInt();

      /*
       * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
       */

      int lotteryOdds = 1;
      for (int i = 1; i <= k; i++){
         lotteryOdds = lotteryOdds * (n - i + 1) / i;

      System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
      }
   }
}
