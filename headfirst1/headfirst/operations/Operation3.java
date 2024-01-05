package headfirst1.headfirst.operations;

import java.util.concurrent.atomic.AtomicInteger;

public class Operation3 implements MathOperation {
    public Operation3() {
        super();
    }

    @Override
    public void performOperation(AtomicInteger x, AtomicInteger y) {
        // TODO Implement this method
        y.addAndGet(2);
        if (y.get() > 4) {
            y.decrementAndGet();
        }
    } // performOperation
}
