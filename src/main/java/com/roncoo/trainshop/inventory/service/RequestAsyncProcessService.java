package com.roncoo.trainshop.inventory.service;

import com.roncoo.trainshop.inventory.request.Request;

/**
 * 请求异步执行的service
 *
 * @author Administrator
 */
public interface RequestAsyncProcessService {

    void process(Request request);

}
