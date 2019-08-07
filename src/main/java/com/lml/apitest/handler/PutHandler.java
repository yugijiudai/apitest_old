package com.lml.apitest.handler;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.lml.apitest.dto.RequestDto;
import com.lml.apitest.enums.MethodEnum;
import com.lml.apitest.util.RestUtil;
import com.lml.apitest.vo.RestVo;

/**
 * @author yugi
 * @apiNote put请求处理器
 * @since 2019-08-06
 */
public class PutHandler implements RequestHandler {

    @Override
    public MethodEnum getMethod() {
        return MethodEnum.PUT;
    }

    @Override
    public RestVo<JSONObject> handleRequest(RequestDto requestDto) {
        JSONObject reqObj = JSONUtil.parseObj(requestDto.getParam());
        return RestUtil.put(requestDto.getUrl(), reqObj, JSONObject.class, requestDto.getHeader());
    }
}
