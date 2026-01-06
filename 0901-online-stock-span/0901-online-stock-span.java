import java.util.Stack;

class StockSpanner {

    Stack<int[]> s; // {price, span}

    public StockSpanner() {
        s = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        // SAME logic as:
        // while(currprice >= stock[s.peek()])
        while (!s.isEmpty() && price >= s.peek()[0]) {
            span += s.pop()[1]; // <-- index difference replaced by span add
        }

        s.push(new int[]{price, span});
        return span;
    }
}
