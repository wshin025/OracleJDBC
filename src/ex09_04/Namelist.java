package ex09_04;

import java.util.ArrayList;

public class Namelist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Kim");
        names.add("Park");
        names.add("Lee");
        names.add("Jung");


    //요소변경
        names.set(1,"Cha");


    // 요소 삭제
        String removedName =  names.remove(2);
    // String removed = names.remove(1);
        System.out.println("삭제된 요소 " + removedName);

    // 요소 반환
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%s | ", names.get(i));
        }
    }
}
