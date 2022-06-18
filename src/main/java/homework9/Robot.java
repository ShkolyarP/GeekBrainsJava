package homework9;

public class Robot implements Participant {

    private final int MAX_RUN;
    private final int MAX_JUMP;

    public Robot(int MAX_RUN, int MAX_JUMP) {
        this.MAX_RUN = MAX_RUN;
        this.MAX_JUMP = MAX_JUMP;
    }

    @Override
    public int jumping() {
        System.out.println("Robot jumping");
        return MAX_JUMP;
    }

    @Override
    public int running() {
        System.out.println("Robot running");
        return MAX_RUN;
    }
}
