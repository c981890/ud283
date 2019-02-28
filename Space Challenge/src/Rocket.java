public class Rocket  implements SpaceShip{
    private int rocketWeight;
    private int currentWeight;
    private int maxWeight;

        public boolean launch() {
            return true;
        }

        public boolean land() {
            return true;
        }

        public boolean canCarry(Item item){
            if (item.getWeight() + this.rocketWeight <= this.maxWeight) {
                return true;
            }
            return false;
        }
        public void carry(Item item) {
            this.currentWeight = this.rocketWeight + item.getWeight();
        }

}
