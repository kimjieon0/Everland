package everland;

import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EverlandMain {

	public static void main(String[] args) {
		EverlandCount everlandprocess = new EverlandCount();
		EverlandArrayList everlandArray = new EverlandArrayList();
		EverlandPrice everlandprice = new EverlandPrice();
		everlandprice.DatePattern();
		while (true) {
			everlandArray.clearAll();
			do {
				everlandprice.inputDate();
				everlandprice.BirthDay();
				if (everlandprice.socialNumber.equals("0")) {
					continue;
				}
				everlandprice.BirthTicket();
				everlandprocess.TicketCount();
				if (everlandprocess.count == 0) {
					continue;
				}
				System.out.println("¤Ñ");
				everlandprice.PreferentialTreatment();
				if (everlandprice.benefit == 0) {
					continue;
				}
				everlandArray.AddWant(everlandprice.ticket, everlandprice.age, everlandprice.price,
						everlandprocess.count, everlandprice.b);
			} while (everlandArray.addOrder == 1);
			everlandArray.result(everlandprice.price, everlandprocess.count);
			break;
		}
	}
}
