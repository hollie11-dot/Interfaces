import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* // Test 1
        List<Object> objects = List.of(
                new Aeroplane(),
                new Car(),
                new Pigeon(),
                new Duck(),
                new Fish()
        );

        for (Object object : objects) {

            if (object instanceof Swimmable swimmable) {
                swimmable.swim();
            }

            if (object instanceof Flyable flyable) {
                flyable.fly();
            }

            if (object instanceof Vehicle vehicle) {
                vehicle.move();
            }

        }
        */

        Sky sky = new Sky();
        sky.addTraffic(new Duck());
        sky.addTraffic(new Pigeon());
        sky.addTraffic(new Aeroplane());

        Water water = new Water();
        water.addTraffic(new Duck());
        water.addTraffic(new Fish());

        Road road = new Road();
        road.addTraffic(new Car());
        road.addTraffic(new Van());
        road.addTraffic(new Lorry());

        List<Environment<?>> environments = List.of(sky, water, road);

        for (Environment<?> environment : environments) {
//            environment.checkTraffic();
            environment.checkVehicles();;
        }

    }
}