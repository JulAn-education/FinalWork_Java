package shop;

public class Main {
    public static void main(String[] args) {

        Store store = new Store("toysFile.txt", "prizeFile.txt");

        store.addToy(1, "Медведь", 10);
        store.addToy(2, "Машина", 12);
        store.addToy(3, "Кукла", 25);
        store.addToy(4, "Краски", 30);
        store.addToy(5, "Коструктор", 20);
        store.addToy(6, "Кубики", 18);
        store.addToy(7, "Книга", 15);

        store.changeFrequency(1, 20);
        store.changeFrequency(2, 15);
        store.changeFrequency(3, 15);
        store.changeFrequency(4, 10);
        store.changeFrequency(5, 15);
        store.changeFrequency(6, 15);
        store.changeFrequency(7, 10);

        for (int i = 0; i <10; i++) {
            Toy toy = store.play();

            System.out.println("Your prize: " + toy.getName());

            store.getPrizeToy();
        }

    }
}