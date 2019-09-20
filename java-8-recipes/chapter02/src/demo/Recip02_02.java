package demo;

public class Recip02_02 {
    public static void main(String[] args) {
        PoolCalculator calculator = new PoolCalculator();
        calculator.setLength(32);
        calculator.setWidth(16);
        calculator.setMaxDepth(8);
        calculator.setMinDepth(4);
        Volume volume = calculator::calculateVoluem;
        double poolVolume = volume.calculateVoluem();
        System.out.println("Voluem of the pool is "+poolVolume+" cubic feet");
        System.out.println("Gallons is the pool "+calculator.calculateGallons(volume));
    }
}
