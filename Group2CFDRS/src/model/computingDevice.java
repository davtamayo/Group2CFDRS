/**
 * 
 */
package model;

/**
 * @author dftamayo
 *
 */
public class computingDevice {

	private String fileName;
	private String filePath;

	// Constructor
	/**
	 * @param fileName
	 * @param filePath
	 */
	public computingDevice(String fileName, String filePath) {
		this.setFileName(fileName);
		this.setFilePath(filePath);
	}

	// end Constructor

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		// gets the name of the file to be used.
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		// sets the name of the file, and can change it
		this.fileName = fileName;
	}

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		// indicates where the file is located
		return filePath;
	}

	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		// sets the path location
		this.filePath = filePath;
	}

}
