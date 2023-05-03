public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new LinkedStack<>();
        pushAndPop(stack1);

        System.out.println("--------");

        Stack<Integer> stack2 = new ArrayStack<>(100);
        pushAndPop(stack2);
    }

    private static void pushAndPop(Stack<Integer> stack) {  // use the metamorphism
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
