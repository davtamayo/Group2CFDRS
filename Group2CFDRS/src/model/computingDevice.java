/**
 * 
 */
package model;

import java.util.concurrent.TimeUnit;

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
	 * @throws InterruptedException
	 */
	public static void compressFile() throws InterruptedException {
		// compresses file before submitting.
		System.out.println("Compressing File.");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Compressing File..");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Compressing File...");
		TimeUnit.SECONDS.sleep(3);

	}

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		computingDevice MyComputer = new computingDevice("Group2CFRDS.txt", "C:\\Documents\\");
		System.out.println("The file is " + MyComputer.getFileName() + " and is located at \""
				+ MyComputer.getFilePath() + "\" folder.");

		file MyFile = new file("Group2CDFRS.txt", 10, "None", false, "C:\\Documents\\CFDRS");
		System.out.println("\nBelow are your file statistics: \n\n" + "**Filename:" + MyFile.getFileName() + ".\n"
				+ "**Compression type: " + MyFile.getCompressionType() + ".\n" + "**File Size: " + MyFile.getFileSize()
				+ " GB\n");

		compressFile();

		MyFile.setFileName("Group2CFDRS.zip");
		MyFile.setCompressionType("zip");
		MyFile.setFileSize(2);

		System.out.println("\nYour file has been compressed. Here are the new file details: \n\n" + "**Filename:"
				+ MyFile.getFileName() + ".\n" + "**Compression type: " + MyFile.getCompressionType() + ".\n"
				+ "**File Size: " + MyFile.getFileSize() + " MB\n\nYour file is located on: " + MyComputer.getFilePath()
				+ MyFile.getFileName());

		TimeUnit.SECONDS.sleep(3);
		System.out.println("\nUploading file...");

		cfdrsGUI myGUI = new cfdrsGUI("Connectec", "\\\\10.1.1.100\\UploadedFiles\\", "Processing your request...");
		System.out.println(myGUI.getUserMessage());
		TimeUnit.SECONDS.sleep(3);
		System.out.println("\nFile uploaded!");
	}

}
