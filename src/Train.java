import java.util.Objects;

public class Train extends Transport {

    private float costTrips;
    private Integer timeTrips;
    private String startStation;
    private String finalStation;
    private int quantityVan;


    public Train(String brand, String model, int productionYear, String country, String color, int maxSped) {
        super(brand, model, productionYear, country, color, maxSped);
    }

    public Train(String brand, String model, int dateCreat, String country, String color, int maxSped,
                 float costTrips, Integer timeTrips, String startStation, String finalStation, int quantityVan) {
        super(brand, model, dateCreat, country, color, maxSped);
        setCostTrips(costTrips);
        setTimeTrips(timeTrips);
        setStartStation(startStation);
        setStartStation(finalStation);
        setQuantityVan(quantityVan);
    }

    public float getCostTrips() {
        return costTrips;
    }

    public void setCostTrips(float costTrips) {
        if (costTrips > 10) {
            this.costTrips = costTrips;
        } else {
            this.costTrips = 100;
        }
    }

    public int getTimeTrips() {
        return timeTrips;
    }

    public void setTimeTrips(Integer timeTrips) {
        this.timeTrips = Objects.requireNonNullElse(timeTrips, 1);

    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        if (startStation != null && startStation.isBlank()) {
            this.startStation = startStation;
        } else {
            this.startStation = "Samara";
        }
    }

    public String getFinalStation() {
        return finalStation;
    }

    public void setFinalStation(String finalStation) {
        if (finalStation != null && finalStation.isBlank()) {
            this.finalStation = finalStation;
        } else {
            this.finalStation = "Vladivostok";
        }
    }

    public int getQuantityVan() {
        return quantityVan;
    }

    public void setQuantityVan(int quantityVan) {
        if (quantityVan > 0) {
            this.quantityVan = quantityVan;
        } else {
            this.quantityVan = 7;
        }
    }

    @Override
    public String toString() {
        return super.toString()+ " стоимость " + costTrips +
                ", врем в пути " + timeTrips +
                ", первая станция " + startStation + '\'' +
                ", последняя станция " + finalStation + '\'' +
                ", количество вагонов " + quantityVan;
    }
}