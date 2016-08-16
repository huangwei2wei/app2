// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CreateSnareRspMsg.proto

package com.chuangyou.common.protobuf.pb.battle;

public final class CreateSnareRspMsgProto {
  private CreateSnareRspMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CreateSnareRspMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CreateSnareRspMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 livingId = 1;</code>
     *
     * <pre>
     *产生的陷阱ID
     * </pre>
     */
    boolean hasLivingId();
    /**
     * <code>optional int64 livingId = 1;</code>
     *
     * <pre>
     *产生的陷阱ID
     * </pre>
     */
    long getLivingId();

    /**
     * <code>optional int64 createTime = 2;</code>
     *
     * <pre>
     *陷阱产生时间
     * </pre>
     */
    boolean hasCreateTime();
    /**
     * <code>optional int64 createTime = 2;</code>
     *
     * <pre>
     *陷阱产生时间
     * </pre>
     */
    long getCreateTime();

    /**
     * <code>optional .PBVector3 bornPos = 3;</code>
     *
     * <pre>
     *出生点
     * </pre>
     */
    boolean hasBornPos();
    /**
     * <code>optional .PBVector3 bornPos = 3;</code>
     *
     * <pre>
     *出生点
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 getBornPos();
    /**
     * <code>optional .PBVector3 bornPos = 3;</code>
     *
     * <pre>
     *出生点
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder getBornPosOrBuilder();

    /**
     * <code>optional .PBVector3 targetPos = 4;</code>
     *
     * <pre>
     *目标点
     * </pre>
     */
    boolean hasTargetPos();
    /**
     * <code>optional .PBVector3 targetPos = 4;</code>
     *
     * <pre>
     *目标点
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 getTargetPos();
    /**
     * <code>optional .PBVector3 targetPos = 4;</code>
     *
     * <pre>
     *目标点
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder getTargetPosOrBuilder();

    /**
     * <code>optional int64 lockingId = 5;</code>
     *
     * <pre>
     *锁定目标ID
     * </pre>
     */
    boolean hasLockingId();
    /**
     * <code>optional int64 lockingId = 5;</code>
     *
     * <pre>
     *锁定目标ID
     * </pre>
     */
    long getLockingId();
  }
  /**
   * Protobuf type {@code CreateSnareRspMsg}
   */
  public static final class CreateSnareRspMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:CreateSnareRspMsg)
      CreateSnareRspMsgOrBuilder {
    // Use CreateSnareRspMsg.newBuilder() to construct.
    private CreateSnareRspMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CreateSnareRspMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CreateSnareRspMsg defaultInstance;
    public static CreateSnareRspMsg getDefaultInstance() {
      return defaultInstance;
    }

    public CreateSnareRspMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CreateSnareRspMsg(
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
              livingId_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              createTime_ = input.readInt64();
              break;
            }
            case 26: {
              com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = bornPos_.toBuilder();
              }
              bornPos_ = input.readMessage(com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(bornPos_);
                bornPos_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 34: {
              com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) == 0x00000008)) {
                subBuilder = targetPos_.toBuilder();
              }
              targetPos_ = input.readMessage(com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(targetPos_);
                targetPos_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              lockingId_ = input.readInt64();
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
      return com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.internal_static_CreateSnareRspMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.internal_static_CreateSnareRspMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg.class, com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<CreateSnareRspMsg> PARSER =
        new com.google.protobuf.AbstractParser<CreateSnareRspMsg>() {
      public CreateSnareRspMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateSnareRspMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<CreateSnareRspMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int LIVINGID_FIELD_NUMBER = 1;
    private long livingId_;
    /**
     * <code>optional int64 livingId = 1;</code>
     *
     * <pre>
     *产生的陷阱ID
     * </pre>
     */
    public boolean hasLivingId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 livingId = 1;</code>
     *
     * <pre>
     *产生的陷阱ID
     * </pre>
     */
    public long getLivingId() {
      return livingId_;
    }

    public static final int CREATETIME_FIELD_NUMBER = 2;
    private long createTime_;
    /**
     * <code>optional int64 createTime = 2;</code>
     *
     * <pre>
     *陷阱产生时间
     * </pre>
     */
    public boolean hasCreateTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 createTime = 2;</code>
     *
     * <pre>
     *陷阱产生时间
     * </pre>
     */
    public long getCreateTime() {
      return createTime_;
    }

    public static final int BORNPOS_FIELD_NUMBER = 3;
    private com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 bornPos_;
    /**
     * <code>optional .PBVector3 bornPos = 3;</code>
     *
     * <pre>
     *出生点
     * </pre>
     */
    public boolean hasBornPos() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional .PBVector3 bornPos = 3;</code>
     *
     * <pre>
     *出生点
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 getBornPos() {
      return bornPos_;
    }
    /**
     * <code>optional .PBVector3 bornPos = 3;</code>
     *
     * <pre>
     *出生点
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder getBornPosOrBuilder() {
      return bornPos_;
    }

    public static final int TARGETPOS_FIELD_NUMBER = 4;
    private com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 targetPos_;
    /**
     * <code>optional .PBVector3 targetPos = 4;</code>
     *
     * <pre>
     *目标点
     * </pre>
     */
    public boolean hasTargetPos() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional .PBVector3 targetPos = 4;</code>
     *
     * <pre>
     *目标点
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 getTargetPos() {
      return targetPos_;
    }
    /**
     * <code>optional .PBVector3 targetPos = 4;</code>
     *
     * <pre>
     *目标点
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder getTargetPosOrBuilder() {
      return targetPos_;
    }

    public static final int LOCKINGID_FIELD_NUMBER = 5;
    private long lockingId_;
    /**
     * <code>optional int64 lockingId = 5;</code>
     *
     * <pre>
     *锁定目标ID
     * </pre>
     */
    public boolean hasLockingId() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int64 lockingId = 5;</code>
     *
     * <pre>
     *锁定目标ID
     * </pre>
     */
    public long getLockingId() {
      return lockingId_;
    }

    private void initFields() {
      livingId_ = 0L;
      createTime_ = 0L;
      bornPos_ = com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.getDefaultInstance();
      targetPos_ = com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.getDefaultInstance();
      lockingId_ = 0L;
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
        output.writeInt64(1, livingId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, createTime_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, bornPos_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, targetPos_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt64(5, lockingId_);
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
          .computeInt64Size(1, livingId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, createTime_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, bornPos_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, targetPos_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, lockingId_);
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

    public static com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg prototype) {
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
     * Protobuf type {@code CreateSnareRspMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CreateSnareRspMsg)
        com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.internal_static_CreateSnareRspMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.internal_static_CreateSnareRspMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg.class, com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg.newBuilder()
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
          getBornPosFieldBuilder();
          getTargetPosFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        livingId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        createTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (bornPosBuilder_ == null) {
          bornPos_ = com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.getDefaultInstance();
        } else {
          bornPosBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (targetPosBuilder_ == null) {
          targetPos_ = com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.getDefaultInstance();
        } else {
          targetPosBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        lockingId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.internal_static_CreateSnareRspMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg build() {
        com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg result = new com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.livingId_ = livingId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.createTime_ = createTime_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (bornPosBuilder_ == null) {
          result.bornPos_ = bornPos_;
        } else {
          result.bornPos_ = bornPosBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (targetPosBuilder_ == null) {
          result.targetPos_ = targetPos_;
        } else {
          result.targetPos_ = targetPosBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.lockingId_ = lockingId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg.getDefaultInstance()) return this;
        if (other.hasLivingId()) {
          setLivingId(other.getLivingId());
        }
        if (other.hasCreateTime()) {
          setCreateTime(other.getCreateTime());
        }
        if (other.hasBornPos()) {
          mergeBornPos(other.getBornPos());
        }
        if (other.hasTargetPos()) {
          mergeTargetPos(other.getTargetPos());
        }
        if (other.hasLockingId()) {
          setLockingId(other.getLockingId());
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
        com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.battle.CreateSnareRspMsgProto.CreateSnareRspMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long livingId_ ;
      /**
       * <code>optional int64 livingId = 1;</code>
       *
       * <pre>
       *产生的陷阱ID
       * </pre>
       */
      public boolean hasLivingId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int64 livingId = 1;</code>
       *
       * <pre>
       *产生的陷阱ID
       * </pre>
       */
      public long getLivingId() {
        return livingId_;
      }
      /**
       * <code>optional int64 livingId = 1;</code>
       *
       * <pre>
       *产生的陷阱ID
       * </pre>
       */
      public Builder setLivingId(long value) {
        bitField0_ |= 0x00000001;
        livingId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 livingId = 1;</code>
       *
       * <pre>
       *产生的陷阱ID
       * </pre>
       */
      public Builder clearLivingId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        livingId_ = 0L;
        onChanged();
        return this;
      }

      private long createTime_ ;
      /**
       * <code>optional int64 createTime = 2;</code>
       *
       * <pre>
       *陷阱产生时间
       * </pre>
       */
      public boolean hasCreateTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int64 createTime = 2;</code>
       *
       * <pre>
       *陷阱产生时间
       * </pre>
       */
      public long getCreateTime() {
        return createTime_;
      }
      /**
       * <code>optional int64 createTime = 2;</code>
       *
       * <pre>
       *陷阱产生时间
       * </pre>
       */
      public Builder setCreateTime(long value) {
        bitField0_ |= 0x00000002;
        createTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 createTime = 2;</code>
       *
       * <pre>
       *陷阱产生时间
       * </pre>
       */
      public Builder clearCreateTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        createTime_ = 0L;
        onChanged();
        return this;
      }

      private com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 bornPos_ = com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder> bornPosBuilder_;
      /**
       * <code>optional .PBVector3 bornPos = 3;</code>
       *
       * <pre>
       *出生点
       * </pre>
       */
      public boolean hasBornPos() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional .PBVector3 bornPos = 3;</code>
       *
       * <pre>
       *出生点
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 getBornPos() {
        if (bornPosBuilder_ == null) {
          return bornPos_;
        } else {
          return bornPosBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .PBVector3 bornPos = 3;</code>
       *
       * <pre>
       *出生点
       * </pre>
       */
      public Builder setBornPos(com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 value) {
        if (bornPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          bornPos_ = value;
          onChanged();
        } else {
          bornPosBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .PBVector3 bornPos = 3;</code>
       *
       * <pre>
       *出生点
       * </pre>
       */
      public Builder setBornPos(
          com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder builderForValue) {
        if (bornPosBuilder_ == null) {
          bornPos_ = builderForValue.build();
          onChanged();
        } else {
          bornPosBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .PBVector3 bornPos = 3;</code>
       *
       * <pre>
       *出生点
       * </pre>
       */
      public Builder mergeBornPos(com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 value) {
        if (bornPosBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              bornPos_ != com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.getDefaultInstance()) {
            bornPos_ =
              com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.newBuilder(bornPos_).mergeFrom(value).buildPartial();
          } else {
            bornPos_ = value;
          }
          onChanged();
        } else {
          bornPosBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .PBVector3 bornPos = 3;</code>
       *
       * <pre>
       *出生点
       * </pre>
       */
      public Builder clearBornPos() {
        if (bornPosBuilder_ == null) {
          bornPos_ = com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.getDefaultInstance();
          onChanged();
        } else {
          bornPosBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .PBVector3 bornPos = 3;</code>
       *
       * <pre>
       *出生点
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder getBornPosBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getBornPosFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .PBVector3 bornPos = 3;</code>
       *
       * <pre>
       *出生点
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder getBornPosOrBuilder() {
        if (bornPosBuilder_ != null) {
          return bornPosBuilder_.getMessageOrBuilder();
        } else {
          return bornPos_;
        }
      }
      /**
       * <code>optional .PBVector3 bornPos = 3;</code>
       *
       * <pre>
       *出生点
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder> 
          getBornPosFieldBuilder() {
        if (bornPosBuilder_ == null) {
          bornPosBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder>(
                  getBornPos(),
                  getParentForChildren(),
                  isClean());
          bornPos_ = null;
        }
        return bornPosBuilder_;
      }

      private com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 targetPos_ = com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder> targetPosBuilder_;
      /**
       * <code>optional .PBVector3 targetPos = 4;</code>
       *
       * <pre>
       *目标点
       * </pre>
       */
      public boolean hasTargetPos() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional .PBVector3 targetPos = 4;</code>
       *
       * <pre>
       *目标点
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 getTargetPos() {
        if (targetPosBuilder_ == null) {
          return targetPos_;
        } else {
          return targetPosBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .PBVector3 targetPos = 4;</code>
       *
       * <pre>
       *目标点
       * </pre>
       */
      public Builder setTargetPos(com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 value) {
        if (targetPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetPos_ = value;
          onChanged();
        } else {
          targetPosBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .PBVector3 targetPos = 4;</code>
       *
       * <pre>
       *目标点
       * </pre>
       */
      public Builder setTargetPos(
          com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder builderForValue) {
        if (targetPosBuilder_ == null) {
          targetPos_ = builderForValue.build();
          onChanged();
        } else {
          targetPosBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .PBVector3 targetPos = 4;</code>
       *
       * <pre>
       *目标点
       * </pre>
       */
      public Builder mergeTargetPos(com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3 value) {
        if (targetPosBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008) &&
              targetPos_ != com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.getDefaultInstance()) {
            targetPos_ =
              com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.newBuilder(targetPos_).mergeFrom(value).buildPartial();
          } else {
            targetPos_ = value;
          }
          onChanged();
        } else {
          targetPosBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .PBVector3 targetPos = 4;</code>
       *
       * <pre>
       *目标点
       * </pre>
       */
      public Builder clearTargetPos() {
        if (targetPosBuilder_ == null) {
          targetPos_ = com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.getDefaultInstance();
          onChanged();
        } else {
          targetPosBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <code>optional .PBVector3 targetPos = 4;</code>
       *
       * <pre>
       *目标点
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder getTargetPosBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getTargetPosFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .PBVector3 targetPos = 4;</code>
       *
       * <pre>
       *目标点
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder getTargetPosOrBuilder() {
        if (targetPosBuilder_ != null) {
          return targetPosBuilder_.getMessageOrBuilder();
        } else {
          return targetPos_;
        }
      }
      /**
       * <code>optional .PBVector3 targetPos = 4;</code>
       *
       * <pre>
       *目标点
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder> 
          getTargetPosFieldBuilder() {
        if (targetPosBuilder_ == null) {
          targetPosBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3.Builder, com.chuangyou.common.protobuf.pb.Vector3Proto.PBVector3OrBuilder>(
                  getTargetPos(),
                  getParentForChildren(),
                  isClean());
          targetPos_ = null;
        }
        return targetPosBuilder_;
      }

      private long lockingId_ ;
      /**
       * <code>optional int64 lockingId = 5;</code>
       *
       * <pre>
       *锁定目标ID
       * </pre>
       */
      public boolean hasLockingId() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int64 lockingId = 5;</code>
       *
       * <pre>
       *锁定目标ID
       * </pre>
       */
      public long getLockingId() {
        return lockingId_;
      }
      /**
       * <code>optional int64 lockingId = 5;</code>
       *
       * <pre>
       *锁定目标ID
       * </pre>
       */
      public Builder setLockingId(long value) {
        bitField0_ |= 0x00000010;
        lockingId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 lockingId = 5;</code>
       *
       * <pre>
       *锁定目标ID
       * </pre>
       */
      public Builder clearLockingId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        lockingId_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:CreateSnareRspMsg)
    }

    static {
      defaultInstance = new CreateSnareRspMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:CreateSnareRspMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateSnareRspMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_CreateSnareRspMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027CreateSnareRspMsg.proto\032\017PBVector3.pro" +
      "to\"\210\001\n\021CreateSnareRspMsg\022\020\n\010livingId\030\001 \001" +
      "(\003\022\022\n\ncreateTime\030\002 \001(\003\022\033\n\007bornPos\030\003 \001(\0132" +
      "\n.PBVector3\022\035\n\ttargetPos\030\004 \001(\0132\n.PBVecto" +
      "r3\022\021\n\tlockingId\030\005 \001(\003BA\n\'com.chuangyou.c" +
      "ommon.protobuf.pb.battleB\026CreateSnareRsp" +
      "MsgProto"
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
          com.chuangyou.common.protobuf.pb.Vector3Proto.getDescriptor(),
        }, assigner);
    internal_static_CreateSnareRspMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CreateSnareRspMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_CreateSnareRspMsg_descriptor,
        new java.lang.String[] { "LivingId", "CreateTime", "BornPos", "TargetPos", "LockingId", });
    com.chuangyou.common.protobuf.pb.Vector3Proto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
