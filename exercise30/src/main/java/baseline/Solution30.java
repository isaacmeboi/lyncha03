package baseline;

public class Solution30 {
    public void math(){
        for(int i=1;i<=12;i++)
        {
            for(int j=1;j<=12;j++)
            {
                System.out.print((i*j)+"\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Solution30 ca = new Solution30();
        ca.math();
    }
}
