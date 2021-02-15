package robot;

import by.teachmeskills.robot.hands.IHand;
import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.IHead;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.ILeg;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

import java.util.Random;
import java.util.Scanner;

public class CreateRobot {
    private IHand[] iHands = new IHand[]{new SamsungHand(), new SonyHand(), new ToshibaHand()};
    private ILeg[] iLegs = new ILeg[]{new SamsungLeg(), new SonyLeg(), new ToshibaLeg()};
    private IHead[] iHeads = new IHead[]{new SamsungHead(), new SonyHead(), new ToshibaHead()};

    public Robot createRobot() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя робота");
        String name = scanner.nextLine();
        Random random = new Random();
        return new Robot(iHeads[random.nextInt(3)], iHands[random.nextInt(3)], iLegs[random.nextInt(3)], name);
    }
}
