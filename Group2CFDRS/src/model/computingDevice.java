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

	/**
	 * @param args
	 */
	public void compressFile() {
		// compresses file before submitting.
		System.out.println("Compressing File...");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		file MyFile = new file("Group2CDFRS.txt", 10, "None", false, "C:\\Documents\\CFDRS");
		System.out.println("The file compression type is currently \"" + MyFile.getCompressionType() + "\".\n");

		computingDevice MyComputer = new computingDevice("Group2CFRDS.txt", "C:\\Documents\\");
		System.out.println("The file is " + MyComputer.getFileName() + " and is located at \""
				+ MyComputer.getFilePath() + "\" folder.");
	}

}
