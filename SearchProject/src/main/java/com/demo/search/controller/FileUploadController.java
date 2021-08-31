package com.demo.search.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/image")
	public String showUploadForm() {
		System.out.println("File Upload Cotroller begins");
		return "fileform";
	}

	@RequestMapping(value = "/uploadImage", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") CommonsMultipartFile file, HttpSession s,Model m) {

		System.out.println("File Upload Handler---------- ");
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		System.out.println(file.getStorageDescription());
		System.out.println("--------------");

		byte[] data = file.getBytes();
		String path = s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator
				+ "images" + File.separator + file.getOriginalFilename();
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("File Uploaded");
			m.addAttribute("msg","Uploaded Scuccesfully!!!!");
			m.addAttribute("filename",file.getOriginalFilename());

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Uploading error");
		}

		return "filesuccess";

	}

}
