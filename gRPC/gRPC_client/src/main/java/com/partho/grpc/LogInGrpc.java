package com.partho.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

public final class LogInGrpc {

  private LogInGrpc() {}

  public static final String SERVICE_NAME = "LogIn";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<User.UserModel,
          User.APIResponse> getSignUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "signUp",
      requestType = User.UserModel.class,
      responseType = User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<User.UserModel,
          User.APIResponse> getSignUpMethod() {
    io.grpc.MethodDescriptor<User.UserModel, User.APIResponse> getSignUpMethod;
    if ((getSignUpMethod = LogInGrpc.getSignUpMethod) == null) {
      synchronized (LogInGrpc.class) {
        if ((getSignUpMethod = LogInGrpc.getSignUpMethod) == null) {
          LogInGrpc.getSignUpMethod = getSignUpMethod =
              io.grpc.MethodDescriptor.<User.UserModel, User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LogIn", "signUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  User.UserModel.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LogInMethodDescriptorSupplier("signUp"))
                  .build();
          }
        }
     }
     return getSignUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<User.LoginRequest,
          User.APIResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = User.LoginRequest.class,
      responseType = User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<User.LoginRequest,
          User.APIResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<User.LoginRequest, User.APIResponse> getLoginMethod;
    if ((getLoginMethod = LogInGrpc.getLoginMethod) == null) {
      synchronized (LogInGrpc.class) {
        if ((getLoginMethod = LogInGrpc.getLoginMethod) == null) {
          LogInGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<User.LoginRequest, User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LogIn", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  User.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LogInMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<User.Empty,
          User.APIResponse> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "logout",
      requestType = User.Empty.class,
      responseType = User.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<User.Empty,
          User.APIResponse> getLogoutMethod() {
    io.grpc.MethodDescriptor<User.Empty, User.APIResponse> getLogoutMethod;
    if ((getLogoutMethod = LogInGrpc.getLogoutMethod) == null) {
      synchronized (LogInGrpc.class) {
        if ((getLogoutMethod = LogInGrpc.getLogoutMethod) == null) {
          LogInGrpc.getLogoutMethod = getLogoutMethod =
              io.grpc.MethodDescriptor.<User.Empty, User.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LogIn", "logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  User.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  User.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new LogInMethodDescriptorSupplier("logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogInStub newStub(io.grpc.Channel channel) {
    return new LogInStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogInBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LogInBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogInFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LogInFutureStub(channel);
  }

  /**
   */
  public static abstract class LogInImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *  define api
     * </pre>
     */
    public void signUp(User.UserModel request,
                       io.grpc.stub.StreamObserver<User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSignUpMethod(), responseObserver);
    }

    /**
     */
    public void login(User.LoginRequest request,
                      io.grpc.stub.StreamObserver<User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void logout(User.Empty request,
                       io.grpc.stub.StreamObserver<User.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSignUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      User.UserModel,
                      User.APIResponse>(
                  this, METHODID_SIGN_UP)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      User.LoginRequest,
                      User.APIResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                      User.Empty,
                      User.APIResponse>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   */
  public static final class LogInStub extends io.grpc.stub.AbstractStub<LogInStub> {
    private LogInStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LogInStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected LogInStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LogInStub(channel, callOptions);
    }

    /**
     * <pre>
     *  define api
     * </pre>
     */
    public void signUp(User.UserModel request,
                       io.grpc.stub.StreamObserver<User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(User.LoginRequest request,
                      io.grpc.stub.StreamObserver<User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(User.Empty request,
                       io.grpc.stub.StreamObserver<User.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LogInBlockingStub extends io.grpc.stub.AbstractStub<LogInBlockingStub> {
    private LogInBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LogInBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected LogInBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LogInBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *  define api
     * </pre>
     */
    public User.APIResponse signUp(User.UserModel request) {
      return blockingUnaryCall(
          getChannel(), getSignUpMethod(), getCallOptions(), request);
    }

    /**
     */
    public User.APIResponse login(User.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public User.APIResponse logout(User.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LogInFutureStub extends io.grpc.stub.AbstractStub<LogInFutureStub> {
    private LogInFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LogInFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected LogInFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LogInFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *  define api
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<User.APIResponse> signUp(
        User.UserModel request) {
      return futureUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<User.APIResponse> login(
        User.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<User.APIResponse> logout(
        User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SIGN_UP = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_LOGOUT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LogInImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogInImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIGN_UP:
          serviceImpl.signUp((User.UserModel) request,
              (io.grpc.stub.StreamObserver<User.APIResponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((User.LoginRequest) request,
              (io.grpc.stub.StreamObserver<User.APIResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((User.Empty) request,
              (io.grpc.stub.StreamObserver<User.APIResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LogInBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogInBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return User.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogIn");
    }
  }

  private static final class LogInFileDescriptorSupplier
      extends LogInBaseDescriptorSupplier {
    LogInFileDescriptorSupplier() {}
  }

  private static final class LogInMethodDescriptorSupplier
      extends LogInBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogInMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LogInGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogInFileDescriptorSupplier())
              .addMethod(getSignUpMethod())
              .addMethod(getLoginMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
