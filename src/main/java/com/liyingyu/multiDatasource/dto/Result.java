package com.liyingyu.multiDatasource.dto;

import lombok.*;

/**
 * @author Yingyu Li
 * @create 2018-07-11 16:59
 **/


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Result<T> {

    //请求是否成功
    private boolean success;

    //请求成功时返回的数据封装
    private T data;

    //请求失败时的提示信息
    private String error;

}
