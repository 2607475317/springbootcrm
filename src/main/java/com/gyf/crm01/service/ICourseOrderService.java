package com.gyf.crm01.service;

import com.gyf.crm01.model.CourseOrder;
import com.gyf.crm01.model.PageResult;

public interface ICourseOrderService {
    public PageResult<CourseOrder> findPageResult(CourseOrder condition,int page,int pageSize);

    public void save(CourseOrder order);

    public  CourseOrder findByOrderId(String order_id);
}
