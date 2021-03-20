import cylinder.BottleOfWater;
import cylinder.CocaCola;
import prism.Book;
import prism.Folder;
import sphere.AbstractSphere;
import sphere.Apple;
import sphere.TennisBall;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        ArrayList<Object> ruesag1 = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            ruesag1.add(new Apple(7, 100));
        }
        ruesag1.add(new Book(3, 500));
        ruesag1.add(new CocaCola(30, 1.5));


        ArrayList<Object> ruesag2 = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            ruesag2.add(new TennisBall(6, 150));
        }
        ruesag2.add(new Folder(5, 100));
        ruesag2.add(new BottleOfWater(35, 0.5));


        ArrayList<Object> ruesag3 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            for (int j =1; j <= 3; j++) {
                ruesag3.add(new TennisBall(6, 100));
            }
            ruesag3.add(new Apple(5.5, 120));
        }
        ruesag3.add(new Folder(5, 300));
        ruesag3.add(new CocaCola(25, 1));


    }
}
