public class TowerOfHanoi {
    public static void towerOfHanoi(char source, char destination, char auxilary, int disk) {
        if (disk == 0) {
            return;
        }
        towerOfHanoi(source, auxilary, destination, disk - 1);
        System.out.println("Moved " + disk + " from " + source + " to " + destination + " ");
        towerOfHanoi(auxilary,destination,source, disk - 1);
    }

    public static void main(String[] args) {
        towerOfHanoi('a', 'b', 'c', 3);
    }
}
