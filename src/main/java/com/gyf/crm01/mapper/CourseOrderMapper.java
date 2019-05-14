package com.gyf.crm01.mapper;

import com.gyf.crm01.model.CourseOrder;

import java.util.List;
import java.util.Map;

public interface CourseOrderMapper {

    /**
     * 返回记录数据
     * @param map
     * @return
     */
    public int findCountByMap(Map<String,Object> map);

    /**
     * 返回数据列表
     * @param map
     * @return
     */
    public List<CourseOrder> findListByMap(Map<String,Object> map);

    public void insert(CourseOrder order);

    public CourseOrder findByOrderId(String order_id);

    public void deleteByOrderId(String order_id);

    public void update(CourseOrder order);
}
