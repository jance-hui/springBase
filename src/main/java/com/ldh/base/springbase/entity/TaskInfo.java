package com.ldh.base.springbase.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 任务信息表
 * </p>
 *
 * @author jance-hui
 * @since 2020-06-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TaskInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 任务编号
     */
    private Integer taskNo;

    /**
     * 任务类型[1一次性任务；2每月任务；3每日任务]
     */
    private String taskType;

    /**
     * 任务时间[20200601121010=>2020-06-01 12:10:10]
     */
    private String taskTime;

    /**
     * 指令
     */
    private String instruction;

    /**
     * 状态[1：状态1；2：状态2]
     */
    private String sts;

    /**
     * 创建时间
     */
    private String creatTime;

    /**
     * 备注
     */
    private String filler;


}
