public class Task2 {
    public static void main(String[] args) {
        String original="madam";
        StringBuilder reverse=new StringBuilder();
        for(int i=original.length()-1;i>=0;i--){
            reverse.append(original.charAt(i));
        }
        String finalStr=reverse.toString();
        if(finalStr.equals(original)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
