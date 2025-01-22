package Algorithms.DataGenerator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BaseAlgo {
    
    public int[] revert(int[] data) {
        int[] reverted = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            reverted[i] = data[data.length - 1 - i];
        }
        return reverted;
    }

    public int max(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public int min(int[] data) {
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }
}
