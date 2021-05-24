package com.company;
import java.util.Scanner;
class  ab{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("enter the length : "); int m =input.nextInt();
            System.out.println("enter the width : "); int n=input.nextInt();
            int[][] a = new int[m][n];
            int[][] b = new int[m][n];
            int sum[][] = new int[m][n];
            for(int i = 0 ; i<m ; i++)
                for(int j = 0; j<n ; j++){
                    System.out.println("in array a enter the ["+i+"]"+"["+j+"]"+ " member");  a[i][j]=input.nextInt();}

            for(int i = 0 ; i<m ; i++)
                for(int j = 0; j<n ; j++){
                    System.out.println("in array a enter the ["+i+"]"+"["+j+"]"+ " member"); b[i][j]=input.nextInt();}

            for(int i = 0 ; i<m ; i++)
                for(int j = 0; j<n ; j++)
                    sum[i][j]=a[i][j]+b[i][j];// defining sum array

            for(int i = 0 ; i<m ; i++) {
                for (int j = 0; j < n; j++){
                    System.out.print(a[i][j]+" ");}//printing a

                System.out.println();
            }

            System.out.println();// making a space between arrays


            for(int i = 0 ; i<m ; i++) {
                for (int j = 0; j < n; j++){
                    System.out.print(b[i][j]+" ");}//printing b

                System.out.println();
            }

            System.out.println();// making a space between arrays

            for(int i = 0 ; i<m ; i++) {
                for (int j = 0; j < n; j++){
                    System.out.print(sum[i][j]+" ");}//printing sum

                System.out.println();
            }


        }
}
