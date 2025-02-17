// NOT TO BE PUBLISHED ON GITHUB. DO NOT SHARE LAB SOLUTIONS.
package lab3;

/**
 * Returns true only if both words have the same length and differ in one
 * character.
 * (Does not need to handle variable length characters.)
 */
public class OneLetterDiff implements WordCriteria {
  @Override
  public boolean adjacent(String word1, String word2) {
    boolean sameLength = false;
    int differ = 0;

    char word1arr[] = word1.toCharArray();
    char word2arr[] = word2.toCharArray();

    if (word1.length() == word2.length()) {
      sameLength = true;

      for (int i = 0; i < word1arr.length; i++) {
        if (word1arr[i] != word2arr[i])
          differ++;
      }
    }

    return sameLength && differ == 1;
  }
}
