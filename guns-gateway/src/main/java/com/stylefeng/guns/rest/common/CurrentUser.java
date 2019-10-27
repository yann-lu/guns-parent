/**
 * Copyright (c) 2019-2019 All Rights Reserved.
 */
package com.stylefeng.guns.rest.common;


/**
 * @author 陆炎
 * @version : CurrentUser.java, v0.1 2019/10/27 陆炎 Exp $$
 */
public class CurrentUser {

    /*尽量存储小一点的数据，只存储用户id*/

    //线程绑定的存储空间
    private static final ThreadLocal<String> threadLocal = new ThreadLocal<>();

    //将用户信息放入存储空间
    public static void saveUserId(String userId){
        threadLocal.set(userId);
    }

    //取出当前用户
    public static String getCurrentUser(){
        return threadLocal.get();
    }
}