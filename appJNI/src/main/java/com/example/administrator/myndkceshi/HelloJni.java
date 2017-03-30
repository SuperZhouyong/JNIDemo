package com.example.administrator.myndkceshi;

/**
 * @data 2017/3/28 0028
 * @aurher Administrator
 */

public class HelloJni {
     static {
        //加载.so类库，加载的名称去掉lib
        System.loadLibrary("helloword");
    }
    public native int HelloWord(int a);
}

/*
*  /* static {
        //加载.so类库，加载的名称去掉lib
        System.loadLibrary("hello");
    }*/
