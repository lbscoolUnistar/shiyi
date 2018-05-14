package com.usx.service;

import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by ishan@usx.net.cn on 2018-05-12 20:27:45.
 */
@Service
public class CacheService {

	/***
	 * 测试缓存是否生效
	 * 
	 * @return
	 */
	@Cacheable(value = "myCache", key = "#key")
	public String testCache(String key) {
		System.out.println("第一次调用会会打印此语句-------");
		return "cache test success 123 !!!";
	}
	
	@CachePut(value="myCache",key="#key")// 更新myCache 缓存
	public String updateCache(String key) { 
		System.out.println("更新myCache 缓存-------");
		return "cache test success 1234 !!!";
	} 
}