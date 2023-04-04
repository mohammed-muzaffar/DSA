public class BackTrackingArr{
    
    public void changeArr(int[] arr, int i, int val){
        if(i == arr.length){
            printArr(arr);
            return;
        }

        arr[i] =  val;
        change(arr, i+1, val+1);
        arr[i] = arr[i] - 2;
    }

    public void printArr(int[] arr){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);

        }
    }

    public static void main(String args[]){
        int[] arr = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
    
}

//Time Complexity O(n)
//Space Complexity o(n) stack Overflow