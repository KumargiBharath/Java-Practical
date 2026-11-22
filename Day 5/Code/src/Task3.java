public class Task3 {
    public static void main(String[] args) {
        int array[]=new int[]{1,2,3,4,5};
        int sum=0;
        for(int i:array){
            sum+=i;
        }
        System.out.println(sum/ array.length);
    }
}
