public class Water extends Environment<Swimmable> {
    @Override
    public void checkTraffic() {
        for (Swimmable traffic : this.traffic) {
            traffic.swim();
        }}
}
