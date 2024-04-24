/**
 * 
 */
package com.LMS.APIAutomation;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import org.apache.commons.io.FileUtils;

import com.LMS.APIAutomation.Resources.ReadProperties;


/**
 * @author sa185402
 *
 */
public class GenericMethods {
	
ReadProperties prop = new ReadProperties();
	
	public void createBATFile(String BATFileName) throws IOException {
//		String path = System.getProperty("user.dir");
		//String path = "C:\\Manoj\\ManojJMeter\\LMS\\ILoader";
		File file = new File(prop.getIloader_BATFile_Path() + "/" +BATFileName);
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBytes("@echo off");
		dos.writeBytes("\n");
		dos.writeBytes("cd " + prop.getIloader_BATFile_Path());
		dos.writeBytes("\n");
		String Psexec = "PsExec.exe " + prop.getServer() + " -u " + prop.getServerUserName() + " -p " + prop.getServerPassword() + " \"" + prop.getServerExeLoader() + "\"";
		dos.writeBytes(Psexec);
		dos.writeBytes("\n");
		fos.close();
	}
	
	public void ExecuteBatFile(String BATFileName) throws IOException {

//		String path = System.getProperty("user.dir") +"/" + BATFileName;
		String path = prop.getIloader_BATFile_Path() + "\\" + BATFileName;
		String[] array = { "cmd", "/C", "start", path };
		Process child1 = Runtime.getRuntime().exec(array);
		
	}
	
	public void fileTransfer(String XML_File_Name) throws IOException {
		String Source_Path = prop.getIloader_XML_File_Path() + "\\" + XML_File_Name;
		String Destination_Path = prop.getIloader_Server_IN_Path() + "\\" + XML_File_Name;
		FileUtils.copyFile(new File(Source_Path),new File(Destination_Path));
		
	}
	

}
