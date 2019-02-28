public class U2 {
    private int rocketCost;
    private int rocketWeight;
    private int maxWeight;
    private int currentWeight;
    private int cargoLimit;

    public U2() {
        this.rocketCost = 120;
        this.rocketWeight = 18000;
        this.maxWeight = 29000;
        this.cargoLimit = this.maxWeight - this.rocketWeight;
    }


    public boolean launch() {
        float chanceOfLaunchExplosion = (float) (0.04 * (this.currentWeight/this.cargoLimit));
        if (Math.random() > chanceOfLaunchExplosion) {
            return true;
        }
        return false;
    }


    public boolean land() {
        float chanceOfLandingExplosion = (float) (0.08 * (this.currentWeight / this.cargoLimit));
        if (Math.random() > chanceOfLandingExplosion) {
            return true;
        }
        return false;
    }


}
