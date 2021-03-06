// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shop/GetInfoByIdRespMsg.proto

package com.chuangyou.common.protobuf.pb.shop;

public final class GetInfoByIdRespProto {
  private GetInfoByIdRespProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GetInfoByIdRespMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetInfoByIdRespMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 npcId = 1;</code>
     *
     * <pre>
     *npcID  ：不需要可以不做任何处理
     * </pre>
     */
    boolean hasNpcId();
    /**
     * <code>required int32 npcId = 1;</code>
     *
     * <pre>
     *npcID  ：不需要可以不做任何处理
     * </pre>
     */
    int getNpcId();

    /**
     * <code>required int32 shopId = 2;</code>
     *
     * <pre>
     *商店ID
     * </pre>
     */
    boolean hasShopId();
    /**
     * <code>required int32 shopId = 2;</code>
     *
     * <pre>
     *商店ID
     * </pre>
     */
    int getShopId();

    /**
     * <code>required .GoodsInfo info = 3;</code>
     *
     * <pre>
     *商品信息详情
     * </pre>
     */
    boolean hasInfo();
    /**
     * <code>required .GoodsInfo info = 3;</code>
     *
     * <pre>
     *商品信息详情
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo getInfo();
    /**
     * <code>required .GoodsInfo info = 3;</code>
     *
     * <pre>
     *商品信息详情
     * </pre>
     */
    com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfoOrBuilder getInfoOrBuilder();
  }
  /**
   * Protobuf type {@code GetInfoByIdRespMsg}
   *
   * <pre>
   *单个商店商品信息
   *回复
   * </pre>
   */
  public static final class GetInfoByIdRespMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:GetInfoByIdRespMsg)
      GetInfoByIdRespMsgOrBuilder {
    // Use GetInfoByIdRespMsg.newBuilder() to construct.
    private GetInfoByIdRespMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private GetInfoByIdRespMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final GetInfoByIdRespMsg defaultInstance;
    public static GetInfoByIdRespMsg getDefaultInstance() {
      return defaultInstance;
    }

    public GetInfoByIdRespMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private GetInfoByIdRespMsg(
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
              npcId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              shopId_ = input.readInt32();
              break;
            }
            case 26: {
              com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = info_.toBuilder();
              }
              info_ = input.readMessage(com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(info_);
                info_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
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
      return com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.internal_static_GetInfoByIdRespMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.internal_static_GetInfoByIdRespMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg.class, com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<GetInfoByIdRespMsg> PARSER =
        new com.google.protobuf.AbstractParser<GetInfoByIdRespMsg>() {
      public GetInfoByIdRespMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetInfoByIdRespMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<GetInfoByIdRespMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int NPCID_FIELD_NUMBER = 1;
    private int npcId_;
    /**
     * <code>required int32 npcId = 1;</code>
     *
     * <pre>
     *npcID  ：不需要可以不做任何处理
     * </pre>
     */
    public boolean hasNpcId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 npcId = 1;</code>
     *
     * <pre>
     *npcID  ：不需要可以不做任何处理
     * </pre>
     */
    public int getNpcId() {
      return npcId_;
    }

    public static final int SHOPID_FIELD_NUMBER = 2;
    private int shopId_;
    /**
     * <code>required int32 shopId = 2;</code>
     *
     * <pre>
     *商店ID
     * </pre>
     */
    public boolean hasShopId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 shopId = 2;</code>
     *
     * <pre>
     *商店ID
     * </pre>
     */
    public int getShopId() {
      return shopId_;
    }

    public static final int INFO_FIELD_NUMBER = 3;
    private com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo info_;
    /**
     * <code>required .GoodsInfo info = 3;</code>
     *
     * <pre>
     *商品信息详情
     * </pre>
     */
    public boolean hasInfo() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required .GoodsInfo info = 3;</code>
     *
     * <pre>
     *商品信息详情
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo getInfo() {
      return info_;
    }
    /**
     * <code>required .GoodsInfo info = 3;</code>
     *
     * <pre>
     *商品信息详情
     * </pre>
     */
    public com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfoOrBuilder getInfoOrBuilder() {
      return info_;
    }

    private void initFields() {
      npcId_ = 0;
      shopId_ = 0;
      info_ = com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasNpcId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasShopId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasInfo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getInfo().isInitialized()) {
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
        output.writeInt32(1, npcId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, shopId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, info_);
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
          .computeInt32Size(1, npcId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, shopId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, info_);
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

    public static com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg prototype) {
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
     * Protobuf type {@code GetInfoByIdRespMsg}
     *
     * <pre>
     *单个商店商品信息
     *回复
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetInfoByIdRespMsg)
        com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.internal_static_GetInfoByIdRespMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.internal_static_GetInfoByIdRespMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg.class, com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg.newBuilder()
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
          getInfoFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        npcId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        shopId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (infoBuilder_ == null) {
          info_ = com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo.getDefaultInstance();
        } else {
          infoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.internal_static_GetInfoByIdRespMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg build() {
        com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg result = new com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.npcId_ = npcId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.shopId_ = shopId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (infoBuilder_ == null) {
          result.info_ = info_;
        } else {
          result.info_ = infoBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg.getDefaultInstance()) return this;
        if (other.hasNpcId()) {
          setNpcId(other.getNpcId());
        }
        if (other.hasShopId()) {
          setShopId(other.getShopId());
        }
        if (other.hasInfo()) {
          mergeInfo(other.getInfo());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasNpcId()) {
          
          return false;
        }
        if (!hasShopId()) {
          
          return false;
        }
        if (!hasInfo()) {
          
          return false;
        }
        if (!getInfo().isInitialized()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.shop.GetInfoByIdRespProto.GetInfoByIdRespMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int npcId_ ;
      /**
       * <code>required int32 npcId = 1;</code>
       *
       * <pre>
       *npcID  ：不需要可以不做任何处理
       * </pre>
       */
      public boolean hasNpcId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 npcId = 1;</code>
       *
       * <pre>
       *npcID  ：不需要可以不做任何处理
       * </pre>
       */
      public int getNpcId() {
        return npcId_;
      }
      /**
       * <code>required int32 npcId = 1;</code>
       *
       * <pre>
       *npcID  ：不需要可以不做任何处理
       * </pre>
       */
      public Builder setNpcId(int value) {
        bitField0_ |= 0x00000001;
        npcId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 npcId = 1;</code>
       *
       * <pre>
       *npcID  ：不需要可以不做任何处理
       * </pre>
       */
      public Builder clearNpcId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        npcId_ = 0;
        onChanged();
        return this;
      }

      private int shopId_ ;
      /**
       * <code>required int32 shopId = 2;</code>
       *
       * <pre>
       *商店ID
       * </pre>
       */
      public boolean hasShopId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 shopId = 2;</code>
       *
       * <pre>
       *商店ID
       * </pre>
       */
      public int getShopId() {
        return shopId_;
      }
      /**
       * <code>required int32 shopId = 2;</code>
       *
       * <pre>
       *商店ID
       * </pre>
       */
      public Builder setShopId(int value) {
        bitField0_ |= 0x00000002;
        shopId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 shopId = 2;</code>
       *
       * <pre>
       *商店ID
       * </pre>
       */
      public Builder clearShopId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        shopId_ = 0;
        onChanged();
        return this;
      }

      private com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo info_ = com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo, com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo.Builder, com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfoOrBuilder> infoBuilder_;
      /**
       * <code>required .GoodsInfo info = 3;</code>
       *
       * <pre>
       *商品信息详情
       * </pre>
       */
      public boolean hasInfo() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required .GoodsInfo info = 3;</code>
       *
       * <pre>
       *商品信息详情
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo getInfo() {
        if (infoBuilder_ == null) {
          return info_;
        } else {
          return infoBuilder_.getMessage();
        }
      }
      /**
       * <code>required .GoodsInfo info = 3;</code>
       *
       * <pre>
       *商品信息详情
       * </pre>
       */
      public Builder setInfo(com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo value) {
        if (infoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          info_ = value;
          onChanged();
        } else {
          infoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .GoodsInfo info = 3;</code>
       *
       * <pre>
       *商品信息详情
       * </pre>
       */
      public Builder setInfo(
          com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo.Builder builderForValue) {
        if (infoBuilder_ == null) {
          info_ = builderForValue.build();
          onChanged();
        } else {
          infoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .GoodsInfo info = 3;</code>
       *
       * <pre>
       *商品信息详情
       * </pre>
       */
      public Builder mergeInfo(com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo value) {
        if (infoBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004) &&
              info_ != com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo.getDefaultInstance()) {
            info_ =
              com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo.newBuilder(info_).mergeFrom(value).buildPartial();
          } else {
            info_ = value;
          }
          onChanged();
        } else {
          infoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>required .GoodsInfo info = 3;</code>
       *
       * <pre>
       *商品信息详情
       * </pre>
       */
      public Builder clearInfo() {
        if (infoBuilder_ == null) {
          info_ = com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo.getDefaultInstance();
          onChanged();
        } else {
          infoBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>required .GoodsInfo info = 3;</code>
       *
       * <pre>
       *商品信息详情
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo.Builder getInfoBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>required .GoodsInfo info = 3;</code>
       *
       * <pre>
       *商品信息详情
       * </pre>
       */
      public com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfoOrBuilder getInfoOrBuilder() {
        if (infoBuilder_ != null) {
          return infoBuilder_.getMessageOrBuilder();
        } else {
          return info_;
        }
      }
      /**
       * <code>required .GoodsInfo info = 3;</code>
       *
       * <pre>
       *商品信息详情
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<
          com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo, com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo.Builder, com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfoOrBuilder> 
          getInfoFieldBuilder() {
        if (infoBuilder_ == null) {
          infoBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo, com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfo.Builder, com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.GoodsInfoOrBuilder>(
                  getInfo(),
                  getParentForChildren(),
                  isClean());
          info_ = null;
        }
        return infoBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:GetInfoByIdRespMsg)
    }

    static {
      defaultInstance = new GetInfoByIdRespMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:GetInfoByIdRespMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetInfoByIdRespMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_GetInfoByIdRespMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035shop/GetInfoByIdRespMsg.proto\032\024shop/Go" +
      "odsInfo.proto\"M\n\022GetInfoByIdRespMsg\022\r\n\005n" +
      "pcId\030\001 \002(\005\022\016\n\006shopId\030\002 \002(\005\022\030\n\004info\030\003 \002(\013" +
      "2\n.GoodsInfoB=\n%com.chuangyou.common.pro" +
      "tobuf.pb.shopB\024GetInfoByIdRespProto"
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
          com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.getDescriptor(),
        }, assigner);
    internal_static_GetInfoByIdRespMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetInfoByIdRespMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_GetInfoByIdRespMsg_descriptor,
        new java.lang.String[] { "NpcId", "ShopId", "Info", });
    com.chuangyou.common.protobuf.pb.shop.GoodsInfoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
