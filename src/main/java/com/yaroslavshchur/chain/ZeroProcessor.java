package main.java.com.yaroslavshchur.chain;

public class ZeroProcessor extends Processor {

    public ZeroProcessor(Processor processor) {
        super(processor);
    }

    public void process(int request) {
        if (request == 0) {
            System.out.println("It is zero: " + request);
        } else {
            super.process(request);
        }
    }
}
