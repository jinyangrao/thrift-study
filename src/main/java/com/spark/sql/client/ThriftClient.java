package com.spark.sql.client;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import rao.thrift.bean.TResult;
import rao.thrift.service.TResultService;

public class ThriftClient {

    public static void main(String[] args) {
        try {

            TTransport tTransport = new TSocket("localhost", 9999);

            tTransport.open();

            TProtocol protocol = new TBinaryProtocol(tTransport);

            TResultService.Client client = new TResultService.Client(protocol);

            TResult result = client.getResponse("001");

            System.out.println(result.toString());

            tTransport.close();


        }catch (TTransportException e) {
            e.printStackTrace();
        }catch (TException e) {
            e.printStackTrace();
        }
    }

}
