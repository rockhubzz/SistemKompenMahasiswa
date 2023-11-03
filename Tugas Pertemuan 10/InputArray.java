import java.util.Arrays;
import java.util.Scanner;
public class InputArray{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] array= new int[5][5];

        array[0]= new int[] {2,6,8,9,0};
        array[1]= new int[] {26,23,46,68,0};
        array[2]= new int[] {623,409,0,0,0};
        
        while(true){
            System.out.println();
        for(int i= 0; i<array.length; i++){
            System.out.print("Baris ke-"+(i+1)+": ");
            System.out.print(Arrays.toString(array[i]));
            System.out.println();
        }
        System.out.print("Masukkan baris: ");
        int brsIn= sc.nextInt();
        if(brsIn==0) System.exit(0);
        else{
        System.out.print("Masukkan kolom: ");
        int klmIn= sc.nextInt();
        System.out.print("Masukkan nilai: ");
        int elmIn= sc.nextInt();

        array[brsIn-1][klmIn-1]=elmIn;
            }
        }
    }
}