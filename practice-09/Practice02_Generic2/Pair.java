package Practice02_Generic2;

public class Pair <K, V> {
    // TODO : private 멤버변수 key와 value를 선언
    private K key;
    private V value;

    public Pair(K key, V value) {
        // TODO : key와 value를 멤버 변수에 할당
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }
}
