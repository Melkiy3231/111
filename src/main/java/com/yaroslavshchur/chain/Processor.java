package main.java.com.yaroslavshchur.chain;

public abstract class Processor {

    private Processor processor;

    public Processor(Processor processor) {
        this.processor = processor;
    }

    public void process(int request) {
        if (processor != null) {
            processor.process(request);
        }
    }
}
