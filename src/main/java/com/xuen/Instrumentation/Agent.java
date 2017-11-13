package com.xuen.Instrumentation;

import java.lang.instrument.Instrumentation;

public class Agent {


    public static void premain(String args, Instrumentation instrumentation) {
        System.out.println(args);
        instrumentation.addTransformer(new MonitorTransformer());
    }
}


