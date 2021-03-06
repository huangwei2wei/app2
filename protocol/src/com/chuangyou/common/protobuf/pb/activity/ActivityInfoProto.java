// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityInfoMsg.proto

package com.chuangyou.common.protobuf.pb.activity;

public final class ActivityInfoProto {
  private ActivityInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ActivityInfoMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityInfoMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 id = 1;</code>
     *
     * <pre>
     *活动ID
     * </pre>
     */
    boolean hasId();
    /**
     * <code>optional int32 id = 1;</code>
     *
     * <pre>
     *活动ID
     * </pre>
     */
    int getId();

    /**
     * <code>optional int32 state = 2;</code>
     *
     * <pre>
     *状态    0:正常状态  1：活动提前结束
     * </pre>
     */
    boolean hasState();
    /**
     * <code>optional int32 state = 2;</code>
     *
     * <pre>
     *状态    0:正常状态  1：活动提前结束
     * </pre>
     */
    int getState();

    /**
     * <code>optional int32 remainTime = 3;</code>
     *
     * <pre>
     *剩余次数
     * </pre>
     */
    boolean hasRemainTime();
    /**
     * <code>optional int32 remainTime = 3;</code>
     *
     * <pre>
     *剩余次数
     * </pre>
     */
    int getRemainTime();

    /**
     * <code>optional int32 param = 4;</code>
     *
     * <pre>
     *预留参数
     * </pre>
     */
    boolean hasParam();
    /**
     * <code>optional int32 param = 4;</code>
     *
     * <pre>
     *预留参数
     * </pre>
     */
    int getParam();
  }
  /**
   * Protobuf type {@code ActivityInfoMsg}
   *
   * <pre>
   *活动详细信息
   * </pre>
   */
  public static final class ActivityInfoMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ActivityInfoMsg)
      ActivityInfoMsgOrBuilder {
    // Use ActivityInfoMsg.newBuilder() to construct.
    private ActivityInfoMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ActivityInfoMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ActivityInfoMsg defaultInstance;
    public static ActivityInfoMsg getDefaultInstance() {
      return defaultInstance;
    }

    public ActivityInfoMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ActivityInfoMsg(
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
              id_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              state_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              remainTime_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              param_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.internal_static_ActivityInfoMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.internal_static_ActivityInfoMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg.class, com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<ActivityInfoMsg> PARSER =
        new com.google.protobuf.AbstractParser<ActivityInfoMsg>() {
      public ActivityInfoMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivityInfoMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityInfoMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>optional int32 id = 1;</code>
     *
     * <pre>
     *活动ID
     * </pre>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 id = 1;</code>
     *
     * <pre>
     *活动ID
     * </pre>
     */
    public int getId() {
      return id_;
    }

    public static final int STATE_FIELD_NUMBER = 2;
    private int state_;
    /**
     * <code>optional int32 state = 2;</code>
     *
     * <pre>
     *状态    0:正常状态  1：活动提前结束
     * </pre>
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 state = 2;</code>
     *
     * <pre>
     *状态    0:正常状态  1：活动提前结束
     * </pre>
     */
    public int getState() {
      return state_;
    }

    public static final int REMAINTIME_FIELD_NUMBER = 3;
    private int remainTime_;
    /**
     * <code>optional int32 remainTime = 3;</code>
     *
     * <pre>
     *剩余次数
     * </pre>
     */
    public boolean hasRemainTime() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 remainTime = 3;</code>
     *
     * <pre>
     *剩余次数
     * </pre>
     */
    public int getRemainTime() {
      return remainTime_;
    }

    public static final int PARAM_FIELD_NUMBER = 4;
    private int param_;
    /**
     * <code>optional int32 param = 4;</code>
     *
     * <pre>
     *预留参数
     * </pre>
     */
    public boolean hasParam() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional int32 param = 4;</code>
     *
     * <pre>
     *预留参数
     * </pre>
     */
    public int getParam() {
      return param_;
    }

    private void initFields() {
      id_ = 0;
      state_ = 0;
      remainTime_ = 0;
      param_ = 0;
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
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, state_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, remainTime_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, param_);
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
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, state_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, remainTime_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, param_);
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

    public static com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg prototype) {
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
     * Protobuf type {@code ActivityInfoMsg}
     *
     * <pre>
     *活动详细信息
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityInfoMsg)
        com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.internal_static_ActivityInfoMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.internal_static_ActivityInfoMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg.class, com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg.newBuilder()
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
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        state_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        remainTime_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        param_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.internal_static_ActivityInfoMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg build() {
        com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg result = new com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.state_ = state_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.remainTime_ = remainTime_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.param_ = param_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasState()) {
          setState(other.getState());
        }
        if (other.hasRemainTime()) {
          setRemainTime(other.getRemainTime());
        }
        if (other.hasParam()) {
          setParam(other.getParam());
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
        com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.activity.ActivityInfoProto.ActivityInfoMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>optional int32 id = 1;</code>
       *
       * <pre>
       *活动ID
       * </pre>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 id = 1;</code>
       *
       * <pre>
       *活动ID
       * </pre>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>optional int32 id = 1;</code>
       *
       * <pre>
       *活动ID
       * </pre>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 id = 1;</code>
       *
       * <pre>
       *活动ID
       * </pre>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private int state_ ;
      /**
       * <code>optional int32 state = 2;</code>
       *
       * <pre>
       *状态    0:正常状态  1：活动提前结束
       * </pre>
       */
      public boolean hasState() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 state = 2;</code>
       *
       * <pre>
       *状态    0:正常状态  1：活动提前结束
       * </pre>
       */
      public int getState() {
        return state_;
      }
      /**
       * <code>optional int32 state = 2;</code>
       *
       * <pre>
       *状态    0:正常状态  1：活动提前结束
       * </pre>
       */
      public Builder setState(int value) {
        bitField0_ |= 0x00000002;
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 state = 2;</code>
       *
       * <pre>
       *状态    0:正常状态  1：活动提前结束
       * </pre>
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000002);
        state_ = 0;
        onChanged();
        return this;
      }

      private int remainTime_ ;
      /**
       * <code>optional int32 remainTime = 3;</code>
       *
       * <pre>
       *剩余次数
       * </pre>
       */
      public boolean hasRemainTime() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 remainTime = 3;</code>
       *
       * <pre>
       *剩余次数
       * </pre>
       */
      public int getRemainTime() {
        return remainTime_;
      }
      /**
       * <code>optional int32 remainTime = 3;</code>
       *
       * <pre>
       *剩余次数
       * </pre>
       */
      public Builder setRemainTime(int value) {
        bitField0_ |= 0x00000004;
        remainTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 remainTime = 3;</code>
       *
       * <pre>
       *剩余次数
       * </pre>
       */
      public Builder clearRemainTime() {
        bitField0_ = (bitField0_ & ~0x00000004);
        remainTime_ = 0;
        onChanged();
        return this;
      }

      private int param_ ;
      /**
       * <code>optional int32 param = 4;</code>
       *
       * <pre>
       *预留参数
       * </pre>
       */
      public boolean hasParam() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional int32 param = 4;</code>
       *
       * <pre>
       *预留参数
       * </pre>
       */
      public int getParam() {
        return param_;
      }
      /**
       * <code>optional int32 param = 4;</code>
       *
       * <pre>
       *预留参数
       * </pre>
       */
      public Builder setParam(int value) {
        bitField0_ |= 0x00000008;
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 param = 4;</code>
       *
       * <pre>
       *预留参数
       * </pre>
       */
      public Builder clearParam() {
        bitField0_ = (bitField0_ & ~0x00000008);
        param_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ActivityInfoMsg)
    }

    static {
      defaultInstance = new ActivityInfoMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ActivityInfoMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityInfoMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ActivityInfoMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ActivityInfoMsg.proto\"O\n\017ActivityInfoM" +
      "sg\022\n\n\002id\030\001 \001(\005\022\r\n\005state\030\002 \001(\005\022\022\n\nremainT" +
      "ime\030\003 \001(\005\022\r\n\005param\030\004 \001(\005B>\n)com.chuangyo" +
      "u.common.protobuf.pb.activityB\021ActivityI" +
      "nfoProto"
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
    internal_static_ActivityInfoMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityInfoMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ActivityInfoMsg_descriptor,
        new java.lang.String[] { "Id", "State", "RemainTime", "Param", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
