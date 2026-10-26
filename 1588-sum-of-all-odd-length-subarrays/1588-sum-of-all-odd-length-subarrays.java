class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i+=2){
            // int j=0;
            int x=0;
            int y=x+i;
            while(y<arr.length){
                for(int w=x;w<=y;w++){
                    sum+=arr[w];
                }
                x++;
                y++;
                // j++;
            }
            
        }   
        return sum;
    }
}