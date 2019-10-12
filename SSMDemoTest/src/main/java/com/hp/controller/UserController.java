package com.hp.controller;

import com.hp.domain.User;
import com.hp.framework.annotation.Autowired;
import com.hp.framework.annotation.Controller;
import com.hp.framework.annotation.RequestMapping;
import com.hp.framework.annotation.RequestMethod;
import com.hp.framework.bean.Data;
import com.hp.framework.bean.Param;
import com.hp.framework.bean.View;
import com.hp.service.IUserService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author litianxiang
 */
@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 用户列表
     *
     * @return
     */
    @RequestMapping(value = "/getUserList", method = RequestMethod.GET)
    public View getUserList() {
        List<User> userList = userService.getAllUser();
        return new View("index.jsp").addModel("userList", userList);
    }

    /**
     * 用户详情
     *
     * @param param
     * @return
     */
    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    public Data getUserInfo(Param param) {
        String id = (String) param.getParamMap().get("id");
        User user = userService.GetUserInfoById(Integer.parseInt(id));

        return new Data(user);
    }

    @RequestMapping(value = "/editUser", method = RequestMethod.GET)
    public Data editUser(Param param) {
        String id = (String) param.getParamMap().get("id");
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("age", 911);
        userService.updateUser(Integer.parseInt(id), fieldMap);

        return new Data("Success.");
    }

}
