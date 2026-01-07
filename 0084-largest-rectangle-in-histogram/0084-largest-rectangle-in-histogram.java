import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                int height = heights[stack.pop()];

                int right = i;
                int left = stack.isEmpty() ? -1 : stack.peek();

                int width = right - left - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        // process remaining bars
        while (!stack.isEmpty()) {
            int height = heights[stack.pop()];

            int right = n;
            int left = stack.isEmpty() ? -1 : stack.peek();

            int width = right - left - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }
}
