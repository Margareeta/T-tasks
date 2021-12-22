package com.tsystems.javaschool.tasks.subsequence;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {

    /**
     * Checks if it is possible to get a sequence which is equal to the first
     * one by removing some elements from the second one.
     *
     * @param x first sequence
     * @param y second sequence
     * @return <code>true</code> if possible, otherwise <code>false</code>
     */
    @SuppressWarnings("rawtypes")
    //can i change signtture?
    public boolean find(List x, List y) {
        List z = new ArrayList();
        // TODO: Implement the logic here
        if (x.size() > y.size()) {
            return false;
        } else {
            for (int i = 0; i < x.size(); i++) {
                for (int j = 0; j < y.size(); j++) {
                    if (x.get(i) == y.get(i) || x.get(i) == y.get(j)) {
                        z.add(y.get(j));
                    }
                }
            } if(z.equals(x)) return true;
        }
        return false;
    }
}
