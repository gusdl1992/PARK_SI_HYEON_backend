package day23.step2;

public class Map <K , V>{
    private K key;
    private V valu;

    // 키와 값으로 묶여야해서 제 생각에는 기본생성자 X
    // 풀생성자 필요 할것 같음...
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
