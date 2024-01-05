package headfirst1.headfirst.operations;

import java.util.concurrent.atomic.AtomicInteger;

public class YEqualsYPlusX implements MathOperation {
    public YEqualsYPlusX() {
        super();
    }

    @Override
    public void performOperation(AtomicInteger x, AtomicInteger y) {
        // y = y + x
        int result = y.get() + x.get();
        y.set( result );
    } // performOperation
    
}
