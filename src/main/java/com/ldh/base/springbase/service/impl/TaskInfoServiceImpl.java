package com.ldh.base.springbase.service.impl;

import com.ldh.base.springbase.entity.TaskInfo;
import com.ldh.base.springbase.mapper.TaskInfoMapper;
import com.ldh.base.springbase.service.ITaskInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 任务信息表 服务实现类
 * </p>
 *
 * @author jance-hui
 * @since 2020-06-20
 */
@Service
public class TaskInfoServiceImpl extends ServiceImpl<TaskInfoMapper, TaskInfo> implements ITaskInfoService {

}
