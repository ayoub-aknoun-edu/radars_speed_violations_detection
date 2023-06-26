package me.project.immatriculationservice.stubs;

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
    comments = "Source: immatriculation.proto")
public final class ImmatriculationServiceGrpc {

  private ImmatriculationServiceGrpc() {}

  public static final String SERVICE_NAME = "ImmatriculationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest,
      me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse> getGetProprietaireMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProprietaire",
      requestType = me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest.class,
      responseType = me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest,
      me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse> getGetProprietaireMethod() {
    io.grpc.MethodDescriptor<me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest, me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse> getGetProprietaireMethod;
    if ((getGetProprietaireMethod = ImmatriculationServiceGrpc.getGetProprietaireMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getGetProprietaireMethod = ImmatriculationServiceGrpc.getGetProprietaireMethod) == null) {
          ImmatriculationServiceGrpc.getGetProprietaireMethod = getGetProprietaireMethod = 
              io.grpc.MethodDescriptor.<me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest, me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "getProprietaire"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("getProprietaire"))
                  .build();
          }
        }
     }
     return getGetProprietaireMethod;
  }

  private static volatile io.grpc.MethodDescriptor<me.project.immatriculationservice.stubs.Immatriculation.VehiculeRequest,
      me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse> getGetVehiculeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehicule",
      requestType = me.project.immatriculationservice.stubs.Immatriculation.VehiculeRequest.class,
      responseType = me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<me.project.immatriculationservice.stubs.Immatriculation.VehiculeRequest,
      me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse> getGetVehiculeMethod() {
    io.grpc.MethodDescriptor<me.project.immatriculationservice.stubs.Immatriculation.VehiculeRequest, me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse> getGetVehiculeMethod;
    if ((getGetVehiculeMethod = ImmatriculationServiceGrpc.getGetVehiculeMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getGetVehiculeMethod = ImmatriculationServiceGrpc.getGetVehiculeMethod) == null) {
          ImmatriculationServiceGrpc.getGetVehiculeMethod = getGetVehiculeMethod = 
              io.grpc.MethodDescriptor.<me.project.immatriculationservice.stubs.Immatriculation.VehiculeRequest, me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "getVehicule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.project.immatriculationservice.stubs.Immatriculation.VehiculeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("getVehicule"))
                  .build();
          }
        }
     }
     return getGetVehiculeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest,
      me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse> getGetVehiculesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVehicules",
      requestType = me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest.class,
      responseType = me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest,
      me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse> getGetVehiculesMethod() {
    io.grpc.MethodDescriptor<me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest, me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse> getGetVehiculesMethod;
    if ((getGetVehiculesMethod = ImmatriculationServiceGrpc.getGetVehiculesMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getGetVehiculesMethod = ImmatriculationServiceGrpc.getGetVehiculesMethod) == null) {
          ImmatriculationServiceGrpc.getGetVehiculesMethod = getGetVehiculesMethod = 
              io.grpc.MethodDescriptor.<me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest, me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "getVehicules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("getVehicules"))
                  .build();
          }
        }
     }
     return getGetVehiculesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse> getGetProprietairesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProprietaires",
      requestType = com.google.protobuf.Empty.class,
      responseType = me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse> getGetProprietairesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse> getGetProprietairesMethod;
    if ((getGetProprietairesMethod = ImmatriculationServiceGrpc.getGetProprietairesMethod) == null) {
      synchronized (ImmatriculationServiceGrpc.class) {
        if ((getGetProprietairesMethod = ImmatriculationServiceGrpc.getGetProprietairesMethod) == null) {
          ImmatriculationServiceGrpc.getGetProprietairesMethod = getGetProprietairesMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "ImmatriculationService", "getProprietaires"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ImmatriculationServiceMethodDescriptorSupplier("getProprietaires"))
                  .build();
          }
        }
     }
     return getGetProprietairesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImmatriculationServiceStub newStub(io.grpc.Channel channel) {
    return new ImmatriculationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImmatriculationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ImmatriculationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImmatriculationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ImmatriculationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ImmatriculationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProprietaire(me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest request,
        io.grpc.stub.StreamObserver<me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietaireMethod(), responseObserver);
    }

    /**
     */
    public void getVehicule(me.project.immatriculationservice.stubs.Immatriculation.VehiculeRequest request,
        io.grpc.stub.StreamObserver<me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiculeMethod(), responseObserver);
    }

    /**
     */
    public void getVehicules(me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest request,
        io.grpc.stub.StreamObserver<me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVehiculesMethod(), responseObserver);
    }

    /**
     */
    public void getProprietaires(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProprietairesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetProprietaireMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest,
                me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse>(
                  this, METHODID_GET_PROPRIETAIRE)))
          .addMethod(
            getGetVehiculeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                me.project.immatriculationservice.stubs.Immatriculation.VehiculeRequest,
                me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse>(
                  this, METHODID_GET_VEHICULE)))
          .addMethod(
            getGetVehiculesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest,
                me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse>(
                  this, METHODID_GET_VEHICULES)))
          .addMethod(
            getGetProprietairesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse>(
                  this, METHODID_GET_PROPRIETAIRES)))
          .build();
    }
  }

  /**
   */
  public static final class ImmatriculationServiceStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceStub> {
    private ImmatriculationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProprietaire(me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest request,
        io.grpc.stub.StreamObserver<me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProprietaireMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVehicule(me.project.immatriculationservice.stubs.Immatriculation.VehiculeRequest request,
        io.grpc.stub.StreamObserver<me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVehiculeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVehicules(me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest request,
        io.grpc.stub.StreamObserver<me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetVehiculesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProprietaires(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetProprietairesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ImmatriculationServiceBlockingStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceBlockingStub> {
    private ImmatriculationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse getProprietaire(me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetProprietaireMethod(), getCallOptions(), request);
    }

    /**
     */
    public me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse getVehicule(me.project.immatriculationservice.stubs.Immatriculation.VehiculeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVehiculeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse> getVehicules(
        me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetVehiculesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse> getProprietaires(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetProprietairesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ImmatriculationServiceFutureStub extends io.grpc.stub.AbstractStub<ImmatriculationServiceFutureStub> {
    private ImmatriculationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ImmatriculationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImmatriculationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ImmatriculationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse> getProprietaire(
        me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProprietaireMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse> getVehicule(
        me.project.immatriculationservice.stubs.Immatriculation.VehiculeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVehiculeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROPRIETAIRE = 0;
  private static final int METHODID_GET_VEHICULE = 1;
  private static final int METHODID_GET_VEHICULES = 2;
  private static final int METHODID_GET_PROPRIETAIRES = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ImmatriculationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ImmatriculationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROPRIETAIRE:
          serviceImpl.getProprietaire((me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest) request,
              (io.grpc.stub.StreamObserver<me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse>) responseObserver);
          break;
        case METHODID_GET_VEHICULE:
          serviceImpl.getVehicule((me.project.immatriculationservice.stubs.Immatriculation.VehiculeRequest) request,
              (io.grpc.stub.StreamObserver<me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse>) responseObserver);
          break;
        case METHODID_GET_VEHICULES:
          serviceImpl.getVehicules((me.project.immatriculationservice.stubs.Immatriculation.PropreitaireRequest) request,
              (io.grpc.stub.StreamObserver<me.project.immatriculationservice.stubs.Immatriculation.VehiculeResponse>) responseObserver);
          break;
        case METHODID_GET_PROPRIETAIRES:
          serviceImpl.getProprietaires((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<me.project.immatriculationservice.stubs.Immatriculation.ProprietaireResponse>) responseObserver);
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

  private static abstract class ImmatriculationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImmatriculationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return me.project.immatriculationservice.stubs.Immatriculation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ImmatriculationService");
    }
  }

  private static final class ImmatriculationServiceFileDescriptorSupplier
      extends ImmatriculationServiceBaseDescriptorSupplier {
    ImmatriculationServiceFileDescriptorSupplier() {}
  }

  private static final class ImmatriculationServiceMethodDescriptorSupplier
      extends ImmatriculationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ImmatriculationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ImmatriculationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImmatriculationServiceFileDescriptorSupplier())
              .addMethod(getGetProprietaireMethod())
              .addMethod(getGetVehiculeMethod())
              .addMethod(getGetVehiculesMethod())
              .addMethod(getGetProprietairesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
