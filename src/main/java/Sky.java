public class Sky extends Environment<Flyable> {
    @Override
    public void checkTraffic() {
        for (Flyable traffic : this.traffic) {
            traffic.fly();
        }
    }

    @Override
    public void checkVehicles() {
        for (Flyable vehicle : this.vehicles) {
            vehicle.fly();
        }

    }
}
