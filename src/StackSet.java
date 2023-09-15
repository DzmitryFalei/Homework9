import java.util.ArrayDeque;
import java.util.Deque;
import java.util.SortedSet;
import java.util.TreeSet;

public class StackSet {

    private final long startTime = System.currentTimeMillis();

    Deque<Integer> stack = new ArrayDeque<>();
    SortedSet<Integer> maxValueSet = new TreeSet<>();

    public void push(Integer integer) {
        stack.push(integer);
        maxValueSet.add(integer);
    }
    public Integer max() {
        int maxItem = maxValueSet.last();
        stack.remove(maxItem);
        maxValueSet.remove(maxItem);
        return maxItem;
    }
    public Integer pop() {
        int popItem = stack.pop();
        maxValueSet.remove(popItem);
        return popItem;
    }

    public Deque<Integer> getStack() {
        return stack;
    }

    public void setStack(Deque<Integer> stack) {
        this.stack = stack;

    }

}
