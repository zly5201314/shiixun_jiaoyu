package com.jk.cntroller;

import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <pre>项目名称：shiixun_jiaoyu
 * 类名称：UserController
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/5/9 19:57
 * 修改人：张利瑶
 * 修改时间：2019/5/9 19:57
 * 修改备注：
 * @version </pre>
 */
@RestController
public class UserController {

    @Autowired
    private UserService userservice;


    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return userservice.hiService( name );
    }
}
