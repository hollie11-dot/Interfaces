import java.util.ArrayList;
import java.util.List;

public abstract class Environment<T> {

    protected List<T> traffic = new ArrayList<>();
    protected List<T> vehicles = new ArrayList<>();

    public abstract void checkTraffic();

    public void addTraffic(T traffic) {
        if (traffic instanceof Vehicle) {
            this.vehicles.add(traffic);
        }

        this.traffic.add(traffic);
    }

    public abstract void checkVehicles();


}
