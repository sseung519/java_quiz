package ch13.Quiz01;

public class Container<S> {
    private S test;

    public S get() {
        return test;
    }

    public void set(S test) {
        this.test = test;
    }
}
