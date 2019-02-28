public class U1 extends Rocket{
    private int rocketCost;
    private int rocketWeight;
    private int maxWeight;
    private int currentWeight;
    private int cargoLimit;

    public U1() {
        this.rocketCost = 100;
        this.rocketWeight = 10000;
        this.maxWeight = 18000;
        this.cargoLimit = this.maxWeight - this.rocketWeight;
    }

    @Override
    public boolean launch() {
        float chanceOfLaunchExplosion = (float) (0.05 * (this.currentWeight/this.cargoLimit));
        if (Math.random() > chanceOfLaunchExplosion) {
            return true;
        }
        return false;
    }

    @Override
    public boolean land() {
        float chanceOfLandingExplosion = (float) (0.01 * (this.currentWeight / this.cargoLimit));
        if (Math.random() > chanceOfLandingExplosion) {
            return true;
        }
        return false;
    }
}
