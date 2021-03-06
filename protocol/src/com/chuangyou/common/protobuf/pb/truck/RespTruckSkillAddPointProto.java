// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RespTruckSkillAddPoint.proto

package com.chuangyou.common.protobuf.pb.truck;

public final class RespTruckSkillAddPointProto {
  private RespTruckSkillAddPointProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RespTruckSkillAddPointOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RespTruckSkillAddPoint)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 addPointState = 1;</code>
     *
     * <pre>
     *加点状态 1.成功 2.失败
     * </pre>
     */
    boolean hasAddPointState();
    /**
     * <code>required int32 addPointState = 1;</code>
     *
     * <pre>
     *加点状态 1.成功 2.失败
     * </pre>
     */
    int getAddPointState();

    /**
     * <code>required int32 skilltype = 2;</code>
     *
     * <pre>
     *技能类型 1.镖车技能 2.帮派镖车技能 3.镖师技能 4.镖师天赋
     * </pre>
     */
    boolean hasSkilltype();
    /**
     * <code>required int32 skilltype = 2;</code>
     *
     * <pre>
     *技能类型 1.镖车技能 2.帮派镖车技能 3.镖师技能 4.镖师天赋
     * </pre>
     */
    int getSkilltype();

    /**
     * <code>required int32 remainPoint = 3;</code>
     *
     * <pre>
     *可加点
     * </pre>
     */
    boolean hasRemainPoint();
    /**
     * <code>required int32 remainPoint = 3;</code>
     *
     * <pre>
     *可加点
     * </pre>
     */
    int getRemainPoint();

    /**
     * <code>required int32 oldskillId = 4;</code>
     *
     * <pre>
     *技能Id
     * </pre>
     */
    boolean hasOldskillId();
    /**
     * <code>required int32 oldskillId = 4;</code>
     *
     * <pre>
     *技能Id
     * </pre>
     */
    int getOldskillId();

    /**
     * <code>required int32 newskillId = 5;</code>
     *
     * <pre>
     *新的技能Id
     * </pre>
     */
    boolean hasNewskillId();
    /**
     * <code>required int32 newskillId = 5;</code>
     *
     * <pre>
     *新的技能Id
     * </pre>
     */
    int getNewskillId();

    /**
     * <code>required int32 type = 6;</code>
     *
     * <pre>
     * </pre>
     */
    boolean hasType();
    /**
     * <code>required int32 type = 6;</code>
     *
     * <pre>
     * </pre>
     */
    int getType();
  }
  /**
   * Protobuf type {@code RespTruckSkillAddPoint}
   *
   * <pre>
   *回应
   * </pre>
   */
  public static final class RespTruckSkillAddPoint extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:RespTruckSkillAddPoint)
      RespTruckSkillAddPointOrBuilder {
    // Use RespTruckSkillAddPoint.newBuilder() to construct.
    private RespTruckSkillAddPoint(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RespTruckSkillAddPoint(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RespTruckSkillAddPoint defaultInstance;
    public static RespTruckSkillAddPoint getDefaultInstance() {
      return defaultInstance;
    }

    public RespTruckSkillAddPoint getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RespTruckSkillAddPoint(
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
              addPointState_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              skilltype_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              remainPoint_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              oldskillId_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              newskillId_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              type_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.internal_static_RespTruckSkillAddPoint_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.internal_static_RespTruckSkillAddPoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint.class, com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint.Builder.class);
    }

    public static com.google.protobuf.Parser<RespTruckSkillAddPoint> PARSER =
        new com.google.protobuf.AbstractParser<RespTruckSkillAddPoint>() {
      public RespTruckSkillAddPoint parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RespTruckSkillAddPoint(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RespTruckSkillAddPoint> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ADDPOINTSTATE_FIELD_NUMBER = 1;
    private int addPointState_;
    /**
     * <code>required int32 addPointState = 1;</code>
     *
     * <pre>
     *加点状态 1.成功 2.失败
     * </pre>
     */
    public boolean hasAddPointState() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 addPointState = 1;</code>
     *
     * <pre>
     *加点状态 1.成功 2.失败
     * </pre>
     */
    public int getAddPointState() {
      return addPointState_;
    }

    public static final int SKILLTYPE_FIELD_NUMBER = 2;
    private int skilltype_;
    /**
     * <code>required int32 skilltype = 2;</code>
     *
     * <pre>
     *技能类型 1.镖车技能 2.帮派镖车技能 3.镖师技能 4.镖师天赋
     * </pre>
     */
    public boolean hasSkilltype() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 skilltype = 2;</code>
     *
     * <pre>
     *技能类型 1.镖车技能 2.帮派镖车技能 3.镖师技能 4.镖师天赋
     * </pre>
     */
    public int getSkilltype() {
      return skilltype_;
    }

    public static final int REMAINPOINT_FIELD_NUMBER = 3;
    private int remainPoint_;
    /**
     * <code>required int32 remainPoint = 3;</code>
     *
     * <pre>
     *可加点
     * </pre>
     */
    public boolean hasRemainPoint() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 remainPoint = 3;</code>
     *
     * <pre>
     *可加点
     * </pre>
     */
    public int getRemainPoint() {
      return remainPoint_;
    }

    public static final int OLDSKILLID_FIELD_NUMBER = 4;
    private int oldskillId_;
    /**
     * <code>required int32 oldskillId = 4;</code>
     *
     * <pre>
     *技能Id
     * </pre>
     */
    public boolean hasOldskillId() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 oldskillId = 4;</code>
     *
     * <pre>
     *技能Id
     * </pre>
     */
    public int getOldskillId() {
      return oldskillId_;
    }

    public static final int NEWSKILLID_FIELD_NUMBER = 5;
    private int newskillId_;
    /**
     * <code>required int32 newskillId = 5;</code>
     *
     * <pre>
     *新的技能Id
     * </pre>
     */
    public boolean hasNewskillId() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int32 newskillId = 5;</code>
     *
     * <pre>
     *新的技能Id
     * </pre>
     */
    public int getNewskillId() {
      return newskillId_;
    }

    public static final int TYPE_FIELD_NUMBER = 6;
    private int type_;
    /**
     * <code>required int32 type = 6;</code>
     *
     * <pre>
     * </pre>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required int32 type = 6;</code>
     *
     * <pre>
     * </pre>
     */
    public int getType() {
      return type_;
    }

    private void initFields() {
      addPointState_ = 0;
      skilltype_ = 0;
      remainPoint_ = 0;
      oldskillId_ = 0;
      newskillId_ = 0;
      type_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasAddPointState()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSkilltype()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRemainPoint()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOldskillId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNewskillId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
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
        output.writeInt32(1, addPointState_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, skilltype_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, remainPoint_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, oldskillId_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, newskillId_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, type_);
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
          .computeInt32Size(1, addPointState_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, skilltype_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, remainPoint_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, oldskillId_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, newskillId_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, type_);
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

    public static com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint prototype) {
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
     * Protobuf type {@code RespTruckSkillAddPoint}
     *
     * <pre>
     *回应
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RespTruckSkillAddPoint)
        com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPointOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.internal_static_RespTruckSkillAddPoint_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.internal_static_RespTruckSkillAddPoint_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint.class, com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint.newBuilder()
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
        addPointState_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        skilltype_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        remainPoint_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        oldskillId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        newskillId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.internal_static_RespTruckSkillAddPoint_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint build() {
        com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint buildPartial() {
        com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint result = new com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.addPointState_ = addPointState_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.skilltype_ = skilltype_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.remainPoint_ = remainPoint_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.oldskillId_ = oldskillId_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.newskillId_ = newskillId_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint other) {
        if (other == com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint.getDefaultInstance()) return this;
        if (other.hasAddPointState()) {
          setAddPointState(other.getAddPointState());
        }
        if (other.hasSkilltype()) {
          setSkilltype(other.getSkilltype());
        }
        if (other.hasRemainPoint()) {
          setRemainPoint(other.getRemainPoint());
        }
        if (other.hasOldskillId()) {
          setOldskillId(other.getOldskillId());
        }
        if (other.hasNewskillId()) {
          setNewskillId(other.getNewskillId());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasAddPointState()) {
          
          return false;
        }
        if (!hasSkilltype()) {
          
          return false;
        }
        if (!hasRemainPoint()) {
          
          return false;
        }
        if (!hasOldskillId()) {
          
          return false;
        }
        if (!hasNewskillId()) {
          
          return false;
        }
        if (!hasType()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.truck.RespTruckSkillAddPointProto.RespTruckSkillAddPoint) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int addPointState_ ;
      /**
       * <code>required int32 addPointState = 1;</code>
       *
       * <pre>
       *加点状态 1.成功 2.失败
       * </pre>
       */
      public boolean hasAddPointState() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 addPointState = 1;</code>
       *
       * <pre>
       *加点状态 1.成功 2.失败
       * </pre>
       */
      public int getAddPointState() {
        return addPointState_;
      }
      /**
       * <code>required int32 addPointState = 1;</code>
       *
       * <pre>
       *加点状态 1.成功 2.失败
       * </pre>
       */
      public Builder setAddPointState(int value) {
        bitField0_ |= 0x00000001;
        addPointState_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 addPointState = 1;</code>
       *
       * <pre>
       *加点状态 1.成功 2.失败
       * </pre>
       */
      public Builder clearAddPointState() {
        bitField0_ = (bitField0_ & ~0x00000001);
        addPointState_ = 0;
        onChanged();
        return this;
      }

      private int skilltype_ ;
      /**
       * <code>required int32 skilltype = 2;</code>
       *
       * <pre>
       *技能类型 1.镖车技能 2.帮派镖车技能 3.镖师技能 4.镖师天赋
       * </pre>
       */
      public boolean hasSkilltype() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 skilltype = 2;</code>
       *
       * <pre>
       *技能类型 1.镖车技能 2.帮派镖车技能 3.镖师技能 4.镖师天赋
       * </pre>
       */
      public int getSkilltype() {
        return skilltype_;
      }
      /**
       * <code>required int32 skilltype = 2;</code>
       *
       * <pre>
       *技能类型 1.镖车技能 2.帮派镖车技能 3.镖师技能 4.镖师天赋
       * </pre>
       */
      public Builder setSkilltype(int value) {
        bitField0_ |= 0x00000002;
        skilltype_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 skilltype = 2;</code>
       *
       * <pre>
       *技能类型 1.镖车技能 2.帮派镖车技能 3.镖师技能 4.镖师天赋
       * </pre>
       */
      public Builder clearSkilltype() {
        bitField0_ = (bitField0_ & ~0x00000002);
        skilltype_ = 0;
        onChanged();
        return this;
      }

      private int remainPoint_ ;
      /**
       * <code>required int32 remainPoint = 3;</code>
       *
       * <pre>
       *可加点
       * </pre>
       */
      public boolean hasRemainPoint() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 remainPoint = 3;</code>
       *
       * <pre>
       *可加点
       * </pre>
       */
      public int getRemainPoint() {
        return remainPoint_;
      }
      /**
       * <code>required int32 remainPoint = 3;</code>
       *
       * <pre>
       *可加点
       * </pre>
       */
      public Builder setRemainPoint(int value) {
        bitField0_ |= 0x00000004;
        remainPoint_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 remainPoint = 3;</code>
       *
       * <pre>
       *可加点
       * </pre>
       */
      public Builder clearRemainPoint() {
        bitField0_ = (bitField0_ & ~0x00000004);
        remainPoint_ = 0;
        onChanged();
        return this;
      }

      private int oldskillId_ ;
      /**
       * <code>required int32 oldskillId = 4;</code>
       *
       * <pre>
       *技能Id
       * </pre>
       */
      public boolean hasOldskillId() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 oldskillId = 4;</code>
       *
       * <pre>
       *技能Id
       * </pre>
       */
      public int getOldskillId() {
        return oldskillId_;
      }
      /**
       * <code>required int32 oldskillId = 4;</code>
       *
       * <pre>
       *技能Id
       * </pre>
       */
      public Builder setOldskillId(int value) {
        bitField0_ |= 0x00000008;
        oldskillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 oldskillId = 4;</code>
       *
       * <pre>
       *技能Id
       * </pre>
       */
      public Builder clearOldskillId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        oldskillId_ = 0;
        onChanged();
        return this;
      }

      private int newskillId_ ;
      /**
       * <code>required int32 newskillId = 5;</code>
       *
       * <pre>
       *新的技能Id
       * </pre>
       */
      public boolean hasNewskillId() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required int32 newskillId = 5;</code>
       *
       * <pre>
       *新的技能Id
       * </pre>
       */
      public int getNewskillId() {
        return newskillId_;
      }
      /**
       * <code>required int32 newskillId = 5;</code>
       *
       * <pre>
       *新的技能Id
       * </pre>
       */
      public Builder setNewskillId(int value) {
        bitField0_ |= 0x00000010;
        newskillId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 newskillId = 5;</code>
       *
       * <pre>
       *新的技能Id
       * </pre>
       */
      public Builder clearNewskillId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        newskillId_ = 0;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <code>required int32 type = 6;</code>
       *
       * <pre>
       * </pre>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required int32 type = 6;</code>
       *
       * <pre>
       * </pre>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>required int32 type = 6;</code>
       *
       * <pre>
       * </pre>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000020;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 type = 6;</code>
       *
       * <pre>
       * </pre>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000020);
        type_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:RespTruckSkillAddPoint)
    }

    static {
      defaultInstance = new RespTruckSkillAddPoint(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:RespTruckSkillAddPoint)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RespTruckSkillAddPoint_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_RespTruckSkillAddPoint_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034RespTruckSkillAddPoint.proto\"\215\001\n\026RespT" +
      "ruckSkillAddPoint\022\025\n\raddPointState\030\001 \002(\005" +
      "\022\021\n\tskilltype\030\002 \002(\005\022\023\n\013remainPoint\030\003 \002(\005" +
      "\022\022\n\noldskillId\030\004 \002(\005\022\022\n\nnewskillId\030\005 \002(\005" +
      "\022\014\n\004type\030\006 \002(\005BE\n&com.chuangyou.common.p" +
      "rotobuf.pb.truckB\033RespTruckSkillAddPoint" +
      "Proto"
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
    internal_static_RespTruckSkillAddPoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RespTruckSkillAddPoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_RespTruckSkillAddPoint_descriptor,
        new java.lang.String[] { "AddPointState", "Skilltype", "RemainPoint", "OldskillId", "NewskillId", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
