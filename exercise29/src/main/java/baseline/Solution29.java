package baseline;
import java.util.Scanner;

public class Solution29 {
    int r;
    public int math(){
        r = 72/r;
        return r;
    }
    public int loop() {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (true) {
            try {
                System.out.print("What is the rate of return? ");
                r = Integer.parseInt(sc.next()); //read r
                System.out.println("It will take " + math() + " years to double your initial investment.");
                flag = true; //if exception not raised,set flag to true
            } catch (NumberFormatException e) //catch invalid number exception
            {
                System.out.println("Sorry. That's not a valid input");
            } catch (ArithmeticException e) //catch division by error exception
            {
                System.out.println("Sorry. That's not a valid input");
            }
            if (flag) //if exception not raised
            {
                break;
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        Solution29 ca = new Solution29();
        ca.loop();

        }

    public void setR(int r) {
        this.r = r;
    }
}

