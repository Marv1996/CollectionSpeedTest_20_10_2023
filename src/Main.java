import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            int element = random.nextInt();
            arrayList.add(element);
            linkedList.add(element);
        }

        System.out.println("-----ArrayList-----");
        System.out.println(removeSpeed(arrayList));
        System.out.println("-----LinkedList-----");
        System.out.println(removeSpeed(linkedList));

    }

    public static double removeSpeed(Collection collection) {
        long start = System.currentTimeMillis();
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                iterator.remove();
            }
        }
        long end = System.currentTimeMillis();
        return (end - start) / 1000.0;
    }
}