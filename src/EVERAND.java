package Day4;

import java.util.Scanner;

public class EVERAND {

   public static void main(String[] args) {

      Scanner myInput = new Scanner(System.in);

      int A_Adult = 60000, A_kidsOld = 48000;
      int B_Adult = 56000, B_kidsOld = 44000;
      int C_Adult = 50000, C_kidsOld = 40000;
      int A_DisabledAdult = 36000, A_DisabledKids = 28000;
      int B_DisabledAdult = 33000, B_DisabledKids = 26000;
      int C_DisabledAdult = 30000, C_DisabledKids = 24000;
      int A_nationalAdult = 30000, A_nationalKids = 24000;
      int B_nationalAdults = 28000, B_nationalKids = 22000;
      int C_nationalAdults = 25000, C_nationalKids = 20000;
      int A_mulChildrenAdult = 48000, A_mulChildrenKids = 38000;
      int B_mulChildrenAdult = 44000, B_mulChildrenKids = 35000;
      int C_mulChildrenAdult = 40000, C_mulChildrenKids = 32000;
      int A_pregnent = 51000, B_pregnent = 47000, C_pregnent = 42000;
      int price = 0;
      int age = 0;
      int count = 0;
      int discount = 0;

      // System.out.printf("이용날짜를 입력해주세요 : ");
      // int date = myInput.nextInt();
      int inputYear, inputMonth, inputDay;
      int totalDays;
      int endOfMonth = 0;
      boolean isLeapYear = false;
      System.out.print("년도 입력 : ");
      inputYear = myInput.nextInt();
      System.out.print("월 입력 : ");
      inputMonth = myInput.nextInt();
      System.out.print("일 입력 : ");
      inputDay = myInput.nextInt();
      inputDay = 1;
      System.out.println("생년월일을 입력하세요" );
      age = myInput.nextInt();
      System.out.println("몇 개를 주문하시겠습니까?");
      count = myInput.nextInt();
      System.out.println("우대사항을 선택하세요 \n 1.없음 \n 2.장애인 \n 3.국가유공자 \n 4.다자녀 \n 5.임산부 ");
      discount = myInput.nextInt();

      if (inputYear == 2021 && inputMonth == 6) {
         if ((inputDay == 1) || (inputDay == 2) || (inputDay == 3) || (inputDay == 4) || (inputDay == 5)
               || (inputDay == 6) || (inputDay == 7) || (inputDay == 8) || (inputDay == 9) || (inputDay == 10)
               || (inputDay == 11) || (inputDay == 12) || (inputDay == 13) || (inputDay == 19) || (inputDay == 20)
               || (inputDay == 26) || (inputDay == 27)) {
            if ((age <= 2008) && (age > 1956)) {
               System.out.println(B_Adult * count);
            } else {
               System.out.println(B_kidsOld* count);
            }
         } else {
            if ((age <= 2008) && (age > 1956)) {
               System.out.println(C_Adult* count);
            } else {
               System.out.println(C_kidsOld* count);
            }

         }

      }
      if (inputYear == 2021 && inputMonth == 7) {
         if ((inputDay == 3) || (inputDay == 4) || (inputDay == 10) || (inputDay == 11) || (inputDay == 17)
               || (inputDay == 18) || (inputDay == 24) || (inputDay == 25) || (inputDay == 29) || (inputDay == 30)
               || (inputDay == 31)) {
            if ((age <= 2008) && (age > 1956)) {
               System.out.println(B_Adult* count);
            } else {
               System.out.println(B_kidsOld* count);
            }
         } else {
            if ((age <= 2008) && (age > 1956)) {
               System.out.println(C_Adult* count);
            } else {
               System.out.println(C_kidsOld* count);
            }

         }
      }
      if (inputYear == 2021 && inputMonth == 8) {
         if ((inputDay == 1) || (inputDay == 2) || (inputDay == 3) || (inputDay == 7) || (inputDay == 8)
               || (inputDay == 14) || (inputDay == 15) || (inputDay == 21) || (inputDay == 22) || (inputDay == 28)
               || (inputDay == 29)) {
            if ((age <= 2008) && (age > 1956)) {
               System.out.println(B_Adult* count);
            } else {
               System.out.println(B_kidsOld* count);
            }
         } else {
            if ((age <= 2008) && (age > 1956)) {
               System.out.println(C_Adult* count);
            } else {
               System.out.println(C_kidsOld* count);
            }

         }
      }
      if (inputYear == 2021 && inputMonth == 9) {
         if ((inputDay == 1) || (inputDay == 2)) {
            if ((age <= 2008) && (age > 1956)) {
               System.out.println(A_Adult* count);
            } else {
               System.out.println(A_kidsOld* count);
            }
         } else if ((inputDay == 4) || (inputDay == 5) || (inputDay == 11) || (inputDay == 12) || (inputDay == 18)
               || (inputDay == 19) || (inputDay == 20) || (inputDay == 21) || (inputDay == 22) || (inputDay == 25)
               || (inputDay == 26)) {
            if ((age <= 2008) && (age > 1956)) {
               System.out.println(C_Adult* count);
            } else {
               System.out.println(C_kidsOld* count);
            }
         } else {
            if ((age<= 2008) && (age > 1956)) {
               System.out.println(B_Adult* count);
            } else {
               System.out.println(B_kidsOld* count);
            }

         }
      }
      if (inputYear == 2021 && inputMonth == 10) {
         if ((inputDay == 2) || (inputDay == 3) || (inputDay == 9) || (inputDay == 10) || (inputDay == 16)
               || (inputDay == 17) || (inputDay == 23) || (inputDay == 24) || (inputDay == 30)
               || (inputDay == 31)) {
            if ((age <= 2008) && (age > 1956)) {
               System.out.println(A_Adult* count);
            } else {
               System.out.println(A_kidsOld* count);
            }
         } else {
            if ((age <= 2008) && (age > 1956)) {
               System.out.println(B_Adult* count);
            } else {
               System.out.println(B_kidsOld* count);
            }

         }
      }
      if (inputYear == 2021 && inputMonth == 11) {
         if ((inputDay == 6) || (inputDay == 7)) {
            if ((age <= 2008) && (age> 1956)) {
               System.out.println(A_Adult* count);
            } else {
               System.out.println(A_kidsOld* count);
            }
         } else if ((inputDay == 15) || (inputDay == 16) || (inputDay == 17) || (inputDay == 18) || (inputDay == 19)
               || (inputDay == 22) || (inputDay == 23) || (inputDay == 24) || (inputDay == 25) || (inputDay == 26)
               || (inputDay == 29) || (inputDay == 30)) {
            if ((age <= 2008) && (age > 1956)) {
               System.out.println(C_Adult* count);
            } else {
               System.out.println(C_kidsOld* count);
            }
         } else {
            if ((age <= 2008) && (age > 1956)) {
               System.out.println(B_Adult* count);
            } else {
               System.out.println(B_kidsOld* count);
            }

         }
      } 
      
      
   }
}