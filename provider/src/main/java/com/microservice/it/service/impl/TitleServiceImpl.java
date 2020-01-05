package com.microservice.it.service.impl;

import com.microservice.it.dao.TitleDao;
import com.microservice.it.entity.PageParam;
import com.microservice.it.entity.PageVO;
import com.microservice.it.entity.Title;
import com.microservice.it.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @project: microservice
 * @date: 2020/1/5
 * @author: Wenxin
 * @version: 1.0
 */
@Service
public class TitleServiceImpl implements TitleService {

    @Autowired
    private TitleDao titleDao;
    @Override
    public PageVO<Title> queryTitlePage(PageParam pageParam) {
        return new PageVO<>(titleDao.countTotalTitle(),titleDao.queryTitlePage(pageParam));
    }

    @Override
    public void insertTitle(Title title) {
        titleDao.insertTitle(title);
    }

    @Override
    public void updateTitle(Title title) {
        titleDao.updateTitle(title);
    }

    @Override
    public Title getTitleById(Long empNo) {
        return titleDao.getTitleById(empNo);
    }

    @Override
    public void deleteTitleById(Long empNo) {
        titleDao.deleteTitleById(empNo);
    }
}
