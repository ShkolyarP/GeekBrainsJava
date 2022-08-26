package homework9;

public class Human implements Participant {

    private final int MAX_RUN;
    private final int MAX_JUMP;

    public Human(int MAX_RUN, int MAX_JUMP) {
        this.MAX_RUN = MAX_RUN;
        this.MAX_JUMP = MAX_JUMP;
    }


    @Override
    public int jumping() {
        System.out.println("Human jumping");
        return MAX_JUMP;
    }

    @Override
    public int running() {
        System.out.println("Human running");
        return MAX_RUN;
    }
}

