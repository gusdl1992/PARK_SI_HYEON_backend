package 조별과제1;

public class test {
    public static void main(String[] args) {

        // 배열 for 문 으로 오름차순

        int[] arr = {10 , 5, 7 , 2 , 6 , 4};
        int temp = 0;
        for (int i = 0 ; i < arr.length ; i++){

            for (int j = i+1; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                } // if e
            }//2 for e
        }   // 1 for e

        for (int i = 0 ; i<arr.length; i++ ){
            System.out.println("arr = " + arr[i]);
        } // 출력

    }
}
