package _02_nested_loops._1_snowflake;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;


public class Snowflake {
	
	public static void main(String[] args) {

		// #1. Make a new Robot
Robot notarobot = new Robot();

		// #2. Set your robot’s position to x=300 and y=300
notarobot.moveTo(300, 300);

		// #3. Put the robot's pen down
notarobot.penDown();

		// #4. Set the robot’s speed to 5
notarobot.setSpeed(10);
notarobot.hide();
for(int j = 1; j<7; j++) {
		// #5. use a for loop below to do everything ( #6, #7, #8, #9, #12, #13, #14 ) 6 times (use i as the counter)
for(int i = 1; i<7; i++) {
	

			
			// #6. Set the pen color to black
notarobot.setPenColor(Color.black);
			
			// #7. move the robot by 50
notarobot.move(50);
			
			// #8. turn the robot to the right by 60
			notarobot.turn(60);
			
			// #12. set the pen color to blue for even numbers of i
if(i%2 == 0) {
	notarobot.setPenColor(Color.blue);
}else {
	notarobot.setPenColor(Color.red);
}
			
			// #13. set the pen color to red for all odd numbers of i

}
			// #9. Use a for loop to do everything (#10, #11) 6 times ( use j as a counter )
			
			
					// #10. turn the robot to the left by 60
		notarobot.turn(60);
					
					// #11. move the robot by 50 (play the start button)
					notarobot.move(50);
				
			
			// #14. set the pen color to black
	notarobot.setPenColor(Color.black);
}			
		
	}

}
