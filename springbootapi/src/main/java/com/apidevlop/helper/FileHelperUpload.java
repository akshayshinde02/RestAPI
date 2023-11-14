//package com.apidevlop.helper;
//
//import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
//
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.multipart.MultipartFile;
//
//@Component
//public class FileHelperUpload {
//
//	// public final String UPLOAD_DIR="C:\\Users\\aksha\\Downloads\\springbootapi\\springbootapi\\src\\main\\resources\\static\\image";
//	public final String UPLOAD_DIR = new ClassPathResource("static/image/").getFile().getAbsolutePath();
//	
//	public FileHelperUpload() throws IOException{
//		
//	}
//	
//	public boolean uploadFIle(MultipartFile file) 
//	{
//		boolean f = false;
//		
//		try {
//			
//			// 
//			/*
//			 * InputStream is = file.getInputStream();
//			 * 
//			 * byte data[] = new byte[is.available()];
//			 * 
//			 * is.read(data);
//			 * 
//			 * //write FileOutputStream fos = new
//			 * FileOutputStream(UPLOAD_DIR+"\\"+file.getOriginalFilename());
//			 * fos.write(data);
//			 * 
//			 * fos.flush(); fos.close(); f=true;
//			 */
//			
//			Files.copy(file.getInputStream(), Paths.get(UPLOAD_DIR+"\\"+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
//			f= true;
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		return f;
//	}
//}
