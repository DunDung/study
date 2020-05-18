import a.Production;

public class Main {

    public static void main(String[] args) {
        Production production = new Production();
        production.produce(3);
        System.out.println(production.getCount());
    }
}
