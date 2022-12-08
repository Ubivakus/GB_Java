class Solution3 {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int insertIndex = m + n - 1;
    int index1 = m - 1;
    int index2 = n - 1;

    while (index2 >= 0) {
      if (index1 < 0) {
        nums1[insertIndex--] = nums2[index2--];
      } else {
        if (nums2[index2] >= nums1[index1]) {
          nums1[insertIndex--] = nums2[index2--];
        } else {
          nums1[insertIndex--] = nums1[index1--];
        }
      }
    }
  }
}