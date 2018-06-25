package com.ning.service;

import com.ning.entity.Company;

import java.util.List;

/**
 * CompanyService
 *
 * @author ning
 * @create 2018-06-22 10:15
 **/
public interface CompanyService {
    List<Company> searchList(Integer id);

    List<Company> searchList2(Integer id);

}