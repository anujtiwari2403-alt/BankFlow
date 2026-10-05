public class binarySearch {
//     public static int binarySearch(int numbers[], int target){
//          int low=0;
//     int high=numbers.length-1;
//     while (low<=high) {
//         int mid=low+(high-low)/2;
//         if (numbers[mid]==target) {
//           return mid;
//         }else if (numbers[mid]<target) {
//             low=mid+1;
//         }else{
//             high=mid-1;
//         }

//     }
//     return -1;
//     }
// public static void main(String[] args) {
//     int[] numbers={12,34,56,78,90,96,98};
//     int target=78;
//     System.out.println("Element is found at index :"+binarySearch(numbers, target));
   
// }
    
// }

// Binary search question....
// shorting number in an rotated array...


public static int Search(int nums[],int target){
     int low=0;
     int high=nums.length-1;
     while (low<=high) {
         int mid=low+(high-low)/2;
         if (nums[mid]==target) {
            return mid;
         }
         if (nums[low]<=nums[mid]) {
            if (nums[low]<=target&& target<=nums[mid]) {
                high=mid-1;
            }else{
                low=mid+1;
            }
         }
         else{
            if (nums[mid]<=target && target<=nums[high]) {
                low=mid+1;
            }else{
                high=mid-1;
            }
         }
     }
     return -1;
}
public static void main(String[] args) {
    int nums[]={4,5,6,7,0,1,2};
    int target=6;
    System.out.println("Element found at index: "+Search(nums, target));
}



}