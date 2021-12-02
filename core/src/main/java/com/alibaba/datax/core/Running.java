package com.alibaba.datax.core;

import java.io.File;

/**
 * @author liuweidong03 <liuweidong03@kuaishou.com>
 * Created on 2021-10-11
 */
public class Running {

    private static final String CONF_NAME = "stream2stream.json";

    /**
     * 130604 records/s before.
     */
    public static void main(String[] args) throws Throwable {

        //  mvn -U clean package assembly:assembly -Dmaven.test.skip=true

        String baseDir = new File(System.getProperty("user.dir")).getPath();

        System.out.println("baseDir = " + baseDir);

        System.setProperty("datax.home", baseDir + "/target/datax/datax");

        String conf = System.getProperty("datax.home") + "/job/" + CONF_NAME;

        Engine.main(new String[]{
                "-job", conf,
                "-jobid", String.valueOf(conf.hashCode())
        });
    }
}
