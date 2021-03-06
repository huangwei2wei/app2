// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: task/GetTaskListRespMsg.proto

package com.chuangyou.common.protobuf.pb.task;

public final class GetTaskListRespProto {
  private GetTaskListRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GetTaskListRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetTaskListRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .TaskInfoMsg tasks = 1;</code>
     *
     * <pre>
     *列表
     * </pre>
     */
    java.util.List<com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg> 
        getTasksList();
    /**
     * <code>repeated .TaskInfoMsg tasks = 1;</code>
     *
     * <pre>
     *列表
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg getTasks(int index);
    /**
     * <code>repeated .TaskInfoMsg tasks = 1;</code>
     *
     * <pre>
     *列表
     * </pre>
     */
    int getTasksCount();
    /**
     * <code>repeated .TaskInfoMsg tasks = 1;</code>
     *
     * <pre>
     *列表
     * </pre>
     */
    java.util.List<? extends com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsgOrBuilder> 
        getTasksOrBuilderList();
    /**
     * <code>repeated .TaskInfoMsg tasks = 1;</code>
     *
     * <pre>
     *列表
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsgOrBuilder getTasksOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code GetTaskListRespMsg}
   *
   * <pre>
   *任务列表
   * </pre>
   */
  public static final class GetTaskListRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:GetTaskListRespMsg)
      GetTaskListRespMsgOrBuilder {
    // Use GetTaskListRespMsg.newBuilder() to construct.
    private GetTaskListRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetTaskListRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetTaskListRespMsg defaultInstance;
    public static GetTaskListRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public GetTaskListRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetTaskListRespMsg(
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                tasks_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg>();
                mutable_bitField0_ |= 0x00000001;
              }
              tasks_.add(input.readMessage(com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg.PARSER, extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          tasks_ = java.util.Collections.unmodifiableList(tasks_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.internal_static_GetTaskListRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.internal_static_GetTaskListRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg.class, com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<GetTaskListRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<GetTaskListRespMsg>() {
      public GetTaskListRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetTaskListRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetTaskListRespMsg> getParserForType() {
      return PARSER;
    }

    public static final int TASKS_FIELD_NUMBER = 1;
    private java.util.List<com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg> tasks_;
    /**
     * <code>repeated .TaskInfoMsg tasks = 1;</code>
     *
     * <pre>
     *列表
     * </pre>
     */
    public java.util.List<com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg> getTasksList() {
      return tasks_;
    }
    /**
     * <code>repeated .TaskInfoMsg tasks = 1;</code>
     *
     * <pre>
     *列表
     * </pre>
     */
    public java.util.List<? extends com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsgOrBuilder> 
        getTasksOrBuilderList() {
      return tasks_;
    }
    /**
     * <code>repeated .TaskInfoMsg tasks = 1;</code>
     *
     * <pre>
     *列表
     * </pre>
     */
    public int getTasksCount() {
      return tasks_.size();
    }
    /**
     * <code>repeated .TaskInfoMsg tasks = 1;</code>
     *
     * <pre>
     *列表
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg getTasks(int index) {
      return tasks_.get(index);
    }
    /**
     * <code>repeated .TaskInfoMsg tasks = 1;</code>
     *
     * <pre>
     *列表
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsgOrBuilder getTasksOrBuilder(
        int index) {
      return tasks_.get(index);
    }

    private void initFields() {
      tasks_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getTasksCount(); i++) {
        if (!getTasks(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < tasks_.size(); i++) {
        output.writeMessage(1, tasks_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < tasks_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, tasks_.get(i));
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

    public static com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg prototype) {
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
     * Protobuf type {@code GetTaskListRespMsg}
     *
     * <pre>
     *任务列表
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetTaskListRespMsg)
        com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.internal_static_GetTaskListRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.internal_static_GetTaskListRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg.class, com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg.newBuilder()
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
          getTasksFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        if (tasksBuilder_ == null) {
          tasks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          tasksBuilder_.clear();
        }
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.internal_static_GetTaskListRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg build() {
        com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg result = new com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg(this);
        int from_bitField0_ = bitField0_;
        if (tasksBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            tasks_ = java.util.Collections.unmodifiableList(tasks_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.tasks_ = tasks_;
        } else {
          result.tasks_ = tasksBuilder_.build();
        }
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg.getDefaultInstance()) return this;
        if (tasksBuilder_ == null) {
          if (!other.tasks_.isEmpty()) {
            if (tasks_.isEmpty()) {
              tasks_ = other.tasks_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTasksIsMutable();
              tasks_.addAll(other.tasks_);
            }
            onChanged();
          }
        } else {
          if (!other.tasks_.isEmpty()) {
            if (tasksBuilder_.isEmpty()) {
              tasksBuilder_.dispose();
              tasksBuilder_ = null;
              tasks_ = other.tasks_;
              bitField0_ = (bitField0_ & ~0x00000001);
              tasksBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getTasksFieldBuilder() : null;
            } else {
              tasksBuilder_.addAllMessages(other.tasks_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        for (int i = 0; i < getTasksCount(); i++) {
          if (!getTasks(i).isInitialized()) {
            
            return false;
          }
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.task.GetTaskListRespProto.GetTaskListRespMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg> tasks_ =
        java.util.Collections.emptyList();
      private void ensureTasksIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          tasks_ = new java.util.ArrayList<com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg>(tasks_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg, com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg.Builder, com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsgOrBuilder> tasksBuilder_;

      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg> getTasksList() {
        if (tasksBuilder_ == null) {
          return java.util.Collections.unmodifiableList(tasks_);
        } else {
          return tasksBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public int getTasksCount() {
        if (tasksBuilder_ == null) {
          return tasks_.size();
        } else {
          return tasksBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg getTasks(int index) {
        if (tasksBuilder_ == null) {
          return tasks_.get(index);
        } else {
          return tasksBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public Builder setTasks(
          int index, com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg value) {
        if (tasksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTasksIsMutable();
          tasks_.set(index, value);
          onChanged();
        } else {
          tasksBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public Builder setTasks(
          int index, com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg.Builder builderForValue) {
        if (tasksBuilder_ == null) {
          ensureTasksIsMutable();
          tasks_.set(index, builderForValue.build());
          onChanged();
        } else {
          tasksBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public Builder addTasks(com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg value) {
        if (tasksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTasksIsMutable();
          tasks_.add(value);
          onChanged();
        } else {
          tasksBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public Builder addTasks(
          int index, com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg value) {
        if (tasksBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTasksIsMutable();
          tasks_.add(index, value);
          onChanged();
        } else {
          tasksBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public Builder addTasks(
          com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg.Builder builderForValue) {
        if (tasksBuilder_ == null) {
          ensureTasksIsMutable();
          tasks_.add(builderForValue.build());
          onChanged();
        } else {
          tasksBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public Builder addTasks(
          int index, com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg.Builder builderForValue) {
        if (tasksBuilder_ == null) {
          ensureTasksIsMutable();
          tasks_.add(index, builderForValue.build());
          onChanged();
        } else {
          tasksBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public Builder addAllTasks(
          java.lang.Iterable<? extends com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg> values) {
        if (tasksBuilder_ == null) {
          ensureTasksIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, tasks_);
          onChanged();
        } else {
          tasksBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public Builder clearTasks() {
        if (tasksBuilder_ == null) {
          tasks_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          tasksBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public Builder removeTasks(int index) {
        if (tasksBuilder_ == null) {
          ensureTasksIsMutable();
          tasks_.remove(index);
          onChanged();
        } else {
          tasksBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg.Builder getTasksBuilder(
          int index) {
        return getTasksFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsgOrBuilder getTasksOrBuilder(
          int index) {
        if (tasksBuilder_ == null) {
          return tasks_.get(index);  } else {
          return tasksBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public java.util.List<? extends com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsgOrBuilder> 
           getTasksOrBuilderList() {
        if (tasksBuilder_ != null) {
          return tasksBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(tasks_);
        }
      }
      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg.Builder addTasksBuilder() {
        return getTasksFieldBuilder().addBuilder(
            com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg.Builder addTasksBuilder(
          int index) {
        return getTasksFieldBuilder().addBuilder(
            index, com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg.getDefaultInstance());
      }
      /**
       * <code>repeated .TaskInfoMsg tasks = 1;</code>
       *
       * <pre>
       *列表
       * </pre>
       */
      public java.util.List<com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg.Builder> 
           getTasksBuilderList() {
        return getTasksFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg, com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg.Builder, com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsgOrBuilder> 
          getTasksFieldBuilder() {
        if (tasksBuilder_ == null) {
          tasksBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg, com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsg.Builder, com.chuangyou.common.protobuf.pb.task.TaskInfoProto.TaskInfoMsgOrBuilder>(
                  tasks_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          tasks_ = null;
        }
        return tasksBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:GetTaskListRespMsg)
    }

    static {
      defaultInstance = new GetTaskListRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:GetTaskListRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetTaskListRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GetTaskListRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035task/GetTaskListRespMsg.proto\032\026task/Ta" +
      "skInfoMsg.proto\"1\n\022GetTaskListRespMsg\022\033\n" +
      "\005tasks\030\001 \003(\0132\014.TaskInfoMsgB=\n%com.chuang" +
      "you.common.protobuf.pb.taskB\024GetTaskList" +
      "RespProto"
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
          com.chuangyou.common.protobuf.pb.task.TaskInfoProto.getDescriptor(),
        }, assigner);
    internal_static_GetTaskListRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetTaskListRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_GetTaskListRespMsg_descriptor,
        new java.lang.String[] { "Tasks", });
    com.chuangyou.common.protobuf.pb.task.TaskInfoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
