//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    boolean valid (char ch){
        return ch>='0' && ch<='9';
    }
     int atoi(String s) {
    // Your code here
       int ans = 0;
       boolean checkNegative = s.charAt(0)=='-';
       int multiply = 0;
       if(checkNegative){
           multiply = (int)Math.pow(10,s.length()-2);
       } else {
           multiply = (int)Math.pow(10,s.length()-1);
       }
       for(int i =0 ; i<s.length();i++){
           if(checkNegative && i==0){
               continue;
           }
           if(!valid(s.charAt(i))){
               return -1;
           }
           int temp = (s.charAt(i)-'0' )* multiply;
           ans = ans + temp;
           multiply /= 10;
       }
       
       if(checkNegative){
           return ans * (-1);
       }
       return ans;
        
    }
}

