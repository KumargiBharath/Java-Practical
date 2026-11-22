public class Task2 {
    public static void main(String[] args) {
        int array[]=new int[]{1,2,3,4,5};
        int large=Integer.MIN_VALUE;
        for(int i:array){
            if(i>large){
                large=i;
            }
        }
        System.out.println(large);
    }
}
