package com.gyf.crm01.web.controller;

import com.gyf.crm01.model.CURDResult;
import com.gyf.crm01.model.CourseOrder;
import com.gyf.crm01.model.PageResult;
import com.gyf.crm01.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

@Controller
@RequestMapping("courseorder")
public class CourseOrderController {
    @RequestMapping("list")
    public String list(){
        return  "courseorder/list";
    }

    @RequestMapping("add")
    public String add(){
        return  "courseorder/add";
    }

    @Autowired
    ICourseOrderService orderService;


    @RequestMapping("listJson")
    @ResponseBody
    public PageResult<CourseOrder> listJson(int page,int limit){
        return orderService.findPageResult(null,page,limit);//limit就是pageSize

    }

    @RequestMapping("save")
    @ResponseBody
    public CURDResult save(CourseOrder order){
        System.out.println(order);
        CURDResult rslt = new CURDResult();
        if(StringUtils.isEmpty(order.getOrder_id())){
            orderService.save(order);
        }else{
            System.out.println("修改");
            orderService.update(order);
        }

        return rslt;
    }

    @RequestMapping("detail")
    public String detail(Model model, String order_id){
        CourseOrder order = orderService.findByOrderId(order_id);
        model.addAttribute("order",order);
        return "courseorder/detail";
    }

    @RequestMapping("edit")
    public String edit(Model model, String order_id){
        CourseOrder order = orderService.findByOrderId(order_id);
        model.addAttribute("order",order);
        return "courseorder/edit";
    }

    @RequestMapping("delete")
    @ResponseBody
    public CURDResult delete(String order_id){
        CURDResult rslt = new CURDResult();
        orderService.delete(order_id);
        return rslt;
    }
}
