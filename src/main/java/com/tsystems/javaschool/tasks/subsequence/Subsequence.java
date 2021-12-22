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

    public boolean find(List x, List y) {
        if (x == null || y == null) {
            throw new IllegalArgumentException();
        } else if (x.size() > y.size()) {
            return false;
        } else if (x.size() == 0) {
            return true;
        } else {
            int n = 0;
            for (int i = 0; i < y.size(); i++) {
                if (x.get(n) == y.get(i)) {
                    n++;
                    if (n == x.size()) {
                        return true;
                    }
                }
            }

        }
        return false;
    }
}
