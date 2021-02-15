package robot;

import java.util.List;

public class Expensive {
    public static Robot expensiveRobot(List<Robot> robots) {
        int priceMax = 0;
        for (Robot robot : robots) {
            if (priceMax < robot.getPrice()) {
                priceMax = robot.getPrice();
            }
        }
        for (Robot robot : robots) {
            if (priceMax == robot.getPrice()) {
                return robot;
            }
        }
        return robots.get(0);
    }
}
