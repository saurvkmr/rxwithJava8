package reactBasic;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ObseverImpl<T> implements Observer {
    @Override
    public void onSubscribe(Disposable d) {
        //
    }

    @Override
    public void onNext(Object o) {
        System.out.println("Received o = " + o);
    }

    @Override
    public void onError(Throwable e) {
        System.err.println(e);
    }

    @Override
    public void onComplete() {
        System.out.println("Done");
    }
}
