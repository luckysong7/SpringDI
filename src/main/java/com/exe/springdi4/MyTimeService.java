package com.exe.springdi4;

import java.text.DateFormat;
import java.util.Date;

public class MyTimeService implements TimeService {

	public String getTimeService() {

		//�������
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		//������Ŀ� ���缭 ���� ��¥ �����
		String now = dateFormat.format(new Date());
		
		return now;
	}

}
