import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");

        StackSet stackSet = new StackSet();

        stackSet.push(5);
        stackSet.push(43);
        stackSet.push(55);
        stackSet.push(22);
        stackSet.push(45);
        stackSet.push(16);

        System.out.println(stackSet.pop());

        System.out.println(stackSet.max());
        System.out.println(stackSet.max());
        System.out.println(stackSet.max());

        stackSet.push(87);
        stackSet.push(3);

        System.out.println(stackSet.pop());

        System.out.println(stackSet.max());

        System.out.println("Task 2");

        CharsCount charsCount = new CharsCount();

        for (Map.Entry<Character, Integer> item :
                charsCount.getCharsCount("aartttwqddduuss").entrySet()) {
            System.out.printf("'%s' -  %d \n", item.getKey(), item.getValue());
        }
    }
}