package Array;

public class Number_game_LCM {
    public static void main(String[] args) {
        Long  num = Long.valueOf(3);
        System.out.println(numGame(num));
    }
    public static long Hcf(long a,long b)
    {
        if(b==0)
        {
            return a;
        }
        return (Hcf(b,(a%b)));
    }

    static Long numGame(Long n) {
        // code here
        int modi=1000000007;
        long wHcf=1;
        //To fing LCM of n numbers...
        for(long i=1;i<=n;i++)
        {
            wHcf=((wHcf*i)/Hcf(wHcf,i))%modi;
        }
        return wHcf;
    }
}
