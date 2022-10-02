public class Car extends Transport{
    public Car(String brand, String model, int productionYear, String country, String color, int maxSped) {
        super(brand, model, productionYear, country, color, maxSped);
    }

    @Override
    public void refill() {
        System.out.println("заправляем бензином, дизелем на заправке или заряжать на специальных электроду-парковках, если это электрокар");
    }

}