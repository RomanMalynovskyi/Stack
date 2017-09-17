package com.gmail.malynovskyiroman.javaOOP.Stack1;

import java.util.ArrayList;

public class BlackList {
    private ArrayList<Class<?>> list;

    public BlackList() {
        this.list = new ArrayList<>();
    }

    public void addClassToBlackList(Class<?> elem) {
        list.add(elem);
    }

    public boolean isBelongToBlackList(Object object) {
        for (Class<?> cl : list) {
            if (cl == object.getClass()) {
                return true;
            }
        }
        return false;
    }
}
