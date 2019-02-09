package reactBasic;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class ObseverableTest {

    public static void main(String args[]) {
        //Observable<String> myObservable = Observable.just("alpha", "beta", "gamma", "theta");
        Observable<Long> myObservable = grtObserverable();
        //myObservable.subscribe(System.out::println);
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //myObservable.map(s -> s.length()).subscribe(System.out::println);
    }

    private static Observable<Long> grtObserverable() {
        System.out.println("Hi");
        return Observable.interval(1, TimeUnit.SECONDS);
    }
}
