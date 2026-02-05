package TelecomSignal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DataCollector collector = new DataCollector();
		DataStorage storage = new DataStorage();
		DataAnalyzer analyzer = new DataAnalyzer();

		while (true) {
			System.out.println("\n===== Telecom Signal Monitoring System =====");
			System.out.println("1. Add New Sample");
			System.out.println("2. Analyze Data");
			System.out.println("3. Exit");
			System.out.print("Choose Option: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				SignalData data = collector.collectData();
				storage.saveData(data);
				break;

			case 2:
				analyzer.analyzeData();
				break;

			case 3:
				System.out.println("Exiting...");
				return;

			default:
				System.out.println("Invalid Option!");
			}
		}
	}
}
