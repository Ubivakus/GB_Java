class Solution {
  public String mergeAlternately(String word1, String word2) {
    int firstLength = word1.length();
    int secondLength = word2.length();
    int i = 0;
    int j = 0;
    StringBuilder word3 = new StringBuilder();
    while (i < firstLength || j < secondLength) {
      if (i < firstLength) {
        word3.append(word1.charAt(i++));
      }
      if (j < secondLength) {
        word3.append(word2.charAt(j++));
      }
    }
    return word3.toString();
  }
}