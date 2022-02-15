package com.codedifferentlt.labs.lab18b.part1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CodingChallengeTest {

    @Test
    public void containsVowelsTest01(){
        CodingChallenge challenge = new CodingChallenge();
        String input = "abcdefg";
        Boolean expected = true;
        Boolean actual = challenge.containsVowels(input);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void containsVowelsTest02(){
        CodingChallenge challenge = new CodingChallenge();
        String input = "wxz";
        Boolean expected = false;
        Boolean actual = challenge.containsVowels(input);
        Assertions.assertEquals(expected,actual);
    }
}
