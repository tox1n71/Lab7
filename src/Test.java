import ru.itmo.lab5.worker.Worker;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {


    public static void main(String[] args){
        IntSum intSum = new IntSum();
        StringSum stringSum = new StringSumAdapter(intSum);
        System.out.println(stringSum.sum("Hello", "World"));
        System.out.println(intSum.sumInt(1, 10));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.stream().reduce((s1, s2) -> s1 > s2 ? s1 : s2).ifPresent(System.out::println);
        System.out.println(list.stream().reduce(0, (a, b) -> a + b));

    }
}
