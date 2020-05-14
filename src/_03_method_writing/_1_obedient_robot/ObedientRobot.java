package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
		Robot notarobot = new Robot();
		public static void main(String[] args) {
			new ObedientRobot().ask();
		}
void ask() {

	notarobot.setSpeed(500);
	notarobot.hide();
	notarobot.penDown();
	String shape = JOptionPane.showInputDialog("Circle, square, or triangle?");
	if(shape.equalsIgnoreCase("circle")) {
		circle();
	}else if(shape.equalsIgnoreCase("square")){
		square();
	}else if(shape.equalsIgnoreCase("triangle")) {
		triangle();
	}
}
void circle() {
	for(int i=0; i<360; i++) {
		notarobot.move(1);
		notarobot.turn(1);
	}
}
void square() {
	for(int j=0; j<4; j++) {
		notarobot.move(50);
		notarobot.turn(1);
	}
}
void triangle() {
	notarobot.turn(30);
	notarobot.move(50);
	notarobot.turn(120);
	notarobot.move(50);
	notarobot.turn(120);
	notarobot.move(50);

}
}

