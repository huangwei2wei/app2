// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inverseBead/ReqEnterCampaignMsg.proto

package com.chuangyou.common.protobuf.pb.inverseBead;

public final class ReqEnterCampaignMsgProto {
  private ReqEnterCampaignMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface ReqEnterCampaignMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReqEnterCampaignMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 campaign = 1;</code>
     *
     * <pre>
     *占位不用传
     * </pre>
     */
    boolean hasCampaign();
    /**
     * <code>optional int32 campaign = 1;</code>
     *
     * <pre>
     *占位不用传
     * </pre>
     */
    int getCampaign();
  }
  /**
   * Protobuf type {@code ReqEnterCampaignMsg}
   *
   * <pre>
   *请求进入天逆珠逆境
   * </pre>
   */
  public static final class ReqEnterCampaignMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ReqEnterCampaignMsg)
      ReqEnterCampaignMsgOrBuilder {
    // Use ReqEnterCampaignMsg.newBuilder() to construct.
    private ReqEnterCampaignMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private ReqEnterCampaignMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final ReqEnterCampaignMsg defaultInstance;
    public static ReqEnterCampaignMsg getDefaultInstance() {
      return defaultInstance;
    }

    public ReqEnterCampaignMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private ReqEnterCampaignMsg(
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
      return com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.internal_static_ReqEnterCampaignMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.internal_static_ReqEnterCampaignMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg.class, com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<ReqEnterCampaignMsg> PARSER =
        new com.google.protobuf.AbstractParser<ReqEnterCampaignMsg>() {
      public ReqEnterCampaignMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReqEnterCampaignMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<ReqEnterCampaignMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int CAMPAIGN_FIELD_NUMBER = 1;
    private int campaign_;
    /**
     * <code>optional int32 campaign = 1;</code>
     *
     * <pre>
     *占位不用传
     * </pre>
     */
    public boolean hasCampaign() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 campaign = 1;</code>
     *
     * <pre>
     *占位不用传
     * </pre>
     */
    public int getCampaign() {
      return campaign_;
    }

    private void initFields() {
      campaign_ = 0;
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

    public static com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg prototype) {
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
     * Protobuf type {@code ReqEnterCampaignMsg}
     *
     * <pre>
     *请求进入天逆珠逆境
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReqEnterCampaignMsg)
        com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.internal_static_ReqEnterCampaignMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.internal_static_ReqEnterCampaignMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg.class, com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg.newBuilder()
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
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.internal_static_ReqEnterCampaignMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg build() {
        com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg result = new com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.campaign_ = campaign_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg.getDefaultInstance()) return this;
        if (other.hasCampaign()) {
          setCampaign(other.getCampaign());
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
        com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.inverseBead.ReqEnterCampaignMsgProto.ReqEnterCampaignMsg) e.getUnfinishedMessage();
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
       *占位不用传
       * </pre>
       */
      public boolean hasCampaign() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 campaign = 1;</code>
       *
       * <pre>
       *占位不用传
       * </pre>
       */
      public int getCampaign() {
        return campaign_;
      }
      /**
       * <code>optional int32 campaign = 1;</code>
       *
       * <pre>
       *占位不用传
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
       *占位不用传
       * </pre>
       */
      public Builder clearCampaign() {
        bitField0_ = (bitField0_ & ~0x00000001);
        campaign_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ReqEnterCampaignMsg)
    }

    static {
      defaultInstance = new ReqEnterCampaignMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:ReqEnterCampaignMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReqEnterCampaignMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ReqEnterCampaignMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%inverseBead/ReqEnterCampaignMsg.proto\"" +
      "\'\n\023ReqEnterCampaignMsg\022\020\n\010campaign\030\001 \001(\005" +
      "BH\n,com.chuangyou.common.protobuf.pb.inv" +
      "erseBeadB\030ReqEnterCampaignMsgProto"
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
    internal_static_ReqEnterCampaignMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReqEnterCampaignMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ReqEnterCampaignMsg_descriptor,
        new java.lang.String[] { "Campaign", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
