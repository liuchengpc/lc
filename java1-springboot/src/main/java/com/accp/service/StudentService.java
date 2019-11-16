package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Student;
import com.accp.mapper.StudentMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	StudentMapper stuMapper;
	
	public List<Student> find(){
		return stuMapper.selectByExample(null);
	}
	
	public PageInfo<Student> findPage(Integer pageNum,Integer pageSize){
		Page<Student> page = PageHelper.startPage(pageNum, pageSize);
		stuMapper.selectByExample(null);
		return page.toPageInfo();
	}

}
