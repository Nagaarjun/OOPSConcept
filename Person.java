package com.tcs.main;

class Person {

	public final char Id;
	public final int AmountSpent;
	public int AmountOwes = 0;
	public final char[] For;
	public static Person[] List;
	
	
	public Person(char Id, int AmountSpent, char[] For) {
		this.Id = Id;
		this.AmountSpent = AmountSpent;
		this.For = For;
	}

	public static void UpdateSelf() {
		for (Person s : List) {
			if (s.For.length == 0 || s.AmountSpent == 0) {
				continue;
			}
			int spent = s.AmountSpent / s.For.length;
			for (char Id : s.For) {
				Person sfor = Person.GetFor(Id);
				sfor.updateAmountOwes(spent);
			}
		}
	}
	
	public static Person GetFor(char Id) {
		for (Person s : List) {
			if (s.Id == Id) {
				return s;
			}
		}
		return null;
	}
	
	public void updateAmountOwes(int amtOwes) {
		this.AmountOwes += amtOwes;
	}

	public int AmountNeeded() {
		return AmountOwes - AmountSpent;
	}

	public static void DisplaySelf() {
		for (Person s : List) {
			int amt = s.AmountNeeded();
			System.out.println(s.Id + (amt > 0 ? (" has to give " + amt) : (" gets " + (-amt))));
		}
	}	
}