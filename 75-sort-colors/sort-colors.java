class Solution {
    public void sortColors(int[] nums) {
        int low=0;//Red
        int mid=0;//search
        int high=nums.length-1; //Blue

        while(mid<=high){
            if(nums[mid]==0){
                //found red,Swap 
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;

                low++;
                mid++;
            }
            else if(nums[mid]==1){
                //found White,Stand by 
                mid++;

            }
            else{
                //found blue
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;

                high--;
            }
        }   
    }
}