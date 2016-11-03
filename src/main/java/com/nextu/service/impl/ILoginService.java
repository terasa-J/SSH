package com.nextu.service.impl;

import java.util.List;

import com.nextu.model.ClientsRegisters;
import com.nextu.service.IService;

public interface ILoginService  extends IService<ClientsRegisters>{

	List<ClientsRegisters> getList();
}
