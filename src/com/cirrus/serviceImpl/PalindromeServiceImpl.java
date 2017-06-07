package com.cirrus.serviceImpl;

import com.cirrus.service.PalindromeService;

/**
 * Created by Rabin on 6/7/2017.
 */
public class PalindromeServiceImpl implements PalindromeService {

    @Override
    public int getReverse(int num) {
        int reverse = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        return reverse;
    }

    @Override
    public boolean checkPalindrome(int num) {
        int reverseNum = getReverse(num);
        if (num == reverseNum) {
            return true;
        } else
            return false;
    }

    @Override
    public int findPalindrome(int higher, int lower) {
        for (int num = higher; lower >= lower; num--) {
            if (checkPalindrome(num)) {
                return num;
            }
        }
        return -1;
    }
}
