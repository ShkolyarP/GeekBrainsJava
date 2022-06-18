package homework9;

public class Task1 {
    public static void main(String[] args) {
        Human human = new Human(200, 400);
        Robot robot = new Robot(500, 20);
        Cat cat = new Cat(100, 1000);
        Wall wall = new Wall(300);
        Treadmill tredmill = new Treadmill(150);

        Participant[] participants = {human, robot, cat};
        Obstacle[] obstacles = {tredmill, wall};

        for (Participant participant :
                participants) {

            for (int i = 0; i < obstacles.length; i++) {
                if (!obstacles[i].overcoming(participant)) {
                    break;
                }

            }

        }

    }


}
