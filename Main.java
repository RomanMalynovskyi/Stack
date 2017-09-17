package com.gmail.malynovskyiroman.javaOOP.Stack1;

public class Main {

    public static void main(String[] args) {
        BlackList blackList = new BlackList();

        // blackList.addClassToBlackList(Integer.class);
        // blackList.addClassToBlackList(String.class);
        blackList.addClassToBlackList(Double.class);

        Stack stack = new Stack(5, blackList);

        stack.addElement(77);
        stack.addElement("Somestring");
        stack.addElement(45);
        stack.addElement("Text");
        stack.addElement(5.0);

        stack.printStack();
        System.out.println(stack.removeElement());
        stack.printStack();
    }
}
