package com.mall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zjt
 * @email zjintao12581@gmail.com
 * @date 2021-04-15 11:32:34
 */
@Data
@TableName("undo_log")
public class UndoLogEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId
    private Long id;
    /**
     *
     */
    private Long branchId;
    /**
     *
     */
    private String xid;
    /**
     *
     */
    private String context;
    /**
     *
     */
    private byte[] rollbackInfo;
    /**
     *
     */
    private Integer logStatus;
    /**
     *
     */
    private Date logCreated;
    /**
     *
     */
    private Date logModified;
    /**
     *
     */
    private String ext;

}
