// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inverseBead/ResInverseBeadResetMsg.proto

package com.chuangyou.common.protobuf.pb.inverseBead;

public final class ResInverseBeadResetMsgProto {
  private ResInverseBeadResetMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ResInverseBeadResetMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResInverseBeadResetMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 monsterNum = 1;</code>
     *
     * <pre>
     *怪物数量
     * </pre>
     */
    boolean hasMonsterNum();
    /**
     * <code>required int32 monsterNum = 1;</code>
     *
     * <pre>
     *怪物数量
     * </pre>
     */
    int getMonsterNum();

    /**
     * <code>required int64 resetTime = 2;</code>
     *
     * <pre>
     *重置时间
     * </pre>
     */
    boolean hasResetTime();
    /**
     * <code>required int64 resetTime = 2;</code>
     *
     * <pre>
     *重置时间
     * </pre>
     */
    long getResetTime();
  }
  /**
   * Protobuf type {@code ResInverseBeadResetMsg}
   *
   * <pre>
   *请求重置天逆珠
   * </pre>
   */
  public static final class ResInverseBeadResetMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ResInverseBeadResetMsg)
      ResInverseBeadResetMsgOrBuilder {
    // Use ResInverseBeadResetMsg.newBuilder() to construct.
    private ResInverseBeadResetMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ResInverseBeadResetMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ResInverseBeadResetMsg defaultInstance;
    public static ResInverseBeadResetMsg getDefaultInstance() {
      return defaultInstance;
    }

    public ResInverseBeadResetMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ResInverseBeadResetMsg(
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
              monsterNum_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              resetTime_ = input.readInt64();
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
      return com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.internal_static_ResInverseBeadResetMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.internal_static_ResInverseBeadResetMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg.class, com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<ResInverseBeadResetMsg> PARSER =
        new com.google.protobuf.AbstractParser<ResInverseBeadResetMsg>() {
      public ResInverseBeadResetMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResInverseBeadResetMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ResInverseBeadResetMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int MONSTERNUM_FIELD_NUMBER = 1;
    private int monsterNum_;
    /**
     * <code>required int32 monsterNum = 1;</code>
     *
     * <pre>
     *怪物数量
     * </pre>
     */
    public boolean hasMonsterNum() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 monsterNum = 1;</code>
     *
     * <pre>
     *怪物数量
     * </pre>
     */
    public int getMonsterNum() {
      return monsterNum_;
    }

    public static final int RESETTIME_FIELD_NUMBER = 2;
    private long resetTime_;
    /**
     * <code>required int64 resetTime = 2;</code>
     *
     * <pre>
     *重置时间
     * </pre>
     */
    public boolean hasResetTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int64 resetTime = 2;</code>
     *
     * <pre>
     *重置时间
     * </pre>
     */
    public long getResetTime() {
      return resetTime_;
    }

    private void initFields() {
      monsterNum_ = 0;
      resetTime_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasMonsterNum()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasResetTime()) {
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
        output.writeInt32(1, monsterNum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, resetTime_);
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
          .computeInt32Size(1, monsterNum_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, resetTime_);
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

    public static com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg prototype) {
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
     * Protobuf type {@code ResInverseBeadResetMsg}
     *
     * <pre>
     *请求重置天逆珠
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResInverseBeadResetMsg)
        com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.internal_static_ResInverseBeadResetMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.internal_static_ResInverseBeadResetMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg.class, com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg.newBuilder()
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
        monsterNum_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        resetTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.internal_static_ResInverseBeadResetMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg build() {
        com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg result = new com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.monsterNum_ = monsterNum_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.resetTime_ = resetTime_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg.getDefaultInstance()) return this;
        if (other.hasMonsterNum()) {
          setMonsterNum(other.getMonsterNum());
        }
        if (other.hasResetTime()) {
          setResetTime(other.getResetTime());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasMonsterNum()) {
          
          return false;
        }
        if (!hasResetTime()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.inverseBead.ResInverseBeadResetMsgProto.ResInverseBeadResetMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int monsterNum_ ;
      /**
       * <code>required int32 monsterNum = 1;</code>
       *
       * <pre>
       *怪物数量
       * </pre>
       */
      public boolean hasMonsterNum() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 monsterNum = 1;</code>
       *
       * <pre>
       *怪物数量
       * </pre>
       */
      public int getMonsterNum() {
        return monsterNum_;
      }
      /**
       * <code>required int32 monsterNum = 1;</code>
       *
       * <pre>
       *怪物数量
       * </pre>
       */
      public Builder setMonsterNum(int value) {
        bitField0_ |= 0x00000001;
        monsterNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 monsterNum = 1;</code>
       *
       * <pre>
       *怪物数量
       * </pre>
       */
      public Builder clearMonsterNum() {
        bitField0_ = (bitField0_ & ~0x00000001);
        monsterNum_ = 0;
        onChanged();
        return this;
      }

      private long resetTime_ ;
      /**
       * <code>required int64 resetTime = 2;</code>
       *
       * <pre>
       *重置时间
       * </pre>
       */
      public boolean hasResetTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int64 resetTime = 2;</code>
       *
       * <pre>
       *重置时间
       * </pre>
       */
      public long getResetTime() {
        return resetTime_;
      }
      /**
       * <code>required int64 resetTime = 2;</code>
       *
       * <pre>
       *重置时间
       * </pre>
       */
      public Builder setResetTime(long value) {
        bitField0_ |= 0x00000002;
        resetTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 resetTime = 2;</code>
       *
       * <pre>
       *重置时间
       * </pre>
       */
      public Builder clearResetTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        resetTime_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ResInverseBeadResetMsg)
    }

    static {
      defaultInstance = new ResInverseBeadResetMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ResInverseBeadResetMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResInverseBeadResetMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ResInverseBeadResetMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(inverseBead/ResInverseBeadResetMsg.pro" +
      "to\"?\n\026ResInverseBeadResetMsg\022\022\n\nmonsterN" +
      "um\030\001 \002(\005\022\021\n\tresetTime\030\002 \002(\003BK\n,com.chuan" +
      "gyou.common.protobuf.pb.inverseBeadB\033Res" +
      "InverseBeadResetMsgProto"
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
    internal_static_ResInverseBeadResetMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ResInverseBeadResetMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ResInverseBeadResetMsg_descriptor,
        new java.lang.String[] { "MonsterNum", "ResetTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
