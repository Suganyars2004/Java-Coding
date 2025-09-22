package Arrays.Strings;

public class palindrome {
    public static void main(String[] args) {
        String a="dad";
        boolean b=pali(a);
        if(b==true){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
    static boolean pali(String a){
        int left=0;
        int right=a.length()-1;
        for(int i=0;i<a.length()/2;i++){
            if(a.charAt(left)==a.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}