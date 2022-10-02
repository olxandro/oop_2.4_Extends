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
    }
}