import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static boolean isPrime (int series){

    boolean flag = false; 
    for(int i=2;  i<-series/2; i++) {
       
        if(series % i 0){
            flag = true;
            break;
        }
    }

        if (!flag){
            return true;

        }else
            return false;
    }

        public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n < 1 || n > 1000)
            System.out.println("\"INVALID INPUT\"");
        else{

            ArrayList<Integer> arr = new ArrayList<>();

            ArrayList<Integer> newarr = new ArrayList<>();

        for(int i=2; i<1000; i++){

        if(isPrime(i)){
            arr.add(i);
            }

        }

        newarr.add(arr.get(n-2));
        newarr.add(arr.get(n-1)); 
        newarr.add(arr.get(n));

        for (int ele: newarr) { 
            System.out.print(ele+" ");
        }
      }
    }
}
	