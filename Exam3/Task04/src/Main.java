import java.util.HashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Object> leftPocket = new LinkedList<>();
        Jingle phone = new SmartPhone("Redmi 5+");
        leftPocket.add(phone);
        phone.sound();
        leftPocket.get(0);
        System.out.println(leftPocket);

        LinkedList<Object> rightPocket = new LinkedList<>();
        Purchase money = new Money("Com", 5000);
        rightPocket.add(money);
        money.buy();
        rightPocket.get(0);
        System.out.println(rightPocket);


    }
}
