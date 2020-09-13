 /*
Problem_name :	The 3n+1 Problem 
Problem_link :	https://www.hackerrank.com/contests/doyoulikeit/challenges/the-3n-1-problem/problem
*/




import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int No=s.nextInt();
        System.out.println(conjecture(No));       
    
    }
    public static int conjecture(int No){
        int count=0;
        while(No!=1){
            if((No%2)==0){
                No=No/2;
                count++;
            }
            else{
                No=(No*3)+1;
                count++;
            }
        }
        return ++count;
    }
}