/**
 * 
 */
package model;

/**
 * @author dftamayo
 *
 */
public class cfdrs {

	private String cfdrsName;
	private String cfdrsStatus;
	private String fileOriginalFileSource;
	private String fileDestination;

	// Constructor
	/**
	 * @param cfdrsName
	 * @param cfdrsStatus
	 * @param fileOriginalFileSource
	 * @param fileDestination
	 */
	public cfdrs(String cfdrsName, String cfdrsStatus, String fileOriginalFileSource, String fileDestination) {
		this.cfdrsName = cfdrsName;
		this.cfdrsStatus = cfdrsStatus;
		this.fileOriginalFileSource = fileOriginalFileSource;
		this.fileDestination = fileDestination;
	}
	// End Constructor

	public static void getZippedFileName() {
		System.out.println("Getting zipped file...");
	}

	public static void decompressFile() {
		System.out.println("Decompressing zipped file...");
	}

	public static void createVirtualEnvironment() {
		System.out.println("Creating virtual environment...");
	}

	public static void destroyVirtualEnvironment() {
		System.out.println("Destroying virtual environment...");
	}

	public static void checkForMaliciousContent() {
		System.out.println("Checking files for malicious content...");
	}

	public static void repackageFile() {
		System.out.println("Rezipping file...");
	}

	public static void rerouteFile() {
		System.out.println("Rerouting zipped file...");
	}

	public static void moveFile() {
		System.out.println("Moving file...");
	}

	public static void copyingFile() {
		System.out.println("Getting zipped file...");
	}

	public static void deleteFile() {
		System.out.println("Deleting file...");
	}
}
