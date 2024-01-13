public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int [] array = {38, 24, 800, 8, 16};
       for (int i = 0; i < array.length; i++){
           if (array[i] >= 10 &&
                   array[i] < 100 &&
                   array[i] % 8 == 0)
           sum += array[i];
       }
        System.out.println(sum);
    }
}
