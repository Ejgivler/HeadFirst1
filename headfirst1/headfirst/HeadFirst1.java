package headfirst1.headfirst;

import headfirst1.headfirst.operations.MathOperation;

import java.util.concurrent.atomic.AtomicInteger;


public class HeadFirst1 {
    private static final String[] answers = 
        { "22 46"
        , "11 34 59"
        , "02 14 26 38"
        , "02 14 36 48"
        , "00 11 21 32 42"
        , "11 21 32 42 53"
        , "00 11 23 36 410"
        , "02 14 25 36 47" };
    
    public HeadFirst1() {
        super();
    }
    
    public static void main(String[] args) {
        HeadFirst1 hf = new HeadFirst1();
        hf.quiz2();
   } // main

    public void quiz2() {
       int x = 0;
       int y = 0;
       while ( x < 5 ) {
           // START: replaceable code from sample from online quiz
           y = x - y; 
           // END
           System.out.print(x + "" + y + " ");
           x = x + 1;
       }
   } // quiz2

   public String quiz1( MathOperation mathOperation ) {
       System.out.println("Using mathoperation: " + mathOperation.getClass().getName() );
       // https://stackoverflow.com/questions/3815173/increment-a-integers-int-value
       // AtomicInteger is mutable, Integer is not (can't change inside called method and reflect outside with Integer)
       AtomicInteger x = new AtomicInteger(0);
       AtomicInteger y = new AtomicInteger(0);
       StringBuilder answerString = new StringBuilder();
       while ( x.get() < 5 ) {
           mathOperation.performOperation(x, y);
           answerString.append(x + "" + y + " ");
           int result = x.incrementAndGet();
       }
       String finalAnswer = answerString.toString();
       showMatchingAnswer( finalAnswer );        
       return finalAnswer;
   } // quiz1
   
    
    private static void showMatchingAnswer(String finalAnswer) {
        int match = 0;
        for (String answer : answers ) {
            if (finalAnswer.trim().equalsIgnoreCase(answer)) {
                break;
            }
            match++;
        }
        System.out.println("Calculated answer: " + finalAnswer );
        System.out.println("Found match at answers list at position (0-based): " + match);
        System.out.println("Answer List: " + answers[match]);
    } // showMatchingAnswer


}
