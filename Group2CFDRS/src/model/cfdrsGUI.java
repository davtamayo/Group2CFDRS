/**
 * 
 */
package model;

/**
 * @author dftamayo
 *
 */
public class cfdrsGUI {
	private String connectionStatus;
	private String destination;
	private String userMessage;

	/**
	 * @param connectionStatus
	 * @param destination
	 * @param userMessage
	 */
	public cfdrsGUI(String connectionStatus, String destination, String userMessage) {
		this.setConnectionStatus(connectionStatus);
		this.setDestination(destination);
		this.setUserMessage(userMessage);
	}

	/**
	 * @return the connectionStatus
	 */
	public String getConnectionStatus() {
		return connectionStatus;
	}

	/**
	 * @param connectionStatus the connectionStatus to set
	 */
	public void setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the userMessage
	 */
	public String getUserMessage() {
		return userMessage;
	}

	/**
	 * @param userMessage the userMessage to set
	 */
	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}

	public void getCompressedType() {
		System.out.println("File type is zip.");
	}

	public void processRequest() {
		System.out.println("Processing File.");
	}

	public void sendFileTo() {
		System.out.println("Submitting File for analysis.");
	}

}
