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
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
