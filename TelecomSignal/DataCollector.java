package TelecomSignal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DataCollector {

	public SignalData collectData() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Location: ");
		String location = sc.nextLine();

		System.out.print("Enter Signal Strength (in dBm, e.g., -85): ");
		int signalStrength = sc.nextInt();
		sc.nextLine(); // consume leftover

		System.out.print("Enter Network Type (4G/5G): ");
		String networkType = sc.nextLine();

		System.out.print("Enter Operator (Jio/Airtel/VI): ");
		String operator = sc.nextLine();

		String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

		return new SignalData(timestamp, location, signalStrength, networkType, operator);
	}
}
