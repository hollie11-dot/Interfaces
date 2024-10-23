public interface Drivable {
    default void drive(){
        System.out.println(this.getClass().getSimpleName() + " is being driven!");
    };
}
