/*
 * Created on 2004-10-16
 *
 * http://www.open-v.com �ṩ�����ά������
 */
package com.openv.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HelloWorld implements IHelloWorld {
    protected static final Log log = LogFactory.getLog(HelloWorld.class);

    public String getContent(String helloworld) throws Exception {
        log.info(helloworld);
        throw new Exception();
        //return helloworld;
    }
}
