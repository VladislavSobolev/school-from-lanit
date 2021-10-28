package model;

public class Kotik {
    private int  satiety;
    private String name;
    private int age;
    private int weight;
    private String meow;
    static int countCats;

    public Kotik(){
        name = "Unknown";
        weight = 5;
        meow = "Unknown";
        countCats++;
    }
    public Kotik(String name, int age, int weight, String meow) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.meow = meow;
        countCats++;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public String getMeow(){
        return meow;
    }

    public void setMeow(String meow){
        this.meow = meow;
    }




    public void eat(int satiety){ this.satiety += satiety; }

    public  void  eat(int satiety, String eat){ this.satiety += satiety; }

    public void eat(){ eat(10, "Meat"); }



    public boolean play(){
        if(satiety <= 0){
            System.out.println("I'm hungry. My satiety is " + satiety + ". Feed me");
            eat();
            return false;

        } else {
            System.out.println("My satiety is " + satiety +  ". Please play with me <3");
            satiety -= 3;
            return true;
        }
    }

    public boolean sleep(){
        if(satiety <= 0){
            System.out.println("I'm hungry. My satiety is " + satiety + ". Feed me");
            eat();
            return false;
        } else {
            System.out.println("My satiety is " + satiety + ". I'm sleeping zzzzzzz...");
            satiety -= 1;
            return true;
        }
    }

    public boolean chaseMouse(){
        if (satiety <= 0){
            System.out.println("I'm hungry. My satiety is " + satiety + ". Feed me");
            eat(15);
            return false;
        } else {
            System.out.println("My satiety is " + satiety +
                    ". I see a mouse. " + "Now I will catch her!");
            satiety -= 5;
            return true;
        }
    }

    public boolean harassment(){
        if (satiety <= 0){
            System.out.println("I'm hungry. My satiety is " + satiety + ". Feed me");
            eat(25);
            return false;
        } else {
            System.out.println("Please touch me. Please please please please please ");
            satiety -= 2;
            return true;
        }
    }

    public boolean relieve(){
        if (satiety <= 0){
            System.out.println("I'm hungry. My satiety is " + satiety + "Feed me");
            eat(6);
            return false;
        } else {
            System.out.println("I pooped )))))");
            satiety -= 2;
            return true;
        }
    }


    public void liveAnotherDay(){

        for (int i = 0; i < 24; i++){
            int randomMethod = (int) (Math.random() * 5 + 1);
            switch (randomMethod){
                case (1) : {
                    play();
                    break;
                }
                case (2) : {
                    sleep();
                    break;
                }
                case (3) : {
                    chaseMouse();
                    break;
                }
                case (4) : {
                    harassment();
                    break;
                }
                case (5) : {
                    relieve();
                    break;
                }
            }
        }
    }


}
