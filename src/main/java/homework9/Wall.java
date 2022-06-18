package homework9;

public class Wall implements Obstacle {

    private int heightWall;

    public Wall(int heightWall) {
        this.heightWall = heightWall;
    }

    @Override
    public boolean overcoming(Participant participant) {

        if (participant.jumping() >= heightWall) {
            System.out.println("The wall has been overcome");
            System.out.println("");
            return true;
        } else
            System.out.println("Failure");
        System.out.println("");
        return false;
    }
}
