package com.spark.sql.service;

import org.apache.thrift.TProcessor;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import rao.thrift.service.TResultService;

public class ThriftServer {
    public static void main(String[] args) {
        try {
            TServerTransport serverTransport = new TServerSocket(9999);

            TProcessor processor = new TResultService.Processor<HandleService>(new HandleService());

            TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));

            System.out.println("starting the simple server...");

            server.serve();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
