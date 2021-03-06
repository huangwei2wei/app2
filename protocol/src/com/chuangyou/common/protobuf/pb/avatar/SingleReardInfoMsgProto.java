// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SingleReardInfoMsg.proto

package com.chuangyou.common.protobuf.pb.avatar;

public final class SingleReardInfoMsgProto {
  private SingleReardInfoMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SingleReardInfoMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SingleReardInfoMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 index = 1;</code>
     *
     * <pre>
     *奖励序号
     * </pre>
     */
    boolean hasIndex();
    /**
     * <code>optional int32 index = 1;</code>
     *
     * <pre>
     *奖励序号
     * </pre>
     */
    int getIndex();

    /**
     * <code>optional int32 type = 2;</code>
     *
     * <pre>
     *奖励类型 1 等级提升，2 技能提升 3 秘籍提升 4 失败 5 不能提升，给予奖励
     * </pre>
     */
    boolean hasType();
    /**
     * <code>optional int32 type = 2;</code>
     *
     * <pre>
     *奖励类型 1 等级提升，2 技能提升 3 秘籍提升 4 失败 5 不能提升，给予奖励
     * </pre>
     */
    int getType();

    /**
     * <code>optional int32 param = 3;</code>
     *
     * <pre>
     *额外参数  2,3 提升时，附带技能ID
     * </pre>
     */
    boolean hasParam();
    /**
     * <code>optional int32 param = 3;</code>
     *
     * <pre>
     *额外参数  2,3 提升时，附带技能ID
     * </pre>
     */
    int getParam();
  }
  /**
   * Protobuf type {@code SingleReardInfoMsg}
   */
  public static final class SingleReardInfoMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:SingleReardInfoMsg)
      SingleReardInfoMsgOrBuilder {
    // Use SingleReardInfoMsg.newBuilder() to construct.
    private SingleReardInfoMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SingleReardInfoMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SingleReardInfoMsg defaultInstance;
    public static SingleReardInfoMsg getDefaultInstance() {
      return defaultInstance;
    }

    public SingleReardInfoMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SingleReardInfoMsg(
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
              index_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              type_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
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
      return com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.internal_static_SingleReardInfoMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.internal_static_SingleReardInfoMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg.class, com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<SingleReardInfoMsg> PARSER =
        new com.google.protobuf.AbstractParser<SingleReardInfoMsg>() {
      public SingleReardInfoMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SingleReardInfoMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SingleReardInfoMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int INDEX_FIELD_NUMBER = 1;
    private int index_;
    /**
     * <code>optional int32 index = 1;</code>
     *
     * <pre>
     *奖励序号
     * </pre>
     */
    public boolean hasIndex() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 index = 1;</code>
     *
     * <pre>
     *奖励序号
     * </pre>
     */
    public int getIndex() {
      return index_;
    }

    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    /**
     * <code>optional int32 type = 2;</code>
     *
     * <pre>
     *奖励类型 1 等级提升，2 技能提升 3 秘籍提升 4 失败 5 不能提升，给予奖励
     * </pre>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 type = 2;</code>
     *
     * <pre>
     *奖励类型 1 等级提升，2 技能提升 3 秘籍提升 4 失败 5 不能提升，给予奖励
     * </pre>
     */
    public int getType() {
      return type_;
    }

    public static final int PARAM_FIELD_NUMBER = 3;
    private int param_;
    /**
     * <code>optional int32 param = 3;</code>
     *
     * <pre>
     *额外参数  2,3 提升时，附带技能ID
     * </pre>
     */
    public boolean hasParam() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 param = 3;</code>
     *
     * <pre>
     *额外参数  2,3 提升时，附带技能ID
     * </pre>
     */
    public int getParam() {
      return param_;
    }

    private void initFields() {
      index_ = 0;
      type_ = 0;
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
        output.writeInt32(1, index_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, type_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, param_);
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
          .computeInt32Size(1, index_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, type_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, param_);
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

    public static com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg prototype) {
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
     * Protobuf type {@code SingleReardInfoMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SingleReardInfoMsg)
        com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.internal_static_SingleReardInfoMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.internal_static_SingleReardInfoMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg.class, com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg.newBuilder()
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
        index_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        param_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.internal_static_SingleReardInfoMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg build() {
        com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg result = new com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.index_ = index_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.param_ = param_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg.getDefaultInstance()) return this;
        if (other.hasIndex()) {
          setIndex(other.getIndex());
        }
        if (other.hasType()) {
          setType(other.getType());
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
        com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.avatar.SingleReardInfoMsgProto.SingleReardInfoMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int index_ ;
      /**
       * <code>optional int32 index = 1;</code>
       *
       * <pre>
       *奖励序号
       * </pre>
       */
      public boolean hasIndex() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 index = 1;</code>
       *
       * <pre>
       *奖励序号
       * </pre>
       */
      public int getIndex() {
        return index_;
      }
      /**
       * <code>optional int32 index = 1;</code>
       *
       * <pre>
       *奖励序号
       * </pre>
       */
      public Builder setIndex(int value) {
        bitField0_ |= 0x00000001;
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 index = 1;</code>
       *
       * <pre>
       *奖励序号
       * </pre>
       */
      public Builder clearIndex() {
        bitField0_ = (bitField0_ & ~0x00000001);
        index_ = 0;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <code>optional int32 type = 2;</code>
       *
       * <pre>
       *奖励类型 1 等级提升，2 技能提升 3 秘籍提升 4 失败 5 不能提升，给予奖励
       * </pre>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 type = 2;</code>
       *
       * <pre>
       *奖励类型 1 等级提升，2 技能提升 3 秘籍提升 4 失败 5 不能提升，给予奖励
       * </pre>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>optional int32 type = 2;</code>
       *
       * <pre>
       *奖励类型 1 等级提升，2 技能提升 3 秘籍提升 4 失败 5 不能提升，给予奖励
       * </pre>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000002;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 type = 2;</code>
       *
       * <pre>
       *奖励类型 1 等级提升，2 技能提升 3 秘籍提升 4 失败 5 不能提升，给予奖励
       * </pre>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
        onChanged();
        return this;
      }

      private int param_ ;
      /**
       * <code>optional int32 param = 3;</code>
       *
       * <pre>
       *额外参数  2,3 提升时，附带技能ID
       * </pre>
       */
      public boolean hasParam() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 param = 3;</code>
       *
       * <pre>
       *额外参数  2,3 提升时，附带技能ID
       * </pre>
       */
      public int getParam() {
        return param_;
      }
      /**
       * <code>optional int32 param = 3;</code>
       *
       * <pre>
       *额外参数  2,3 提升时，附带技能ID
       * </pre>
       */
      public Builder setParam(int value) {
        bitField0_ |= 0x00000004;
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 param = 3;</code>
       *
       * <pre>
       *额外参数  2,3 提升时，附带技能ID
       * </pre>
       */
      public Builder clearParam() {
        bitField0_ = (bitField0_ & ~0x00000004);
        param_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:SingleReardInfoMsg)
    }

    static {
      defaultInstance = new SingleReardInfoMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:SingleReardInfoMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SingleReardInfoMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SingleReardInfoMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030SingleReardInfoMsg.proto\"@\n\022SingleRear" +
      "dInfoMsg\022\r\n\005index\030\001 \001(\005\022\014\n\004type\030\002 \001(\005\022\r\n" +
      "\005param\030\003 \001(\005BB\n\'com.chuangyou.common.pro" +
      "tobuf.pb.avatarB\027SingleReardInfoMsgProto"
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
    internal_static_SingleReardInfoMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SingleReardInfoMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_SingleReardInfoMsg_descriptor,
        new java.lang.String[] { "Index", "Type", "Param", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
