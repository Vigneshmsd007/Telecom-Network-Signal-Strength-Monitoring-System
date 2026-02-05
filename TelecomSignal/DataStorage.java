package TelecomSignal;

import java.io.FileWriter;
import java.io.IOException;

public class DataStorage {

	private static final String FILE_NAME = "data.csv";

	public void saveData(SignalData data) {
		try {
			FileWriter writer = new FileWriter(FILE_NAME, true);

			writer.write(data.getTimestamp() + "," + data.getLocation() + "," + data.getSignalStrength() + ","
					+ data.getNetworkType() + "," + data.getOperator() + "\n");

			writer.close();
			System.out.println("✔ Data Saved Successfully into data.csv\n");

		} catch (IOException e) {
			System.out.println("Error saving data: " + e.getMessage());
		}
	}
}
