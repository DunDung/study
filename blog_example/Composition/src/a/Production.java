package a;

public abstract class Production {
    protected Count count;

    protected Production() {
        this.count = new Count(0);
    }

    abstract protected void produce(int productionNumber);
}
