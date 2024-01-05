package headfirst1.headfirst.operations;

import java.util.concurrent.atomic.AtomicInteger;

public class Operation5 implements MathOperation {
    public Operation5() {
        super();
    }

    @Override
    public void performOperation(AtomicInteger x, AtomicInteger y) {
        if ( y.get() < 5 ) {
            x.incrementAndGet();
            if ( y.get() < 3 ) {
                x.decrementAndGet();
            }
        }
        y.addAndGet(2);
    } // performOperation

}
