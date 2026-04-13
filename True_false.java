//if string has only number print true and if string has characters and number both print false
public class True_false {
    public static void main(String[] args) {
        String str1="123456";
        String str2="a3x1c5";
        int length=str1.length();
        int len=str2.length();
        boolean isDigit1=true;
        boolean isDigit2=true;
        int i,j;
        for(i=0;i<length;i++){
            char ch=str1.charAt(i);
            if(!Character.isDigit(ch)){
                isDigit1=false;
                break;
            }
        }
        for(i=0;i<len;i++){
            char ch=str2.charAt(i);
            if(!Character.isDigit(ch)){
                isDigit2=false;
                break;
            }
        }
        System.out.println(isDigit1);
        System.out.println(isDigit2);
    }
}
