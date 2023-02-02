package Searching;

public class BinarySearch {

    //Needs Sorted Array
    public int BinarySeacrchFn(int[] arrayInput, int searchNum){
        int left = 0;
        int right = arrayInput.length-1;

        while(left <= right){
            int mid = left+(right - left)/2;
            if(arrayInput[mid] == searchNum){
                return mid;
            }
            if(arrayInput[mid] < searchNum){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    }
}
