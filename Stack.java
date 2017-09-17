package com.gmail.malynovskyiroman.javaOOP.Stack1;

import java.util.Arrays;

public class Stack {
    private int size;
    private Object[] elements;
    private int top;
    private BlackList blackList;

    public Stack(int size, BlackList blackList) {
        this.size = size;
        this.elements = new Object[size];
        this.top = -1;
        this.blackList = blackList;
    }

    public void addElement(Object object) {
        if (blackList.isBelongToBlackList(object)) {
            System.out.println("Addition of class is prohibited. Class " + object.getClass().getSimpleName() + " in block list!");
            return;
        } else if (top == size - 1) {
            System.out.println("Stack is full!");
            return;
        } else {
            elements[++top] = object;
        }

    }

    public Object removeElement() {
        Object temp = elements[top];
        elements[top] = null;
        top--;
        return temp;
    }

    public Object getElement() {
        if (top == -1) {
            return "Stack is empty!";
        } else {
            return elements[top];
        }
    }

    public void printStack() {
        System.out.println("******* My Stack *******");
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == null) {
                System.out.print(" ");
            } else {
                System.out.print(elements[i] + " ");
            }
        }
        System.out.println();
    }
}
