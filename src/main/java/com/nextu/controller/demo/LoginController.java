package com.nextu.controller.demo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nextu.dao.ClientsRegistersMapper;
import com.nextu.model.ClientsRegisters;

@Controller
@RequestMapping("/test_1")
public class LoginController {

		
	@Autowired
	private ClientsRegistersMapper loginMapper;
			
//	访问地址 http://localhost:8080/i/test_1/getList
	@RequestMapping("/getList")
	public ModelAndView getLoginList()
			
	{
		// 确定返回页面
		ModelAndView mav = new ModelAndView("loginResult");

		List <ClientsRegisters> list = new ArrayList<ClientsRegisters>();
		
		//调用mapper 中的方法获取数据库中的数据
		list = loginMapper.selectAll();
				
		//返回json语句
		ObjectMapper objextMapper = new ObjectMapper();
		String result="";
		try {
       //		   转换json
			result = objextMapper.writeValueAsString(list);
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}
		// mav 传递对象 键值对传递
		mav.addObject("result", result);
		return mav;
	}
	
	//访问地址: http://localhost:8080/i/test_1/doLogin?id=1
	// @RequestParam 传参
	
	@RequestMapping("/doLogin")
	public ModelAndView doLogin(@RequestParam (value ="id",required = false)
	  long id
			)
	{
		ModelAndView mav = new ModelAndView ("loginResult");
		//通过主键查询对象
		ClientsRegisters client = loginMapper.selectByPrimaryKey(id); 
		
		//返回json语句
		ObjectMapper objextMapper = new ObjectMapper();
		String result="";
		try {
       //		   转换json
			result = objextMapper.writeValueAsString(client);
		} catch (JsonProcessingException e) {

			e.printStackTrace();
		}
		// mav 传递对象 键值对传递
		mav.addObject("result", result);
		
		return mav;
		
	}

}
