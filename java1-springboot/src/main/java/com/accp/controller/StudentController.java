package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Student;
import com.accp.service.StudentService;
import com.github.pagehelper.PageInfo;

@Controller
public class StudentController {

	@Autowired
	StudentService service;
	
	@RequestMapping("/toPage")
	public String toPage() {
		System.out.println("dserberebrerberbetetbo");
		return "page";
	}
	
	@RequestMapping("/findPage")
	@ResponseBody
	public PageInfo<Student> find(Integer pageNum,Integer pageSize) {
		return service.findPage(pageNum, pageSize);
	}
	

	@RequestMapping("/find")
	public String find(Model model) {
		List<Student> list = service.find();
		model.addAttribute("list", list);
		return "abc";
	}
	
	@RequestMapping("/toAdd")
	public String toAdd() {
		return "add";
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public String add(Student stu) {
		return "中文";
	}

}
