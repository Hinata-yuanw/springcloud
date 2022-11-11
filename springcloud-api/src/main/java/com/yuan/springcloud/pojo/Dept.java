package com.yuan.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName: Dept
 * @Description: TODO
 * @Author: yuan.wang
 * @Date: 2022/10/28-17:46
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private Long deptno;
    private String dname;

    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
