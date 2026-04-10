public class count {
    public static void main(String[] args) {
        String str7="abc";
        int count2=0;
        int i,j;
        int length=str7.length();
        System.out.println(str7.length());
        for(i=0;i<length;i++){
            for(j=i+1;j<=length;j++){
                String sub=str7.substring(i,j);
                System.out.println(sub);
                if(sub.charAt(0)==sub.charAt(sub.length()-1)){
                    count2++;
                }
            }
        }
        System.out.println("Count="+count2);
    }
}
