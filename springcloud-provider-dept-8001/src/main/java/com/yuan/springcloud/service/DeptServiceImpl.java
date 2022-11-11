package com.yuan.springcloud.service;

import com.yuan.springcloud.dao.DeptDao;
import com.yuan.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: DeptServiceImpl
 * @Description: TODO
 * @Author: yuan.wang
 * @Date: 2022/11/1-17:31
 * @Version: 1.0
 */
@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
