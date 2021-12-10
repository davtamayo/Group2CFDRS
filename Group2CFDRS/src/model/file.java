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
	 * @return the fileSize
	 */
	public float getFileSize() {
		return fileSize;
	}

	/**
	 * @param fileSize the fileSize to set
	 */
	public void setFileSize(float fileSize) {
		this.fileSize = fileSize;
	}

	/**
	 * @return the compressionType
	 */
	public String getCompressionType() {
		return compressionType;
	}

	/**
	 * @param compressionType the compressionType to set
	 */
	public void setCompressionType(String compressionType) {
		this.compressionType = compressionType;
	}

	/**
	 * @return the isCompressed
	 */
	public boolean isCompressed() {
		return isCompressed;
	}

	/**
	 * @param isCompressed the isCompressed to set
	 */
	public void setCompressed(boolean isCompressed) {
		this.isCompressed = isCompressed;
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

	public void openFile() {
		System.out.println("File is open.");
	}

	public void closeFile() {
		System.out.println("File is closed.");
	}

}
