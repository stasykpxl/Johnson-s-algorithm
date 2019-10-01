package by.spartakzatawit;

import by.spartakzatawit.box.Box;
import by.spartakzatawit.detail.Detail;

public class Main {

    public static void main(String[] args){

        Box box = new Box();
        box.addDetail(new Detail(1,1, 5));
        box.addDetail(new Detail(2,6,4));
        box.addDetail(new Detail(3,2,3));
        box.addDetail(new Detail(4,6, 3));
        box.addDetail(new Detail(5,9,1));
        box.addDetail(new Detail(6,4, 5));
        box.addDetail(new Detail(7,2, 2));
        box.addDetail(new Detail(8,7,7));

        System.out.println("Тест- 1");
        box.sort();
        System.out.println("Time: " + box.getTime());
        System.out.println(box.toString());

        Box box2 = new Box();
        box2.addDetail(new Detail(1,12, 2));
        box2.addDetail(new Detail(2,7,9));
        box2.addDetail(new Detail(3,3,4));
        box2.addDetail(new Detail(4,5, 5));
        box2.addDetail(new Detail(5,1,3));
        box2.addDetail(new Detail(6,7, 5));
        box2.addDetail(new Detail(7,2, 8));

        System.out.println("Тест - 2");
        box2.sort();
        System.out.println("Time: " + box2.getTime());
        System.out.println(box2.toString());

        Box box3 = new Box();
        box3.addDetail(new Detail(1,6, 2));
        box3.addDetail(new Detail(2,3,4));
        box3.addDetail(new Detail(3,2,2));
        box3.addDetail(new Detail(4,3, 2));

        System.out.println("Тест - 3");
        box3.sort();
        System.out.println("Time: " + box3.getTime());
        System.out.println(box3.toString());
    }
}
