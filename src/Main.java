import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        boolean result = false;
        List<Integer> arrayList_first = new ArrayList();

        arrayList_first.add(1);
        arrayList_first.add(3);
        arrayList_first.add(5);
        arrayList_first.add(7);
        arrayList_first.add(9);

        List<Integer> arrayList_second = new ArrayList();

        arrayList_second.add(2);
        arrayList_second.add(4);
        arrayList_second.add(6);
        arrayList_second.add(8);
        arrayList_second.add(0);


        for (int i = 0; i < 106; i++) {
            count++;
            if (arrayList_first.get(0) > arrayList_second.get(0) || ((arrayList_first.get(0) == 0) && (arrayList_second.get(0) == 9))) {
                arrayList_first.add(arrayList_first.get(0));
                arrayList_first.add(arrayList_second.get(0));
            } else if (arrayList_first.get(0) < arrayList_second.get(0) || ((arrayList_first.get(0) == 9) && (arrayList_second.get(0) == 0))) {
                arrayList_second.add(arrayList_second.get(0));
                arrayList_second.add(arrayList_second.get(0));
            }
            arrayList_first.remove(0);
            arrayList_second.remove(0);

            if (arrayList_first.size() == 0) {
                System.out.println("Second " + count);
                result = true;
                break;
            } else if (arrayList_second.size() == 0) {
                System.out.println("First " + count);
                result = true;
                break;
            } else if (result) {
                System.out.println("Ботва");
            }

        }

    }
}