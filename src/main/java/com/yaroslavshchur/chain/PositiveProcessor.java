package main.java.com.yaroslavshchur.chain;

public class PositiveProcessor extends Processor {

    public PositiveProcessor(Processor processor) {
        super(processor);
    }

    public void process(int request) {
        if (request > 0) {
            System.out.println("It is positive number: " + request);
        } else {
            super.process(request);
        }
    }
}
