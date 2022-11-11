package com.yuan.springcloud.dao;

import com.yuan.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: DeptDao
 * @Description: TODO
 * @Author: yuan.wang
 * @Date: 2022/11/1-16:11
 * @Version: 1.0
 */

@Mapper
@Repository
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();

}
