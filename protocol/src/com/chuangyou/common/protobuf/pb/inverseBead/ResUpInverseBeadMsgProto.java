// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inverseBead/ResUpInverseBeadMsg.proto

package com.chuangyou.common.protobuf.pb.inverseBead;

public final class ResUpInverseBeadMsgProto {
  private ResUpInverseBeadMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ResUpInverseBeadMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ResUpInverseBeadMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 fiveElements = 1;</code>
     *
     * <pre>
     * 五行 1金、2 木、3水、4火、5土
     * </pre>
     */
    boolean hasFiveElements();
    /**
     * <code>required int32 fiveElements = 1;</code>
     *
     * <pre>
     * 五行 1金、2 木、3水、4火、5土
     * </pre>
     */
    int getFiveElements();

    /**
     * <code>required int32 marking = 2;</code>
     *
     * <pre>
     * 升级的印记 1到10
     * </pre>
     */
    boolean hasMarking();
    /**
     * <code>required int32 marking = 2;</code>
     *
     * <pre>
     * 升级的印记 1到10
     * </pre>
     */
    int getMarking();

    /**
     * <code>required int32 stage = 3;</code>
     *
     * <pre>
     * 升级到的阶段
     * </pre>
     */
    boolean hasStage();
    /**
     * <code>required int32 stage = 3;</code>
     *
     * <pre>
     * 升级到的阶段
     * </pre>
     */
    int getStage();

    /**
     * <code>required int32 val = 4;</code>
     *
     * <pre>
     * 当前的进度值 
     * </pre>
     */
    boolean hasVal();
    /**
     * <code>required int32 val = 4;</code>
     *
     * <pre>
     * 当前的进度值 
     * </pre>
     */
    int getVal();
  }
  /**
   * Protobuf type {@code ResUpInverseBeadMsg}
   *
   * <pre>
   *升级成功
   * </pre>
   */
  public static final class ResUpInverseBeadMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ResUpInverseBeadMsg)
      ResUpInverseBeadMsgOrBuilder {
    // Use ResUpInverseBeadMsg.newBuilder() to construct.
    private ResUpInverseBeadMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ResUpInverseBeadMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ResUpInverseBeadMsg defaultInstance;
    public static ResUpInverseBeadMsg getDefaultInstance() {
      return defaultInstance;
    }

    public ResUpInverseBeadMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ResUpInverseBeadMsg(
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
              fiveElements_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              marking_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              stage_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              val_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.internal_static_ResUpInverseBeadMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.internal_static_ResUpInverseBeadMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg.class, com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<ResUpInverseBeadMsg> PARSER =
        new com.google.protobuf.AbstractParser<ResUpInverseBeadMsg>() {
      public ResUpInverseBeadMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResUpInverseBeadMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ResUpInverseBeadMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int FIVEELEMENTS_FIELD_NUMBER = 1;
    private int fiveElements_;
    /**
     * <code>required int32 fiveElements = 1;</code>
     *
     * <pre>
     * 五行 1金、2 木、3水、4火、5土
     * </pre>
     */
    public boolean hasFiveElements() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 fiveElements = 1;</code>
     *
     * <pre>
     * 五行 1金、2 木、3水、4火、5土
     * </pre>
     */
    public int getFiveElements() {
      return fiveElements_;
    }

    public static final int MARKING_FIELD_NUMBER = 2;
    private int marking_;
    /**
     * <code>required int32 marking = 2;</code>
     *
     * <pre>
     * 升级的印记 1到10
     * </pre>
     */
    public boolean hasMarking() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 marking = 2;</code>
     *
     * <pre>
     * 升级的印记 1到10
     * </pre>
     */
    public int getMarking() {
      return marking_;
    }

    public static final int STAGE_FIELD_NUMBER = 3;
    private int stage_;
    /**
     * <code>required int32 stage = 3;</code>
     *
     * <pre>
     * 升级到的阶段
     * </pre>
     */
    public boolean hasStage() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 stage = 3;</code>
     *
     * <pre>
     * 升级到的阶段
     * </pre>
     */
    public int getStage() {
      return stage_;
    }

    public static final int VAL_FIELD_NUMBER = 4;
    private int val_;
    /**
     * <code>required int32 val = 4;</code>
     *
     * <pre>
     * 当前的进度值 
     * </pre>
     */
    public boolean hasVal() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 val = 4;</code>
     *
     * <pre>
     * 当前的进度值 
     * </pre>
     */
    public int getVal() {
      return val_;
    }

    private void initFields() {
      fiveElements_ = 0;
      marking_ = 0;
      stage_ = 0;
      val_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasFiveElements()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMarking()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasStage()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVal()) {
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
        output.writeInt32(1, fiveElements_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, marking_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, stage_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, val_);
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
          .computeInt32Size(1, fiveElements_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, marking_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, stage_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, val_);
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

    public static com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg prototype) {
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
     * Protobuf type {@code ResUpInverseBeadMsg}
     *
     * <pre>
     *升级成功
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ResUpInverseBeadMsg)
        com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.internal_static_ResUpInverseBeadMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.internal_static_ResUpInverseBeadMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg.class, com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg.newBuilder()
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
        fiveElements_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        marking_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        stage_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        val_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.internal_static_ResUpInverseBeadMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg build() {
        com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg result = new com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.fiveElements_ = fiveElements_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.marking_ = marking_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.stage_ = stage_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.val_ = val_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg.getDefaultInstance()) return this;
        if (other.hasFiveElements()) {
          setFiveElements(other.getFiveElements());
        }
        if (other.hasMarking()) {
          setMarking(other.getMarking());
        }
        if (other.hasStage()) {
          setStage(other.getStage());
        }
        if (other.hasVal()) {
          setVal(other.getVal());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasFiveElements()) {
          
          return false;
        }
        if (!hasMarking()) {
          
          return false;
        }
        if (!hasStage()) {
          
          return false;
        }
        if (!hasVal()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.inverseBead.ResUpInverseBeadMsgProto.ResUpInverseBeadMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int fiveElements_ ;
      /**
       * <code>required int32 fiveElements = 1;</code>
       *
       * <pre>
       * 五行 1金、2 木、3水、4火、5土
       * </pre>
       */
      public boolean hasFiveElements() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 fiveElements = 1;</code>
       *
       * <pre>
       * 五行 1金、2 木、3水、4火、5土
       * </pre>
       */
      public int getFiveElements() {
        return fiveElements_;
      }
      /**
       * <code>required int32 fiveElements = 1;</code>
       *
       * <pre>
       * 五行 1金、2 木、3水、4火、5土
       * </pre>
       */
      public Builder setFiveElements(int value) {
        bitField0_ |= 0x00000001;
        fiveElements_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 fiveElements = 1;</code>
       *
       * <pre>
       * 五行 1金、2 木、3水、4火、5土
       * </pre>
       */
      public Builder clearFiveElements() {
        bitField0_ = (bitField0_ & ~0x00000001);
        fiveElements_ = 0;
        onChanged();
        return this;
      }

      private int marking_ ;
      /**
       * <code>required int32 marking = 2;</code>
       *
       * <pre>
       * 升级的印记 1到10
       * </pre>
       */
      public boolean hasMarking() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 marking = 2;</code>
       *
       * <pre>
       * 升级的印记 1到10
       * </pre>
       */
      public int getMarking() {
        return marking_;
      }
      /**
       * <code>required int32 marking = 2;</code>
       *
       * <pre>
       * 升级的印记 1到10
       * </pre>
       */
      public Builder setMarking(int value) {
        bitField0_ |= 0x00000002;
        marking_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 marking = 2;</code>
       *
       * <pre>
       * 升级的印记 1到10
       * </pre>
       */
      public Builder clearMarking() {
        bitField0_ = (bitField0_ & ~0x00000002);
        marking_ = 0;
        onChanged();
        return this;
      }

      private int stage_ ;
      /**
       * <code>required int32 stage = 3;</code>
       *
       * <pre>
       * 升级到的阶段
       * </pre>
       */
      public boolean hasStage() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 stage = 3;</code>
       *
       * <pre>
       * 升级到的阶段
       * </pre>
       */
      public int getStage() {
        return stage_;
      }
      /**
       * <code>required int32 stage = 3;</code>
       *
       * <pre>
       * 升级到的阶段
       * </pre>
       */
      public Builder setStage(int value) {
        bitField0_ |= 0x00000004;
        stage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 stage = 3;</code>
       *
       * <pre>
       * 升级到的阶段
       * </pre>
       */
      public Builder clearStage() {
        bitField0_ = (bitField0_ & ~0x00000004);
        stage_ = 0;
        onChanged();
        return this;
      }

      private int val_ ;
      /**
       * <code>required int32 val = 4;</code>
       *
       * <pre>
       * 当前的进度值 
       * </pre>
       */
      public boolean hasVal() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 val = 4;</code>
       *
       * <pre>
       * 当前的进度值 
       * </pre>
       */
      public int getVal() {
        return val_;
      }
      /**
       * <code>required int32 val = 4;</code>
       *
       * <pre>
       * 当前的进度值 
       * </pre>
       */
      public Builder setVal(int value) {
        bitField0_ |= 0x00000008;
        val_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 val = 4;</code>
       *
       * <pre>
       * 当前的进度值 
       * </pre>
       */
      public Builder clearVal() {
        bitField0_ = (bitField0_ & ~0x00000008);
        val_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ResUpInverseBeadMsg)
    }

    static {
      defaultInstance = new ResUpInverseBeadMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ResUpInverseBeadMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResUpInverseBeadMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ResUpInverseBeadMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%inverseBead/ResUpInverseBeadMsg.proto\"" +
      "X\n\023ResUpInverseBeadMsg\022\024\n\014fiveElements\030\001" +
      " \002(\005\022\017\n\007marking\030\002 \002(\005\022\r\n\005stage\030\003 \002(\005\022\013\n\003" +
      "val\030\004 \002(\005BH\n,com.chuangyou.common.protob" +
      "uf.pb.inverseBeadB\030ResUpInverseBeadMsgPr" +
      "oto"
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
    internal_static_ResUpInverseBeadMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ResUpInverseBeadMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ResUpInverseBeadMsg_descriptor,
        new java.lang.String[] { "FiveElements", "Marking", "Stage", "Val", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
