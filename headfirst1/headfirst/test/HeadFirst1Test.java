package headfirst1.headfirst.test;

import headfirst1.headfirst.HeadFirst1;

import headfirst1.headfirst.operations.MathOperation;
import headfirst1.headfirst.operations.Operation3;
import headfirst1.headfirst.operations.Operation4;
import headfirst1.headfirst.operations.Operation5;
import headfirst1.headfirst.operations.YEqualsXMinusY;
import headfirst1.headfirst.operations.YEqualsYPlusX;

import org.junit.Assert;
import org.junit.Test;

public class HeadFirst1Test {

    private HeadFirst1 hf1 = new HeadFirst1();    
    
    public HeadFirst1Test() {
    }

    @Test
    public void testYEqualsXMinusY() {
        // internally, the quiz always has a trailing space, so add for compare later
        String expectedResults = "00 11 21 32 42 ";
        MathOperation yequalsXMinusY = new YEqualsXMinusY();
        String result = hf1.quiz1(yequalsXMinusY);
        Assert.assertTrue("Answer/Result does not match expectedResults [Answer=" + result + ", Expected=" + expectedResults + "]"
                         , result.equals(expectedResults) );
    } // testYEqualsXMinusY
    
    @Test
    public void testYEqualsYPlusX() {
        String expectedResults = "00 11 23 36 410 ";
        MathOperation yequalsyplusx = new YEqualsYPlusX();
        String result = hf1.quiz1(yequalsyplusx);
        Assert.assertTrue("Answer/Result does not match expectedResults [Answer=" + result + ", Expected=" + expectedResults + "]"
                         , result.equals(expectedResults) );
    } // testYEqualsYPlusX
    
    @Test
    public void testOperation3() {
        String expectedResults = "02 14 25 36 47 ";
        MathOperation mathoperation = new Operation3();
        String result = hf1.quiz1(mathoperation);
        Assert.assertTrue("Answer/Result does not match expectedResults [Answer=" + result + ", Expected=" + expectedResults + "]"
                         , result.equals(expectedResults) );
    } // testOperation3
    
    @Test 
    public void testOperation4() {
        String expectedResults = "11 34 59 ";
        MathOperation mathoperation = new Operation4();
        String result = hf1.quiz1(mathoperation);
        Assert.assertTrue("Answer/Result does not match expectedResults [Answer=" + result + ", Expected=" + expectedResults + "]"
                         , result.equals(expectedResults) );
    } // testOperation4
    
    @Test
    public void testOperation5() {
        String expectedResults = "02 14 36 48 " ;
        MathOperation mathoperation = new Operation5();
        String result = hf1.quiz1(mathoperation);
        Assert.assertTrue("Answer/Result does not match expectedResults [Answer=" + result + ", Expected=" + expectedResults + "]"
                         , result.equals(expectedResults) );
    } // testOperation5    
    
}
