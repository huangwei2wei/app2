// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LimitlessCampaignRecordInfoMsg.proto

package com.chuangyou.common.protobuf.pb.campaign;

public final class LimitlessCampaignRecordInfoMsgProto {
  private LimitlessCampaignRecordInfoMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface LimitlessCampaignRecordInfoMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LimitlessCampaignRecordInfoMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 campaignId = 1;</code>
     *
     * <pre>
     *副本ID
     * </pre>
     */
    boolean hasCampaignId();
    /**
     * <code>optional int32 campaignId = 1;</code>
     *
     * <pre>
     *副本ID
     * </pre>
     */
    int getCampaignId();

    /**
     * <code>optional int64 updataTime = 2;</code>
     *
     * <pre>
     *完成时间	
     * </pre>
     */
    boolean hasUpdataTime();
    /**
     * <code>optional int64 updataTime = 2;</code>
     *
     * <pre>
     *完成时间	
     * </pre>
     */
    long getUpdataTime();
  }
  /**
   * Protobuf type {@code LimitlessCampaignRecordInfoMsg}
   */
  public static final class LimitlessCampaignRecordInfoMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:LimitlessCampaignRecordInfoMsg)
      LimitlessCampaignRecordInfoMsgOrBuilder {
    // Use LimitlessCampaignRecordInfoMsg.newBuilder() to construct.
    private LimitlessCampaignRecordInfoMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private LimitlessCampaignRecordInfoMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final LimitlessCampaignRecordInfoMsg defaultInstance;
    public static LimitlessCampaignRecordInfoMsg getDefaultInstance() {
      return defaultInstance;
    }

    public LimitlessCampaignRecordInfoMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private LimitlessCampaignRecordInfoMsg(
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
              campaignId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              updataTime_ = input.readInt64();
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
      return com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.internal_static_LimitlessCampaignRecordInfoMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.internal_static_LimitlessCampaignRecordInfoMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg.class, com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<LimitlessCampaignRecordInfoMsg> PARSER =
        new com.google.protobuf.AbstractParser<LimitlessCampaignRecordInfoMsg>() {
      public LimitlessCampaignRecordInfoMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LimitlessCampaignRecordInfoMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<LimitlessCampaignRecordInfoMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int CAMPAIGNID_FIELD_NUMBER = 1;
    private int campaignId_;
    /**
     * <code>optional int32 campaignId = 1;</code>
     *
     * <pre>
     *副本ID
     * </pre>
     */
    public boolean hasCampaignId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 campaignId = 1;</code>
     *
     * <pre>
     *副本ID
     * </pre>
     */
    public int getCampaignId() {
      return campaignId_;
    }

    public static final int UPDATATIME_FIELD_NUMBER = 2;
    private long updataTime_;
    /**
     * <code>optional int64 updataTime = 2;</code>
     *
     * <pre>
     *完成时间	
     * </pre>
     */
    public boolean hasUpdataTime() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 updataTime = 2;</code>
     *
     * <pre>
     *完成时间	
     * </pre>
     */
    public long getUpdataTime() {
      return updataTime_;
    }

    private void initFields() {
      campaignId_ = 0;
      updataTime_ = 0L;
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
        output.writeInt32(1, campaignId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, updataTime_);
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
          .computeInt32Size(1, campaignId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, updataTime_);
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

    public static com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg prototype) {
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
     * Protobuf type {@code LimitlessCampaignRecordInfoMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LimitlessCampaignRecordInfoMsg)
        com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.internal_static_LimitlessCampaignRecordInfoMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.internal_static_LimitlessCampaignRecordInfoMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg.class, com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg.newBuilder()
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
        campaignId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        updataTime_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.internal_static_LimitlessCampaignRecordInfoMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg build() {
        com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg result = new com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.campaignId_ = campaignId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.updataTime_ = updataTime_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg.getDefaultInstance()) return this;
        if (other.hasCampaignId()) {
          setCampaignId(other.getCampaignId());
        }
        if (other.hasUpdataTime()) {
          setUpdataTime(other.getUpdataTime());
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
        com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.campaign.LimitlessCampaignRecordInfoMsgProto.LimitlessCampaignRecordInfoMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int campaignId_ ;
      /**
       * <code>optional int32 campaignId = 1;</code>
       *
       * <pre>
       *副本ID
       * </pre>
       */
      public boolean hasCampaignId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 campaignId = 1;</code>
       *
       * <pre>
       *副本ID
       * </pre>
       */
      public int getCampaignId() {
        return campaignId_;
      }
      /**
       * <code>optional int32 campaignId = 1;</code>
       *
       * <pre>
       *副本ID
       * </pre>
       */
      public Builder setCampaignId(int value) {
        bitField0_ |= 0x00000001;
        campaignId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 campaignId = 1;</code>
       *
       * <pre>
       *副本ID
       * </pre>
       */
      public Builder clearCampaignId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        campaignId_ = 0;
        onChanged();
        return this;
      }

      private long updataTime_ ;
      /**
       * <code>optional int64 updataTime = 2;</code>
       *
       * <pre>
       *完成时间	
       * </pre>
       */
      public boolean hasUpdataTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int64 updataTime = 2;</code>
       *
       * <pre>
       *完成时间	
       * </pre>
       */
      public long getUpdataTime() {
        return updataTime_;
      }
      /**
       * <code>optional int64 updataTime = 2;</code>
       *
       * <pre>
       *完成时间	
       * </pre>
       */
      public Builder setUpdataTime(long value) {
        bitField0_ |= 0x00000002;
        updataTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 updataTime = 2;</code>
       *
       * <pre>
       *完成时间	
       * </pre>
       */
      public Builder clearUpdataTime() {
        bitField0_ = (bitField0_ & ~0x00000002);
        updataTime_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:LimitlessCampaignRecordInfoMsg)
    }

    static {
      defaultInstance = new LimitlessCampaignRecordInfoMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:LimitlessCampaignRecordInfoMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LimitlessCampaignRecordInfoMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_LimitlessCampaignRecordInfoMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$LimitlessCampaignRecordInfoMsg.proto\"H" +
      "\n\036LimitlessCampaignRecordInfoMsg\022\022\n\ncamp" +
      "aignId\030\001 \001(\005\022\022\n\nupdataTime\030\002 \001(\003BP\n)com." +
      "chuangyou.common.protobuf.pb.campaignB#L" +
      "imitlessCampaignRecordInfoMsgProto"
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
    internal_static_LimitlessCampaignRecordInfoMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LimitlessCampaignRecordInfoMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_LimitlessCampaignRecordInfoMsg_descriptor,
        new java.lang.String[] { "CampaignId", "UpdataTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
