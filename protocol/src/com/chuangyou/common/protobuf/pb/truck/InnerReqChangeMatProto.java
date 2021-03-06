// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InnerReqChangeMat.proto

package com.chuangyou.common.protobuf.pb.truck;

public final class InnerReqChangeMatProto {
  private InnerReqChangeMatProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface InnerReqChangeMatOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InnerReqChangeMat)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 truckId = 1;</code>
     *
     * <pre>
     *镖车ID	
     * </pre>
     */
    boolean hasTruckId();
    /**
     * <code>required int64 truckId = 1;</code>
     *
     * <pre>
     *镖车ID	
     * </pre>
     */
    long getTruckId();

    /**
     * <code>required int32 addtype = 2;</code>
     *
     * <pre>
     *添加类型 1.灵石添加 2.物品添加	
     * </pre>
     */
    boolean hasAddtype();
    /**
     * <code>required int32 addtype = 2;</code>
     *
     * <pre>
     *添加类型 1.灵石添加 2.物品添加	
     * </pre>
     */
    int getAddtype();

    /**
     * <code>required int32 itemTypeId = 3;</code>
     *
     * <pre>
     *使用物品的ID
     * </pre>
     */
    boolean hasItemTypeId();
    /**
     * <code>required int32 itemTypeId = 3;</code>
     *
     * <pre>
     *使用物品的ID
     * </pre>
     */
    int getItemTypeId();

    /**
     * <code>required int32 count = 4;</code>
     *
     * <pre>
     *添加物质的数量
     * </pre>
     */
    boolean hasCount();
    /**
     * <code>required int32 count = 4;</code>
     *
     * <pre>
     *添加物质的数量
     * </pre>
     */
    int getCount();

    /**
     * <code>required int32 price = 5;</code>
     *
     * <pre>
     *添加物质的价格(灵石)
     * </pre>
     */
    boolean hasPrice();
    /**
     * <code>required int32 price = 5;</code>
     *
     * <pre>
     *添加物质的价格(灵石)
     * </pre>
     */
    int getPrice();

    /**
     * <code>required int32 mapId = 6;</code>
     *
     * <pre>
     *镖车所在的地图Id
     * </pre>
     */
    boolean hasMapId();
    /**
     * <code>required int32 mapId = 6;</code>
     *
     * <pre>
     *镖车所在的地图Id
     * </pre>
     */
    int getMapId();
  }
  /**
   * Protobuf type {@code InnerReqChangeMat}
   *
   * <pre>
   *请求兑换物资
   * </pre>
   */
  public static final class InnerReqChangeMat extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:InnerReqChangeMat)
      InnerReqChangeMatOrBuilder {
    // Use InnerReqChangeMat.newBuilder() to construct.
    private InnerReqChangeMat(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private InnerReqChangeMat(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final InnerReqChangeMat defaultInstance;
    public static InnerReqChangeMat getDefaultInstance() {
      return defaultInstance;
    }

    public InnerReqChangeMat getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private InnerReqChangeMat(
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
              truckId_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              addtype_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              itemTypeId_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              count_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              price_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              mapId_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.internal_static_InnerReqChangeMat_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.internal_static_InnerReqChangeMat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat.class, com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat.Builder.class);
    }

    public static com.google.protobuf.Parser<InnerReqChangeMat> PARSER =
        new com.google.protobuf.AbstractParser<InnerReqChangeMat>() {
      public InnerReqChangeMat parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InnerReqChangeMat(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<InnerReqChangeMat> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TRUCKID_FIELD_NUMBER = 1;
    private long truckId_;
    /**
     * <code>required int64 truckId = 1;</code>
     *
     * <pre>
     *镖车ID	
     * </pre>
     */
    public boolean hasTruckId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 truckId = 1;</code>
     *
     * <pre>
     *镖车ID	
     * </pre>
     */
    public long getTruckId() {
      return truckId_;
    }

    public static final int ADDTYPE_FIELD_NUMBER = 2;
    private int addtype_;
    /**
     * <code>required int32 addtype = 2;</code>
     *
     * <pre>
     *添加类型 1.灵石添加 2.物品添加	
     * </pre>
     */
    public boolean hasAddtype() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 addtype = 2;</code>
     *
     * <pre>
     *添加类型 1.灵石添加 2.物品添加	
     * </pre>
     */
    public int getAddtype() {
      return addtype_;
    }

    public static final int ITEMTYPEID_FIELD_NUMBER = 3;
    private int itemTypeId_;
    /**
     * <code>required int32 itemTypeId = 3;</code>
     *
     * <pre>
     *使用物品的ID
     * </pre>
     */
    public boolean hasItemTypeId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 itemTypeId = 3;</code>
     *
     * <pre>
     *使用物品的ID
     * </pre>
     */
    public int getItemTypeId() {
      return itemTypeId_;
    }

    public static final int COUNT_FIELD_NUMBER = 4;
    private int count_;
    /**
     * <code>required int32 count = 4;</code>
     *
     * <pre>
     *添加物质的数量
     * </pre>
     */
    public boolean hasCount() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 count = 4;</code>
     *
     * <pre>
     *添加物质的数量
     * </pre>
     */
    public int getCount() {
      return count_;
    }

    public static final int PRICE_FIELD_NUMBER = 5;
    private int price_;
    /**
     * <code>required int32 price = 5;</code>
     *
     * <pre>
     *添加物质的价格(灵石)
     * </pre>
     */
    public boolean hasPrice() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required int32 price = 5;</code>
     *
     * <pre>
     *添加物质的价格(灵石)
     * </pre>
     */
    public int getPrice() {
      return price_;
    }

    public static final int MAPID_FIELD_NUMBER = 6;
    private int mapId_;
    /**
     * <code>required int32 mapId = 6;</code>
     *
     * <pre>
     *镖车所在的地图Id
     * </pre>
     */
    public boolean hasMapId() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>required int32 mapId = 6;</code>
     *
     * <pre>
     *镖车所在的地图Id
     * </pre>
     */
    public int getMapId() {
      return mapId_;
    }

    private void initFields() {
      truckId_ = 0L;
      addtype_ = 0;
      itemTypeId_ = 0;
      count_ = 0;
      price_ = 0;
      mapId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTruckId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasAddtype()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasItemTypeId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCount()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPrice()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMapId()) {
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
        output.writeInt64(1, truckId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, addtype_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, itemTypeId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, count_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, price_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, mapId_);
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
          .computeInt64Size(1, truckId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, addtype_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, itemTypeId_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, count_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, price_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, mapId_);
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

    public static com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat prototype) {
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
     * Protobuf type {@code InnerReqChangeMat}
     *
     * <pre>
     *请求兑换物资
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InnerReqChangeMat)
        com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMatOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.internal_static_InnerReqChangeMat_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.internal_static_InnerReqChangeMat_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat.class, com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat.newBuilder()
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
        truckId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        addtype_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        itemTypeId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        count_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        price_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        mapId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.internal_static_InnerReqChangeMat_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat build() {
        com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat buildPartial() {
        com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat result = new com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.truckId_ = truckId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.addtype_ = addtype_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.itemTypeId_ = itemTypeId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.count_ = count_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.price_ = price_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.mapId_ = mapId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat other) {
        if (other == com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat.getDefaultInstance()) return this;
        if (other.hasTruckId()) {
          setTruckId(other.getTruckId());
        }
        if (other.hasAddtype()) {
          setAddtype(other.getAddtype());
        }
        if (other.hasItemTypeId()) {
          setItemTypeId(other.getItemTypeId());
        }
        if (other.hasCount()) {
          setCount(other.getCount());
        }
        if (other.hasPrice()) {
          setPrice(other.getPrice());
        }
        if (other.hasMapId()) {
          setMapId(other.getMapId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTruckId()) {
          
          return false;
        }
        if (!hasAddtype()) {
          
          return false;
        }
        if (!hasItemTypeId()) {
          
          return false;
        }
        if (!hasCount()) {
          
          return false;
        }
        if (!hasPrice()) {
          
          return false;
        }
        if (!hasMapId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.truck.InnerReqChangeMatProto.InnerReqChangeMat) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long truckId_ ;
      /**
       * <code>required int64 truckId = 1;</code>
       *
       * <pre>
       *镖车ID	
       * </pre>
       */
      public boolean hasTruckId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 truckId = 1;</code>
       *
       * <pre>
       *镖车ID	
       * </pre>
       */
      public long getTruckId() {
        return truckId_;
      }
      /**
       * <code>required int64 truckId = 1;</code>
       *
       * <pre>
       *镖车ID	
       * </pre>
       */
      public Builder setTruckId(long value) {
        bitField0_ |= 0x00000001;
        truckId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 truckId = 1;</code>
       *
       * <pre>
       *镖车ID	
       * </pre>
       */
      public Builder clearTruckId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        truckId_ = 0L;
        onChanged();
        return this;
      }

      private int addtype_ ;
      /**
       * <code>required int32 addtype = 2;</code>
       *
       * <pre>
       *添加类型 1.灵石添加 2.物品添加	
       * </pre>
       */
      public boolean hasAddtype() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 addtype = 2;</code>
       *
       * <pre>
       *添加类型 1.灵石添加 2.物品添加	
       * </pre>
       */
      public int getAddtype() {
        return addtype_;
      }
      /**
       * <code>required int32 addtype = 2;</code>
       *
       * <pre>
       *添加类型 1.灵石添加 2.物品添加	
       * </pre>
       */
      public Builder setAddtype(int value) {
        bitField0_ |= 0x00000002;
        addtype_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 addtype = 2;</code>
       *
       * <pre>
       *添加类型 1.灵石添加 2.物品添加	
       * </pre>
       */
      public Builder clearAddtype() {
        bitField0_ = (bitField0_ & ~0x00000002);
        addtype_ = 0;
        onChanged();
        return this;
      }

      private int itemTypeId_ ;
      /**
       * <code>required int32 itemTypeId = 3;</code>
       *
       * <pre>
       *使用物品的ID
       * </pre>
       */
      public boolean hasItemTypeId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 itemTypeId = 3;</code>
       *
       * <pre>
       *使用物品的ID
       * </pre>
       */
      public int getItemTypeId() {
        return itemTypeId_;
      }
      /**
       * <code>required int32 itemTypeId = 3;</code>
       *
       * <pre>
       *使用物品的ID
       * </pre>
       */
      public Builder setItemTypeId(int value) {
        bitField0_ |= 0x00000004;
        itemTypeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 itemTypeId = 3;</code>
       *
       * <pre>
       *使用物品的ID
       * </pre>
       */
      public Builder clearItemTypeId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        itemTypeId_ = 0;
        onChanged();
        return this;
      }

      private int count_ ;
      /**
       * <code>required int32 count = 4;</code>
       *
       * <pre>
       *添加物质的数量
       * </pre>
       */
      public boolean hasCount() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required int32 count = 4;</code>
       *
       * <pre>
       *添加物质的数量
       * </pre>
       */
      public int getCount() {
        return count_;
      }
      /**
       * <code>required int32 count = 4;</code>
       *
       * <pre>
       *添加物质的数量
       * </pre>
       */
      public Builder setCount(int value) {
        bitField0_ |= 0x00000008;
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 count = 4;</code>
       *
       * <pre>
       *添加物质的数量
       * </pre>
       */
      public Builder clearCount() {
        bitField0_ = (bitField0_ & ~0x00000008);
        count_ = 0;
        onChanged();
        return this;
      }

      private int price_ ;
      /**
       * <code>required int32 price = 5;</code>
       *
       * <pre>
       *添加物质的价格(灵石)
       * </pre>
       */
      public boolean hasPrice() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required int32 price = 5;</code>
       *
       * <pre>
       *添加物质的价格(灵石)
       * </pre>
       */
      public int getPrice() {
        return price_;
      }
      /**
       * <code>required int32 price = 5;</code>
       *
       * <pre>
       *添加物质的价格(灵石)
       * </pre>
       */
      public Builder setPrice(int value) {
        bitField0_ |= 0x00000010;
        price_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 price = 5;</code>
       *
       * <pre>
       *添加物质的价格(灵石)
       * </pre>
       */
      public Builder clearPrice() {
        bitField0_ = (bitField0_ & ~0x00000010);
        price_ = 0;
        onChanged();
        return this;
      }

      private int mapId_ ;
      /**
       * <code>required int32 mapId = 6;</code>
       *
       * <pre>
       *镖车所在的地图Id
       * </pre>
       */
      public boolean hasMapId() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>required int32 mapId = 6;</code>
       *
       * <pre>
       *镖车所在的地图Id
       * </pre>
       */
      public int getMapId() {
        return mapId_;
      }
      /**
       * <code>required int32 mapId = 6;</code>
       *
       * <pre>
       *镖车所在的地图Id
       * </pre>
       */
      public Builder setMapId(int value) {
        bitField0_ |= 0x00000020;
        mapId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 mapId = 6;</code>
       *
       * <pre>
       *镖车所在的地图Id
       * </pre>
       */
      public Builder clearMapId() {
        bitField0_ = (bitField0_ & ~0x00000020);
        mapId_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:InnerReqChangeMat)
    }

    static {
      defaultInstance = new InnerReqChangeMat(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:InnerReqChangeMat)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InnerReqChangeMat_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_InnerReqChangeMat_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027InnerReqChangeMat.proto\"v\n\021InnerReqCha" +
      "ngeMat\022\017\n\007truckId\030\001 \002(\003\022\017\n\007addtype\030\002 \002(\005" +
      "\022\022\n\nitemTypeId\030\003 \002(\005\022\r\n\005count\030\004 \002(\005\022\r\n\005p" +
      "rice\030\005 \002(\005\022\r\n\005mapId\030\006 \002(\005B@\n&com.chuangy" +
      "ou.common.protobuf.pb.truckB\026InnerReqCha" +
      "ngeMatProto"
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
    internal_static_InnerReqChangeMat_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InnerReqChangeMat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_InnerReqChangeMat_descriptor,
        new java.lang.String[] { "TruckId", "Addtype", "ItemTypeId", "Count", "Price", "MapId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
