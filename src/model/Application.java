package model;

public class Application {
    public static void main(String[] args) {
        Kotik firstCat = new Kotik("Hanry", 4, 6,"English");
        Kotik secondCat = new Kotik();
        secondCat.setAge(7);
        secondCat.setMeow("Russian");
        secondCat.setName("Barsik");
        secondCat.setWeight(9);
        firstCat.liveAnotherDay();
        String name = firstCat.getName();
        int age = firstCat.getAge();
        System.out.println("My name is " + name + ". My age is " + age);
        System.out.println(firstCat.getMeow().equalsIgnoreCase(secondCat.getMeow()));
        System.out.println("Cats count is " + Kotik.countCats);

    }
}
