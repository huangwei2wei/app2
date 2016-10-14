// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InnerReqAddMat.proto

package com.chuangyou.common.protobuf.pb.truck;

public final class InnerReqAddMatProto {
  private InnerReqAddMatProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface InnerReqAddMatOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InnerReqAddMat)
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
     * <code>required int32 count = 2;</code>
     *
     * <pre>
     *数量
     * </pre>
     */
    boolean hasCount();
    /**
     * <code>required int32 count = 2;</code>
     *
     * <pre>
     *数量
     * </pre>
     */
    int getCount();
  }
  /**
   * Protobuf type {@code InnerReqAddMat}
   *
   * <pre>
   *镖车数据
   * </pre>
   */
  public static final class InnerReqAddMat extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:InnerReqAddMat)
      InnerReqAddMatOrBuilder {
    // Use InnerReqAddMat.newBuilder() to construct.
    private InnerReqAddMat(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private InnerReqAddMat(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final InnerReqAddMat defaultInstance;
    public static InnerReqAddMat getDefaultInstance() {
      return defaultInstance;
    }

    public InnerReqAddMat getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private InnerReqAddMat(
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
              count_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.internal_static_InnerReqAddMat_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.internal_static_InnerReqAddMat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat.class, com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat.Builder.class);
    }

    public static com.google.protobuf.Parser<InnerReqAddMat> PARSER =
        new com.google.protobuf.AbstractParser<InnerReqAddMat>() {
      public InnerReqAddMat parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InnerReqAddMat(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<InnerReqAddMat> getParserForType() {
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

    public static final int COUNT_FIELD_NUMBER = 2;
    private int count_;
    /**
     * <code>required int32 count = 2;</code>
     *
     * <pre>
     *数量
     * </pre>
     */
    public boolean hasCount() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 count = 2;</code>
     *
     * <pre>
     *数量
     * </pre>
     */
    public int getCount() {
      return count_;
    }

    private void initFields() {
      trucktype_ = 0;
      count_ = 0;
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
      if (!hasCount()) {
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
        output.writeInt32(2, count_);
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
          .computeInt32Size(2, count_);
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

    public static com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat prototype) {
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
     * Protobuf type {@code InnerReqAddMat}
     *
     * <pre>
     *镖车数据
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InnerReqAddMat)
        com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMatOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.internal_static_InnerReqAddMat_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.internal_static_InnerReqAddMat_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat.class, com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat.newBuilder()
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
        count_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.internal_static_InnerReqAddMat_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat build() {
        com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat buildPartial() {
        com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat result = new com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.trucktype_ = trucktype_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.count_ = count_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat other) {
        if (other == com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat.getDefaultInstance()) return this;
        if (other.hasTrucktype()) {
          setTrucktype(other.getTrucktype());
        }
        if (other.hasCount()) {
          setCount(other.getCount());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasTrucktype()) {
          
          return false;
        }
        if (!hasCount()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.truck.InnerReqAddMatProto.InnerReqAddMat) e.getUnfinishedMessage();
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

      private int count_ ;
      /**
       * <code>required int32 count = 2;</code>
       *
       * <pre>
       *数量
       * </pre>
       */
      public boolean hasCount() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 count = 2;</code>
       *
       * <pre>
       *数量
       * </pre>
       */
      public int getCount() {
        return count_;
      }
      /**
       * <code>required int32 count = 2;</code>
       *
       * <pre>
       *数量
       * </pre>
       */
      public Builder setCount(int value) {
        bitField0_ |= 0x00000002;
        count_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 count = 2;</code>
       *
       * <pre>
       *数量
       * </pre>
       */
      public Builder clearCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        count_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:InnerReqAddMat)
    }

    static {
      defaultInstance = new InnerReqAddMat(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:InnerReqAddMat)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InnerReqAddMat_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_InnerReqAddMat_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024InnerReqAddMat.proto\032\017TruckData.proto\"" +
      "2\n\016InnerReqAddMat\022\021\n\ttrucktype\030\001 \002(\005\022\r\n\005" +
      "count\030\002 \002(\005B=\n&com.chuangyou.common.prot" +
      "obuf.pb.truckB\023InnerReqAddMatProto"
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
          com.chuangyou.common.protobuf.pb.truck.TruckDataProto.getDescriptor(),
        }, assigner);
    internal_static_InnerReqAddMat_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InnerReqAddMat_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_InnerReqAddMat_descriptor,
        new java.lang.String[] { "Trucktype", "Count", });
    com.chuangyou.common.protobuf.pb.truck.TruckDataProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}