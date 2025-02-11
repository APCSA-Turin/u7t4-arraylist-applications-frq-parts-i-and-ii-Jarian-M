package com.example.project.WordScramble;
import java.util.ArrayList;
public class WordScramble {
  /** Scrambles a given word.
   *
   *  @param word  the word to be scrambled
   *  @return  the scrambled word (possibly equal to word)
   *
   *  Precondition: word is either an empty string or contains only uppercase letters.
   *  Postcondition: the string returned was created from word as follows:
   *  - the word was scrambled, beginning at the first letter and continuing from left to right
   *  - two consecutive letters consisting of "A" followed by a letter that was not "A" were swapped
   *  - letters were swapped at most once
   */
  public static String scrambleWord(String word) {
      /* to be implemented in part (a) */
      String scram = "";
      String temp = "";
      if(word.equals("")) {
        return "";
      }
      ArrayList<String> scramble = new ArrayList<>();
      for(int i = 0; i < word.length(); i++) {
        scramble.add(word.substring(i, i + 1));
      }
      for(int l = 1; l < scramble.size(); l++) {
        if(scramble.get(l - 1).equals("A")) {
          if(!scramble.get(l).equals("A")) {
            temp = scramble.set(l - 1, scramble.get(l));
            scramble.set(l, temp);
            l++;
          }
        }
      }
      for(int j = 0; j < scramble.size(); j++) {
        scram += scramble.get(j);
      }
      return scram;
  }

  /** Modifies wordList by replacing each word with its scrambled
   *  version, removing any words that are unchanged as a result of scrambling.
   *
   *  @param wordList the list of words
   *
   *  Precondition: wordList contains only non-null objects
   *  Postcondition:
   *  - all words unchanged by scrambling have been removed from wordList
   *  - each of the remaining words has been replaced by its scrambled version
   *  - the relative ordering of the entries in wordList is the same as it was
   *    before the method was called
   */
  public static ArrayList<String> scrambleOrRemove(ArrayList<String> wordList) {
      /* to be implemented in part (b) */
      for(int i = 0; i < wordList.size(); i++) {
        if(wordList.get(i).equals(scrambleWord(wordList.get(i)))) {
          wordList.remove(wordList.get(i));
          i--;
        } else {
          wordList.set(i, scrambleWord(wordList.get(i)));
        }
      }
      return wordList;
  }

  public static void main(String[] args) {
    System.out.println(WordScramble.scrambleWord("APPLE"));
  }
}
