package com.digit.LMSApp.LmsServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.LMSApp.Entity.Book;
import com.digit.LMSApp.Entity.SubscriptionType;
import com.digit.LMSApp.LmsService.SubscriptionTypeService;
import com.digit.LMSApp.Payload.BookDto;
import com.digit.LMSApp.Payload.SubscriptionTypeDto;
import com.digit.LMSApp.Repository.SubscriptionTypeRepository;

@Service
public class SubscriptionTypeImpl implements SubscriptionTypeService {
	@Autowired
	SubscriptionTypeRepository strepo;

	@Override
	public SubscriptionTypeDto addSubscription01(SubscriptionTypeDto stdto) {
		// TODO Auto-generated method stub
		SubscriptionType st = new SubscriptionType();
		st.setStype(stdto.getStype());
		st.setMonths(stdto.getMonths());
		st.setScost(stdto.getScost());
		SubscriptionType stt = strepo.save(st);
		SubscriptionTypeDto sresponse = new SubscriptionTypeDto();
		sresponse.setStype(stt.getStype());
		sresponse.setScost(stt.getScost());
		sresponse.setMonths(stt.getMonths());
		return sresponse;

	}

	@Override
	public List<SubscriptionType> getAll() {
		// TODO Auto-generated method stub
		 List<SubscriptionType> findAll = strepo.findAll();
		 
		 return findAll;
		 
		 
	}
	

}
