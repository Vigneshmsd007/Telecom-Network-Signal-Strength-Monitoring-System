package TelecomSignal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataAnalyzer {

	public void analyzeData() {
		String file = "data.csv";
		String line;
		int totalRecords = 0;
		int weakCount = 0;
		int sumSignal = 0;
		int maxSignal = -200;
		int minSignal = 0;

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				int signal = Integer.parseInt(data[2]);

				sumSignal += signal;
				totalRecords++;

				if (signal < -90) {
					weakCount++;
				}

				if (signal > maxSignal)
					maxSignal = signal;
				if (signal < minSignal)
					minSignal = signal;
			}

			br.close();

		} catch (IOException e) {
			System.out.println("Error reading file");
		}

		System.out.println("📊 ANALYSIS REPORT");
		System.out.println("Total Samples: " + totalRecords);
		System.out.println("Average Signal Strength: " + (sumSignal / totalRecords));
		System.out.println("Weak Signal Count (< -90 dBm): " + weakCount);
		System.out.println("Strongest Signal: " + maxSignal + " dBm");
		System.out.println("Weakest Signal: " + minSignal + " dBm");
		System.out.println("----------------------------------------");
	}
}
