package HomeWork7;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {

        this.foodCount = foodCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "foodCount=" + foodCount +
                '}';
    }

    public void decreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;
    }

    public void addFood(int food){
      foodCount += food;
    }

    
}
