package com.dsa.learning.arrays.gfg;


import java.util.Arrays;

public class CreateCustomArrayList<T> {

    int count = 0;
    int resizse = 5;
    Integer[] integer = new Integer[resizse];
    Integer[] integer1;

    public boolean add(Object o) {
        if (o instanceof Integer) {
            if (count == (75 * integer.length) / 100) {
                integer1 = integer;
                integer = new Integer[resizse * 2];
                integer=Arrays.copyOf(integer1,resizse * 2);
            }

            integer[count] = ((Integer) o).intValue();
            count++;
            return true;
        } else if (o instanceof String) {

        }
        return false;
    }

    public static void main(String[] args) {
        CreateCustomArrayList<Integer> arrayList = new CreateCustomArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(70);
        arrayList.add(80);
        arrayList.add(90);
        arrayList.add(100);
        System.out.println(Arrays.toString(arrayList.integer));
    }
}
