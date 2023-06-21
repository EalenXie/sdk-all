package io.github.ealenxie.armlogi.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


/**
 * @author lanzhi
 * Created on 2023/3/28 15:31
 **/
@Getter
@Setter
public class Page<T> {

    private Integer pageIndex;
    private Integer pageSize;
    private Integer total;
    private List<T> records;
}

