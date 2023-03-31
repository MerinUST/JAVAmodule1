package javaEnums;

public class TestEnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayofWeek today=DayofWeek.SATURDAY;
		System.out.println("Today is"+ today.getName());
		switch (today) {
		case MONDAY:
			System.out.println("Work hard");
			break;
		case TUESDAY:
			System.out.println("Work little");
			break;
		case WEDNESDAY:
			System.out.println("Work eork little more");
			break;
		case THURSDAY:
			System.out.println("es");
			break;
		case FRIDAY:
			System.out.println("vghj");
			break;
		case SATURDAY:
			System.out.println("xdcfbh");
			break;
		case SUNDAY:
			System.out.println("do all cleanining works");
			break;
		}

	}

}
