package _04_practice._2_code_4_life;


import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {

	// 1. Ask the user how many hours they spent coding this week.
String coding = JOptionPane.showInputDialog("How many hours did you spend coding this week?");
	// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
	// write code instead.
int num = Integer.parseInt(coding);
if(num <3) {
	JOptionPane.showMessageDialog(null, "stop watching youtube and write code instead");
}else {
	JOptionPane.showMessageDialog(null, "you are a code ninja");
	

	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	// they're a Code Ninja

	// 4. If it is more than 5, call the method below to play the Batman theme song.
	// NOTE: You may have to get batman.wav from league-sounds on github

}
}

}