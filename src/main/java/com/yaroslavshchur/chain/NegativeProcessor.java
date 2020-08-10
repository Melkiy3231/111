package main.java.com.yaroslavshchur.chain;

public class NegativeProcessor extends Processor {

    public NegativeProcessor(Processor processor) {
        super(processor);
    }

    public void process(int request) {
        if (request < 0) {
            System.out.println("It is negative number: " + request);
        } else {
            super.process(request);
        }
    }
}
