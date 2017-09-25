package com.gmail.malynovskyiroman.javaOOP.Stack1;

import java.util.ArrayList;

public class BlackList<T>{
    private ArrayList<T> list;

    public BlackList() {
        this.list = new ArrayList<>();
    }

    public void addClassToBlackList(T elem) {
        list.add(elem);
    }

    public boolean isBelongToBlackList(Object object) {
        for (T cl : list) {
            if (cl == object.getClass()) {
                return true;
            }
        }
        return false;
    }
}
