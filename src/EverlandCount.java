package everland;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EverlandCount {

	public int count = 0;

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
