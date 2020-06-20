package com.ldh.base.springbase.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ldh.base.springbase.entity.TaskInfo;
import com.ldh.base.springbase.service.ITaskInfoService;
import com.ldh.base.springbase.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 任务信息表 前端控制器
 * </p>
 *
 * @author jance-hui
 * @since 2020-06-20
 */
@RestController
@RequestMapping("/springbase/task-info")
public class TaskInfoController {

    @Autowired
    private ITaskInfoService taskInfoService;

    @RequestMapping("/insert")
    public void insert (@RequestBody TaskInfo taskInfo){
        taskInfo.setCreatTime(DateUtils.getNowDate());
        taskInfoService.save(taskInfo);
    }
    @RequestMapping("/getInfo")
    public List<TaskInfo> getInfo (@RequestBody TaskInfo taskInfo){
        return taskInfoService.list(new QueryWrapper<>(taskInfo));
    }
    @RequestMapping("/error")
    public List<TaskInfo> error (TaskInfo taskInfo) throws Exception {
        throw new Exception();
    }
}
