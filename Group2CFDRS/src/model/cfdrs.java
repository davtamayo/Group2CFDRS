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

	/**
	 * @param returns file name
	 */
	public static void getZippedFileName() {
		// gets name of zipped file
		System.out.println("Getting zipped file...");
	}

	/**
	 * @param returns the decompressed zipped file(s)
	 */
	public static void decompressFile() {
		// decompresses files
		System.out.println("Decompressing zipped file...");
	}

	/**
	 * @param creates the virtual environment
	 */
	public static void createVirtualEnvironment() {
		// creates a virtual environment for detonating files
		System.out.println("Creating virtual environment...");
	}

	/**
	 * @param destroys the virtual environment
	 */
	public static void destroyVirtualEnvironment() {
		// destroys a virtualized environment
		System.out.println("Destroying virtual environment...");
	}

	/**
	 * @param return existence of malicious content
	 */
	public static void checkForMaliciousContent() {
		// checks if files are malicious
		System.out.println("Checking files for malicious content...");
	}

	/**
	 * @param returns repackaged file
	 */
	public static void repackageFile() {
		// re-zips file
		System.out.println("Rezipping file...");
	}

	/**
	 * @param re-routes file
	 */
	public static void rerouteFile() {
		// reroutes files
		System.out.println("Rerouting zipped file...");
	}

	/**
	 * @param moves files locally
	 */
	public static void moveFile() {
		// moves file locally
		System.out.println("Moving file...");
	}

	/**
	 * @param file copy
	 */
	public static void copyingFile() {
		// creates a copy of the file
		System.out.println("Getting zipped file...");
	}

	/**
	 * @param file deletion
	 */
	public static void deleteFile() {
		// deletes a file
		System.out.println("Deleting file...");
	}

	/**
	 * @param file returns fileServerStats
	 */
	public void pollStatics() {
		// retrieves CPU, RAM, and Storage statistics from Server
		System.out.println("Retrieving File Server statistics...");
	}
}
