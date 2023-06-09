package com.dao;

import com.dto.request.UserLoginReq;
import com.dto.response.CommonResponse;
import com.dto.response.GeneralResponse;
import com.dto.user.request.CreateNewUserRequest;
import com.dto.user.request.GetCustomerDetailReq;
import com.dto.user.response.CustomerRes;

import java.util.List;

public interface UserDAO {

    /**
     * createNewUser
     *
     * @param createNewUserReq
     * @return
     */
    GeneralResponse createNewUser(CreateNewUserRequest createNewUserReq);

    /**
     * getCustomerDetail
     *
     * @param getCustomerDetailReq
     * @return
     */
    CustomerRes getCustomerDetail(GetCustomerDetailReq getCustomerDetailReq);


    /**
     * getCustomerList
     *
     * @return
     */
    List<CustomerRes> getCustomerList();

    CommonResponse login(UserLoginReq loginReq);
}
