package com.ning.controller;

import com.ning.entity.Company;
import com.ning.service.CompanyService;
import com.zx.dto.ReturnMsg;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 公司实体控制层
 *
 * @author ning
 * @create 2018-06-22 10:13
 **/
@RequestMapping("company")
@Controller
public class CompanyController {

    private static Logger logger = LoggerFactory.getLogger(CompanyController.class);

    @Autowired
    private CompanyService companyService;

    @RequestMapping("list")
    public @ResponseBody
    ReturnMsg getCompanyList(HttpServletRequest request, Integer id){

        ReturnMsg msg = new ReturnMsg();

        List<Company> companyList = companyService.searchList(id);

        msg.setData(companyList);
        msg.setErrorCode(0);

        return msg;
    }

    @RequestMapping("list2")
    public @ResponseBody
    ReturnMsg getCompanyList2(HttpServletRequest request, Integer id){

        ReturnMsg msg = new ReturnMsg();

        List<Company> companyList = companyService.searchList2(id);

        msg.setData(companyList);
        msg.setErrorCode(0);

        return msg;
    }
}