// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RespTruckResult.proto

package com.chuangyou.common.protobuf.pb.truck;

public final class RespTruckResultProto {
  private RespTruckResultProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RespTruckResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RespTruckResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 type = 1;</code>
     *
     * <pre>
     *1.个人镖车 2.帮派镖车 3.镖师
     * </pre>
     */
    boolean hasType();
    /**
     * <code>required int32 type = 1;</code>
     *
     * <pre>
     *1.个人镖车 2.帮派镖车 3.镖师
     * </pre>
     */
    int getType();

    /**
     * <code>required int32 state = 2;</code>
     *
     * <pre>
     *完成状态
     * </pre>
     */
    boolean hasState();
    /**
     * <code>required int32 state = 2;</code>
     *
     * <pre>
     *完成状态
     * </pre>
     */
    int getState();

    /**
     * <code>required int32 exp = 3;</code>
     *
     * <pre>
     *当前经验
     * </pre>
     */
    boolean hasExp();
    /**
     * <code>required int32 exp = 3;</code>
     *
     * <pre>
     *当前经验
     * </pre>
     */
    int getExp();

    /**
     * <code>required int32 level = 4;</code>
     *
     * <pre>
     *当前等级
     * </pre>
     */
    boolean hasLevel();
    /**
     * <code>required int32 level = 4;</code>
     *
     * <pre>
     *当前等级
     * </pre>
     */
    int getLevel();

    /**
     * <code>required int32 skillPoint = 5;</code>
     *
     * <pre>
     *当前技能点
     * </pre>
     */
    boolean hasSkillPoint();
    /**
     * <code>required int32 skillPoint = 5;</code>
     *
     * <pre>
     *当前技能点
     * </pre>
     */
    int getSkillPoint();

    /**
     * <code>required int32 op = 6;</code>
     *
     * <pre>
     *当前操作 1.更新技能经验 2.结算
     * </pre>
     */
    boolean hasOp();
    /**
     * <code>required int32 op = 6;</code>
     *
     * <pre>
     *当前操作 1.更新技能经验 2.结算
     * </pre>
     */
    int getOp();
  }
  /**
   * Protobuf type {@code RespTruckResult}
   *
   * <pre>
   *运镖完成
   * </pre>
   */
  public static final class RespTruckResult extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:RespTruckResult)
      RespTruckResultOrBuilder {
    // Use RespTruckResult.newBuilder() to construct.
    private RespTruckResult(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RespTruckResult(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RespTruckResult defaultInstance;
    public static RespTruckResult getDefaultInstance() {
      return defaultInstance;
    }

    public RespTruckResult getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RespTruckResult(
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
              type_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              state_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              exp_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              level_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              skillPoint_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
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
      return com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.internal_static_RespTruckResult_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.internal_static_RespTruckResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult.class, com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult.Builder.class);
    }

    public static com.google.protobuf.Parser<RespTruckResult> PARSER =
        new com.google.protobuf.AbstractParser<RespTruckResult>() {
      public RespTruckResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RespTruckResult(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RespTruckResult> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>required int32 type = 1;</code>
     *
     * <pre>
     *1.个人镖车 2.帮派镖车 3.镖师
     * </pre>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 type = 1;</code>
     *
     * <pre>
     *1.个人镖车 2.帮派镖车 3.镖师
     * </pre>
     */
    public int getType() {
      return type_;
    }

    public static final int STATE_FIELD_NUMBER = 2;
    private int state_;
    /**
     * <code>required int32 state = 2;</code>
     *
     * <pre>
     *完成状态
     * </pre>
     */
    public boolean hasState() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 state = 2;</code>
     *
     * <pre>
     *完成状态
     * </pre>
     */
    public int getState() {
      return state_;
    }

    public static final int EXP_FIELD_NUMBER = 3;
    private int exp_;
    /**
     * <code>required int32 exp = 3;</code>
     *
     * <pre>
     *当前经验
     * </pre>
     */
    public boolean hasExp() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 exp = 3;</code>
     *
     * <pre>
     *当前经验
     * </pre>
     */
    public int getExp() {
      return exp_;
    }

    public static final int LEVEL_FIELD_NUMBER = 4;
    private int level_;
    /**
     * <code>required int32 level = 4;</code>
     *
     * <pre>
     *当前等级
     * </pre>
     */
    public boolean hasLevel() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 level = 4;</code>
     *
     * <pre>
     *当前等级
     * </pre>
     */
    public int getLevel() {
      return level_;
    }

    public static final int SKILLPOINT_FIELD_NUMBER = 5;
    private int skillPoint_;
    /**
     * <code>required int32 skillPoint = 5;</code>
     *
     * <pre>
     *当前技能点
     * </pre>
     */
    public boolean hasSkillPoint() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int32 skillPoint = 5;</code>
     *
     * <pre>
     *当前技能点
     * </pre>
     */
    public int getSkillPoint() {
      return skillPoint_;
    }

    public static final int OP_FIELD_NUMBER = 6;
    private int op_;
    /**
     * <code>required int32 op = 6;</code>
     *
     * <pre>
     *当前操作 1.更新技能经验 2.结算
     * </pre>
     */
    public boolean hasOp() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required int32 op = 6;</code>
     *
     * <pre>
     *当前操作 1.更新技能经验 2.结算
     * </pre>
     */
    public int getOp() {
      return op_;
    }

    private void initFields() {
      type_ = 0;
      state_ = 0;
      exp_ = 0;
      level_ = 0;
      skillPoint_ = 0;
      op_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasState()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasExp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLevel()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSkillPoint()) {
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
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, state_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, exp_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, level_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, skillPoint_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, op_);
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
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, state_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, exp_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, level_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, skillPoint_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, op_);
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

    public static com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult prototype) {
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
     * Protobuf type {@code RespTruckResult}
     *
     * <pre>
     *运镖完成
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RespTruckResult)
        com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.internal_static_RespTruckResult_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.internal_static_RespTruckResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult.class, com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult.newBuilder()
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
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        state_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        exp_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        level_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        skillPoint_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        op_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.internal_static_RespTruckResult_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult build() {
        com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult buildPartial() {
        com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult result = new com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.state_ = state_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.exp_ = exp_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.level_ = level_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.skillPoint_ = skillPoint_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.op_ = op_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult other) {
        if (other == com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasState()) {
          setState(other.getState());
        }
        if (other.hasExp()) {
          setExp(other.getExp());
        }
        if (other.hasLevel()) {
          setLevel(other.getLevel());
        }
        if (other.hasSkillPoint()) {
          setSkillPoint(other.getSkillPoint());
        }
        if (other.hasOp()) {
          setOp(other.getOp());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        if (!hasState()) {
          
          return false;
        }
        if (!hasExp()) {
          
          return false;
        }
        if (!hasLevel()) {
          
          return false;
        }
        if (!hasSkillPoint()) {
          
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
        com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.truck.RespTruckResultProto.RespTruckResult) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int type_ ;
      /**
       * <code>required int32 type = 1;</code>
       *
       * <pre>
       *1.个人镖车 2.帮派镖车 3.镖师
       * </pre>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 type = 1;</code>
       *
       * <pre>
       *1.个人镖车 2.帮派镖车 3.镖师
       * </pre>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>required int32 type = 1;</code>
       *
       * <pre>
       *1.个人镖车 2.帮派镖车 3.镖师
       * </pre>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 type = 1;</code>
       *
       * <pre>
       *1.个人镖车 2.帮派镖车 3.镖师
       * </pre>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }

      private int state_ ;
      /**
       * <code>required int32 state = 2;</code>
       *
       * <pre>
       *完成状态
       * </pre>
       */
      public boolean hasState() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 state = 2;</code>
       *
       * <pre>
       *完成状态
       * </pre>
       */
      public int getState() {
        return state_;
      }
      /**
       * <code>required int32 state = 2;</code>
       *
       * <pre>
       *完成状态
       * </pre>
       */
      public Builder setState(int value) {
        bitField0_ |= 0x00000002;
        state_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 state = 2;</code>
       *
       * <pre>
       *完成状态
       * </pre>
       */
      public Builder clearState() {
        bitField0_ = (bitField0_ & ~0x00000002);
        state_ = 0;
        onChanged();
        return this;
      }

      private int exp_ ;
      /**
       * <code>required int32 exp = 3;</code>
       *
       * <pre>
       *当前经验
       * </pre>
       */
      public boolean hasExp() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 exp = 3;</code>
       *
       * <pre>
       *当前经验
       * </pre>
       */
      public int getExp() {
        return exp_;
      }
      /**
       * <code>required int32 exp = 3;</code>
       *
       * <pre>
       *当前经验
       * </pre>
       */
      public Builder setExp(int value) {
        bitField0_ |= 0x00000004;
        exp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 exp = 3;</code>
       *
       * <pre>
       *当前经验
       * </pre>
       */
      public Builder clearExp() {
        bitField0_ = (bitField0_ & ~0x00000004);
        exp_ = 0;
        onChanged();
        return this;
      }

      private int level_ ;
      /**
       * <code>required int32 level = 4;</code>
       *
       * <pre>
       *当前等级
       * </pre>
       */
      public boolean hasLevel() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 level = 4;</code>
       *
       * <pre>
       *当前等级
       * </pre>
       */
      public int getLevel() {
        return level_;
      }
      /**
       * <code>required int32 level = 4;</code>
       *
       * <pre>
       *当前等级
       * </pre>
       */
      public Builder setLevel(int value) {
        bitField0_ |= 0x00000008;
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 level = 4;</code>
       *
       * <pre>
       *当前等级
       * </pre>
       */
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000008);
        level_ = 0;
        onChanged();
        return this;
      }

      private int skillPoint_ ;
      /**
       * <code>required int32 skillPoint = 5;</code>
       *
       * <pre>
       *当前技能点
       * </pre>
       */
      public boolean hasSkillPoint() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required int32 skillPoint = 5;</code>
       *
       * <pre>
       *当前技能点
       * </pre>
       */
      public int getSkillPoint() {
        return skillPoint_;
      }
      /**
       * <code>required int32 skillPoint = 5;</code>
       *
       * <pre>
       *当前技能点
       * </pre>
       */
      public Builder setSkillPoint(int value) {
        bitField0_ |= 0x00000010;
        skillPoint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 skillPoint = 5;</code>
       *
       * <pre>
       *当前技能点
       * </pre>
       */
      public Builder clearSkillPoint() {
        bitField0_ = (bitField0_ & ~0x00000010);
        skillPoint_ = 0;
        onChanged();
        return this;
      }

      private int op_ ;
      /**
       * <code>required int32 op = 6;</code>
       *
       * <pre>
       *当前操作 1.更新技能经验 2.结算
       * </pre>
       */
      public boolean hasOp() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required int32 op = 6;</code>
       *
       * <pre>
       *当前操作 1.更新技能经验 2.结算
       * </pre>
       */
      public int getOp() {
        return op_;
      }
      /**
       * <code>required int32 op = 6;</code>
       *
       * <pre>
       *当前操作 1.更新技能经验 2.结算
       * </pre>
       */
      public Builder setOp(int value) {
        bitField0_ |= 0x00000020;
        op_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 op = 6;</code>
       *
       * <pre>
       *当前操作 1.更新技能经验 2.结算
       * </pre>
       */
      public Builder clearOp() {
        bitField0_ = (bitField0_ & ~0x00000020);
        op_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:RespTruckResult)
    }

    static {
      defaultInstance = new RespTruckResult(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:RespTruckResult)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RespTruckResult_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_RespTruckResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025RespTruckResult.proto\"j\n\017RespTruckResu" +
      "lt\022\014\n\004type\030\001 \002(\005\022\r\n\005state\030\002 \002(\005\022\013\n\003exp\030\003" +
      " \002(\005\022\r\n\005level\030\004 \002(\005\022\022\n\nskillPoint\030\005 \002(\005\022" +
      "\n\n\002op\030\006 \002(\005B>\n&com.chuangyou.common.prot" +
      "obuf.pb.truckB\024RespTruckResultProto"
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
    internal_static_RespTruckResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RespTruckResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_RespTruckResult_descriptor,
        new java.lang.String[] { "Type", "State", "Exp", "Level", "SkillPoint", "Op", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
