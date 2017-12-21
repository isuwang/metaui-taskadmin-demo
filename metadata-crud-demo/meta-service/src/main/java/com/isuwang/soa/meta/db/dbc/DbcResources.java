package com.isuwang.soa.meta.db.dbc;

import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by tangliu on 16-02-18.
 */
@Service
public class DbcResources {

    public static DataSource metadbDataSorce;

    @Resource(name = "meta_dataSource")
    public void setMetadbDataSorce(DataSource dataSource) {
        DbcResources.metadbDataSorce = dataSource;
    }


    public static JedisPool jedisPool;

    @Resource(name = "jedisPool")
    public void setJedisPool(JedisPool jedisPool) {
        DbcResources.jedisPool = jedisPool;
    }
}
