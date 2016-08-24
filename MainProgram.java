package com.tcs.main;



public class MainProgram {

	public static void main(String[] args) {		

		try {
			
			Person.List = new Person[]{
				new Person('A', 100, new char[]{'A', 'B', 'C', 'D'}),
				new Person('B', 500, new char[]{'C', 'D'}),
				new Person('C', 0, new char[]{}),
				new Person('D', 300, new char[]{'A', 'B'})
			};

			Person.UpdateSelf();

			Person.DisplaySelf();

		} catch (Error e) {
			System.out.println(e.getMessage());
		}
	}

}


