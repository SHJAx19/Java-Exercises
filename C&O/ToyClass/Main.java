package ToyClass;

public class Main {

    public static void main(String[] args) {
        ToyClass s1 = new ToyClass("Ahmad", 0);
        System.out.println(s1);
        System.out.println("--------------------------");
        System.out.println(" 'Changer' works here: ");
        ToyClass.changer(s1);
        System.out.println(s1);
    }
}
