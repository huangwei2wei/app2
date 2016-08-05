// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: space/SetSpaceCollectionReqMsg.proto

package com.chuangyou.common.protobuf.pb.space;

public final class SetSpaceCollectionReqProto {
  private SetSpaceCollectionReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SetSpaceCollectionReqMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetSpaceCollectionReqMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 op = 1;</code>
     *
     * <pre>
     *1：收藏指定留言  2：取消指定留言的收藏 3：新增留言收藏数量  4:取消全部收藏
     * </pre>
     */
    boolean hasOp();
    /**
     * <code>required int32 op = 1;</code>
     *
     * <pre>
     *1：收藏指定留言  2：取消指定留言的收藏 3：新增留言收藏数量  4:取消全部收藏
     * </pre>
     */
    int getOp();

    /**
     * <code>optional int32 messageId = 2;</code>
     *
     * <pre>
     *留言ID号
     * </pre>
     */
    boolean hasMessageId();
    /**
     * <code>optional int32 messageId = 2;</code>
     *
     * <pre>
     *留言ID号
     * </pre>
     */
    int getMessageId();

    /**
     * <code>optional int32 addCollectionNum = 3;</code>
     *
     * <pre>
     *新增留言收藏数量
     * </pre>
     */
    boolean hasAddCollectionNum();
    /**
     * <code>optional int32 addCollectionNum = 3;</code>
     *
     * <pre>
     *新增留言收藏数量
     * </pre>
     */
    int getAddCollectionNum();
  }
  /**
   * Protobuf type {@code SetSpaceCollectionReqMsg}
   *
   * <pre>
   *设置收藏相关
   * </pre>
   */
  public static final class SetSpaceCollectionReqMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:SetSpaceCollectionReqMsg)
      SetSpaceCollectionReqMsgOrBuilder {
    // Use SetSpaceCollectionReqMsg.newBuilder() to construct.
    private SetSpaceCollectionReqMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SetSpaceCollectionReqMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SetSpaceCollectionReqMsg defaultInstance;
    public static SetSpaceCollectionReqMsg getDefaultInstance() {
      return defaultInstance;
    }

    public SetSpaceCollectionReqMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SetSpaceCollectionReqMsg(
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
              op_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              messageId_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              addCollectionNum_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.internal_static_SetSpaceCollectionReqMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.internal_static_SetSpaceCollectionReqMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg.class, com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<SetSpaceCollectionReqMsg> PARSER =
        new com.google.protobuf.AbstractParser<SetSpaceCollectionReqMsg>() {
      public SetSpaceCollectionReqMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetSpaceCollectionReqMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SetSpaceCollectionReqMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int OP_FIELD_NUMBER = 1;
    private int op_;
    /**
     * <code>required int32 op = 1;</code>
     *
     * <pre>
     *1：收藏指定留言  2：取消指定留言的收藏 3：新增留言收藏数量  4:取消全部收藏
     * </pre>
     */
    public boolean hasOp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 op = 1;</code>
     *
     * <pre>
     *1：收藏指定留言  2：取消指定留言的收藏 3：新增留言收藏数量  4:取消全部收藏
     * </pre>
     */
    public int getOp() {
      return op_;
    }

    public static final int MESSAGEID_FIELD_NUMBER = 2;
    private int messageId_;
    /**
     * <code>optional int32 messageId = 2;</code>
     *
     * <pre>
     *留言ID号
     * </pre>
     */
    public boolean hasMessageId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 messageId = 2;</code>
     *
     * <pre>
     *留言ID号
     * </pre>
     */
    public int getMessageId() {
      return messageId_;
    }

    public static final int ADDCOLLECTIONNUM_FIELD_NUMBER = 3;
    private int addCollectionNum_;
    /**
     * <code>optional int32 addCollectionNum = 3;</code>
     *
     * <pre>
     *新增留言收藏数量
     * </pre>
     */
    public boolean hasAddCollectionNum() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 addCollectionNum = 3;</code>
     *
     * <pre>
     *新增留言收藏数量
     * </pre>
     */
    public int getAddCollectionNum() {
      return addCollectionNum_;
    }

    private void initFields() {
      op_ = 0;
      messageId_ = 0;
      addCollectionNum_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasOp()) {
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
        output.writeInt32(1, op_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, messageId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, addCollectionNum_);
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
          .computeInt32Size(1, op_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, messageId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, addCollectionNum_);
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

    public static com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg prototype) {
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
     * Protobuf type {@code SetSpaceCollectionReqMsg}
     *
     * <pre>
     *设置收藏相关
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetSpaceCollectionReqMsg)
        com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.internal_static_SetSpaceCollectionReqMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.internal_static_SetSpaceCollectionReqMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg.class, com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg.newBuilder()
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
        op_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        messageId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        addCollectionNum_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.internal_static_SetSpaceCollectionReqMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg build() {
        com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg result = new com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.op_ = op_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.messageId_ = messageId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.addCollectionNum_ = addCollectionNum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg.getDefaultInstance()) return this;
        if (other.hasOp()) {
          setOp(other.getOp());
        }
        if (other.hasMessageId()) {
          setMessageId(other.getMessageId());
        }
        if (other.hasAddCollectionNum()) {
          setAddCollectionNum(other.getAddCollectionNum());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasOp()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.space.SetSpaceCollectionReqProto.SetSpaceCollectionReqMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int op_ ;
      /**
       * <code>required int32 op = 1;</code>
       *
       * <pre>
       *1：收藏指定留言  2：取消指定留言的收藏 3：新增留言收藏数量  4:取消全部收藏
       * </pre>
       */
      public boolean hasOp() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 op = 1;</code>
       *
       * <pre>
       *1：收藏指定留言  2：取消指定留言的收藏 3：新增留言收藏数量  4:取消全部收藏
       * </pre>
       */
      public int getOp() {
        return op_;
      }
      /**
       * <code>required int32 op = 1;</code>
       *
       * <pre>
       *1：收藏指定留言  2：取消指定留言的收藏 3：新增留言收藏数量  4:取消全部收藏
       * </pre>
       */
      public Builder setOp(int value) {
        bitField0_ |= 0x00000001;
        op_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 op = 1;</code>
       *
       * <pre>
       *1：收藏指定留言  2：取消指定留言的收藏 3：新增留言收藏数量  4:取消全部收藏
       * </pre>
       */
      public Builder clearOp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        op_ = 0;
        onChanged();
        return this;
      }

      private int messageId_ ;
      /**
       * <code>optional int32 messageId = 2;</code>
       *
       * <pre>
       *留言ID号
       * </pre>
       */
      public boolean hasMessageId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 messageId = 2;</code>
       *
       * <pre>
       *留言ID号
       * </pre>
       */
      public int getMessageId() {
        return messageId_;
      }
      /**
       * <code>optional int32 messageId = 2;</code>
       *
       * <pre>
       *留言ID号
       * </pre>
       */
      public Builder setMessageId(int value) {
        bitField0_ |= 0x00000002;
        messageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 messageId = 2;</code>
       *
       * <pre>
       *留言ID号
       * </pre>
       */
      public Builder clearMessageId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        messageId_ = 0;
        onChanged();
        return this;
      }

      private int addCollectionNum_ ;
      /**
       * <code>optional int32 addCollectionNum = 3;</code>
       *
       * <pre>
       *新增留言收藏数量
       * </pre>
       */
      public boolean hasAddCollectionNum() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 addCollectionNum = 3;</code>
       *
       * <pre>
       *新增留言收藏数量
       * </pre>
       */
      public int getAddCollectionNum() {
        return addCollectionNum_;
      }
      /**
       * <code>optional int32 addCollectionNum = 3;</code>
       *
       * <pre>
       *新增留言收藏数量
       * </pre>
       */
      public Builder setAddCollectionNum(int value) {
        bitField0_ |= 0x00000004;
        addCollectionNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 addCollectionNum = 3;</code>
       *
       * <pre>
       *新增留言收藏数量
       * </pre>
       */
      public Builder clearAddCollectionNum() {
        bitField0_ = (bitField0_ & ~0x00000004);
        addCollectionNum_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:SetSpaceCollectionReqMsg)
    }

    static {
      defaultInstance = new SetSpaceCollectionReqMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:SetSpaceCollectionReqMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetSpaceCollectionReqMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SetSpaceCollectionReqMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$space/SetSpaceCollectionReqMsg.proto\"S" +
      "\n\030SetSpaceCollectionReqMsg\022\n\n\002op\030\001 \002(\005\022\021" +
      "\n\tmessageId\030\002 \001(\005\022\030\n\020addCollectionNum\030\003 " +
      "\001(\005BD\n&com.chuangyou.common.protobuf.pb." +
      "spaceB\032SetSpaceCollectionReqProto"
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
    internal_static_SetSpaceCollectionReqMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetSpaceCollectionReqMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_SetSpaceCollectionReqMsg_descriptor,
        new java.lang.String[] { "Op", "MessageId", "AddCollectionNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
