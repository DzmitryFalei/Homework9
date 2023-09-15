import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        Deque<String> stack = new ArrayDeque<>();
        stack.push("Peter");
        stack.push("Sasha");
        stack.push("Elena");

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack);

        stack.push("Katrin");
        stack.push("Vova");

        System.out.println(stack);

        System.out.println(stack.pop());

        System.out.println(stack);


        System.out.println("Task 2");

        String str = "aartttwqddduuss";
        System.out.println(str);
        Map<Character, Integer> letters = new HashMap<>();
        char[] lettersArray = str.toCharArray();

        for (char c : lettersArray) {
            if (letters.containsKey(c)) {
                letters.put(c, letters.get(c) + 1);
            } else {
                letters.putIfAbsent(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> item : letters.entrySet()) {
            System.out.printf("'%s' -  %d \n", item.getKey(), item.getValue());
        }
    }
}