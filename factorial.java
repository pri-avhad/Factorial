import java.util.*;
class factorial
{
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no.");
        int N = sc.nextInt();
        int f = 1;
        while (N>0)
        {
            f*=N;
            N--;
        }
        System.out.println("The factorial = "+f);
    }
}