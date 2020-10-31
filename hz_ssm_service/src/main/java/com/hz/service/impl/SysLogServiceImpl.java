package com.hz.service.impl;

import com.github.pagehelper.PageHelper;
import com.hz.dao.ISysLogDao;
import com.hz.domain.SysLog;
import com.hz.service.ISysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * @author hz
 * @date 2020/4/10 19:25
 */

@Service
@Transactional
public class  SysLogServiceImpl implements ISysLogService {


    @Autowired
    private ISysLogDao sysLogDao;

    @Override
    public List<SysLog> findAll(Integer pageNum, Integer pageSize) throws Exception{
        PageHelper.startPage(pageNum, pageSize);
        return sysLogDao.findAll(pageNum, pageSize);
    }

    @Override
    public void save(SysLog sysLog) throws Exception {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        sysLog.setId(uuid);
        sysLogDao.save(sysLog);
    }
}
