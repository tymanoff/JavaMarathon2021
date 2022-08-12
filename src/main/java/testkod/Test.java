package testkod;

public class Test{
    public static void main(String[] args){
        int[] nums = {0,1,0,3,-1,5,8,0,4,2};
        if(nums != null || nums.length!=0){
            moveZeroes(nums);
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }else {
            System.out.println("массив пустой");
        }
    }
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i<nums.length-1; i++){
            if (nums[i] == 0) {
            for (int j = i; j<nums.length-1; j++) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }
    }
}



