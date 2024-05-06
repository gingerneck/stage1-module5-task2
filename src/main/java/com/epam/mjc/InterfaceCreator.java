package com.epam.mjc;

import java.util.ArrayList;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {

        return source -> {
            var res = new ArrayList<Integer>();
            for (Integer intg : source) {
                res.add(intg / divider);
            }
            return res;
        };
    }
}
