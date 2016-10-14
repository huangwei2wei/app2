// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InnerReqUpdateMask.proto

package com.chuangyou.common.protobuf.pb.truck;

public final class InnerReqUpdateMaskProto {
  private InnerReqUpdateMaskProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface InnerReqUpdateMaskOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InnerReqUpdateMask)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 trucktype = 1;</code>
     *
     * <pre>
     *镖车类型	
     * </pre>
     */
    boolean hasTrucktype();
    /**
     * <code>required int32 trucktype = 1;</code>
     *
     * <pre>
     *镖车类型	
     * </pre>
     */
    int getTrucktype();

    /**
     * <code>required int32 guildId = 2;</code>
     *
     * <pre>
     *帮派Id
     * </pre>
     */
    boolean hasGuildId();
    /**
     * <code>required int32 guildId = 2;</code>
     *
     * <pre>
     *帮派Id
     * </pre>
     */
    int getGuildId();
  }
  /**
   * Protobuf type {@code InnerReqUpdateMask}
   *
   * <pre>
   *运镖完成
   * </pre>
   */
  public static final class InnerReqUpdateMask extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:InnerReqUpdateMask)
      InnerReqUpdateMaskOrBuilder {
    // Use InnerReqUpdateMask.newBuilder() to construct.
    private InnerReqUpdateMask(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private InnerReqUpdateMask(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final InnerReqUpdateMask defaultInstance;
    public static InnerReqUpdateMask getDefaultInstance() {
      return defaultInstance;
    }

    public InnerReqUpdateMask getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private InnerReqUpdateMask(
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
              trucktype_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              guildId_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.internal_static_InnerReqUpdateMask_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.internal_static_InnerReqUpdateMask_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask.class, com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask.Builder.class);
    }

    public static com.google.protobuf.Parser<InnerReqUpdateMask> PARSER =
        new com.google.protobuf.AbstractParser<InnerReqUpdateMask>() {
      public InnerReqUpdateMask parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InnerReqUpdateMask(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<InnerReqUpdateMask> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TRUCKTYPE_FIELD_NUMBER = 1;
    private int trucktype_;
    /**
     * <code>required int32 trucktype = 1;</code>
     *
     * <pre>
     *镖车类型	
     * </pre>
     */
    public boolean hasTrucktype() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 trucktype = 1;</code>
     *
     * <pre>
     *镖车类型	
     * </pre>
     */
    public int getTrucktype() {
      return trucktype_;
    }

    public static final int GUILDID_FIELD_NUMBER = 2;
    private int guildId_;
    /**
     * <code>required int32 guildId = 2;</code>
     *
     * <pre>
     *帮派Id
     * </pre>
     */
    public boolean hasGuildId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 guildId = 2;</code>
     *
     * <pre>
     *帮派Id
     * </pre>
     */
    public int getGuildId() {
      return guildId_;
    }

    private void initFields() {
      trucktype_ = 0;
      guildId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasTrucktype()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasGuildId()) {
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
        output.writeInt32(1, trucktype_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, guildId_);
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
          .computeInt32Size(1, trucktype_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, guildId_);
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

    public static com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask prototype) {
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
     * Protobuf type {@code InnerReqUpdateMask}
     *
     * <pre>
     *运镖完成
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InnerReqUpdateMask)
        com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMaskOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.internal_static_InnerReqUpdateMask_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.internal_static_InnerReqUpdateMask_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask.class, com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask.newBuilder()
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
        trucktype_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        guildId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.internal_static_InnerReqUpdateMask_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask build() {
        com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask buildPartial() {
        com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask result = new com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.trucktype_ = trucktype_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.guildId_ = guildId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask other) {
        if (other == com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask.getDefaultInstance()) return this;
        if (other.hasTrucktype()) {
          setTrucktype(other.getTrucktype());
        }
        if (other.hasGuildId()) {
          setGuildId(other.getGuildId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTrucktype()) {
          
          return false;
        }
        if (!hasGuildId()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.truck.InnerReqUpdateMaskProto.InnerReqUpdateMask) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int trucktype_ ;
      /**
       * <code>required int32 trucktype = 1;</code>
       *
       * <pre>
       *镖车类型	
       * </pre>
       */
      public boolean hasTrucktype() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 trucktype = 1;</code>
       *
       * <pre>
       *镖车类型	
       * </pre>
       */
      public int getTrucktype() {
        return trucktype_;
      }
      /**
       * <code>required int32 trucktype = 1;</code>
       *
       * <pre>
       *镖车类型	
       * </pre>
       */
      public Builder setTrucktype(int value) {
        bitField0_ |= 0x00000001;
        trucktype_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 trucktype = 1;</code>
       *
       * <pre>
       *镖车类型	
       * </pre>
       */
      public Builder clearTrucktype() {
        bitField0_ = (bitField0_ & ~0x00000001);
        trucktype_ = 0;
        onChanged();
        return this;
      }

      private int guildId_ ;
      /**
       * <code>required int32 guildId = 2;</code>
       *
       * <pre>
       *帮派Id
       * </pre>
       */
      public boolean hasGuildId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 guildId = 2;</code>
       *
       * <pre>
       *帮派Id
       * </pre>
       */
      public int getGuildId() {
        return guildId_;
      }
      /**
       * <code>required int32 guildId = 2;</code>
       *
       * <pre>
       *帮派Id
       * </pre>
       */
      public Builder setGuildId(int value) {
        bitField0_ |= 0x00000002;
        guildId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 guildId = 2;</code>
       *
       * <pre>
       *帮派Id
       * </pre>
       */
      public Builder clearGuildId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        guildId_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:InnerReqUpdateMask)
    }

    static {
      defaultInstance = new InnerReqUpdateMask(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:InnerReqUpdateMask)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InnerReqUpdateMask_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_InnerReqUpdateMask_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030InnerReqUpdateMask.proto\"8\n\022InnerReqUp" +
      "dateMask\022\021\n\ttrucktype\030\001 \002(\005\022\017\n\007guildId\030\002" +
      " \002(\005BA\n&com.chuangyou.common.protobuf.pb" +
      ".truckB\027InnerReqUpdateMaskProto"
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
    internal_static_InnerReqUpdateMask_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InnerReqUpdateMask_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_InnerReqUpdateMask_descriptor,
        new java.lang.String[] { "Trucktype", "GuildId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}