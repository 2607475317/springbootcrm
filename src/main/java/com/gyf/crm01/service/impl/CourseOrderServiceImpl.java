package com.gyf.crm01.service.impl;

import com.gyf.crm01.mapper.CourseOrderMapper;
import com.gyf.crm01.model.CourseOrder;
import com.gyf.crm01.model.PageResult;
import com.gyf.crm01.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CourseOrderServiceImpl implements ICourseOrderService{

    @Autowired
    CourseOrderMapper orderMapper;

    @Override
    public PageResult<CourseOrder> findPageResult(CourseOrder condition, int page, int pageSize) {

        //定义一个Map-参数先不放在map,后面再处理
        Map<String,Object> params = new HashMap<String,Object>();
        params.put("start",(page - 1) * pageSize);
        params.put("limit",pageSize);

        //定义结果
        PageResult<CourseOrder> result = new PageResult<CourseOrder>();

        result.setCount(orderMapper.findCountByMap(params));
        result.setData(orderMapper.findListByMap(params));
        return result;
    }

    @Override
    public void save(CourseOrder order) {
        orderMapper.insert(order);
    }

    @Override
    public CourseOrder findByOrderId(String order_id) {
        return orderMapper.findByOrderId(order_id);
    }

    @Override
    public void delete(String order_id) {
        orderMapper.deleteByOrderId(order_id);
    }
}
