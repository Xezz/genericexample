package de.xezzco.generics;

import de.xezzco.generics.impl.BaseImpl;
import de.xezzco.generics.impl.BaseExtended;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {
    public static void main(String... args) {
        BaseImpl<Integer> baseImplInt = new BaseImpl<>();
        System.out.println(baseImplInt.returnValueAsIs(1)); // 1
        List<Integer> baseImplIntList = baseImplInt.getList(1);
        for(Integer i : baseImplIntList) {
            System.out.println("Iter base:" + i + " Type of " + i.getClass());
        }

        BaseExtended<Integer> baseUpperInt = new BaseExtended<>();
        System.out.println(baseUpperInt.returnValueAsIs(2));

        List<Integer> baseUpperIntList = baseUpperInt.getList(2);
        for (Integer i : baseUpperIntList) {
            System.out.println("Iter base:" + i + " Type of " + i.getClass());
        }
        List<? extends Number> list = new ArrayList<>();
        //list.add(Integer.valueOf(1)); // does not work
        ArrayList<Integer> aListOfIntegers = new ArrayList<>();// works
        list = aListOfIntegers; // works
        aListOfIntegers.add(1);
        aListOfIntegers.add(2);
        aListOfIntegers.add(3);

        System.out.println("iterating <? extends Number> list");
        for (Number number : list) {
            System.out.println(number + " class is: " + number.getClass());
        }

        System.out.println("iterating <? super Integer> list");
        List<? super Integer> anotherList = new ArrayList<>();
        anotherList.add(Integer.valueOf(1));
        anotherList.add(Integer.valueOf(2));

        for (Object o : anotherList) {
            System.out.println(o + " " + o.getClass());
        }
        List<Number> dat = new ArrayList<Number>(); // works
        anotherList.add(Integer.valueOf(1));

    }

    public static <S> void doStuffWithT(List<S> paramList) {
        for (S t : paramList) {
            System.out.println(t);
        }
    }
}
