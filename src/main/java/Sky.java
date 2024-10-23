public class Sky extends Environment<Flyable> {
    @Override
    public void checkTraffic() {
        for (Flyable traffic : this.traffic) {
            traffic.fly();
        }
    }
}
