// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: soul/SyncSoulLv.proto

package com.chuangyou.common.protobuf.pb.soul;

public final class SyncSoulProto {
  private SyncSoulProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SyncSoulLvOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SyncSoulLv)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 soulLv = 1;</code>
     */
    boolean hasSoulLv();
    /**
     * <code>required int32 soulLv = 1;</code>
     */
    int getSoulLv();
  }
  /**
   * Protobuf type {@code SyncSoulLv}
   *
   * <pre>
   *服务器内部同步协议（ 与客户端无关）
   * </pre>
   */
  public static final class SyncSoulLv extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:SyncSoulLv)
      SyncSoulLvOrBuilder {
    // Use SyncSoulLv.newBuilder() to construct.
    private SyncSoulLv(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SyncSoulLv(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SyncSoulLv defaultInstance;
    public static SyncSoulLv getDefaultInstance() {
      return defaultInstance;
    }

    public SyncSoulLv getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SyncSoulLv(
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
              soulLv_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.internal_static_SyncSoulLv_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.internal_static_SyncSoulLv_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv.class, com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv.Builder.class);
    }

    public static com.google.protobuf.Parser<SyncSoulLv> PARSER =
        new com.google.protobuf.AbstractParser<SyncSoulLv>() {
      public SyncSoulLv parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SyncSoulLv(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SyncSoulLv> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int SOULLV_FIELD_NUMBER = 1;
    private int soulLv_;
    /**
     * <code>required int32 soulLv = 1;</code>
     */
    public boolean hasSoulLv() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 soulLv = 1;</code>
     */
    public int getSoulLv() {
      return soulLv_;
    }

    private void initFields() {
      soulLv_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasSoulLv()) {
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
        output.writeInt32(1, soulLv_);
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
          .computeInt32Size(1, soulLv_);
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

    public static com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv prototype) {
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
     * Protobuf type {@code SyncSoulLv}
     *
     * <pre>
     *服务器内部同步协议（ 与客户端无关）
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SyncSoulLv)
        com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLvOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.internal_static_SyncSoulLv_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.internal_static_SyncSoulLv_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv.class, com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv.newBuilder()
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
        soulLv_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.internal_static_SyncSoulLv_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv build() {
        com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv buildPartial() {
        com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv result = new com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.soulLv_ = soulLv_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv other) {
        if (other == com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv.getDefaultInstance()) return this;
        if (other.hasSoulLv()) {
          setSoulLv(other.getSoulLv());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasSoulLv()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.soul.SyncSoulProto.SyncSoulLv) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int soulLv_ ;
      /**
       * <code>required int32 soulLv = 1;</code>
       */
      public boolean hasSoulLv() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 soulLv = 1;</code>
       */
      public int getSoulLv() {
        return soulLv_;
      }
      /**
       * <code>required int32 soulLv = 1;</code>
       */
      public Builder setSoulLv(int value) {
        bitField0_ |= 0x00000001;
        soulLv_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 soulLv = 1;</code>
       */
      public Builder clearSoulLv() {
        bitField0_ = (bitField0_ & ~0x00000001);
        soulLv_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:SyncSoulLv)
    }

    static {
      defaultInstance = new SyncSoulLv(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:SyncSoulLv)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SyncSoulLv_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SyncSoulLv_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025soul/SyncSoulLv.proto\"\034\n\nSyncSoulLv\022\016\n" +
      "\006soulLv\030\001 \002(\005B6\n%com.chuangyou.common.pr" +
      "otobuf.pb.soulB\rSyncSoulProto"
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
    internal_static_SyncSoulLv_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SyncSoulLv_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_SyncSoulLv_descriptor,
        new java.lang.String[] { "SoulLv", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
