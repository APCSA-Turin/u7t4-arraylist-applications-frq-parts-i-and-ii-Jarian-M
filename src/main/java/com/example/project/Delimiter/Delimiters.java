package com.example.project.Delimiter;
import java.util.ArrayList;

public class Delimiters {
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        /* to be implemented in part (a) */
        ArrayList<String> delim = new ArrayList<String>();
        for(int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals(openDel)) {
                delim.add(tokens[i]);
            }
            if(tokens[i].equals(closeDel)) {
                delim.add(tokens[i]);
            }
        }
        return delim;
    }
    

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(String[] delimiters) {
        /* to be implemented in part (b) */
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < delimiters.length; i++) {
            if(delimiters[i].equals(openDel)) {
                count1++;
            }
            if(delimiters[i].equals(closeDel)) {
                count2++;
            }
            if(count2 > count1) {
                return false;
            }
        }
        if(count1 != count2) {
            return false;
        } else {
            return true;
        }
    }

}