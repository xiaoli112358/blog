package com.mszlu.blog.dao.dos;

import lombok.Data;

/*do对象(不需要持久化的对象)：  这些字段数据库本身没有，而是sql里面计算出来的一些字段名*/
@Data
public class Archives {
    private Integer year;
    private Integer month;
    private Long count;
}
