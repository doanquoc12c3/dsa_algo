package array_string.removeElement;

public class Solution {


            public int removeElement(int[] nums, int val) {
                int count = 0;
                for(int i = 0; i< nums.length; i++){
                    if(nums[i]!=val ){
                        nums[count]=nums[i];
                        count++;
                    }

                }
                System.out.println("new array: ");
                for (int a:
                     nums) {
                    System.out.println(a);
                }
                return count;
            }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {1,2,34,2,43,53,4,3,2,2,2};
        s.removeElement(array,2);
    }
}





