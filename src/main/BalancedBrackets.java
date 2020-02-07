package main;


import java.util.Collections;

public class BalancedBrackets {

    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
        int brackets = 0;

        for (char ch : str.toCharArray()) {

            if (ch == '[') {
                brackets++;
            } else if(ch == ']'){
                brackets--;
            }

            if(Collections.singletonList(str).indexOf("[") > Collections.singletonList(str).indexOf("]")){
                System.out.println("Your brackets are mixed up!");
            }
        }

        if(brackets != 0){
            System.out.println("Pair up your brackets!");
            throw new IllegalArgumentException();
        } else if (str.contains("{") && str.contains("}")){
            System.out.println("Square brackets only!");
        } else if(!str.contains("[") && !str.contains("]")){

            if(str == ""){
                System.out.println("Congrats! You have balanced brackets!");
            } else{
                System.out.println("Don't forget your brackets!");
            }

        } else {
            System.out.println("Congrats! You have balanced brackets!");
        }

        return true;
    }

}
