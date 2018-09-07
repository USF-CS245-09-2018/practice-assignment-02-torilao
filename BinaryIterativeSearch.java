public class BinaryIterativeSearch implements Practice2Search {
    public String searchName(){
        return null;
    }

    @Override
    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high)/2;

            if(target < arr[mid]){
                high = mid - 1;
            } else{
                low = mid + 1;
            }
            if(target == arr[mid]){
                return mid;
            }
        }
        return -1;
    }
}
