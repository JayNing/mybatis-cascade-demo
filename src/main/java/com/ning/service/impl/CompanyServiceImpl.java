package com.ning.service.impl;

import com.ning.entity.Boss;
import com.ning.entity.Company;
import com.ning.mapper.CompanyMapper;
import com.ning.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CompanyService实现
 *
 * @author ning
 * @create 2018-06-22 10:15
 **/
@Service("companyService")
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public List<Company> searchList(Integer id) {

        return companyMapper.selectOne(id);
    }

    @Override
    public List<Company> searchList2(Integer id) {
        return companyMapper.selectMethodTwo(id);
    }

}