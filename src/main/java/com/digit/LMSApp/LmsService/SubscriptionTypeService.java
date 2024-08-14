package com.digit.LMSApp.LmsService;

import java.util.List;

import com.digit.LMSApp.Entity.SubscriptionType;
import com.digit.LMSApp.Payload.SubscriptionTypeDto;

public interface SubscriptionTypeService {

	SubscriptionTypeDto addSubscription01(SubscriptionTypeDto stdto);

	List<SubscriptionType> getAll();

}
