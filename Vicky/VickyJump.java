import java.util.Scanner;

public class VickyJump {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How far would you like Vicky to jump?");
		int distance = sc.nextInt();

		int fullJump = 5 + 3 + 1;
	
		int jumpSets = distance / fullJump;

		int distRemain = distance % fullJump;

		int fullRest = 1 + 2 + 3;

		int totalRest = jumpSets * fullRest;

		if(distRemain == 0) {
			totalRest -= 3; // There is no need to rest after the last jump
		} else {
			int currentJump = 1;
			int timeToAdd = 0;

			while(distRemain > 0) {
				switch(currentJump) {
					case 1:
						distRemain -= 5;

						timeToAdd = 1;

						break;
					case 2:
						distRemain -= 3;

						timeToAdd = 2;

						break;
					case 3:
						distRemain -= 1;

						timeToAdd = 3;

						break;
					default:
						break;
				}

				if(distRemain > 0)
					totalRest += timeToAdd;

				if(currentJump == 3)
					currentJump = 1;
				else
					currentJump++;
			}
		}

		System.out.println("Vicky rested for " + totalRest + " seconds");
	}
}