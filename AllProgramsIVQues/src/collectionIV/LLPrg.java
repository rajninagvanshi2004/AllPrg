package collectionIV;

import java.util.ArrayList;
import java.util.Objects;

public class LLPrg {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Rajni");
        list.add("Shruti");
        list.add("Madhu");
        list.add(1,"PK");
        System.out.println(list);
        String str[]=new String[list.size()];

        Object ob[]=list.toArray();
        for(int j=0;j<ob.length;j++){
            str[j]=(String) ob[j];
        }
        for(int i=0;i<str.length;i++)
            System.out.print(str[i]+",");


    }
}
