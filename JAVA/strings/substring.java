package strings;

public class substring {

    public static void substring(String str ,int si,int ei){
        String substr="";
        for(int i=si;i<=ei-1;i++){
            substr+=str.charAt(i);
        }
        System.out.println(substr);

    }
    public static void main(String args[]){
        String str ="HelloWorld!";
        int si=0;
        int ei=5;
        substring(str, si, ei);

    }
    
}
