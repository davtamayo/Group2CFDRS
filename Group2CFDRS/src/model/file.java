/**
 * 
 */
package model;

/**
 * @author dftamayo
 *
 */
public class file {

	private String fileName;
	private float fileSize;
	private String compressionType;
	private boolean isCompressed;
	private String filePath;

	// Constructor
	/**
	 * @param fileName
	 * @param fileSize
	 * @param compressionType
	 * @param isCompressed
	 * @param filePath
	 */
	public file(String fileName, float fileSize, String compressionType, boolean isCompressed, String filePath) {
		this.setFileName(fileName);
		this.setFileSize(fileSize);
		this.setCompressionType(compressionType);
		this.setCompressed(isCompressed);
		this.setFilePath(filePath);
	}

	// end Constructor

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		// gets its own name
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		// sets its own name
		this.fileName = fileName;
	}

	/**
	 * @return the fileSize
	 */
	public float getFileSize() {
		// gets its own size
		return fileSize;
	}

	/**
	 * @param fileSize the fileSize to set
	 */
	public void setFileSize(float fileSize) {
		// sets its own size
		this.fileSize = fileSize;
	}

	/**
	 * @return the compressionType
	 */
	public String getCompressionType() {
		// gets its compression type used
		return compressionType;
	}

	/**
	 * @param compressionType the compressionType to set
	 */
	public void setCompressionType(String compressionType) {
		// sets compression mechanism
		this.compressionType = compressionType;
	}

	/**
	 * @return the isCompressed
	 */
	public boolean isCompressed() {
		// sets where it is compressed or not
		return isCompressed;
	}

	/**
	 * @param isCompressed the isCompressed to set
	 */
	public void setCompressed(boolean isCompressed) {
		// sets compressions
		this.isCompressed = isCompressed;
	}

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		// knows where it is located
		return filePath;
	}

	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		// sets where it is, when moved
		this.filePath = filePath;
	}

	public static void openFile() {
		// opens its contents
		System.out.println("File is open.");
	}

	public static void closeFile() {
		// closes its contents
		System.out.println("File is closed.");
	}

}
