package com.nextu.service.impl;

import java.util.List;




import org.springframework.stereotype.Service;

import com.nextu.model.ClientsRegisters;



@Service("loginService")
public class LoginService extends BaseService<ClientsRegisters> implements ILoginService {


	
	public List<ClientsRegisters> getList()
	{
		return selectAll();
	}
}
