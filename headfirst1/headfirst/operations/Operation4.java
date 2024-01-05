package headfirst1.headfirst.operations;

import java.util.concurrent.atomic.AtomicInteger;

public class Operation4 implements MathOperation {
    public Operation4() {
        super();
    }

    @Override
    public void performOperation(AtomicInteger x, AtomicInteger y) {
        // TODO Implement this method
        int revisedX = x.incrementAndGet();
        y.addAndGet(revisedX);
    } // performOperation
    
}
