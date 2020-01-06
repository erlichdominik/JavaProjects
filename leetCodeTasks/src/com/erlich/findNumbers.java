package com.erlich;

public class findNumbers {
    public static void main(String[] args) {
//        int[] arr = {12,345,2,6,7896};
//        System.out.println(findNumbers(arr));

    }

    public static int findNumbers(int[] nums) {
        int sum = 0;
        for (int number : nums) {
            if (Integer.toString(number).length() % 2 == 0) {
                sum++;
            }
        }
        return sum;
    }
}

class Solution {
    public static void main(String[] args) {
//        System.out.println(subtractProductAndSum(234));
//        System.out.println(defangIPaddr("255.100.50.0"));
//        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }

    public static int balancedStringSplit(String s) {
        int sum = 0;
        int sameLetter = 0;
        int sameLetter2 = 0;
//        for (char c : s.toCharArray()) {
//
//        }
        for (int i = 0, j = i; i < s.length(); i++, j++) {

        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static int getDecimalValue(ListNode head) {
        int sum = 0;

        while (head != null) {
            if (head.val == 1) {
                sum = (sum * 2 ) + 1;
            } else if (head.val == 0) {
                sum *= 2;
            }
            head = head.next;
        }
        return sum;
    }

    public static int numJewelsInStones(String J, String S) {
        int sum = 0;
        for (char jewelesStones : J.toCharArray()) {
            for (char ownedStones : S.toCharArray()) {
                if (jewelesStones == ownedStones) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public static int subtractProductAndSum(int n) {
        String string = Integer.toString(n);
        int sum = 0;
        int product = 1;

        for (char c : string.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(c));
            product *= Integer.parseInt(String.valueOf(c));
        }
        return product - sum;
    }

    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder(address);
        for (int i = 0, j = 0; i < address.length(); i++, j++) {
            if (address.charAt(i) == '.') {
                sb.insert(j, '[');
                sb.insert(j + 2, ']');
                j += 2;
            }
        }
        return sb.toString();
    }

}