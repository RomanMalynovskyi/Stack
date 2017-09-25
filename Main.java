package com.gmail.malynovskyiroman.javaOOP.Stack1;

        /*      Создайте класс контейнер-стек(класс в который можно добавлять и
                удалять объекты других классов,только в вершину стека)в который
                можно сохранять объекты произвольного типа.Должен быть метод
                добавления элемента в стек,получение с удалением элемента из стека,и
                просто получение элемента из вершины из стека.Должна быть
                реализована работа с «черным списком» классов(смотри ниже).Если
                объект который добавляется в стек принадлежит классу из черного
                списка,то добавление такого объекта запрещено
                Для описанного выше стека создайте класс «Черный список» в котором
                будут описаны классы объектов которые нельзя добавлять в стек.
                Должна быть возможность добавления классов в черный список,проверка
                объекта — на то что класс к которому он принадлежит принадлежит или
                не принадлежит к классам в черном списке.*/

public class Main {

    public static void main(String[] args) {
        BlackList<Class> blackList = new BlackList();

        blackList.addClassToBlackList(Integer.class);
//        blackList.addClassToBlackList(String.class);
//        blackList.addClassToBlackList(Double.class);

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
