package DSA.ArrayPS;

public class maxproduct {
    public static int maxProduct(int[] nums) {
            int pre=1;
            int suf=1;
            int n = nums.length;
            int ans=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(pre==0) pre=1;
                if(suf==0) suf=1;
                suf=suf*nums[i];
                pre=pre*nums[n-i-1];
                ans=Math.max(ans,Math.max(suf,pre));
            }
            return ans;
        }
        public static void main(String[] args) {
            int[] nums = {2,3,-2,4};
            System.out.println(maxProduct(nums));
    }
}

