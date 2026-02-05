package TelecomSignal;

public class SignalData {
	private String timestamp;
	private String location;
	private int signalStrength; // in dBm
	private String networkType;
	private String operator;

	public SignalData(String timestamp, String location, int signalStrength, String networkType, String operator) {
		this.timestamp = timestamp;
		this.location = location;
		this.signalStrength = signalStrength;
		this.networkType = networkType;
		this.operator = operator;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public String getLocation() {
		return location;
	}

	public int getSignalStrength() {
		return signalStrength;
	}

	public String getNetworkType() {
		return networkType;
	}

	public String getOperator() {
		return operator;
	}
}
