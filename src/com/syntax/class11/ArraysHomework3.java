package com.syntax.class11;

public class ArraysHomework3 {

	public static void main(String[] args) {
		
		String[] countries= {"USA", "Ukraine", "Russia", "Spain", "Belarus"};
		String[] capitals={"Washington DC", "Kiev", "Moscow", "Madrid", "Minsk"};

		String capital;
		
		for (String country:countries) {
			
			switch(country) {
			case "USA":
				capital="Washington DC";
				break;
			case "Ukraine":
				capital="Kiev";
				break;
			case "Russia":
				capital="Moscow";
			break;
			case "Spain":
				capital="Madrid";
				break;
			case "Belarus":
				capital="Minsk";
				break;
				default: 
					capital="I don't know";
			}
			System.out.println("The capital of "+country+" is "+capital);
		}
	}

}
