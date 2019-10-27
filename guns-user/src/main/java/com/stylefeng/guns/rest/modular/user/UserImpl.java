package com.stylefeng.guns.rest.modular.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.stylefeng.guns.api.user.UserApi;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = UserApi.class)
public class UserImpl implements UserApi{

    @Override
    public boolean login(String username, String password) {
        System.out.println("this is user Service.................." + username + " " + password);
        return true;
    }

}
