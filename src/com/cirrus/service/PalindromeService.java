package com.cirrus.service;

/**
 * Created by Rabin on 6/7/2017.
 */
public interface PalindromeService {
    int getReverse(int num);

    boolean checkPalindrome(int num);

    int findPalindrome(int higher, int lower);
}
