package day23.step1;

public class Map <K , V>{
    private K key;
    private V valu;

    public Map(K key, V value1) {
        this.key = key;
        this.valu = value1;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getvalu() {
        return valu;
    }

    public void setvalu(V valu) {
        this.valu = valu;
    }

    @Override
    public String toString() {
        return
                "key=" + key +
                ", valu=" + valu;
    }
}
