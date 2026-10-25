class Solution {

    
    public void rotate(int[] nums, int k) {
        int [] nums2 =new int[nums.length ];
        int index=0;
         k = k % nums.length; 
        for(int i = nums.length -k ; i < nums.length ; i++){
            nums2[index ] = nums[i];
            index++;
        }
        for(int i=0;i<nums.length-k;i++){
            nums2[index++]=nums[i];
        }
        //  System.arraycopy(nums2, 0, nums, 0, k);
        for(int i=0;i<nums.length ;i++){
            nums[i]=nums2[i];
        }
    }
}