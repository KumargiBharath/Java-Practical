public class Task1 {
    public static void main(String[] args) {
        String original="Java";
        StringBuilder reverse =new StringBuilder();
        for(int i=original.length()-1;i>=0;i--){
              reverse=reverse.append(original.charAt(i));
        }
        System.out.println(reverse);
    }
}
