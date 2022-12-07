class Solution2 {
  public int removeElement(int[] nums, int val) {
    int count = 0;
    int i = 0;
    while (i < nums.length) {
      if (nums[i] != val) {
        nums[count++] = nums[i];
      }
      ++i;
    }
    return count;
  }
}