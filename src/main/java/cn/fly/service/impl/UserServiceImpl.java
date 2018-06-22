package cn.fly.service.impl;

import cn.fly.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @program: dubbo-service
 * @description:
 * @author: Arctic_Xiong
 * @create: 2018-06-04 20:25
 **/
@Service
public class UserServiceImpl implements UserService{


    @Override
    public String getUserName() {
        return "No." + (int) (Math.random() * 10);
    }
}
