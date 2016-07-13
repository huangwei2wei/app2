// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BufferMsg.proto

package com.chuangyou.common.protobuf.pb.battle;

public final class BufferMsgProto {
  private BufferMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BufferMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BufferMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 option = 1;</code>
     *
     * <pre>
     *操作类型  4 删除，其他增加或者修改
     * </pre>
     */
    boolean hasOption();
    /**
     * <code>optional int32 option = 1;</code>
     *
     * <pre>
     *操作类型  4 删除，其他增加或者修改
     * </pre>
     */
    int getOption();

    /**
     * <code>optional int64 bufferId = 2;</code>
     *
     * <pre>
     *buffer唯一ID
     * </pre>
     */
    boolean hasBufferId();
    /**
     * <code>optional int64 bufferId = 2;</code>
     *
     * <pre>
     *buffer唯一ID
     * </pre>
     */
    long getBufferId();

    /**
     * <code>optional int64 sourceId = 3;</code>
     *
     * <pre>
     *buffer源ID
     * </pre>
     */
    boolean hasSourceId();
    /**
     * <code>optional int64 sourceId = 3;</code>
     *
     * <pre>
     *buffer源ID
     * </pre>
     */
    long getSourceId();

    /**
     * <code>optional string sourcename = 4;</code>
     *
     * <pre>
     *buffer来源名
     * </pre>
     */
    boolean hasSourcename();
    /**
     * <code>optional string sourcename = 4;</code>
     *
     * <pre>
     *buffer来源名
     * </pre>
     */
    java.lang.String getSourcename();
    /**
     * <code>optional string sourcename = 4;</code>
     *
     * <pre>
     *buffer来源名
     * </pre>
     */
    com.google.protobuf.ByteString
        getSourcenameBytes();

    /**
     * <code>optional int32 templateId = 5;</code>
     *
     * <pre>
     *模板ID
     * </pre>
     */
    boolean hasTemplateId();
    /**
     * <code>optional int32 templateId = 5;</code>
     *
     * <pre>
     *模板ID
     * </pre>
     */
    int getTemplateId();

    /**
     * <code>optional int64 aliveTime = 6;</code>
     *
     * <pre>
     *截止时间
     * </pre>
     */
    boolean hasAliveTime();
    /**
     * <code>optional int64 aliveTime = 6;</code>
     *
     * <pre>
     *截止时间
     * </pre>
     */
    long getAliveTime();

    /**
     * <code>optional int32 leftCount = 7;</code>
     *
     * <pre>
     *剩余次数
     * </pre>
     */
    boolean hasLeftCount();
    /**
     * <code>optional int32 leftCount = 7;</code>
     *
     * <pre>
     *剩余次数
     * </pre>
     */
    int getLeftCount();

    /**
     * <code>optional int64 targetId = 8;</code>
     *
     * <pre>
     *目标id
     * </pre>
     */
    boolean hasTargetId();
    /**
     * <code>optional int64 targetId = 8;</code>
     *
     * <pre>
     *目标id
     * </pre>
     */
    long getTargetId();
  }
  /**
   * Protobuf type {@code BufferMsg}
   *
   * <pre>
   *变更用户当前某个buffer
   * </pre>
   */
  public static final class BufferMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:BufferMsg)
      BufferMsgOrBuilder {
    // Use BufferMsg.newBuilder() to construct.
    private BufferMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private BufferMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final BufferMsg defaultInstance;
    public static BufferMsg getDefaultInstance() {
      return defaultInstance;
    }

    public BufferMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private BufferMsg(
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
              option_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              bufferId_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              sourceId_ = input.readInt64();
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              sourcename_ = bs;
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              templateId_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              aliveTime_ = input.readInt64();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              leftCount_ = input.readInt32();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              targetId_ = input.readInt64();
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
      return com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.internal_static_BufferMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.internal_static_BufferMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg.class, com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<BufferMsg> PARSER =
        new com.google.protobuf.AbstractParser<BufferMsg>() {
      public BufferMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BufferMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<BufferMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int OPTION_FIELD_NUMBER = 1;
    private int option_;
    /**
     * <code>optional int32 option = 1;</code>
     *
     * <pre>
     *操作类型  4 删除，其他增加或者修改
     * </pre>
     */
    public boolean hasOption() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 option = 1;</code>
     *
     * <pre>
     *操作类型  4 删除，其他增加或者修改
     * </pre>
     */
    public int getOption() {
      return option_;
    }

    public static final int BUFFERID_FIELD_NUMBER = 2;
    private long bufferId_;
    /**
     * <code>optional int64 bufferId = 2;</code>
     *
     * <pre>
     *buffer唯一ID
     * </pre>
     */
    public boolean hasBufferId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 bufferId = 2;</code>
     *
     * <pre>
     *buffer唯一ID
     * </pre>
     */
    public long getBufferId() {
      return bufferId_;
    }

    public static final int SOURCEID_FIELD_NUMBER = 3;
    private long sourceId_;
    /**
     * <code>optional int64 sourceId = 3;</code>
     *
     * <pre>
     *buffer源ID
     * </pre>
     */
    public boolean hasSourceId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int64 sourceId = 3;</code>
     *
     * <pre>
     *buffer源ID
     * </pre>
     */
    public long getSourceId() {
      return sourceId_;
    }

    public static final int SOURCENAME_FIELD_NUMBER = 4;
    private java.lang.Object sourcename_;
    /**
     * <code>optional string sourcename = 4;</code>
     *
     * <pre>
     *buffer来源名
     * </pre>
     */
    public boolean hasSourcename() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string sourcename = 4;</code>
     *
     * <pre>
     *buffer来源名
     * </pre>
     */
    public java.lang.String getSourcename() {
      java.lang.Object ref = sourcename_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          sourcename_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string sourcename = 4;</code>
     *
     * <pre>
     *buffer来源名
     * </pre>
     */
    public com.google.protobuf.ByteString
        getSourcenameBytes() {
      java.lang.Object ref = sourcename_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sourcename_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TEMPLATEID_FIELD_NUMBER = 5;
    private int templateId_;
    /**
     * <code>optional int32 templateId = 5;</code>
     *
     * <pre>
     *模板ID
     * </pre>
     */
    public boolean hasTemplateId() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int32 templateId = 5;</code>
     *
     * <pre>
     *模板ID
     * </pre>
     */
    public int getTemplateId() {
      return templateId_;
    }

    public static final int ALIVETIME_FIELD_NUMBER = 6;
    private long aliveTime_;
    /**
     * <code>optional int64 aliveTime = 6;</code>
     *
     * <pre>
     *截止时间
     * </pre>
     */
    public boolean hasAliveTime() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional int64 aliveTime = 6;</code>
     *
     * <pre>
     *截止时间
     * </pre>
     */
    public long getAliveTime() {
      return aliveTime_;
    }

    public static final int LEFTCOUNT_FIELD_NUMBER = 7;
    private int leftCount_;
    /**
     * <code>optional int32 leftCount = 7;</code>
     *
     * <pre>
     *剩余次数
     * </pre>
     */
    public boolean hasLeftCount() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    /**
     * <code>optional int32 leftCount = 7;</code>
     *
     * <pre>
     *剩余次数
     * </pre>
     */
    public int getLeftCount() {
      return leftCount_;
    }

    public static final int TARGETID_FIELD_NUMBER = 8;
    private long targetId_;
    /**
     * <code>optional int64 targetId = 8;</code>
     *
     * <pre>
     *目标id
     * </pre>
     */
    public boolean hasTargetId() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional int64 targetId = 8;</code>
     *
     * <pre>
     *目标id
     * </pre>
     */
    public long getTargetId() {
      return targetId_;
    }

    private void initFields() {
      option_ = 0;
      bufferId_ = 0L;
      sourceId_ = 0L;
      sourcename_ = "";
      templateId_ = 0;
      aliveTime_ = 0L;
      leftCount_ = 0;
      targetId_ = 0L;
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
        output.writeInt32(1, option_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, bufferId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt64(3, sourceId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getSourcenameBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, templateId_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt64(6, aliveTime_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(7, leftCount_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt64(8, targetId_);
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
          .computeInt32Size(1, option_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, bufferId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, sourceId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getSourcenameBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, templateId_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(6, aliveTime_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, leftCount_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(8, targetId_);
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

    public static com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg prototype) {
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
     * Protobuf type {@code BufferMsg}
     *
     * <pre>
     *变更用户当前某个buffer
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BufferMsg)
        com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.internal_static_BufferMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.internal_static_BufferMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg.class, com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg.newBuilder()
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
        option_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        bufferId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        sourceId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        sourcename_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        templateId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        aliveTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        leftCount_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        targetId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.internal_static_BufferMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg build() {
        com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg result = new com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.option_ = option_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.bufferId_ = bufferId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.sourceId_ = sourceId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.sourcename_ = sourcename_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.templateId_ = templateId_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.aliveTime_ = aliveTime_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.leftCount_ = leftCount_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.targetId_ = targetId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg.getDefaultInstance()) return this;
        if (other.hasOption()) {
          setOption(other.getOption());
        }
        if (other.hasBufferId()) {
          setBufferId(other.getBufferId());
        }
        if (other.hasSourceId()) {
          setSourceId(other.getSourceId());
        }
        if (other.hasSourcename()) {
          bitField0_ |= 0x00000008;
          sourcename_ = other.sourcename_;
          onChanged();
        }
        if (other.hasTemplateId()) {
          setTemplateId(other.getTemplateId());
        }
        if (other.hasAliveTime()) {
          setAliveTime(other.getAliveTime());
        }
        if (other.hasLeftCount()) {
          setLeftCount(other.getLeftCount());
        }
        if (other.hasTargetId()) {
          setTargetId(other.getTargetId());
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
        com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.battle.BufferMsgProto.BufferMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int option_ ;
      /**
       * <code>optional int32 option = 1;</code>
       *
       * <pre>
       *操作类型  4 删除，其他增加或者修改
       * </pre>
       */
      public boolean hasOption() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 option = 1;</code>
       *
       * <pre>
       *操作类型  4 删除，其他增加或者修改
       * </pre>
       */
      public int getOption() {
        return option_;
      }
      /**
       * <code>optional int32 option = 1;</code>
       *
       * <pre>
       *操作类型  4 删除，其他增加或者修改
       * </pre>
       */
      public Builder setOption(int value) {
        bitField0_ |= 0x00000001;
        option_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 option = 1;</code>
       *
       * <pre>
       *操作类型  4 删除，其他增加或者修改
       * </pre>
       */
      public Builder clearOption() {
        bitField0_ = (bitField0_ & ~0x00000001);
        option_ = 0;
        onChanged();
        return this;
      }

      private long bufferId_ ;
      /**
       * <code>optional int64 bufferId = 2;</code>
       *
       * <pre>
       *buffer唯一ID
       * </pre>
       */
      public boolean hasBufferId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int64 bufferId = 2;</code>
       *
       * <pre>
       *buffer唯一ID
       * </pre>
       */
      public long getBufferId() {
        return bufferId_;
      }
      /**
       * <code>optional int64 bufferId = 2;</code>
       *
       * <pre>
       *buffer唯一ID
       * </pre>
       */
      public Builder setBufferId(long value) {
        bitField0_ |= 0x00000002;
        bufferId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 bufferId = 2;</code>
       *
       * <pre>
       *buffer唯一ID
       * </pre>
       */
      public Builder clearBufferId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        bufferId_ = 0L;
        onChanged();
        return this;
      }

      private long sourceId_ ;
      /**
       * <code>optional int64 sourceId = 3;</code>
       *
       * <pre>
       *buffer源ID
       * </pre>
       */
      public boolean hasSourceId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int64 sourceId = 3;</code>
       *
       * <pre>
       *buffer源ID
       * </pre>
       */
      public long getSourceId() {
        return sourceId_;
      }
      /**
       * <code>optional int64 sourceId = 3;</code>
       *
       * <pre>
       *buffer源ID
       * </pre>
       */
      public Builder setSourceId(long value) {
        bitField0_ |= 0x00000004;
        sourceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 sourceId = 3;</code>
       *
       * <pre>
       *buffer源ID
       * </pre>
       */
      public Builder clearSourceId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        sourceId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object sourcename_ = "";
      /**
       * <code>optional string sourcename = 4;</code>
       *
       * <pre>
       *buffer来源名
       * </pre>
       */
      public boolean hasSourcename() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string sourcename = 4;</code>
       *
       * <pre>
       *buffer来源名
       * </pre>
       */
      public java.lang.String getSourcename() {
        java.lang.Object ref = sourcename_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            sourcename_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string sourcename = 4;</code>
       *
       * <pre>
       *buffer来源名
       * </pre>
       */
      public com.google.protobuf.ByteString
          getSourcenameBytes() {
        java.lang.Object ref = sourcename_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          sourcename_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string sourcename = 4;</code>
       *
       * <pre>
       *buffer来源名
       * </pre>
       */
      public Builder setSourcename(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        sourcename_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string sourcename = 4;</code>
       *
       * <pre>
       *buffer来源名
       * </pre>
       */
      public Builder clearSourcename() {
        bitField0_ = (bitField0_ & ~0x00000008);
        sourcename_ = getDefaultInstance().getSourcename();
        onChanged();
        return this;
      }
      /**
       * <code>optional string sourcename = 4;</code>
       *
       * <pre>
       *buffer来源名
       * </pre>
       */
      public Builder setSourcenameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        sourcename_ = value;
        onChanged();
        return this;
      }

      private int templateId_ ;
      /**
       * <code>optional int32 templateId = 5;</code>
       *
       * <pre>
       *模板ID
       * </pre>
       */
      public boolean hasTemplateId() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional int32 templateId = 5;</code>
       *
       * <pre>
       *模板ID
       * </pre>
       */
      public int getTemplateId() {
        return templateId_;
      }
      /**
       * <code>optional int32 templateId = 5;</code>
       *
       * <pre>
       *模板ID
       * </pre>
       */
      public Builder setTemplateId(int value) {
        bitField0_ |= 0x00000010;
        templateId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 templateId = 5;</code>
       *
       * <pre>
       *模板ID
       * </pre>
       */
      public Builder clearTemplateId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        templateId_ = 0;
        onChanged();
        return this;
      }

      private long aliveTime_ ;
      /**
       * <code>optional int64 aliveTime = 6;</code>
       *
       * <pre>
       *截止时间
       * </pre>
       */
      public boolean hasAliveTime() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional int64 aliveTime = 6;</code>
       *
       * <pre>
       *截止时间
       * </pre>
       */
      public long getAliveTime() {
        return aliveTime_;
      }
      /**
       * <code>optional int64 aliveTime = 6;</code>
       *
       * <pre>
       *截止时间
       * </pre>
       */
      public Builder setAliveTime(long value) {
        bitField0_ |= 0x00000020;
        aliveTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 aliveTime = 6;</code>
       *
       * <pre>
       *截止时间
       * </pre>
       */
      public Builder clearAliveTime() {
        bitField0_ = (bitField0_ & ~0x00000020);
        aliveTime_ = 0L;
        onChanged();
        return this;
      }

      private int leftCount_ ;
      /**
       * <code>optional int32 leftCount = 7;</code>
       *
       * <pre>
       *剩余次数
       * </pre>
       */
      public boolean hasLeftCount() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      /**
       * <code>optional int32 leftCount = 7;</code>
       *
       * <pre>
       *剩余次数
       * </pre>
       */
      public int getLeftCount() {
        return leftCount_;
      }
      /**
       * <code>optional int32 leftCount = 7;</code>
       *
       * <pre>
       *剩余次数
       * </pre>
       */
      public Builder setLeftCount(int value) {
        bitField0_ |= 0x00000040;
        leftCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 leftCount = 7;</code>
       *
       * <pre>
       *剩余次数
       * </pre>
       */
      public Builder clearLeftCount() {
        bitField0_ = (bitField0_ & ~0x00000040);
        leftCount_ = 0;
        onChanged();
        return this;
      }

      private long targetId_ ;
      /**
       * <code>optional int64 targetId = 8;</code>
       *
       * <pre>
       *目标id
       * </pre>
       */
      public boolean hasTargetId() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      /**
       * <code>optional int64 targetId = 8;</code>
       *
       * <pre>
       *目标id
       * </pre>
       */
      public long getTargetId() {
        return targetId_;
      }
      /**
       * <code>optional int64 targetId = 8;</code>
       *
       * <pre>
       *目标id
       * </pre>
       */
      public Builder setTargetId(long value) {
        bitField0_ |= 0x00000080;
        targetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 targetId = 8;</code>
       *
       * <pre>
       *目标id
       * </pre>
       */
      public Builder clearTargetId() {
        bitField0_ = (bitField0_ & ~0x00000080);
        targetId_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:BufferMsg)
    }

    static {
      defaultInstance = new BufferMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:BufferMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BufferMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_BufferMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017BufferMsg.proto\"\237\001\n\tBufferMsg\022\016\n\006optio" +
      "n\030\001 \001(\005\022\020\n\010bufferId\030\002 \001(\003\022\020\n\010sourceId\030\003 " +
      "\001(\003\022\022\n\nsourcename\030\004 \001(\t\022\022\n\ntemplateId\030\005 " +
      "\001(\005\022\021\n\taliveTime\030\006 \001(\003\022\021\n\tleftCount\030\007 \001(" +
      "\005\022\020\n\010targetId\030\010 \001(\003B9\n\'com.chuangyou.com" +
      "mon.protobuf.pb.battleB\016BufferMsgProto"
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
    internal_static_BufferMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BufferMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_BufferMsg_descriptor,
        new java.lang.String[] { "Option", "BufferId", "SourceId", "Sourcename", "TemplateId", "AliveTime", "LeftCount", "TargetId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}