package reactBasic;

import io.reactivex.Observable;

public class ObservableCreate {

    public static void main(String[] args) {

        Observable<String> myString = Observable.create(emitter -> {
            try {
            emitter.onNext("A");
            emitter.onNext("B");
            emitter.onNext("C");
            emitter.onNext("D");
            emitter.onNext("E");
            emitter.onNext("F");
            throw new NullPointerException();
            //emitter.onNext("G");
            //emitter.onComplete();
            } catch (Throwable t) {
                emitter.onError(t);
            }
        }
        );

        myString.subscribe(System.out::println);
    }
}
