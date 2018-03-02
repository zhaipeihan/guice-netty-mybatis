package com.doopp.gauss.server;


import com.doopp.gauss.server.netty.ApplicationChannelInboundHandler;
import com.doopp.gauss.server.netty.NettyServer;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class KTApplication {

    public static void main(String[] args) throws Exception {
        String propertiesConfig = args[0];
        Injector injector = Guice.createInjector(new ApplicationModule(propertiesConfig));
        final NettyServer server = injector.getInstance(NettyServer.class);
        server.run();
    }
}
