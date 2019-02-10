package reactBasic;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

import java.util.Arrays;
import java.util.List;

public class UsingOwnObserver {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ram", "Sham", "Jadu", "Madhu");
        Observable<String> fromList = Observable.fromIterable(list).publish();
        ObseverImpl<String> ob = new ObseverImpl<>();
        fromList.map( s -> s.length() ).subscribe(ob);
        try {
            Thread.sleep(100);
            fromList.subscribe(ob);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ((ConnectableObservable<String>) fromList).connect();
        fromList.subscribe(ob);
        fromList.subscribe(ob);
        ((ConnectableObservable<String>) fromList).connect();
    }
}
