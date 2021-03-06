// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task/TaskSetFailReqMsg.proto

package com.chuangyou.common.protobuf.pb.task;

public final class TaskSetFailReqProto {
  private TaskSetFailReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TaskSetFailReqMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TaskSetFailReqMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 taskId = 1;</code>
     */
    boolean hasTaskId();
    /**
     * <code>required int32 taskId = 1;</code>
     */
    int getTaskId();
  }
  /**
   * Protobuf type {@code TaskSetFailReqMsg}
   *
   * <pre>
   *任务操作
   * </pre>
   */
  public static final class TaskSetFailReqMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:TaskSetFailReqMsg)
      TaskSetFailReqMsgOrBuilder {
    // Use TaskSetFailReqMsg.newBuilder() to construct.
    private TaskSetFailReqMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private TaskSetFailReqMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final TaskSetFailReqMsg defaultInstance;
    public static TaskSetFailReqMsg getDefaultInstance() {
      return defaultInstance;
    }

    public TaskSetFailReqMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private TaskSetFailReqMsg(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              taskId_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.internal_static_TaskSetFailReqMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.internal_static_TaskSetFailReqMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg.class, com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<TaskSetFailReqMsg> PARSER =
        new com.google.protobuf.AbstractParser<TaskSetFailReqMsg>() {
      public TaskSetFailReqMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TaskSetFailReqMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TaskSetFailReqMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TASKID_FIELD_NUMBER = 1;
    private int taskId_;
    /**
     * <code>required int32 taskId = 1;</code>
     */
    public boolean hasTaskId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 taskId = 1;</code>
     */
    public int getTaskId() {
      return taskId_;
    }

    private void initFields() {
      taskId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTaskId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, taskId_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, taskId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code TaskSetFailReqMsg}
     *
     * <pre>
     *任务操作
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TaskSetFailReqMsg)
        com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.internal_static_TaskSetFailReqMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.internal_static_TaskSetFailReqMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg.class, com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        taskId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.internal_static_TaskSetFailReqMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg build() {
        com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg result = new com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.taskId_ = taskId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg.getDefaultInstance()) return this;
        if (other.hasTaskId()) {
          setTaskId(other.getTaskId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTaskId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.task.TaskSetFailReqProto.TaskSetFailReqMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int taskId_ ;
      /**
       * <code>required int32 taskId = 1;</code>
       */
      public boolean hasTaskId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 taskId = 1;</code>
       */
      public int getTaskId() {
        return taskId_;
      }
      /**
       * <code>required int32 taskId = 1;</code>
       */
      public Builder setTaskId(int value) {
        bitField0_ |= 0x00000001;
        taskId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 taskId = 1;</code>
       */
      public Builder clearTaskId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        taskId_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:TaskSetFailReqMsg)
    }

    static {
      defaultInstance = new TaskSetFailReqMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:TaskSetFailReqMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TaskSetFailReqMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TaskSetFailReqMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034task/TaskSetFailReqMsg.proto\"#\n\021TaskSe" +
      "tFailReqMsg\022\016\n\006taskId\030\001 \002(\005B<\n%com.chuan" +
      "gyou.common.protobuf.pb.taskB\023TaskSetFai" +
      "lReqProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_TaskSetFailReqMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TaskSetFailReqMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_TaskSetFailReqMsg_descriptor,
        new java.lang.String[] { "TaskId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
