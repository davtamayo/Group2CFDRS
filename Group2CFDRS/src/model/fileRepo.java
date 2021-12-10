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
		this.fileRepoName = fileRepoName;
		this.fileRepoCPU = fileRepoCPU;
		this.fileRepoMemory = fileRepoMemory;
		this.fileRepoStorage = fileRepoStorage;
		this.fileRepoPath = fileRepoPath;
	}

}
