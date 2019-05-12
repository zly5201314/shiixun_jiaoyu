package com.jk.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <pre>项目名称：shiixun_jiaoyu
 * 类名称：UserSericeApi
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/5/9 19:59
 * 修改人：张利瑶
 * 修改时间：2019/5/9 19:59
 * 修改备注：
 * @version </pre>
 */
public interface UserSericeApi {

    @GetMapping(value = "/hi")
    @ResponseBody
    String hiService(@RequestParam(value = "name") String name);


}
