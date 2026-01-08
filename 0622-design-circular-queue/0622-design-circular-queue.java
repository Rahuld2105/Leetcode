class MyCircularQueue {
    int[] arr;
    int size;
    int front;
    int rear;

    public MyCircularQueue(int k) {
        arr = new int[k];
        size = k;      // ✅ fixed
        front = -1;    // ✅ fixed
        rear = -1;     // ✅ fixed
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }

        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
            return true;
        }

        front = (front + 1) % size;
        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return arr[front];
    }

    public int Rear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return front == (rear + 1) % size;
    }
}
