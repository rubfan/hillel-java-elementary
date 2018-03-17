package ua.od.hillel;

public class Spiral {

    protected int arrSize;
    protected int maxValue;
    public int arr[][];

    public Spiral(int size){
        arrSize=size;
        maxValue=arrSize*arrSize-1;
        arr = generateMatrix(new int[arrSize][arrSize], 0, 0);
    }

    public void print() {
        //lets print numbers
        for(int i = 0; i<arrSize; i++){
            for(int j = 0; j<arrSize; j++){
                System.out.print(" \t"+arr[i][j]);
            }
            System.out.println(" ");
        }
    }

    private int[][] generateMatrix(int[][] target, int level, int currentVal) {
        // always start from lower left corner in each layer
        int w = level;
        int h = target.length - level - 1;

        // fill the bottom line
        int i = 0;
        for (i = w; i < target[0].length - level && currentVal <= maxValue; i++) {
            target[h][i] = currentVal++;
        }

        w = target[0].length - level - 1;

        int j = 0;
        // fill the right line
        for (j = h - 1; j >= level && currentVal <= maxValue; j--) {
            target[j][w] = currentVal++;
        }

        h = level;

        // fill the above line
        for (i = w - 1; i >= level && currentVal <= maxValue; i--) {
            target[h][i] = currentVal++;
        }
        w = level;

        // fill the left line
        for (j = h + 1; j < target.length - level - 1 && currentVal <= maxValue; j++) {
            target[j][w] = currentVal++;
        }

        if (currentVal > maxValue)
            return target;
        return generateMatrix(target, ++level, currentVal);

    }
}

