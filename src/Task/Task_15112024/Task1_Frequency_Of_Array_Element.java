package Task.Task_15112024;

public class Task1_Frequency_Of_Array_Element {
    public static void main(String[] args) {

        int [] arr = new int []{2,4,6,2,6,6,3,6};
        int [] visitedArr = new int[arr.length];
        int visited = -1;

        for(int i = 0; i<arr.length;i++){
            int count=1;
            for(int j=1+i; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visitedArr[j]=visited;
                }
            }
            if(visitedArr[i]!=visited){
                visitedArr[i]=count;
            }
        }
        for(int i =0;i<visitedArr.length;i++){
            if(visitedArr[i]!=visited){
                System.out.println("Frequency of " +arr[i]+" : "+visitedArr[i]);
            }
        }
    }
}
