//package com.apidevlop.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import com.apidevlop.helper.FileHelperUpload;
//
//@RestController
//public class FileUploadController {
//	
//	@Autowired
//	private FileHelperUpload fileupload;
//
//	@PostMapping("/upload-file")
//	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file)
//	{
//		/*
//		 * System.out.println(file.getOriginalFilename());
//		 * System.out.println(file.getSize());
//		 * System.out.println(file.getContentType());
//		 * System.out.println(file.getName());
//		 */
//		
//		try {
//			
//			// Validation
//		if(file.isEmpty())
//		{
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request Must Contian file");
//		}
//		
//		//
//		if(!file.getContentType().equals("image/jpeg")) 
//		{
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only jpeg content type file allowed");
//			
//		}
//		
//		
//		// File Upload Code
//		// path - C:\Users\aksha\Downloads\springbootapi\springbootapi\src\main\resources\static
//		
//		
//		boolean f = fileupload.uploadFIle(file);
//		
//		if(f)
//		{
//			// return ResponseEntity.ok("File is Successfully Uploaded");
//			
//			return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/").path(file.getOriginalFilename()).toUriString());
//		}
//		
//		
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong try again");
//	}
//	
//}
//
