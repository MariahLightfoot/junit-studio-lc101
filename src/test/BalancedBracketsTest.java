package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void testBracketsExistInPairs() {

        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void canHandleSingleBracket()throws Exception{

        assertTrue(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test(expected = IllegalArgumentException.class)
    public void canHandleMoreThanOneOddNumberOfBrackets()throws Exception{

        assertTrue(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void canHandleTextInsideBrackets(){

        assertTrue(BalancedBrackets.hasBalancedBrackets("[DOOGS@@@!&%$]"));
    }

    @Test
    public void canHandleTextOutsideOfBrackets(){

        assertTrue(BalancedBrackets.hasBalancedBrackets("[] are @#$%^&*!!"));
    }

    @Test
    public void canHandleTextInsideAndOutsideOfBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[DOOGS@@@!&%$] are @#$%^&*!!"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void canHandleOddNumbersOfBracketsSeparatedByText()throws Exception{

        assertTrue(BalancedBrackets.hasBalancedBrackets("[DOOGS@@@!&%$] are @#$%^&*!!["));
    }

    @Test
    public void canHandleSpacesBetweenBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[   ]    [    ]"));
    }

    @Test
    public void canHandleTextWithZeroBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("DOOGS@@@!&%$ are @#$%^&*!!"));
    }

    @Test
    public void canHandleEmptyString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testBracketsAreSquareBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("{DOOGS@@@!&%$} are @#$%^&*!!"));
    }

    @Test
    public void testBracketsAreInCorrectOrder(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }



}
