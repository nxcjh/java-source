package com.autohome.java.api;

import java.util.Map;
import java.util.Properties;

import org.junit.Test;

public class SystemLearn {

	@Test
	public void nanoTest(){
		long nanoTime1 = System.nanoTime();
		long timeMillis1 = System.currentTimeMillis();
		System.out.println(nanoTime1);
		System.out.println(timeMillis1);
	}
	
	
	public static void arrayCopyTest(){
		int size = 100000;
		int[] sources = new int[size];
		int[] destination  = new int[size];
		
		long nanoTime1 = System.nanoTime();
		long timeMillis1 = System.currentTimeMillis();
		
		for(int index = 0; index<size; index++){
			destination[index] = sources[index];
		}
		
		long nanoTime2 = System.nanoTime();
		long timeMillis2 = System.currentTimeMillis();
		
		System.out.println("User array copy takes : " + (nanoTime2 - nanoTime1)
		        + " in ns.");
		System.out.println("User array copy takes : "
		        + (timeMillis2 - timeMillis1) + " in ms");
		
		System.arraycopy(sources, 0, destination, 0, size);
		long nanoTime3 = System.nanoTime();
		long timeMillis3 = System.currentTimeMillis();
		System.out.println("System array copy takes : "
		        + (nanoTime3 - nanoTime2) + " in ns.");
		System.out.println("System array copy takes : "
		        + (timeMillis3 - timeMillis2) + " in ms");
	}
	
	
	public static void getPropertiesTest(){
		Map map = System.getenv();
		System.out.println(map);
		/*
		 * {USERPROFILE=C:\Users\nxcjh,
		 *  ProgramData=C:\ProgramData, 
		 *  PATHEXT=.COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC, 
		 *  JAVA_HOME=D:\ProgramFiles\Java\jdk1.7.0_67, 
		 *  ProgramFiles(x86)=C:\Program Files (x86), 
		 *  TEMP=C:\Users\nxcjh\AppData\Local\Temp, 
		 *  SystemDrive=C:, 
		 *  ProgramFiles=C:\Program Files, 
		 *  Path=D:/ProgramFiles/Java/jdk1.7.0_67/bin/../jre/bin/server;D:/ProgramFiles/Java/jdk1.7.0_67/bin/../jre/bin;D:/ProgramFiles/Java/jdk1.7.0_67/bin/../jre/lib/amd64;D:\ProgramFiles\Git\bin;D:\ProgramFiles\protobuf-2.5.0\src\protobuf.exe;D:\ProgramFiles\adt-bundle-windows-x86_64-20130522\sdk\platform-tools;C:\Program Files (x86)\Common Files\NetSarang;D:\ProgramFiles\scala\bin;D:\ProgramFiles\gradle-2.1\bin;D:\ProgramFiles\apache-maven-3.2.3\bin;D:\ProgramFiles\apache-maven-3.2.3/bin;D:\ProgramFiles\Java\jdk1.7.0_67/bin;C:\Program Files (x86)\NVIDIA Corporation\PhysX\Common;C:\Program Files (x86)\Intel\iCLS Client\;C:\Program Files\Intel\iCLS Client\;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Program Files\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\DAL;C:\Program Files (x86)\Intel\Intel(R) Management Engine Components\IPT;C:\Program Files\Intel\WiFi\bin\;C:\Program Files\Common Files\Intel\WirelessCommon\;D:\ProgramFiles\scala\bin;C:\Program Files\Intel\WiFi\bin\;C:\Program Files\Common Files\Intel\WirelessCommon\;D:\ProgramFiles\eclipse;, 
		 *  HOMEDRIVE=C:, 
		 *  PROCESSOR_REVISION=3c03, 
		 *  USERDOMAIN=cuijh, 
		 *  ALLUSERSPROFILE=C:\ProgramData, 
		 *  ProgramW6432=C:\Program Files, 
		 *  PROCESSOR_IDENTIFIER=Intel64 Family 6 Model 60 Stepping 3, 
		 *  GenuineIntel, SESSIONNAME=Console, 
		 *  TMP=C:\Users\nxcjh\AppData\Local\Temp, 
		 *  CommonProgramFiles=C:\Program Files\Common Files,
		 *   =::=::\, LOGONSERVER=\\CUIJH, 
		 *  PROCESSOR_ARCHITECTURE=AMD64, 
		 *  FP_NO_HOST_CHECK=NO, 
		 *  OS=Windows_NT, 
		 *  HOMEPATH=\Users\nxcjh, 
		 *  PROCESSOR_LEVEL=6, 
		 *  CommonProgramW6432=C:\Program Files\Common Files, 
		 *  LOCALAPPDATA=C:\Users\nxcjh\AppData\Local, 
		 *  COMPUTERNAME=CUIJH,
		 *   windir=C:\Windows, 
		 *   SystemRoot=C:\Windows, 
		 *   NUMBER_OF_PROCESSORS=4, 
		 *   USERNAME=nxcjh, 
		 *   PUBLIC=C:\Users\Public, 
		 *   PSModulePath=C:\Windows\system32\WindowsPowerShell\v1.0\Modules\, 
		 *   CommonProgramFiles(x86)=C:\Program Files (x86)\Common Files, 
		 *   ComSpec=C:\Windows\system32\cmd.exe, 
		 *   APPDATA=C:\Users\nxcjh\AppData\Roaming}
		 */
		
	}
	
	/**
	 * 
	 */
	public static void getProperties(){
		Properties p = System.getProperties();
		System.out.println(p.getProperty("java.version"));
		System.out.println(p.getProperty("java.vendor"));
		System.out.println(p.getProperty("java.home"));
		System.out.println(p.getProperty("java.class.path"));
		System.out.println(p.getProperty("user.name"));
		System.out.println(p.getProperty("user.home"));
	}
	public static void main(String[] args) {
		getProperties();
	}
}
