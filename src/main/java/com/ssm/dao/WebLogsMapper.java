package com.ssm.dao;

import com.ssm.Entity.WebLogs;

import java.util.List;

public interface WebLogsMapper {

     Integer addWebLogs(WebLogs webLogs);
     List<WebLogs>  findAllUserLogs();
     int addManyWebLogs(List<WebLogs> list);
}
