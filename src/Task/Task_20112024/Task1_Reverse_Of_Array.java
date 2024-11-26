package Task.Task_20112024;

public class Task1_Reverse_Of_Array {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,4,5};
        System.out.println("The original array is : ");
        for(int i =0;i<array1.length;i++){
            System.out.print(array1[i]+ " ");
        }
        System.out.println();
        System.out.println("The reversed array is ");
        for(int i=array1.length-1;i>=0;i--){
            System.out.print(array1[i]+ " ");
        }
    }
}
