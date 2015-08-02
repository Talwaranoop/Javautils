package com.infer.utils;

import org.junit.Test;

import java.util.*;

/**
 * Created by Anoop on 8/1/2015.
 */
public class combinationOnCountTest {
    @Test

    public void getWords(){
        String sentence = "Apple is awesome Apple is great";
        Map<String,Integer> finalResult;
        finalResult = CombinationOnCount.getAllCombination(sentence, 2);
        System.out.println(finalResult);

}}
