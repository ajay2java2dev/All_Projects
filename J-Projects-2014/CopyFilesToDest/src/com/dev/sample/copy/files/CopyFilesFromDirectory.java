package com.dev.sample.copy.files;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class CopyFilesFromDirectory {
	static File source = new File("C:/Users/ajay/Music/Music-Vij-Coll");
	static File destination = new File("C:/Users/ajay/Music/Music-Vij-Coll");

	public static void main(String[] args) {
		File[] fileArray = source.listFiles();

		for (int i = 0; i < fileArray.length; i++)
			if (fileArray[i].isDirectory()) {

				File[] fileTemp = fileArray[i].listFiles();

				for (int j = 0; j < fileTemp.length; j++) {
					System.out.println("Copying ... " + fileTemp[j] + " to : "
							+ destination);
					try {
						FileUtils.copyFileToDirectory(fileTemp[j], destination);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
	}
}
