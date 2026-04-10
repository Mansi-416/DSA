public class frequent {
    public static void main(String[] args) {
        String s3="aabcaakeaosvccfcn";
        int max=0;
        char maxChar=' ';
        int i,j;
        int len=s3.length();
        for(i=0;i<len;i++){
            int count=0;
            for(j=0;j<len;j++){
            if(s3.charAt(i)==s3.charAt(j)){
                count++;
            }
        }
        if(count>max){
            max=count;
            maxChar=s3.charAt(i);
        }
    }
    System.out.println(maxChar);
    }
    
}
