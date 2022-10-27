import java.time.LocalDate;
import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;
    private int productionYear;
    private String country;
    private String color;
    private Integer maxSped;

    public Transport(String brand, String model, int productionYear, String country, String color, Integer maxSped) {
        this.brand = brand;
        this.model = model;
        if (productionYear > LocalDate.now().getYear()) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = LocalDate.now().getYear();
            this.country = Objects.requireNonNullElse(country, "Russia");
            setColor(color);
            setMaxSped(maxSped);
        }
    }

    public String getStamp() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && color.isEmpty()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
    }

    public int getMaxSped() {
        return maxSped;
    }

    public void setMaxSped(Integer maxSped) {
        if (maxSped != null && maxSped != 0){
            this.maxSped = maxSped;
        } else {
            this.maxSped = 350;
        }
    }

    public abstract void refill();

    @Override
    public String toString() {
        return "Брэнд = " + brand + ", Модель = " + model + ", год выпуска = " + productionYear +
                ", страна производства = " + country + ", цвет кузова = " + color + ", maxSped = " + maxSped;
    }
}