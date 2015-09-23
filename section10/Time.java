/*
2. Viet class Timer theo mo ta sau
- co 3 instance variable la hour, minute, second (integer)
- 3 instance variable deu co setter/getter
- 1 construction    Timer(Float hour, Float minute, Float second)
- method increase(int amount):  tang minute  len amount don vi.
- method standardize: tinh toan lai  hour, minute,  second theo quy tac sau
+ second < 60,  neu lon hon thi chuyen sang minute 1 phan sao cho    1 minute = 60second  (vi du  60 seconds =>  59s + 1m)
+ minute < 60,   neu lon hon thi chuyen sang hour 1 phan sao cho    1hour = 60minute
- method toString:  in ra dien ta cho class nhu sau:    Hour: <hour> | Minute: <minute> | Second: <second>*/

import java.util.*;
public class Time{
	private float hour;
	private float minute;
	private float second;

	public Time(float a, float b, float c){
		hour = a;
		minute = b;
		second = c;

	}
	public Time(){

	}
	public void setHour(float hour){
		this.hour = hour;
	}
	public void setMinute(float minute){
		this.minute = minute;
	}
	public void setSecond(float second){
		this.second = second;
	}
	public float getSecond(){
		return this.second;
	}
	public float getMinute(){
		return this.second;
	}
	public float getHour(){
		return this.second;
	}

	public float addMin(float amount){
		minute = minute + amount;
		return minute;
	}
	public float standardize(){
		while(second>=60){
			second = second-60;
			minute++;
		}

		while(minute>60){
			minute = minute-60;
			hour++;
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
		float hour = sc.nextFloat();
		thoigian.setHour(hour);

		System.out.println("nhap phut:");
		float minute = sc.nextFloat();
		thoigian.setMinute(minute);

		System.out.println("nhap giay:");
		float second = sc.nextFloat();
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
