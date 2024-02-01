package day23.step1;

public class SimpleHashMap <K , V>{
    // 1. 필드
    private Map<K , V>[] array; // 여러 타입 저장
    private int size;

    // 생성자
    public SimpleHashMap(){
        array = new Map[size];
    }

    // 1. 삽입 메소드
    public boolean add( K key , V value){
        int num = -1;
        try {
            // 1. 배열의 사이즈 증가
            this.size++;
            // 중복체크 시작
            for (int i = 0 ; i < array.length; i++){
                if (key.equals(array[i].getKey())){
                    System.out.println("중복값 찾았다!");
                    size--; // 중복되었으니 size++ 한값을 다시 감소
                    num = i; // 중복된 인덱스의 값을 num 에 대입
                }
            }
            // 2. 배열 길이의 마지막 인덱스의 매개변수 저장
                // 배열 메모리 재할당
                // 1. 현재 사이즈 만큼 배열 선언.
            Map<K , V>[] newArray = new Map[size];
            // 2. 배열 복사
            for(int i = 0 ; i < this.array.length; i++){
                newArray[i] = array[i];
            } // 1 for end
            // 3. 기존배열필드에 배열 대입
            array = newArray;
            // 4. 마지막인덱스의 매개변수 대입
            if (num >= 0){ // 중복값이 인덱스가 num 에 들어와 있으면 true
               array[num] = new Map<>(key, value);
               num = -1; // 중복값 저장 변수인 num 값 초기화
            }else {
                array[size-1] = new Map<>(key , value);
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }

    
    // 2. get(key) key 매개변수로 전달해서 value 출력
    public V get(K key){
        try {
            for (int i = 0 ; i < array.length; i++){
                if (key.equals(array[i].getKey())){
                    return (V)array[i].getvalu();
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    // 3. remove(index)
    public boolean remove(K key){
        // 배열의 사이즈 감소.
        this.size--;
        // 2. 감소된 사이즈 만큼 배열 재할당
        Map<K , V>[] newArray = new Map[size];
        // 3. 배열 복사.
            // i 기존 배열 인덱스
            // j 새로운 배열 인덱스
        int j = 0;
        for (int i = 0 ; i <this.array.length ; i++){
            newArray[j] = array[i];
            // 삭제 키 값을 빼고 카피
            // 만약에 삭제할 (키) 아니면.
            if(!key.equals(array[i].getKey())){
                j++;
            }
        }
        // 4. 기존배열에 새로운 배열 대입
        array = newArray;
        return true;
    }

    // 4. size()
    public int size(){
        return this.size;
    }
    // 5. toString
    @Override
    public String toString() {
        String str = "[";
        for (int i = 0 ; i < this.array.length; i++){
            // 각인덱스값 누적
            str += i + ": " + array[i].toString();
            // 마지막 인데스가 아니면 뒤에 , 추가
            str += i != this.array.length-1 ? ", " : "";
        }
        return  str+"]";
    }
}
