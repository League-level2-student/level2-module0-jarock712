package arrays;

import java.io.ObjectInputStream.GetField;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		//2. create an array of 5 robots.
		Robot[] joe = new Robot[5];
		//3. use a for loop to initialize the robots.
		for (int i = 0; i < joe.length; i++) {
			joe[i] = new Robot();
		}
		//4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < joe.length; i++) {
			joe[i].moveTo((i+1)*100, 500);
		}
		//5. use another for loop to iterate through the array and make each robot move 
		//   a random amount less than 50.
		Random ran = new Random();
		for (int i = 0; i < joe.length; i++) {
			joe[i].setSpeed(50);
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		int winner = -1;
		boolean win = false;
		do {
			for (int i = 0; i < joe.length; i++) {
				int rand = ran.nextInt(30);
				joe[i].move(rand);
				joe[i].turn(10);
				if (joe[i].getY() < 0) {
					win = true;
					winner = i;
					break;
				}
			}
		} while (!win);
		//7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "The winner is: " + winner);
		//8. try different races with different amounts of robots.
		
		//9. make the robots race around a circular track.
		
	}
}
