package com.example;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by songpeiyan on 16/4/21.
 */
public class ArrayCovariant {
    public static void main(String[] args) {
        Object[] objectArray = new Object[10];
        String[] stringArray = new String[10];
        //Array is covariant. String[] is subclass of Object[]
        objectArray = stringArray;

        List<Object> objectList = new LinkedList<>();
        List<String> stringList = new LinkedList<>();
        //Error: Incompatible type. List isn't covariant. List<String> and List<Object> are different type.
        //objectList = stringList;
    }
}
