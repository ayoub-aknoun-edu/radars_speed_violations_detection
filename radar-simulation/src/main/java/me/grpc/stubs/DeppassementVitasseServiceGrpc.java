package me.grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: depassementVitasse.proto")
public final class DeppassementVitasseServiceGrpc {

  private DeppassementVitasseServiceGrpc() {}

  public static final String SERVICE_NAME = "DeppassementVitasseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<me.grpc.stubs.DepassementVitasse.DeppassementRequest,
      me.grpc.stubs.DepassementVitasse.deppassementResponse> getDepasseVitsseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "depasseVitsse",
      requestType = me.grpc.stubs.DepassementVitasse.DeppassementRequest.class,
      responseType = me.grpc.stubs.DepassementVitasse.deppassementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<me.grpc.stubs.DepassementVitasse.DeppassementRequest,
      me.grpc.stubs.DepassementVitasse.deppassementResponse> getDepasseVitsseMethod() {
    io.grpc.MethodDescriptor<me.grpc.stubs.DepassementVitasse.DeppassementRequest, me.grpc.stubs.DepassementVitasse.deppassementResponse> getDepasseVitsseMethod;
    if ((getDepasseVitsseMethod = DeppassementVitasseServiceGrpc.getDepasseVitsseMethod) == null) {
      synchronized (DeppassementVitasseServiceGrpc.class) {
        if ((getDepasseVitsseMethod = DeppassementVitasseServiceGrpc.getDepasseVitsseMethod) == null) {
          DeppassementVitasseServiceGrpc.getDepasseVitsseMethod = getDepasseVitsseMethod = 
              io.grpc.MethodDescriptor.<me.grpc.stubs.DepassementVitasse.DeppassementRequest, me.grpc.stubs.DepassementVitasse.deppassementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DeppassementVitasseService", "depasseVitsse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.DepassementVitasse.DeppassementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.DepassementVitasse.deppassementResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DeppassementVitasseServiceMethodDescriptorSupplier("depasseVitsse"))
                  .build();
          }
        }
     }
     return getDepasseVitsseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      me.grpc.stubs.DepassementVitasse.RadarResponse> getGetRadarsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRadars",
      requestType = com.google.protobuf.Empty.class,
      responseType = me.grpc.stubs.DepassementVitasse.RadarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      me.grpc.stubs.DepassementVitasse.RadarResponse> getGetRadarsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, me.grpc.stubs.DepassementVitasse.RadarResponse> getGetRadarsMethod;
    if ((getGetRadarsMethod = DeppassementVitasseServiceGrpc.getGetRadarsMethod) == null) {
      synchronized (DeppassementVitasseServiceGrpc.class) {
        if ((getGetRadarsMethod = DeppassementVitasseServiceGrpc.getGetRadarsMethod) == null) {
          DeppassementVitasseServiceGrpc.getGetRadarsMethod = getGetRadarsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, me.grpc.stubs.DepassementVitasse.RadarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "DeppassementVitasseService", "getRadars"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.grpc.stubs.DepassementVitasse.RadarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DeppassementVitasseServiceMethodDescriptorSupplier("getRadars"))
                  .build();
          }
        }
     }
     return getGetRadarsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeppassementVitasseServiceStub newStub(io.grpc.Channel channel) {
    return new DeppassementVitasseServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeppassementVitasseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeppassementVitasseServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeppassementVitasseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeppassementVitasseServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DeppassementVitasseServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void depasseVitsse(me.grpc.stubs.DepassementVitasse.DeppassementRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.DepassementVitasse.deppassementResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDepasseVitsseMethod(), responseObserver);
    }

    /**
     */
    public void getRadars(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.DepassementVitasse.RadarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRadarsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDepasseVitsseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                me.grpc.stubs.DepassementVitasse.DeppassementRequest,
                me.grpc.stubs.DepassementVitasse.deppassementResponse>(
                  this, METHODID_DEPASSE_VITSSE)))
          .addMethod(
            getGetRadarsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                me.grpc.stubs.DepassementVitasse.RadarResponse>(
                  this, METHODID_GET_RADARS)))
          .build();
    }
  }

  /**
   */
  public static final class DeppassementVitasseServiceStub extends io.grpc.stub.AbstractStub<DeppassementVitasseServiceStub> {
    private DeppassementVitasseServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeppassementVitasseServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeppassementVitasseServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeppassementVitasseServiceStub(channel, callOptions);
    }

    /**
     */
    public void depasseVitsse(me.grpc.stubs.DepassementVitasse.DeppassementRequest request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.DepassementVitasse.deppassementResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDepasseVitsseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRadars(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<me.grpc.stubs.DepassementVitasse.RadarResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetRadarsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeppassementVitasseServiceBlockingStub extends io.grpc.stub.AbstractStub<DeppassementVitasseServiceBlockingStub> {
    private DeppassementVitasseServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeppassementVitasseServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeppassementVitasseServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeppassementVitasseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public me.grpc.stubs.DepassementVitasse.deppassementResponse depasseVitsse(me.grpc.stubs.DepassementVitasse.DeppassementRequest request) {
      return blockingUnaryCall(
          getChannel(), getDepasseVitsseMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<me.grpc.stubs.DepassementVitasse.RadarResponse> getRadars(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetRadarsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeppassementVitasseServiceFutureStub extends io.grpc.stub.AbstractStub<DeppassementVitasseServiceFutureStub> {
    private DeppassementVitasseServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeppassementVitasseServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeppassementVitasseServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeppassementVitasseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<me.grpc.stubs.DepassementVitasse.deppassementResponse> depasseVitsse(
        me.grpc.stubs.DepassementVitasse.DeppassementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDepasseVitsseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEPASSE_VITSSE = 0;
  private static final int METHODID_GET_RADARS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeppassementVitasseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeppassementVitasseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEPASSE_VITSSE:
          serviceImpl.depasseVitsse((me.grpc.stubs.DepassementVitasse.DeppassementRequest) request,
              (io.grpc.stub.StreamObserver<me.grpc.stubs.DepassementVitasse.deppassementResponse>) responseObserver);
          break;
        case METHODID_GET_RADARS:
          serviceImpl.getRadars((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<me.grpc.stubs.DepassementVitasse.RadarResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DeppassementVitasseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeppassementVitasseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return me.grpc.stubs.DepassementVitasse.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeppassementVitasseService");
    }
  }

  private static final class DeppassementVitasseServiceFileDescriptorSupplier
      extends DeppassementVitasseServiceBaseDescriptorSupplier {
    DeppassementVitasseServiceFileDescriptorSupplier() {}
  }

  private static final class DeppassementVitasseServiceMethodDescriptorSupplier
      extends DeppassementVitasseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeppassementVitasseServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DeppassementVitasseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeppassementVitasseServiceFileDescriptorSupplier())
              .addMethod(getDepasseVitsseMethod())
              .addMethod(getGetRadarsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
