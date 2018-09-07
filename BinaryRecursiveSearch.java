public class BinaryRecursiveSearch implements Practice2Search {
    public String searchName(){
        return null;
    }

    public int search(int[] arr, int target){
        return searchHelper(arr, 0, arr.length - 1, target);
    }

    public int searchHelper(int arr[], int low, int high, int target){
        if(low > high){
            return -1;
        }
        int mid = (low + high)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] < target){
            return searchHelper(arr, mid+1, high, target);
        } else{
            return searchHelper(arr, low, mid-1, target);
        }
    }

}

