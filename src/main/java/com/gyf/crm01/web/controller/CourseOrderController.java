package com.gyf.crm01.web.controller;

import com.gyf.crm01.model.CourseOrder;
import com.gyf.crm01.model.PageResult;
import com.gyf.crm01.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("courseorder")
public class CourseOrderController {
    @RequestMapping("list")
    public String list(){
        return  "courseorder/list";
    }

    @Autowired
    ICourseOrderService orderService;


    @RequestMapping("listJson")
    @ResponseBody
    public PageResult<CourseOrder> listJson(){

        return orderService.findPageResult(null,1,10);
    }
}
