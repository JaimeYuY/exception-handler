package com.ocean.angel.tool.service.impl;

import com.alibaba.fastjson.JSON;
import com.ocean.angel.tool.common.ResultBean;
import com.ocean.angel.tool.constant.ResultCode;
import com.ocean.angel.tool.exception.BusinessException;
import com.ocean.angel.tool.service.TestService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public ResultBean test(int type) {

        if (1 == type) {
            throw new BusinessException(ResultCode.INTERNAL_SERVER_ERROR);
        } else if (2 == type) {
            int a = 1 / 0;
        } else if (3 == type) {
            Integer[] arr = {1, 2};
            int a = arr[2];
        } else if (4 == type) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            int a = list.get(2);
        } else if (5 == type) {
            String a = "12.5662";
            Integer b = Integer.parseInt(a);
        } else if (6 == type) {
            Map<String, Object> map = null;
            map.size();
        } else if (7 == type) {
            String a = "hello world";
            Map map = JSON.parseObject(a, Map.class);
        } else if (8 == type) {
            List<String> list = null;
            list.contains("a");
        } else if (9 == type) {
            Integer[] arr = new Integer[1];
            arr[0] = 1;
            arr[1] = 2;
        } else {
            int a = 1 + 1;
        }

        return ResultBean.success();
    }
}
