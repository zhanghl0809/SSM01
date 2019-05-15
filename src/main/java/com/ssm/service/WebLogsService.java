package com.ssm.service;

import com.ssm.Entity.WebLogs;

import java.util.List;

public interface WebLogsService {
    /**
     *
     * @param webLogs
     * @return
     */
    Integer addWebLogs(WebLogs webLogs);

    /**
     *
     * @return
     */
    List<WebLogs> findAllUserLog();

    /**
     *
     * @param list
     */
    int addManyWebLogs(List<WebLogs> list) throws Exception;
}
