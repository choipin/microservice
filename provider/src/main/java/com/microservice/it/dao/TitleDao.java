package com.microservice.it.dao;

import com.microservice.it.entity.PageParam;
import com.microservice.it.entity.Title;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @description:
 * @project: microservice
 * @date: 2020/1/1
 * @author: Wenxin
 * @version: 1.0
 */
@Component
@Mapper
public interface TitleDao {

    List<Title> queryTitlePage(PageParam pageParam);

    Long countTotalTitle();

    void insertTitle(Title title);

    void updateTitle(Title title);

    Title getTitleById(Long empNo);

    void deleteTitleById(Long empNo);
}
