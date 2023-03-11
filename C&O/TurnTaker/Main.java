package TurnTaker;

public class Main {
    public static void main(String[] args) {

        TurnTaker t1 = new TurnTaker("john Cena", 1),
                t2 = new TurnTaker("Randy ortan", 3);

        for (int i = 0; i < 5; i++) {
            System.out.println("Turn:" + TurnTaker.getTurn());
            if (t1.isMyTurn()) {
                System.out.println("love from " + t1.getName());

            }
            if (t2.isMyTurn()) {
                System.out.println("love from" + t2.getName());
            }

        }

    }

}
