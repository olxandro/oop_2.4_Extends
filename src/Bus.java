public class Bus extends Transport{

    public Bus(String brand, String model, int productionYear, String country, String color, Integer maxSped) {
        super(brand, model, productionYear, country, color, maxSped);
    }

    @Override
    public void refill() {
        System.out.println("заправляем бензином, дизелем на заправке");
    }
}