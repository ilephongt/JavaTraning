/*
2. Viet class Timer theo mo ta sau
- co 3 instance variable la hour, minute, second (integer)
- 3 instance variable deu co setter/getter
- 1 construction    Timer(Float hour, Float minute, Float second)
- method increase(int amount):  tang minute  len amount don vi.
- method standardize: tinh toan lai  hour, minute,  second theo quy tac sau
+ second < 60,  neu lon hon thi chuyen sang minute 1 phan sao cho    1 minute = 60second  (vi du  60 seconds =>  59s + 1m)
+ minute < 60,   neu lon hon thi chuyen sang hour 1 phan sao cho    1hour = 60minute
- method toString:  in ra dien ta cho class nhu sau:    “Hour: <hour> | Minute: <minute> | Second: <second>”*/

import java.util.*;
public class Time{
	private int hour;
	private int minute;
	private int second;

	public void setHour(int hour){
		this.hour = hour;
	}
	public void setMinute(int minute){
		this.minute = minute;
	}
	public void setSecond(int second){
		this.second = second;
	}
	public int getSecond(){
		return this.second;
	}
	public int getMinute(){
		return this.second;
	}
	public int getHour(){
		return this.second;
	}

	public int addMin(int amount){
		minute = minute + amount;
		return minute;
	}
	public int standardize(){
		while(second>60){
			int dem = 0;
			second = second-60;
			dem++;
			minute++;
		}

		while(minute>60){
			int dem = 0;
			minute = minute-60;
			dem++;
			hour++;
		}

		while(hour>24){
			int dem = 0;
			hour = hour-24;
			dem++;
		}


		if (second==60){
			second=0;
			minute++;
		}
		if (minute==60){
			minute=0;
			hour++;
		}
		if (hour==24){
			hour=0;
		}
		return hour+minute+second;
		
	}

	public String toString(){
		
		return "Hour:" +this.hour + "     Minute:" +this.minute+"     Second:" +this.second+"\n";
	}

	public static void main(String[] args) {
		
		Time thoigian = new Time();
		Scanner sc = new Scanner(System.in);

		System.out.println("nhap gio:");
		int hour = sc.nextInt();
		thoigian.setHour(hour);

		System.out.println("nhap phut:");
		int minute = sc.nextInt();
		thoigian.setMinute(minute);

		System.out.println("nhap giay:");
		int second = sc.nextInt();
		thoigian.setSecond(second);

		thoigian.standardize();
		System.out.print("thoi gian hien tai:\t"+thoigian.toString());

		System.out.println("nhap so phut duoc cong them:");
		int amount = sc.nextInt();
		thoigian.addMin(amount);
		thoigian.standardize();
		System.out.println("thoi gian sau khi duoc cong them:\n"+thoigian.toString());
	}
}
