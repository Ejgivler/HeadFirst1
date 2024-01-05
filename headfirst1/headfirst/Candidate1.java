package headfirst1.headfirst;

import headfirst1.headfirst.operations.MathOperation;

import java.util.concurrent.atomic.AtomicInteger;

public class Candidate1 implements MathOperation {
    public Candidate1() {
        super();
    }

    @Override
    public void performOperation(AtomicInteger x, AtomicInteger y) {
        // TODO Implement this method
        /*
         * // y = x - y; // 1 matches 4
            // System.out.print(x + "" + y + " ");
            
            // y = y + x; // 2 matches 6
            
            // three
            //y = y + 2;
            //if ( y > 4 ) {
            //    y = y - 1;
            //}
            // 3 matches 7
            
            // four
            //x = x + 1;
            //y = y + x;
         */
         int result = y.addAndGet( -1 * x.get() );
    } // performOperation
}
