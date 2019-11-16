package com.accp.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file")
public class FileController {

	@RequestMapping("/toPage")
	public String toPage() {
		return "file/page";
	}
	
	/**
	 * form表单文件上传
	 * @param files
	 * @return
	 */
	@RequestMapping("/upload")
	public String upload(MultipartFile [] files) {
		File directory = new File("/Users/ta 	ngyong/upload");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : files) {
				String url = "/Users/tangyong/upload/";
				url = url+"/"+l.getOriginalFilename();
				File f = new File(url);
				l.transferTo(f);
			}
			System.out.println("to成功了");
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/file/toPage";
	}
	
	/**
	 * ajax文件上传
	 * @param files
	 * @return
	 */
	@RequestMapping("/uploadAjax")
	@ResponseBody
	public String uploadAjax(MultipartFile [] files) {
		File directory = new File("/Users/tangyong/upload");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : files) {
				String url = "/Users/tangyong/upload/";
				url = url+"/"+l.getOriginalFilename();
				File f = new File(url);
				l.transferTo(f);
			}
			System.out.println("to成功了");
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
	
	/**
	 * 文件下载
	 * @return
	 */
	@RequestMapping("/download")
	@ResponseBody
	public ResponseEntity<byte []> download(){
		try {
			FileInputStream is = new FileInputStream("/Users/tangyong/upload/QR.jpg");
			byte[] bytes = new byte[is.available()];
			is.read(bytes);
			HttpHeaders headers = new HttpHeaders();
			headers.setContentDispositionFormData("attachment", "qr.jpg");
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			return new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
