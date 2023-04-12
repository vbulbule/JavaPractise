package com.vodafone.interfacedemo;

public interface IDemo12 {
    int i = 10; // (public static and final as its final we have to initialize it in same line)
    void test1();
}

/*

if following code is valid??
interface IDemo {
int i;
}
is this valid?? if no why?
No its invalid
Why?? when we declare any variable in in Interface it should be public static and final so it should
initialize in the same lineor initializer block
but in Interface does not support initializer block so we should initialize it in same line

 */