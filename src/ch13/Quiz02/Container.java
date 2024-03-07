package ch13.Quiz02;

public class Container<K, V> {
    private K Key;
    private V Value;

    public K getKey() {
        return Key;
    }

    public void set(K key, V value) {
        Key = key;
        Value = Value;
    }

    public V getValue() {
        return Value;
    }
}
