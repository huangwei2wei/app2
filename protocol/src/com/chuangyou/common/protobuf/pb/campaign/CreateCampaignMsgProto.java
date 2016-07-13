// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: campaign/CreateCampaignMsg.proto

package com.chuangyou.common.protobuf.pb.campaign;

public final class CreateCampaignMsgProto {
  private CreateCampaignMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CreateCampaignMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CreateCampaignMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 campaign = 1;</code>
     *
     * <pre>
     *buffer唯一ID
     * </pre>
     */
    boolean hasCampaign();
    /**
     * <code>optional int32 campaign = 1;</code>
     *
     * <pre>
     *buffer唯一ID
     * </pre>
     */
    int getCampaign();

    /**
     * <code>optional bool useItem = 2;</code>
     *
     * <pre>
     *是否使用物品（使用物品则不扣次数）
     * </pre>
     */
    boolean hasUseItem();
    /**
     * <code>optional bool useItem = 2;</code>
     *
     * <pre>
     *是否使用物品（使用物品则不扣次数）
     * </pre>
     */
    boolean getUseItem();
  }
  /**
   * Protobuf type {@code CreateCampaignMsg}
   */
  public static final class CreateCampaignMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:CreateCampaignMsg)
      CreateCampaignMsgOrBuilder {
    // Use CreateCampaignMsg.newBuilder() to construct.
    private CreateCampaignMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private CreateCampaignMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final CreateCampaignMsg defaultInstance;
    public static CreateCampaignMsg getDefaultInstance() {
      return defaultInstance;
    }

    public CreateCampaignMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private CreateCampaignMsg(
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
              campaign_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              useItem_ = input.readBool();
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
      return com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.internal_static_CreateCampaignMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.internal_static_CreateCampaignMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg.class, com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<CreateCampaignMsg> PARSER =
        new com.google.protobuf.AbstractParser<CreateCampaignMsg>() {
      public CreateCampaignMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CreateCampaignMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<CreateCampaignMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int CAMPAIGN_FIELD_NUMBER = 1;
    private int campaign_;
    /**
     * <code>optional int32 campaign = 1;</code>
     *
     * <pre>
     *buffer唯一ID
     * </pre>
     */
    public boolean hasCampaign() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 campaign = 1;</code>
     *
     * <pre>
     *buffer唯一ID
     * </pre>
     */
    public int getCampaign() {
      return campaign_;
    }

    public static final int USEITEM_FIELD_NUMBER = 2;
    private boolean useItem_;
    /**
     * <code>optional bool useItem = 2;</code>
     *
     * <pre>
     *是否使用物品（使用物品则不扣次数）
     * </pre>
     */
    public boolean hasUseItem() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional bool useItem = 2;</code>
     *
     * <pre>
     *是否使用物品（使用物品则不扣次数）
     * </pre>
     */
    public boolean getUseItem() {
      return useItem_;
    }

    private void initFields() {
      campaign_ = 0;
      useItem_ = false;
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
        output.writeInt32(1, campaign_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, useItem_);
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
          .computeInt32Size(1, campaign_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, useItem_);
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

    public static com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg prototype) {
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
     * Protobuf type {@code CreateCampaignMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CreateCampaignMsg)
        com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.internal_static_CreateCampaignMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.internal_static_CreateCampaignMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg.class, com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg.newBuilder()
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
        campaign_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        useItem_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.internal_static_CreateCampaignMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg build() {
        com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg result = new com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.campaign_ = campaign_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.useItem_ = useItem_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg.getDefaultInstance()) return this;
        if (other.hasCampaign()) {
          setCampaign(other.getCampaign());
        }
        if (other.hasUseItem()) {
          setUseItem(other.getUseItem());
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
        com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.campaign.CreateCampaignMsgProto.CreateCampaignMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int campaign_ ;
      /**
       * <code>optional int32 campaign = 1;</code>
       *
       * <pre>
       *buffer唯一ID
       * </pre>
       */
      public boolean hasCampaign() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 campaign = 1;</code>
       *
       * <pre>
       *buffer唯一ID
       * </pre>
       */
      public int getCampaign() {
        return campaign_;
      }
      /**
       * <code>optional int32 campaign = 1;</code>
       *
       * <pre>
       *buffer唯一ID
       * </pre>
       */
      public Builder setCampaign(int value) {
        bitField0_ |= 0x00000001;
        campaign_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 campaign = 1;</code>
       *
       * <pre>
       *buffer唯一ID
       * </pre>
       */
      public Builder clearCampaign() {
        bitField0_ = (bitField0_ & ~0x00000001);
        campaign_ = 0;
        onChanged();
        return this;
      }

      private boolean useItem_ ;
      /**
       * <code>optional bool useItem = 2;</code>
       *
       * <pre>
       *是否使用物品（使用物品则不扣次数）
       * </pre>
       */
      public boolean hasUseItem() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional bool useItem = 2;</code>
       *
       * <pre>
       *是否使用物品（使用物品则不扣次数）
       * </pre>
       */
      public boolean getUseItem() {
        return useItem_;
      }
      /**
       * <code>optional bool useItem = 2;</code>
       *
       * <pre>
       *是否使用物品（使用物品则不扣次数）
       * </pre>
       */
      public Builder setUseItem(boolean value) {
        bitField0_ |= 0x00000002;
        useItem_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bool useItem = 2;</code>
       *
       * <pre>
       *是否使用物品（使用物品则不扣次数）
       * </pre>
       */
      public Builder clearUseItem() {
        bitField0_ = (bitField0_ & ~0x00000002);
        useItem_ = false;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:CreateCampaignMsg)
    }

    static {
      defaultInstance = new CreateCampaignMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:CreateCampaignMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateCampaignMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_CreateCampaignMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n campaign/CreateCampaignMsg.proto\"6\n\021Cr" +
      "eateCampaignMsg\022\020\n\010campaign\030\001 \001(\005\022\017\n\007use" +
      "Item\030\002 \001(\010BC\n)com.chuangyou.common.proto" +
      "buf.pb.campaignB\026CreateCampaignMsgProto"
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
    internal_static_CreateCampaignMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CreateCampaignMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_CreateCampaignMsg_descriptor,
        new java.lang.String[] { "Campaign", "UseItem", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}