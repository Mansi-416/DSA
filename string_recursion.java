public class string_recursion {
    //count the number of vowels
    // static int countVowel(String str,int i){
    //     if(i==str.length()) return 0;
    //     char ch=str.charAt(i);
    //     int vowel=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?1:0;
    //     return vowel+countVowel(str,i+1);

    // }
    // public static void main(String[] args) {
    //     String str="hello";
    //     int i=0;
    //     System.out.println(countVowel(str, i));
    // }


    //convert lowercase string to uppercase  string
    static String conversion(String str,int i){
        if(i==str.length()) return "";
        char ch=str.charAt(i);
        if(ch>='a' && ch<='z'){
            ch=(char)(ch-32);
        }
        return ch+conversion(str,i+1);
    }
    public static void main(String[] args) {
        String str="hellooo";
        int i=0;
        System.out.println(conversion(str,0));
    }
}
