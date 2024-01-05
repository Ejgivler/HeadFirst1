package headfirst1.headfirst.operations;

import java.util.concurrent.atomic.AtomicInteger;

public class YEqualsXMinusY implements MathOperation {
    
    @Override
    public void performOperation(AtomicInteger x, AtomicInteger y) {
        int result = x.get() - y.get();
        y.set(result);
    }
    
}
