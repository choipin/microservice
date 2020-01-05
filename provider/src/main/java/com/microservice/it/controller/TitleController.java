package com.microservice.it.controller;

import com.microservice.it.entity.PageParam;
import com.microservice.it.entity.PageVO;
import com.microservice.it.entity.Title;
import com.microservice.it.service.TitleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description:
 * @project: microservice
 * @date: 2020/1/5
 * @author: Wenxin
 * @version: 1.0
 */
@RestController
@Api
@Slf4j
public class TitleController {

    @Autowired
    private TitleService titleService;

    @ApiOperation("按id查询")
    @GetMapping("/provider/title/{id}")
    public Title getTitleById(@PathVariable("id")Long id){
        return titleService.getTitleById(id);
    }

    @ApiOperation("按id删除")
    @DeleteMapping("/provider/title/{id}")
    public void deleteTitleById(@PathVariable("id")Long id){
         titleService.deleteTitleById(id);
    }

    @ApiOperation("分页查询")
    @PatchMapping("/provider/title")
    public PageVO<Title> getTitleBypage(@RequestBody PageParam pageParam){
        return titleService.queryTitlePage(pageParam);
    }

    @ApiOperation("插入")
    @PostMapping("/provider/title")
    public void insertTitle(@RequestBody Title title){
         titleService.insertTitle(title);
    }

    @ApiOperation("更新")
    @PutMapping("/provider/title")
    public void updateTitle(@RequestBody Title title){
        titleService.updateTitle(title);
    }
}
