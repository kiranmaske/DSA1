import java.util.*;

public class strings {
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder("kiran ");
        System.out.println(sb);

        //char at index
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'M');
        System.out.println(sb);
        
        //set insert char at index 0

    sb.insert(0,'k');
    System.out.println(sb);

    sb.delete(1,2);
    System.out.println(sb);
    sb.append("manohar maske");
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);

    for(int i=0; i<sb.length()/2;i++)
    {
    int front = i;
    int back=sb.length()-1-i;

    char frontChar=sb.charAt(front);
    char backChar=sb.charAt(back);

    sb.setCharAt(front,backChar);
    sb.setCharAt(back,frontChar);

    }
    System.out.println(sb);
}
 
}
