package Day4;

import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class EverlandMain {



	public static void main(String[] args) {
		EverlandClass everlandprocess = new EverlandClass();
		EverlandArrayList everlandArray = new EverlandArrayList();
		everlandprocess.DatePattern();
		while (true) {
			everlandArray.clearAll();
			do {
				everlandprocess.inputDate();
				everlandprocess.BirthDay();
				if (everlandprocess.socialNumber.equals("0")) {continue;}
				everlandprocess.BirthTicket();
				everlandprocess.TicketCount();
				if (everlandprocess.count == 0) {continue;}
				System.out.println("คั");
				everlandprocess.PreferentialTreatment();
				if (everlandprocess.benefit == 0) {continue;}
				everlandArray.AddWant(everlandprocess.ticket, everlandprocess.age, everlandprocess.price, everlandprocess.count, everlandprocess.b);
				} while (everlandArray.addOrder == 1);
			everlandArray.result(everlandprocess.price, everlandprocess.count);
			break;
		}
	}
}
