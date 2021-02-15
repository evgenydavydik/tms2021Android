package robot;

import java.util.LinkedList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        CreateRobot createRobot = new CreateRobot();
        List<Robot> robots = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            robots.add(createRobot.createRobot());
            System.out.println("Робот по имени " + robots.get(i).getName() + " создан!");
            robots.get(i).action();
        }

        System.out.println("Самый догой робот по имени " + Expensive.expensiveRobot(robots).getName() + " его стоимость " + Expensive.expensiveRobot(robots).getPrice());

    }
}
