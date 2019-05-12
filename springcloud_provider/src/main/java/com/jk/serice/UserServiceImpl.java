package com.jk.serice;

import com.jk.service.UserSericeApi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <pre>项目名称：shiixun_jiaoyu
 * 类名称：UserServiceImpl
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/5/9 19:54
 * 修改人：张利瑶
 * 修改时间：2019/5/9 19:54
 * 修改备注：
 * @version </pre>
 */
@Controller
public class UserServiceImpl implements UserSericeApi {

    @GetMapping(value = "/hi")
    @ResponseBody
    public String hiService(@RequestParam(value = "name")String name) {
        return "hi,"+name+",sorry,error!";
    }

}
