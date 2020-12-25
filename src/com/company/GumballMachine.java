package com.company;

public class GumballMachine {
    // 位置记录
    String location;
    int count;

    // 位置被传入构造器内，然后存到此实例变量中。
    public GumballMachine(String location,int count) {
        this.location = location;
        this.count = count;
    }

    // 让我们也加入上一个setter方法，以便再需要位置可以取得。
    public String getLocation() {
        return location;
    }

    public int getCount() {
        return count;
    }
}
