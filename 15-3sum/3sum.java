class Solution{
    public  List<List<Integer>> threeSum(int[] nums){
       //automatically throws away duplicate so we used hashset
        Set<List<Integer>> result= new HashSet<>();

        //Sort the Array
        Arrays.sort(nums);

        //Picks an achor
        for(int i=0;i<nums.length-2;i++){

            //Two helper
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int total=nums[i] + nums[left] + nums[right];

                if(total==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    left++;
                    right--;
                }
                else if(total<0){
                    left++;
                }
                else{
                    right--;
                }
            }
          }
            //converrt set into std list 
            return new ArrayList<>(result);
       
    }
}