package Java.zoo.food;

public  class Food {
    private String name;
    private int satiety;

    public Food(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }
    public void setSatiety(int satiety){
        this.satiety = satiety;
    }
}
