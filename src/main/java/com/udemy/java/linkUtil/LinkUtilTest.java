package com.udemy.java.linkUtil;

import com.udemy.java.util.LinkUtil;

public class LinkUtilTest {
    public static void main(String[] args) {

        //200 OK
        //404 smth is wrong in our end (bad request)
        // 0 means there is no such host
        //500 server problem

        System.out.println(

                LinkUtil.getResponseCode("https://www.khjasdfk.com/jhghjgjhg")

        );

    }
}
