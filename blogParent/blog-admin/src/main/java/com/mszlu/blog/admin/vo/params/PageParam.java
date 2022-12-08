package com.mszlu.blog.admin.vo.params;

import lombok.Data;

@Data
public class PageParam {

    private Integer currentPage;//第几页

    private Integer pageSize;//每页显示条数

    private String queryString;//查询条件
}

