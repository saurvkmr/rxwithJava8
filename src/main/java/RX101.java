import rx.Observable;
import java.util.List;
import java.util.Arrays;

public class RX101 {

    private static void observables() {
        List<String> list = Arrays.asList("One", "two", "three");
        Observable<String> observer = Observable.from(list);

        System.out.println("hi");
        observer.subscribe( e-> System.out.println(e));
        System.out.println("hello");

        list = Arrays.asList("saurav", "two", "three");
    }

    public static void main(String args[]) {
        observables();
    }
}
