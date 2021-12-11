package model;

/**
 * @author dftamayo
 *
 */
public class fileRepo {

	private String fileRepoName;
	private int fileRepoCPU;
	private int fileRepoMemory;
	private int fileRepoStorage;
	private String fileRepoPath;

	// Constructor
	/**
	 * @param fileRepoName
	 * @param fileRepoCPU
	 * @param fileRepoMemory
	 * @param fileRepoStorage
	 * @param fileRepoPath
	 */
	public fileRepo(String fileRepoName, int fileRepoCPU, int fileRepoMemory, int fileRepoStorage,
			String fileRepoPath) {
		this.setFileRepoName(fileRepoName);
		this.setFileRepoCPU(fileRepoCPU);
		this.setFileRepoMemory(fileRepoMemory);
		this.setFileRepoStorage(fileRepoStorage);
		this.setFileRepoPath(fileRepoPath);
	}

	// End Constructor

	/**
	 * @return the fileRepoName
	 */
	public String getFileRepoName() {
		// gets name of the file repository or destination
		return fileRepoName;
	}

	/**
	 * @param fileRepoName the fileRepoName to set
	 */
	public void setFileRepoName(String fileRepoName) {
		// sets the name of the file repository
		this.fileRepoName = fileRepoName;
	}

	/**
	 * @return the fileRepoCPU
	 */
	public int getFileRepoCPU() {
		// gets the file repository CPU statistics
		return fileRepoCPU;
	}

	/**
	 * @param fileRepoCPU the fileRepoCPU to set
	 */
	public void setFileRepoCPU(int fileRepoCPU) {
		// sets the file repository CPU statistics
		this.fileRepoCPU = fileRepoCPU;
	}

	/**
	 * @return the fileRepoMemory
	 */
	public int getFileRepoMemory() {
		// gets the file repository Memory capacity
		return fileRepoMemory;
	}

	/**
	 * @param fileRepoMemory the fileRepoMemory to set
	 */
	public void setFileRepoMemory(int fileRepoMemory) {
		// sets the file repository Memory capacity

		this.fileRepoMemory = fileRepoMemory;
	}

	/**
	 * @return the fileRepoStorage
	 */
	public int getFileRepoStorage() {
		// gets the file repository storage capacity

		return fileRepoStorage;
	}

	/**
	 * @param fileRepoStorage the fileRepoStorage to set
	 */
	public void setFileRepoStorage(int fileRepoStorage) {
		// sets the file repository storage capacity

		this.fileRepoStorage = fileRepoStorage;
	}

	/**
	 * @return the fileRepoPath
	 */
	public String getFileRepoPath() {
		return fileRepoPath;
	}

	/**
	 * @param fileRepoPath the fileRepoPath to set
	 */
	public void setFileRepoPath(String fileRepoPath) {
		this.fileRepoPath = fileRepoPath;
	}

}
