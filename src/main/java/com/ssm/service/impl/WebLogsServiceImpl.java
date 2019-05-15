package com.ssm.service.impl;

import com.ssm.Entity.WebLogs;
import com.ssm.controller.BaseController;
import com.ssm.dao.WebLogsMapper;
import com.ssm.service.WebLogsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("webLogsService")
public class WebLogsServiceImpl implements WebLogsService {
    private final Logger logger = LoggerFactory.getLogger(WebLogsServiceImpl.class);

    @Autowired
    private WebLogsMapper webLogsMapper;

    /**
     * @param webLogs
     * @return
     */
    public Integer addWebLogs(WebLogs webLogs) {
        logger.info(webLogs.toString());
        Integer integer = webLogsMapper.addWebLogs(webLogs);
        return integer;
    }

    /**
     * @return
     */
    public List<WebLogs> findAllUserLog() {
        List<WebLogs> list = webLogsMapper.findAllUserLogs();
        return list;
    }

    /**
     * @param list
     */
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public int addManyWebLogs(List<WebLogs> list)  {
        try {
           // int j =1/0;
            int i = webLogsMapper.addManyWebLogs(list);
        }catch (RuntimeException e){

        }

        return 0;
    }

}
