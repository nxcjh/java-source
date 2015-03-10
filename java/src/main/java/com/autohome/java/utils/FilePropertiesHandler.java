package com.autohome.java.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.util.Date;

/**
 * Java的File类提供了访问文件的属性, 但File提供的功能有限
 * Java7的NIO.2在java.nio.file.attribute包下提供了大量的工具类, 通过这些工具类，
 * 开发者可以非常简单地读取，修改文件属性，这些工具类主要分为以下两类。
 * XxxAttributeView:代表某种文件属性的视图。
 * XxxAttributes:代表某种文件属性的集合，程序一般通过XxxAttributeView对象获取XxxAttributes。
 * 下面只介绍其中两种:
 * 	1. BasicFileAttributeView: 他可以获取或修改文件的基本属性, 包括文件的最后修改时间, 最后访问时间, 创建时间, 大小
 * 		是否为目录, 是否为符号链接等, 它的readAttribute()方法返回一个BasicFileAttributes对象, 对文件夹基本属性的修改
 * 		是通过BasicFileAttributes对象完成.
 * 	2. DosFileAttributeView: 它主要用于获取或修改文件Dos相关属性, 比如文件是否只读, 是否隐藏, 是否是系统文件, 是否是存档文件等.
 * 		它的readAttributes()方法返回一个DosFileAttributes对象对这些属性的修改其实是由DosfileAttributes对象来完成。
 * @author nxcjh
 *
 */
public class FilePropertiesHandler {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/nxcjh/Desktop/方案（存储格式更新为ORC）(1).txt");
		BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		BasicFileAttributes basicfile = basicView.readAttributes();
		System.out.println("创建时间"+new Date(basicfile.creationTime().toMillis()));
		System.out.println("文件大小"+basicfile.size());  
	    DosFileAttributeView dosview=Files.getFileAttributeView(path, DosFileAttributeView.class);  
	        dosview.setHidden(false);  
	        dosview.setReadOnly(false);  
	}
}
