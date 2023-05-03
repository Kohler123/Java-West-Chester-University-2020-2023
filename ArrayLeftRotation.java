import java.util.Scanner;

public class ArrayLeftRotation {

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number of rotations you want to move: ");
        int inputNum = scan.nextInt();
        int[] array = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

        for (int i=0; i<inputNum; ++i) {
            rotateArray(array);
        }
        if ((inputNum < 0) || (inputNum > 10))
				System.out.println ("Invalid number of rotations.  Please enter again.");

        for (int a : array) {
            
            
            System.out.println(a + " ");
            	
        }
    }

    public static void rotateArray(int[] arr){
        int firstElement = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=firstElement;
        

    }
}