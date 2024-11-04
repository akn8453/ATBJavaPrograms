package Task.Task_29102024;

public class Task29_DuplicateElements_WithFun {
    public static void main(String[] args) {
        int array [] = {12,14,56,78,89,19,100};
        boolean duplicate = DuplicateNumber(array);
        if(duplicate){
            System.out.println("The duplicate value present in the array ");
        }
        else {
            System.out.println("Duplicate value is not present");
        }
    }

    static boolean DuplicateNumber(int arr[]){
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}


