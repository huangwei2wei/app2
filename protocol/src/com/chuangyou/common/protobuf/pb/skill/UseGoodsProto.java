// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: skill/UseGoods.proto

package com.chuangyou.common.protobuf.pb.skill;

public final class UseGoodsProto {
  private UseGoodsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface UseGoodsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UseGoods)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 useGoodsId = 1;</code>
     *
     * <pre>
     *一键升级消耗的物品ID
     * </pre>
     */
    boolean hasUseGoodsId();
    /**
     * <code>required int32 useGoodsId = 1;</code>
     *
     * <pre>
     *一键升级消耗的物品ID
     * </pre>
     */
    int getUseGoodsId();

    /**
     * <code>required int32 useGoodsNum = 2;</code>
     *
     * <pre>
     *一键升级消耗的物品数量
     * </pre>
     */
    boolean hasUseGoodsNum();
    /**
     * <code>required int32 useGoodsNum = 2;</code>
     *
     * <pre>
     *一键升级消耗的物品数量
     * </pre>
     */
    int getUseGoodsNum();
  }
  /**
   * Protobuf type {@code UseGoods}
   *
   * <pre>
   *一键升级消耗的物品
   * </pre>
   */
  public static final class UseGoods extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:UseGoods)
      UseGoodsOrBuilder {
    // Use UseGoods.newBuilder() to construct.
    private UseGoods(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private UseGoods(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final UseGoods defaultInstance;
    public static UseGoods getDefaultInstance() {
      return defaultInstance;
    }

    public UseGoods getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private UseGoods(
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
              useGoodsId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              useGoodsNum_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.internal_static_UseGoods_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.internal_static_UseGoods_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods.class, com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods.Builder.class);
    }

    public static com.google.protobuf.Parser<UseGoods> PARSER =
        new com.google.protobuf.AbstractParser<UseGoods>() {
      public UseGoods parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UseGoods(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<UseGoods> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int USEGOODSID_FIELD_NUMBER = 1;
    private int useGoodsId_;
    /**
     * <code>required int32 useGoodsId = 1;</code>
     *
     * <pre>
     *一键升级消耗的物品ID
     * </pre>
     */
    public boolean hasUseGoodsId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 useGoodsId = 1;</code>
     *
     * <pre>
     *一键升级消耗的物品ID
     * </pre>
     */
    public int getUseGoodsId() {
      return useGoodsId_;
    }

    public static final int USEGOODSNUM_FIELD_NUMBER = 2;
    private int useGoodsNum_;
    /**
     * <code>required int32 useGoodsNum = 2;</code>
     *
     * <pre>
     *一键升级消耗的物品数量
     * </pre>
     */
    public boolean hasUseGoodsNum() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 useGoodsNum = 2;</code>
     *
     * <pre>
     *一键升级消耗的物品数量
     * </pre>
     */
    public int getUseGoodsNum() {
      return useGoodsNum_;
    }

    private void initFields() {
      useGoodsId_ = 0;
      useGoodsNum_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasUseGoodsId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasUseGoodsNum()) {
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
        output.writeInt32(1, useGoodsId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, useGoodsNum_);
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
          .computeInt32Size(1, useGoodsId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, useGoodsNum_);
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

    public static com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods prototype) {
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
     * Protobuf type {@code UseGoods}
     *
     * <pre>
     *一键升级消耗的物品
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UseGoods)
        com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoodsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.internal_static_UseGoods_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.internal_static_UseGoods_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods.class, com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods.newBuilder()
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
        useGoodsId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        useGoodsNum_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.internal_static_UseGoods_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods build() {
        com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods buildPartial() {
        com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods result = new com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.useGoodsId_ = useGoodsId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.useGoodsNum_ = useGoodsNum_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods other) {
        if (other == com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods.getDefaultInstance()) return this;
        if (other.hasUseGoodsId()) {
          setUseGoodsId(other.getUseGoodsId());
        }
        if (other.hasUseGoodsNum()) {
          setUseGoodsNum(other.getUseGoodsNum());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasUseGoodsId()) {
          
          return false;
        }
        if (!hasUseGoodsNum()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.skill.UseGoodsProto.UseGoods) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int useGoodsId_ ;
      /**
       * <code>required int32 useGoodsId = 1;</code>
       *
       * <pre>
       *一键升级消耗的物品ID
       * </pre>
       */
      public boolean hasUseGoodsId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 useGoodsId = 1;</code>
       *
       * <pre>
       *一键升级消耗的物品ID
       * </pre>
       */
      public int getUseGoodsId() {
        return useGoodsId_;
      }
      /**
       * <code>required int32 useGoodsId = 1;</code>
       *
       * <pre>
       *一键升级消耗的物品ID
       * </pre>
       */
      public Builder setUseGoodsId(int value) {
        bitField0_ |= 0x00000001;
        useGoodsId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 useGoodsId = 1;</code>
       *
       * <pre>
       *一键升级消耗的物品ID
       * </pre>
       */
      public Builder clearUseGoodsId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        useGoodsId_ = 0;
        onChanged();
        return this;
      }

      private int useGoodsNum_ ;
      /**
       * <code>required int32 useGoodsNum = 2;</code>
       *
       * <pre>
       *一键升级消耗的物品数量
       * </pre>
       */
      public boolean hasUseGoodsNum() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 useGoodsNum = 2;</code>
       *
       * <pre>
       *一键升级消耗的物品数量
       * </pre>
       */
      public int getUseGoodsNum() {
        return useGoodsNum_;
      }
      /**
       * <code>required int32 useGoodsNum = 2;</code>
       *
       * <pre>
       *一键升级消耗的物品数量
       * </pre>
       */
      public Builder setUseGoodsNum(int value) {
        bitField0_ |= 0x00000002;
        useGoodsNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 useGoodsNum = 2;</code>
       *
       * <pre>
       *一键升级消耗的物品数量
       * </pre>
       */
      public Builder clearUseGoodsNum() {
        bitField0_ = (bitField0_ & ~0x00000002);
        useGoodsNum_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:UseGoods)
    }

    static {
      defaultInstance = new UseGoods(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:UseGoods)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UseGoods_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_UseGoods_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024skill/UseGoods.proto\"3\n\010UseGoods\022\022\n\nus" +
      "eGoodsId\030\001 \002(\005\022\023\n\013useGoodsNum\030\002 \002(\005B7\n&c" +
      "om.chuangyou.common.protobuf.pb.skillB\rU" +
      "seGoodsProto"
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
    internal_static_UseGoods_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UseGoods_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_UseGoods_descriptor,
        new java.lang.String[] { "UseGoodsId", "UseGoodsNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}