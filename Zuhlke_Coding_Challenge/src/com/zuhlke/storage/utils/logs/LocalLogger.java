package com.zuhlke.storage.utils.logs;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LocalLogger extends Logger {


    protected LocalLogger(String name) {
        super(name);
        BasicConfigurator.configure();
    }
}
