package com.ddy.data.vue.Server.impl;

import com.ddy.data.vue.Server.SearchInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SearchInfoImpl implements SearchInfo {

    /*@Autowired
    SearchDao searchDao;*/

    @Override
    public String getInfo(String name){
        /*return searchDao.get(name);*/
        return null;
    }
}
