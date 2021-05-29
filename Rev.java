import java.lang.*;

class Rev {  

public static void main(String str){  

    String words[]=str.split("\\s");  

    String reverseWord="";  

    for(String w:words){  

        StringBuilder sb=new StringBuilder(w);  

        sb.reverse();  

        reverseWord+=sb.toString()+" ";  

    }  

    return reverseWord.trim();  

}  

}