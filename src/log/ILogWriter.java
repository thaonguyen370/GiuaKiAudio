package log;

public interface ILogWriter {

	/**
	 * Simply returns the current log file name
	 * 
	 * @return
	 */
	String getLogName();

	/**
	 * Writes the data to the logfile
	 * 
	 * @param data
	 * @return
	 */
	boolean write(String className, String data);

	/**
	 * Writes the data followed by a new line character
	 * 
	 * @param data
	 * @return
	 */
	boolean writeln(String className, String data);
}
