package com.itrjp.cloud.api;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : renjp
 * @date : 2021-07-31 23:48
 **/
public class TestAbsClass {
    public static void main(String[] args) {
        List<A> list = new ArrayList<>();
        list.add(new Aba());
        list.add(new Aaa());
        for (A a : list) {
            if (a.isM(1)) {
                System.out.println(a);
            }
        }
    }

}

interface A {
    boolean isM(int type);
}

abstract class Aa implements A {
    @Override
    public boolean isM(int type) {
        return type == 1;
    }
}

abstract class Ab implements A {
    @Override
    public boolean isM(int type) {
        return type == 2;
    }
}

class Aaa extends Aa {
    void say() {
        System.out.println("Aaa say");
    }
}

class Aba extends Ab {
    void say() {
        System.out.println("Aba say");
    }
}
