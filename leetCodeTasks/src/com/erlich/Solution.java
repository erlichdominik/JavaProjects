package com.erlich;

class Solution {

    public static void main(String[] args) {
        System.out.println(defangIPaddr("221.122.1.1"));
    //    System.out.println(defangIPaddr("rakToSzpak"));

    }

    public static String defangIPaddr(String address) {
        String helper = "";
        String helper2 = "";
        for(int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.') {

                helper = helper + address.substring(i-1,i) + "[" + address.substring(i,i+1) + "]" ;
            }
        }
        helper+=address.charAt(address.length() - 1);
        //address = address.substring(0, 3);
        return helper;
    }
}