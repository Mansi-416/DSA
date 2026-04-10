public class duplicate_Remove {
    public static void main(String[] args) {
        String str2="aabbbcddeffa";
        String count=" ";
        int length=str2.length();
        for(int i=0;i<length;i++){
            if(i==0||str2.charAt(i)!=str2.charAt(i-1)){     //if these conditions are true add the element to the count variable
                count+=str2.charAt(i);
            }
        }
        System.out.println(count);
        
    }
}
w