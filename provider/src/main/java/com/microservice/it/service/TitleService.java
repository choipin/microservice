package com.microservice.it.service;

import com.microservice.it.entity.PageParam;
import com.microservice.it.entity.PageVO;
import com.microservice.it.entity.Title;

import java.util.List;

/**
 * @description:
 * @project: microservice
 * @date: 2020/1/5
 * @author: Wenxin
 * @version: 1.0
 */
public interface TitleService {

    PageVO<Title> queryTitlePage(PageParam pageParam);

    void insertTitle(Title title);

    void updateTitle(Title title);

    Title getTitleById(Long empNo);

    void deleteTitleById(Long empNo);
}
