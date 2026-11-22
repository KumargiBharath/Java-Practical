public class Task1 {
    public static void main(String[] args) {
        int array[]=new int[]{1,2,3,4,5};
        int small=Integer.MAX_VALUE;
        for(int i:array){
            if(i<small){
                small=i;
            }
        }
        System.out.println(small);
    }
}
