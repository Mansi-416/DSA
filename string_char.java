public class string_char {
    public static void main(String[] args) {
        String str="abc";
        char ch='a';
        int i,j;
        int length=str.length();
        //char[] a=str.toCharArray();
        for(i=0;i<length;i++){
            if(str.charAt(i)==ch){
                str=str.replace(ch,' ');  //remove with space
                str=str.replace(" "," ");   //remove space
            }
        }
        System.out.println(str);
    }
}

