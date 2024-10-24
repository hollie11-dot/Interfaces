public class Road extends Environment<Drivable> {
    @Override
    public void checkTraffic() {
        for (Drivable traffic : this.traffic) {
            traffic.drive();
        }
    }

    @Override
    public void checkVehicles() {
        for (Drivable vehicle : this.vehicles) {
            vehicle.drive();
        }
    }
}