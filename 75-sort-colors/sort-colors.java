class Solution {
    public static void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;

        //Dutch-Flag algorith bcoz of single-pass:space complexity 0(1) no auxilairy ds required & time complexity:0(N)-single pass with minimal swaps
        while(mid<=high)
        if(nums[mid]==0){
            //Red color belongs to front:0
            swap(nums,low,mid);
            low++;
            mid++;
        }
        else if(nums[mid]==1){
            //White color belongs to Middle:1
            mid++;
        }
        else{
            //Blue color belongs to : 2
            swap(nums,mid,high);
            high--;//high is unvisited & want to evalaute new element in next iteration
        }
    }

   //Helper method to swap element in-place
    public static void swap(int[] nums,int i,int j){
           int temp=nums[i];
           nums[i]=nums[j];
           nums[j]=temp;
    }

    public static void main(String[] args){
        int[] num1 = { 2, 0, 2, 1, 1, 0 };
        System.out.println("Original 1:" + Arrays.toString(num1));
        sortColors(num1);
        System.out.println("Sorted:" + Arrays.toString(num1));
        System.out.println();

        int[] num2 = { 2, 0, 1 };
        System.out.println("Original 2:" + Arrays.toString(num2));
        sortColors(num2);
        System.out.println("Sorted:" + Arrays.toString(num2));
    }


}