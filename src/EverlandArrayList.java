package Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class EverlandArrayList {
	public  ArrayList<String> ArrTicket = new ArrayList<String>();
	public  ArrayList<String> ArrAge = new ArrayList<String>();
	public  ArrayList<Integer> ArrCount = new ArrayList<Integer>();
	public  ArrayList<Integer> ArrPrice = new ArrayList<Integer>();
	public  ArrayList<String> Arrb = new ArrayList<String>();
	public  int addOrder = 0;
	
	
	
	public  void clearAll() {
		
		ArrTicket.clear();
		ArrAge.clear();
		ArrCount.clear();
		ArrPrice.clear();
		ArrPrice.clear();
		
		
		
	}
	
	
	public  void AddWant(String ticket, String age, int count, int price, String b) {
		
		
		System.out.println("1. �߰� ����    2. �̿� ����");
		Scanner myInput4 = new Scanner(System.in);
		addOrder = myInput4.nextInt();

		// newTicket[orderCount] = ticket;
		ArrTicket.add(ticket);
		ArrAge.add(age);
		ArrCount.add(count);
		ArrPrice.add(price);
		Arrb.add(b);
	}
	
	public  void result(int count, int price) {
		

		System.out.println("��");
		System.out.printf("������ %d �Դϴ�.\n", price * count);
		System.out.println("�����մϴ�.");
		System.out.println();
		System.out.println("=============== �������� ===============");
		for (int index = 0; index < ArrTicket.size(); index++) {
			System.out.printf("%s  %s  X  %d  %d  %s\n", ArrTicket.get(index), ArrAge.get(index), ArrCount.get(index),
					ArrCount.get(index) * ArrPrice.get(index), Arrb.get(index));
		}
		System.out.println("======================================");

	}
}
