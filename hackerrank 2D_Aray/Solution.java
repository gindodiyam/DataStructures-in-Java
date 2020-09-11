/*
Problem_name :	2D Array - DS
Problem_link :	https://www.hackerrank.com/challenges/2d-array/problem
*/




import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    static int hourglassSum(int[][] arr) {
        int hourglass_sum=0,max=Integer.MIN_VALUE;

        for(int h=0;h<4;h++){
            for(int i=0;i<4;i++){ 
                for(int j=h;j<(h+3);j++){
                    for(int k=i;k<(i+3);k++){
                        if(j==h+1){
                            hourglass_sum+=arr[j][(i+1)];
                            break;
                        }
                        else{
                            hourglass_sum+=arr[j][k];
                        }
                    }
                }
                
                if(hourglass_sum>max){
                max=hourglass_sum;               
                }   
                hourglass_sum=0;
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
