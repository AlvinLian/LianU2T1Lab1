public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("John",5, 10.5);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Sam",8,4.75);
        cat2.introduce();
        cat2.printCatInfo();


    }
}
