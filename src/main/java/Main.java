public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new LinkedStack<>();

        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
