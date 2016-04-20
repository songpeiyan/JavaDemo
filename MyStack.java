package com.example;

import java.util.Arrays;

/**
 * Created by songpeiyan on 16/4/20.
 */
public class MyStack<E> {
    public static void main(String[] args) {
        MyStack<String> stringStack = new MyStack<>();
        stringStack.init(4);
        stringStack.push("ele1");
        stringStack.push("ele2");
        stringStack.push("ele3");
        stringStack.push("ele4");
        stringStack.push("ele5");
        stringStack.push("ele6");
        System.out.println("pop:" + stringStack.pop());
        System.out.println("pop:" + stringStack.pop());
        System.out.println("pop:" + stringStack.pop());
        System.out.println("pop:" + stringStack.pop());
        System.out.println("pop:" + stringStack.pop());
        System.out.println("pop:" + stringStack.pop());
        System.out.println("pop:" + stringStack.pop());
    }

    public static final int DEFAULT_CAPACITY = 16;
    private Object[] elementData;
    private int count;

    public void init(int initCapacity) {
        elementData = new Object[initCapacity];
    }

    public void push(E element) {
        ensureCapacity();
        count++;
        elementData[count - 1] = element;
    }

    public E pop() {
        if (count - 1 >= 0) {
            E element = (E)elementData[count - 1];
            elementData[count - 1] = 0;
            count--;
            return element;
        } else {
            return null;
        }
    }

    private void ensureCapacity() {
        if (elementData == null) {
            elementData = new Object[DEFAULT_CAPACITY];
            return;
        }
        if (count + 1 > elementData.length) {
            elementData = Arrays.copyOf(elementData, elementData.length << 1);
            System.out.println("increase capacity: " + elementData.length);
        }
    }
}

