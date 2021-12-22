package com.tsystems.javaschool.tasks.pyramid;

import java.util.Collections;
import java.util.List;

public class PyramidBuilder {

    /**
     * Builds a pyramid with sorted values (with minumum value at the top line and maximum at the bottom,
     * from left to right). All vacant positions in the array are zeros.
     *
     * @param inputNumbers to be used in the pyramid
     * @return 2d array with pyramid inside
     * @throws {@link CannotBuildPyramidException} if the pyramid cannot be build with given input
     */
    public int[][] buildPyramid(List<Integer> inputNumbers) {
        int size = inputNumbers.size();
        int arrayHeight = 0;
        int n = 0;
        int n1 = 0;
        double d = 1 - 8 * size;
        int [][] pyramid = new int[0][0];
        Collections.sort(inputNumbers);
        if (d > 0){
            n = (int)(-1 - Math.sqrt(d));
            n1 = (int)(-1 + Math.sqrt(d));
        } else try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < n1; j++) {
                if(i < j){
                    pyramid[i][j] = 0;
                } else {
                    pyramid[i][j] = inputNumbers.get(i);
                }
            }
        }

        return pyramid;
    }


}
