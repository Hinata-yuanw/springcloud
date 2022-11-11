package com.yuan.springcloud.service;

import com.yuan.springcloud.pojo.Dept;

import java.util.List;

/**
 * @ClassName: DeptService
 * @Description: TODO
 * @Author: yuan.wang
 * @Date: 2022/11/1-17:30
 * @Version: 1.0
 */
public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
