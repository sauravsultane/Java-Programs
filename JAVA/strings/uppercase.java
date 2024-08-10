package strings;

public class uppercase {

    public static void upper(String str) {
        StringBuilder sb = new StringBuilder("");
        
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){

            if(sb.charAt(i)==' ' && i<str.length()-1){

                sb.append(sb.charAt(i));
                i++;

                sb.append(Character.toUpperCase(sb.charAt(i)));





            }else{
                sb.append(sb.charAt(i));
            }



        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str="hello my name is saurav";
        upper(str);
        
    }
    
}
