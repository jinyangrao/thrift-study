namespace java rao.thrift.service

include "TResult.thrift"

typedef TResult.TResult TResult

service TResultService{
    TResult getResponse(1:string code);
}
