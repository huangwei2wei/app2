// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PvP1v1BattleResultMsg.proto

package com.chuangyou.common.protobuf.pb.pvp1v1;

public final class PvP1v1BattleResultProto {
  private PvP1v1BattleResultProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PvP1v1BattleResultMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PvP1v1BattleResultMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 redId = 1;</code>
     *
     * <pre>
     *红色的ID
     * </pre>
     */
    boolean hasRedId();
    /**
     * <code>optional int64 redId = 1;</code>
     *
     * <pre>
     *红色的ID
     * </pre>
     */
    long getRedId();

    /**
     * <code>optional int64 blue = 2;</code>
     *
     * <pre>
     *蓝色方ID
     * </pre>
     */
    boolean hasBlue();
    /**
     * <code>optional int64 blue = 2;</code>
     *
     * <pre>
     *蓝色方ID
     * </pre>
     */
    long getBlue();

    /**
     * <code>optional int32 result = 3;</code>
     *
     * <pre>
     *战斗结果 1 红色方胜  0 平局 -1 蓝色方胜
     * </pre>
     */
    boolean hasResult();
    /**
     * <code>optional int32 result = 3;</code>
     *
     * <pre>
     *战斗结果 1 红色方胜  0 平局 -1 蓝色方胜
     * </pre>
     */
    int getResult();
  }
  /**
   * Protobuf type {@code PvP1v1BattleResultMsg}
   */
  public static final class PvP1v1BattleResultMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:PvP1v1BattleResultMsg)
      PvP1v1BattleResultMsgOrBuilder {
    // Use PvP1v1BattleResultMsg.newBuilder() to construct.
    private PvP1v1BattleResultMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PvP1v1BattleResultMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PvP1v1BattleResultMsg defaultInstance;
    public static PvP1v1BattleResultMsg getDefaultInstance() {
      return defaultInstance;
    }

    public PvP1v1BattleResultMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PvP1v1BattleResultMsg(
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
              redId_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              blue_ = input.readInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              result_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.internal_static_PvP1v1BattleResultMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.internal_static_PvP1v1BattleResultMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg.class, com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<PvP1v1BattleResultMsg> PARSER =
        new com.google.protobuf.AbstractParser<PvP1v1BattleResultMsg>() {
      public PvP1v1BattleResultMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PvP1v1BattleResultMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PvP1v1BattleResultMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int REDID_FIELD_NUMBER = 1;
    private long redId_;
    /**
     * <code>optional int64 redId = 1;</code>
     *
     * <pre>
     *红色的ID
     * </pre>
     */
    public boolean hasRedId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 redId = 1;</code>
     *
     * <pre>
     *红色的ID
     * </pre>
     */
    public long getRedId() {
      return redId_;
    }

    public static final int BLUE_FIELD_NUMBER = 2;
    private long blue_;
    /**
     * <code>optional int64 blue = 2;</code>
     *
     * <pre>
     *蓝色方ID
     * </pre>
     */
    public boolean hasBlue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 blue = 2;</code>
     *
     * <pre>
     *蓝色方ID
     * </pre>
     */
    public long getBlue() {
      return blue_;
    }

    public static final int RESULT_FIELD_NUMBER = 3;
    private int result_;
    /**
     * <code>optional int32 result = 3;</code>
     *
     * <pre>
     *战斗结果 1 红色方胜  0 平局 -1 蓝色方胜
     * </pre>
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 result = 3;</code>
     *
     * <pre>
     *战斗结果 1 红色方胜  0 平局 -1 蓝色方胜
     * </pre>
     */
    public int getResult() {
      return result_;
    }

    private void initFields() {
      redId_ = 0L;
      blue_ = 0L;
      result_ = 0;
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
        output.writeInt64(1, redId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, blue_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, result_);
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
          .computeInt64Size(1, redId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, blue_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, result_);
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

    public static com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg prototype) {
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
     * Protobuf type {@code PvP1v1BattleResultMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PvP1v1BattleResultMsg)
        com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.internal_static_PvP1v1BattleResultMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.internal_static_PvP1v1BattleResultMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg.class, com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg.newBuilder()
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
        redId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        blue_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        result_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.internal_static_PvP1v1BattleResultMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg build() {
        com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg result = new com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.redId_ = redId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.blue_ = blue_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.result_ = result_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg.getDefaultInstance()) return this;
        if (other.hasRedId()) {
          setRedId(other.getRedId());
        }
        if (other.hasBlue()) {
          setBlue(other.getBlue());
        }
        if (other.hasResult()) {
          setResult(other.getResult());
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
        com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.pvp1v1.PvP1v1BattleResultProto.PvP1v1BattleResultMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long redId_ ;
      /**
       * <code>optional int64 redId = 1;</code>
       *
       * <pre>
       *红色的ID
       * </pre>
       */
      public boolean hasRedId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int64 redId = 1;</code>
       *
       * <pre>
       *红色的ID
       * </pre>
       */
      public long getRedId() {
        return redId_;
      }
      /**
       * <code>optional int64 redId = 1;</code>
       *
       * <pre>
       *红色的ID
       * </pre>
       */
      public Builder setRedId(long value) {
        bitField0_ |= 0x00000001;
        redId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 redId = 1;</code>
       *
       * <pre>
       *红色的ID
       * </pre>
       */
      public Builder clearRedId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        redId_ = 0L;
        onChanged();
        return this;
      }

      private long blue_ ;
      /**
       * <code>optional int64 blue = 2;</code>
       *
       * <pre>
       *蓝色方ID
       * </pre>
       */
      public boolean hasBlue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int64 blue = 2;</code>
       *
       * <pre>
       *蓝色方ID
       * </pre>
       */
      public long getBlue() {
        return blue_;
      }
      /**
       * <code>optional int64 blue = 2;</code>
       *
       * <pre>
       *蓝色方ID
       * </pre>
       */
      public Builder setBlue(long value) {
        bitField0_ |= 0x00000002;
        blue_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 blue = 2;</code>
       *
       * <pre>
       *蓝色方ID
       * </pre>
       */
      public Builder clearBlue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        blue_ = 0L;
        onChanged();
        return this;
      }

      private int result_ ;
      /**
       * <code>optional int32 result = 3;</code>
       *
       * <pre>
       *战斗结果 1 红色方胜  0 平局 -1 蓝色方胜
       * </pre>
       */
      public boolean hasResult() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 result = 3;</code>
       *
       * <pre>
       *战斗结果 1 红色方胜  0 平局 -1 蓝色方胜
       * </pre>
       */
      public int getResult() {
        return result_;
      }
      /**
       * <code>optional int32 result = 3;</code>
       *
       * <pre>
       *战斗结果 1 红色方胜  0 平局 -1 蓝色方胜
       * </pre>
       */
      public Builder setResult(int value) {
        bitField0_ |= 0x00000004;
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 result = 3;</code>
       *
       * <pre>
       *战斗结果 1 红色方胜  0 平局 -1 蓝色方胜
       * </pre>
       */
      public Builder clearResult() {
        bitField0_ = (bitField0_ & ~0x00000004);
        result_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:PvP1v1BattleResultMsg)
    }

    static {
      defaultInstance = new PvP1v1BattleResultMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:PvP1v1BattleResultMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PvP1v1BattleResultMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PvP1v1BattleResultMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033PvP1v1BattleResultMsg.proto\"D\n\025PvP1v1B" +
      "attleResultMsg\022\r\n\005redId\030\001 \001(\003\022\014\n\004blue\030\002 " +
      "\001(\003\022\016\n\006result\030\003 \001(\005BB\n\'com.chuangyou.com" +
      "mon.protobuf.pb.pvp1v1B\027PvP1v1BattleResu" +
      "ltProto"
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
    internal_static_PvP1v1BattleResultMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PvP1v1BattleResultMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_PvP1v1BattleResultMsg_descriptor,
        new java.lang.String[] { "RedId", "Blue", "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
