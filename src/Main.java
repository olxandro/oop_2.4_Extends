import Animals.*;

public class Main {
    public static void main(String[] args) {

        Car ladaSedan = new Car("lada","grande",2015,"Russia","black",-111);
        System.out.println(ladaSedan);
        Train lastochka = new Train("lastochka","b-901",2011,"rus",null,301,
                3500,0,"belorus","minks",11);
        System.out.println(lastochka);
        Train leningrad = new Train("lenin","d-125",2019,"rus",null,270,1700,
                null,"lenin vokz","lenin passg",8);
        System.out.println(leningrad);
        Bus one =new Bus("first","patybus",2021,"gb",null,120);
        System.out.println(one);
        Bus two = new Bus("second","eatbus",2021,null,null,100);
        System.out.println(two);
        Bus three = new Bus("third","ikarus",1986,"rus","red",95);
        System.out.println(three);

        one.refill();

        Amphibians legs = new Amphibians("ляха", 2, null);
        Amphibians yj = new Amphibians("уж", null, "болото");


        Herbivores gazel = new Herbivores("gazel", null, null, -1, null);
        Herbivores jiraff = new Herbivores("jiraf", 22, "africa", 22, "grass");
        Herbivores horse = new Herbivores("horse", 11, "russia", 33, "apple");
        System.out.println(gazel.getEat());
        System.out.println(gazel.getLivingEnvironment());
        System.out.println(gazel.getSpeed());
        gazel.graze();
        gazel.eat();
        gazel.sleep();
        System.out.println(gazel);

        Predators giena = new Predators("giena", 11, "africa", 13, "jiraf");
        Predators tiger = new Predators("tiger", 16, "india", 13, "gazel");
        Predators bear = new Predators("bear", 8, "forest", 13, "berries");

        Flightless pavlin = new Flightless("pavlin", 5,"india","пеший");
        Flightless pingvin = new Flightless("pingvin",7,"arktica","пеший");
        Flightless birdDodo = new Flightless("dodo",4,"america","пеший");
        birdDodo.sleep();
        birdDodo.going();
        Fly chaika = new Fly("Чайка", 22, "sea", "fly");
        Fly albatros = new Fly("альбатрос", 11, "sea", "fly");
        Fly sokol = new Fly("сокол", 2, "лес", "fly");
        albatros.flying();
        System.out.println(albatros);
    }
}