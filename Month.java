class Month {
	private int monthNumber; //number 1-12 that represents a month
	
	//no arg constructor
	public Month() {
		monthNumber = 1;
	}
	
	//constructor that takes an int argument
	public Month(int userMonth) {
		if(userMonth < 1 || userMonth > 12) {
			monthNumber = 1;
		}
		else {
			monthNumber = userMonth;
		}
	}
	
	//constructor that takes a String argument
	public Month(String monthName) {
		if(monthName.equals("January")) {
			monthNumber = 1;
		}
		else if(monthName.equals("February")) {
			monthNumber = 2;
		}
		else if(monthName.equals("March")) {
			monthNumber = 3;
		}
		else if(monthName.equals("April")) {
			monthNumber = 4;
		}
		else if(monthName.equals("May")) {
			monthNumber = 5;
		}
		else if(monthName.equals("June")) {
			monthNumber = 6;
		}
		else if(monthName.equals("July")) {
			monthNumber = 7;
		}
		else if(monthName.equals("August")) {
			monthNumber = 8;
		}
		else if(monthName.equals("September")) {
			monthNumber = 9;
		}
		else if(monthName.equals("October")) {
			monthNumber = 10;
		}
		else if(monthName.equals("November")) {
			monthNumber = 11;
		}
		else if(monthName.equals("December")) {
			monthNumber = 12;
		}
		else {
			monthNumber = 1;
		}
	}
	
	public void setMonthNumber(int userMonth) {
		if(monthNumber < 1 || monthNumber > 12) {
			monthNumber = 1;
		}
		else {
			monthNumber = userMonth;
		}
	}
	
	public int getMonthNumber() {
		return monthNumber;
	}
	
	public String getMonthName() {
		String name;
		switch(monthNumber) {
			case 1:
				name = "January";
			break;
			case 2:
				name = "February";
			break;
			case 3:
				name = "March";
			break;
			case 4:
				name = "April";
			break;
			case 5:
				name = "May";
			break;
			case 6:
				name = "June";
			break;
			case 7:
				name = "July";
			break;
			case 8:
				name = "August";
			break;
			case 9:
				name = "September";
			break;
			case 10:
				name = "October";
			break;
			case 11:
				name = "November";
			break;
			case 12:
				name = "December";
			break;
			default:
				System.out.println("Error.");
				name = "January";
			}
			return name;
	}
	
	public String toString() {
		String str;
		str = "Month: " + getMonthName();
		return str;
	}
	
	public boolean equals(Month userMonth) {
		boolean isEqual;
		if(userMonth.monthNumber == monthNumber) {
			isEqual = true;
		}
		else {
			isEqual = false;
		}
		return isEqual;
	}
	
	public boolean greaterThan(Month userMonth) {
		boolean isGreater;
		if(userMonth.monthNumber < monthNumber) {
			isGreater = false;
		}
		else {
			isGreater = true;
		}
		return isGreater;
	}
	
	public boolean lessThan(Month userMonth) {
		boolean lessThan;
		if(userMonth.monthNumber > monthNumber) {
			lessThan = false;
		}
		else {
			lessThan = true;
		}
		return lessThan;
	}
}