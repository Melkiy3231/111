package main.java.com.yaroslavshchur.chain;

public class Chain {
    private Processor chain;

    public Chain() {
        buildChain();
    }

    private void buildChain() {
        chain = new NegativeProcessor(new PositiveProcessor(new ZeroProcessor(null)));
    }

    public void process(int request) {
        chain.process(request);
    }
}
