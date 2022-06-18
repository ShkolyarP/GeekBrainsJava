package homework9;

public class Treadmill implements Obstacle {

    private int lengthTreadmill;

    public Treadmill(int lengthTreadmill) {
        this.lengthTreadmill = lengthTreadmill;
    }

    @Override
    public boolean overcoming(Participant participant) {

        if (participant.running() >= lengthTreadmill) {
            System.out.println("The treadmill has been overcome");
            System.out.println("");
            return true;
        } else
            System.out.println("Failure");
        System.out.println("");
        return false;

    }
}
