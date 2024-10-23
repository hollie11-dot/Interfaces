public class Road extends Environment<Vehicle> {
    @Override
    public void checkTraffic() {
        for (Vehicle traffic : this.traffic) {
            traffic.move();
        }
    }
}
