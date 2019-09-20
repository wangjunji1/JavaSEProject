package demo;

public class PoolCalculator implements Volume {
    private double width;
    private double length;
    private double minDepth;
    private double MaxDepth;

    public PoolCalculator() {
    }

    public PoolCalculator(double width, double length, double minDepth, double maxDepth) {
        this.width = width;
        this.length = length;
        this.minDepth = minDepth;
        MaxDepth = maxDepth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getMinDepth() {
        return minDepth;
    }

    public void setMinDepth(double minDepth) {
        this.minDepth = minDepth;
    }

    public double getMaxDepth() {
        return MaxDepth;
    }

    public void setMaxDepth(double maxDepth) {
        MaxDepth = maxDepth;
    }

    @Override
    public double calculateVoluem() {
        double avgDepth = (minDepth+MaxDepth)/2;
        return avgDepth*length*width;
    }

    public double calculateGallons(Volume vol){
        return 7.48*vol.calculateVoluem();
    }

}
