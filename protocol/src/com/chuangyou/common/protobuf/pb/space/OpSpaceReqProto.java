// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: space/OpSpaceReqMsg.proto

package com.chuangyou.common.protobuf.pb.space;

public final class OpSpaceReqProto {
  private OpSpaceReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface OpSpaceReqMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OpSpaceReqMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 playerId = 1;</code>
     *
     * <pre>
     * </pre>
     */
    boolean hasPlayerId();
    /**
     * <code>required int64 playerId = 1;</code>
     *
     * <pre>
     * </pre>
     */
    long getPlayerId();

    /**
     * <code>required int32 op = 2;</code>
     *
     * <pre>
     *操作：1：点赞  2：送花 3：鸡蛋
     * </pre>
     */
    boolean hasOp();
    /**
     * <code>required int32 op = 2;</code>
     *
     * <pre>
     *操作：1：点赞  2：送花 3：鸡蛋
     * </pre>
     */
    int getOp();
  }
  /**
   * Protobuf type {@code OpSpaceReqMsg}
   *
   * <pre>
   *空间操作（点赞。送花，鸡蛋。。。。）
   * </pre>
   */
  public static final class OpSpaceReqMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:OpSpaceReqMsg)
      OpSpaceReqMsgOrBuilder {
    // Use OpSpaceReqMsg.newBuilder() to construct.
    private OpSpaceReqMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private OpSpaceReqMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final OpSpaceReqMsg defaultInstance;
    public static OpSpaceReqMsg getDefaultInstance() {
      return defaultInstance;
    }

    public OpSpaceReqMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private OpSpaceReqMsg(
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
              playerId_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              op_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.internal_static_OpSpaceReqMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.internal_static_OpSpaceReqMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg.class, com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<OpSpaceReqMsg> PARSER =
        new com.google.protobuf.AbstractParser<OpSpaceReqMsg>() {
      public OpSpaceReqMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OpSpaceReqMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<OpSpaceReqMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int PLAYERID_FIELD_NUMBER = 1;
    private long playerId_;
    /**
     * <code>required int64 playerId = 1;</code>
     *
     * <pre>
     * </pre>
     */
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 playerId = 1;</code>
     *
     * <pre>
     * </pre>
     */
    public long getPlayerId() {
      return playerId_;
    }

    public static final int OP_FIELD_NUMBER = 2;
    private int op_;
    /**
     * <code>required int32 op = 2;</code>
     *
     * <pre>
     *操作：1：点赞  2：送花 3：鸡蛋
     * </pre>
     */
    public boolean hasOp() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 op = 2;</code>
     *
     * <pre>
     *操作：1：点赞  2：送花 3：鸡蛋
     * </pre>
     */
    public int getOp() {
      return op_;
    }

    private void initFields() {
      playerId_ = 0L;
      op_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasPlayerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
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
        output.writeInt64(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, op_);
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
          .computeInt64Size(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, op_);
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

    public static com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg prototype) {
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
     * Protobuf type {@code OpSpaceReqMsg}
     *
     * <pre>
     *空间操作（点赞。送花，鸡蛋。。。。）
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OpSpaceReqMsg)
        com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.internal_static_OpSpaceReqMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.internal_static_OpSpaceReqMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg.class, com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg.newBuilder()
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
        playerId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        op_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.internal_static_OpSpaceReqMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg build() {
        com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg result = new com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.op_ = op_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        if (other.hasOp()) {
          setOp(other.getOp());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasPlayerId()) {
          
          return false;
        }
        if (!hasOp()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.space.OpSpaceReqProto.OpSpaceReqMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long playerId_ ;
      /**
       * <code>required int64 playerId = 1;</code>
       *
       * <pre>
       * </pre>
       */
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 playerId = 1;</code>
       *
       * <pre>
       * </pre>
       */
      public long getPlayerId() {
        return playerId_;
      }
      /**
       * <code>required int64 playerId = 1;</code>
       *
       * <pre>
       * </pre>
       */
      public Builder setPlayerId(long value) {
        bitField0_ |= 0x00000001;
        playerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 playerId = 1;</code>
       *
       * <pre>
       * </pre>
       */
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0L;
        onChanged();
        return this;
      }

      private int op_ ;
      /**
       * <code>required int32 op = 2;</code>
       *
       * <pre>
       *操作：1：点赞  2：送花 3：鸡蛋
       * </pre>
       */
      public boolean hasOp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 op = 2;</code>
       *
       * <pre>
       *操作：1：点赞  2：送花 3：鸡蛋
       * </pre>
       */
      public int getOp() {
        return op_;
      }
      /**
       * <code>required int32 op = 2;</code>
       *
       * <pre>
       *操作：1：点赞  2：送花 3：鸡蛋
       * </pre>
       */
      public Builder setOp(int value) {
        bitField0_ |= 0x00000002;
        op_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 op = 2;</code>
       *
       * <pre>
       *操作：1：点赞  2：送花 3：鸡蛋
       * </pre>
       */
      public Builder clearOp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        op_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:OpSpaceReqMsg)
    }

    static {
      defaultInstance = new OpSpaceReqMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:OpSpaceReqMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OpSpaceReqMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_OpSpaceReqMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031space/OpSpaceReqMsg.proto\"-\n\rOpSpaceRe" +
      "qMsg\022\020\n\010playerId\030\001 \002(\003\022\n\n\002op\030\002 \002(\005B9\n&co" +
      "m.chuangyou.common.protobuf.pb.spaceB\017Op" +
      "SpaceReqProto"
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
    internal_static_OpSpaceReqMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OpSpaceReqMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_OpSpaceReqMsg_descriptor,
        new java.lang.String[] { "PlayerId", "Op", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
