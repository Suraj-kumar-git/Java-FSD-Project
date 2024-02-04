package com.hexaware.lms.service;

import com.hexaware.lms.dto.AdminDTO;

public interface IAdminService {
	boolean login(String username, String password);

	boolean register(AdminDTO adminDto);

}
