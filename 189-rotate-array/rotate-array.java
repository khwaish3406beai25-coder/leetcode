class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length);
        reverse(nums,0,k);
        reverse(nums,k,nums.length);
    }
        public void reverse(int[] nums,int s,int e){
            while(s<e-1){
                int temp=nums[s];
                nums[s]=nums[e-1];
                nums[e-1]=temp;
                s++;
                e--;
            }
        }
}