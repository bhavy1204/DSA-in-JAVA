public class TrappingRainwater {

    public static void calculateWater(int height[]) {
        int leftMaxHeight[] = new int[height.length];
        leftMaxHeight[0] = height[0];
        for (int i = 1; i < leftMaxHeight.length; i++) {
            leftMaxHeight[i] = Math.max(leftMaxHeight[i - 1], height[i]);
        }

        int rightMaxHeight[] = new int[height.length];
        rightMaxHeight[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMaxHeight[i] = Math.max(rightMaxHeight[i + 1], height[i]);
        }

        int trappedWater =0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel= Math.min(leftMaxHeight[i], rightMaxHeight[i]);
            trappedWater += waterLevel - height[i];
        }

        System.out.println("Total trapped water : "+ trappedWater);

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        calculateWater(height);
    }
}
