package Recursion;



public class StringPalindrome {
    public static void main(String[] args) {
        String s="A man, a plan, a canal:Panama";
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        boolean a=pali(0,s);
        System.out.println(a);

    }
    static boolean pali(int i,String s){
        if(i>=s.length()/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            return false;
        }
        return pali(i+1, s);
    }
}
