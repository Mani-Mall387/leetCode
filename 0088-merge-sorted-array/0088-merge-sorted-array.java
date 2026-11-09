class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1=0;
        int p2=0;

        int l=0;
        if(m>n) l=m;
        if(n>m) l=n;

        // int[] arr= new int[l]
        ArrayList<Integer> arr = new ArrayList<>();

        while(p1<m && p2<n){

            if(nums1[p1]>nums2[p2] ){
                arr.add(nums2[p2]);
                p2++;
            }
            else if(nums1[p1] < nums2[p2] ){
                arr.add(nums1[p1]);
                p1++;
            }
            else if(nums1[p1] == nums2[p2]){
                arr.add(nums1[p1]);
                arr.add(nums2[p2]);
                p1++; p2++;
            }

        }

        while(p1<m ){
            arr.add(nums1[p1]);
            p1++;
        }
        while(p2<n ){
            arr.add(nums2[p2]);
            p2++;
        }

        for(int i = 0; i < m+n; i++) {
            nums1[i] = arr.get(i);
        }
    }
}