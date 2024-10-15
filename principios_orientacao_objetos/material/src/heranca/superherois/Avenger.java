package heranca.superherois;

public interface Avenger {

    boolean isLeader();

    default void enterBuilding() {
        System.out.println("Entering building...");
    }

}
