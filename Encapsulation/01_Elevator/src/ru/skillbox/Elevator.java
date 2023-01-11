public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
        System.out.println("Текущий этаж: " + currentFloor);
    }
    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
        System.out.println("Текущий этаж: " + currentFloor);
    }
    public void move(int floor) {
        if(floor <= maxFloor && floor >= minFloor && floor!=currentFloor) {
            while(currentFloor>floor) {
                moveDown();
            }
            while(currentFloor<floor) {
                moveUp();
            }
        }
        else {
            System.out.println("Ошибка!");
        }

    }
}
