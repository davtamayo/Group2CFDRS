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
//  private String Name; <--needs to be deleted from class
	private String fileRepoPath;

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

	/**
	 * @return the fileRepoName
	 */
	public String getFileRepoName() {
		return fileRepoName;
	}

	/**
	 * @param fileRepoName the fileRepoName to set
	 */
	public void setFileRepoName(String fileRepoName) {
		this.fileRepoName = fileRepoName;
	}

	/**
	 * @return the fileRepoCPU
	 */
	public int getFileRepoCPU() {
		return fileRepoCPU;
	}

	/**
	 * @param fileRepoCPU the fileRepoCPU to set
	 */
	public void setFileRepoCPU(int fileRepoCPU) {
		this.fileRepoCPU = fileRepoCPU;
	}

	/**
	 * @return the fileRepoMemory
	 */
	public int getFileRepoMemory() {
		return fileRepoMemory;
	}

	/**
	 * @param fileRepoMemory the fileRepoMemory to set
	 */
	public void setFileRepoMemory(int fileRepoMemory) {
		this.fileRepoMemory = fileRepoMemory;
	}

	/**
	 * @return the fileRepoStorage
	 */
	public int getFileRepoStorage() {
		return fileRepoStorage;
	}

	/**
	 * @param fileRepoStorage the fileRepoStorage to set
	 */
	public void setFileRepoStorage(int fileRepoStorage) {
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
