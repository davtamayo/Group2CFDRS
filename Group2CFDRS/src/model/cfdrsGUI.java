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

	// Constructor
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
	// End Constructor

	/**
	 * @return the connectionStatus
	 */
	public String getConnectionStatus() {
		// connection status of the CFDRS system
		return connectionStatus;
	}

	/**
	 * @param connectionStatus the connectionStatus to set
	 */
	public void setConnectionStatus(String connectionStatus) {
		// sets connection status of the CFDRS
		this.connectionStatus = connectionStatus;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		// gets the file destination
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		// sets the file destination
		this.destination = destination;
	}

	/**
	 * @return the userMessage
	 */
	public String getUserMessage() {
		// gets a user message
		return userMessage;
	}

	/**
	 * @param userMessage the userMessage to set
	 */
	public void setUserMessage(String userMessage) {
		// sets the user message
		this.userMessage = userMessage;
	}

	/**
	 * @param gets compression type
	 */
	public static void getCompressedType() {
		// gets the compression type of the file
		System.out.println("File type is zip.");
	}

	/**
	 * @param process a file submission
	 */
	public void processRequest() {
		// processing the request to upload the file
		System.out.println("Processing File, please wait.\n");
	}

	/**
	 * @param sends file for uploading
	 */
	public void sendFileTo() {
		// sends file for analysis.
		System.out.println("Submitting File for analysis.");
	}

}
