/*
Theory:-
All blocks having same data type. if all having same data type, WHy to create multiple variables?
Simply we create an array to store all values.

                                ARRAY

Collection of similar type of data, in a continuous allocation.

Array can be written in 1 Dimention and 2 Dimention
Syntax for 1D array: datatype[] arrayname = new datatype[];
Systax for 2D array: datatype[][] arrayname = new datatype[][];
 */

import java.util.*;
public class
Array{
    public static void main(String[] args){
        //Declaring the 1D array
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        //Declaring 2D array
        int[][] a2 = new int[3][3];
        //Printing the array elements
        for(int i = 0;i <arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i <arr.length;i++){
            System.out.print(arr[i]);
        }
        //Printing the 2D array
        for(int i = 0; i < a2.length;i++){
            for(int j = 0; j <a2[i].length;j++){
                a2[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i < a2.length; i++){
            for(int j = 0; j < a2[i].length;j++){
                System.out.print(a2[i][j]);
            }
            System.out.println();
        }
    }
}