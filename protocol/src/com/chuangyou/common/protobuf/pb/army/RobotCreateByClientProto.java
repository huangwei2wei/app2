// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RobotCreateByClientMsg.proto

package com.chuangyou.common.protobuf.pb.army;

public final class RobotCreateByClientProto {
  private RobotCreateByClientProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RobotCreateByClientMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RobotCreateByClientMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int32 robot = 1;</code>
     *
     * <pre>
     *机器人ID
     * </pre>
     */
    java.util.List<java.lang.Integer> getRobotList();
    /**
     * <code>repeated int32 robot = 1;</code>
     *
     * <pre>
     *机器人ID
     * </pre>
     */
    int getRobotCount();
    /**
     * <code>repeated int32 robot = 1;</code>
     *
     * <pre>
     *机器人ID
     * </pre>
     */
    int getRobot(int index);
  }
  /**
   * Protobuf type {@code RobotCreateByClientMsg}
   */
  public static final class RobotCreateByClientMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:RobotCreateByClientMsg)
      RobotCreateByClientMsgOrBuilder {
    // Use RobotCreateByClientMsg.newBuilder() to construct.
    private RobotCreateByClientMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RobotCreateByClientMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RobotCreateByClientMsg defaultInstance;
    public static RobotCreateByClientMsg getDefaultInstance() {
      return defaultInstance;
    }

    public RobotCreateByClientMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RobotCreateByClientMsg(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                robot_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              robot_.add(input.readInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                robot_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                robot_.add(input.readInt32());
              }
              input.popLimit(limit);
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
          robot_ = java.util.Collections.unmodifiableList(robot_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.internal_static_RobotCreateByClientMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.internal_static_RobotCreateByClientMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg.class, com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<RobotCreateByClientMsg> PARSER =
        new com.google.protobuf.AbstractParser<RobotCreateByClientMsg>() {
      public RobotCreateByClientMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RobotCreateByClientMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RobotCreateByClientMsg> getParserForType() {
      return PARSER;
    }

    public static final int ROBOT_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Integer> robot_;
    /**
     * <code>repeated int32 robot = 1;</code>
     *
     * <pre>
     *机器人ID
     * </pre>
     */
    public java.util.List<java.lang.Integer>
        getRobotList() {
      return robot_;
    }
    /**
     * <code>repeated int32 robot = 1;</code>
     *
     * <pre>
     *机器人ID
     * </pre>
     */
    public int getRobotCount() {
      return robot_.size();
    }
    /**
     * <code>repeated int32 robot = 1;</code>
     *
     * <pre>
     *机器人ID
     * </pre>
     */
    public int getRobot(int index) {
      return robot_.get(index);
    }

    private void initFields() {
      robot_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < robot_.size(); i++) {
        output.writeInt32(1, robot_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < robot_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(robot_.get(i));
        }
        size += dataSize;
        size += 1 * getRobotList().size();
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

    public static com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg prototype) {
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
     * Protobuf type {@code RobotCreateByClientMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RobotCreateByClientMsg)
        com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.internal_static_RobotCreateByClientMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.internal_static_RobotCreateByClientMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg.class, com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg.newBuilder()
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
        robot_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.internal_static_RobotCreateByClientMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg build() {
        com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg result = new com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          robot_ = java.util.Collections.unmodifiableList(robot_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.robot_ = robot_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg.getDefaultInstance()) return this;
        if (!other.robot_.isEmpty()) {
          if (robot_.isEmpty()) {
            robot_ = other.robot_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRobotIsMutable();
            robot_.addAll(other.robot_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.army.RobotCreateByClientProto.RobotCreateByClientMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<java.lang.Integer> robot_ = java.util.Collections.emptyList();
      private void ensureRobotIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          robot_ = new java.util.ArrayList<java.lang.Integer>(robot_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 robot = 1;</code>
       *
       * <pre>
       *机器人ID
       * </pre>
       */
      public java.util.List<java.lang.Integer>
          getRobotList() {
        return java.util.Collections.unmodifiableList(robot_);
      }
      /**
       * <code>repeated int32 robot = 1;</code>
       *
       * <pre>
       *机器人ID
       * </pre>
       */
      public int getRobotCount() {
        return robot_.size();
      }
      /**
       * <code>repeated int32 robot = 1;</code>
       *
       * <pre>
       *机器人ID
       * </pre>
       */
      public int getRobot(int index) {
        return robot_.get(index);
      }
      /**
       * <code>repeated int32 robot = 1;</code>
       *
       * <pre>
       *机器人ID
       * </pre>
       */
      public Builder setRobot(
          int index, int value) {
        ensureRobotIsMutable();
        robot_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 robot = 1;</code>
       *
       * <pre>
       *机器人ID
       * </pre>
       */
      public Builder addRobot(int value) {
        ensureRobotIsMutable();
        robot_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 robot = 1;</code>
       *
       * <pre>
       *机器人ID
       * </pre>
       */
      public Builder addAllRobot(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureRobotIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, robot_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 robot = 1;</code>
       *
       * <pre>
       *机器人ID
       * </pre>
       */
      public Builder clearRobot() {
        robot_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:RobotCreateByClientMsg)
    }

    static {
      defaultInstance = new RobotCreateByClientMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:RobotCreateByClientMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RobotCreateByClientMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_RobotCreateByClientMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034RobotCreateByClientMsg.proto\"\'\n\026RobotC" +
      "reateByClientMsg\022\r\n\005robot\030\001 \003(\005BA\n%com.c" +
      "huangyou.common.protobuf.pb.armyB\030RobotC" +
      "reateByClientProto"
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
    internal_static_RobotCreateByClientMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RobotCreateByClientMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_RobotCreateByClientMsg_descriptor,
        new java.lang.String[] { "Robot", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
