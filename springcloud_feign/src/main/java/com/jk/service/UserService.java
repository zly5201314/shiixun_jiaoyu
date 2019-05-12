package com.jk.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * <pre>项目名称：shiixun_jiaoyu
 * 类名称：UserService
 * 类描述：
 * 创建人：张利瑶
 * 创建时间：2019/5/9 19:58
 * 修改人：张利瑶
 * 修改时间：2019/5/9 19:58
 * 修改备注：
 * @version </pre>
 */
@FeignClient(value = "SERVICE-PROVIDER")
public interface UserService extends UserSericeApi {
}
