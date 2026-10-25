class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int j=nums.length -1;

        int x=0;
        int y=0;
        while(i<=j){
            
            if(i==0 && target < nums[i]){
                return 0;
            }
            if(j==nums.length-1 && target > nums[j]){
                return ++j;
            }
            
            if(nums[i]==target){
                return i;
            }
            if(nums[j]==target){
                return j;
            }
            if(nums.length ==2){
                return 1;
            }
           
            if(nums[i]>target){
                
                return i;
            }

            if(nums[j]<target){
                
                return ++j;
            }
            
            i++;
            j--;
        }

        
        
        return i;
    }
    
}