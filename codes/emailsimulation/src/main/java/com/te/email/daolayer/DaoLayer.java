package com.te.email.daolayer;

import com.te.email.dto.UserInfo;

public interface DaoLayer {
		
		boolean validate(UserInfo obj);

		boolean save(UserInfo user);
}
