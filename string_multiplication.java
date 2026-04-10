public class string_multiplication {
    public static void main(String[] args) {
        String s="12";
        String s1="4";
        int num=0,num1=0;
        int i,j;
        for(i=0;i<s.length();i++){
            num=num*10+(s.charAt(i)-'0');
        }
        System.out.println(num);
        for(j=0;j<s1.length();j++){
            num1=num1*10+(s1.charAt(j)-'0');
        }
        System.out.println(num1);
        System.out.println("answer="+(num*num1));
    }
}
