package com.kuang.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class dept implements Serializable {
    //Dept(实体类) orm mysql->Dept(表) 类表关系映射

    private Long deptno; //主键
    private String dname; //部门名称
//来自哪个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存到多个不同的数据库
    private String db_source;

    public dept(String dname) {
        this.dname = dname;
    }


}
