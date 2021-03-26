package Fanxing;

import jdk.swing.interop.SwingInterOpUtils;

public class real_MyGenericInterface<E> implements MyGenericInterface<E>{
    @Override
    public void add(E e) {
        System.out.println(a);
    }

    @Override
    public void show(E e) {
        System.out.println(e);
    }
}
