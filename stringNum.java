public class stringNum{
    public static void main(String[] args){
        String str1="a2b1c5d8y6r9";
        int length=str1.length();
        int i;
        int max=0;
        //char[] a=str1.toCharArray();        
        //String max=str1(0);
        for(i=0;i<length;i++){
            char ch=str1.charAt(i);
            if(Character.isDigit(ch)){
                int num=ch-'0';
                if(num>max){
                    max=num;
                }
            }
        }
        System.out.println("MAximum element="+max);
    }
}