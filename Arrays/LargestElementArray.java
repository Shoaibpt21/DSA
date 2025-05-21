import java.util.Scanner;

class Lea{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count: ");
        int r = sc.nextInt();
        System.out.println("Enter column count: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        int largest = arr[0][0];
        for(int i = 0; i < r;i++){
            for(int j = 0; j < c; j++){
                System.out.println("Enter value of " + i + j);
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < r;i++){
            for(int j = 0; j < c; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for(int i = 0; i < r;i++){
            for(int j = 0; j < c; j++){
                if(arr[i][j] > largest){
                    largest = arr[i][j];
                }
            }
        }
        System.out.println("Largest value of array is: "+largest);
    }
}