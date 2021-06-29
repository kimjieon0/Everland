package everland;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EverlandCount {

	public int todayYear, todayDate, birthYear, birthMonth, birthDay, birthDate, reservationDate, benefit, count = 0,
			manAge, price = 0;
	public String ticket = null, socialNumber = null, age = null;
	public String b = null;

	public void TicketCount() {
		while (true) {
			System.out.println("몇개를 주문하시겠습니까?(0 누르면 처음으로)");
			System.out.print(": ");
			Scanner myInput3 = new Scanner(System.in);
			count = myInput3.nextInt();
			if (count == 0) {
				break;
			} else {
				break;
			}
		}
	}

}
