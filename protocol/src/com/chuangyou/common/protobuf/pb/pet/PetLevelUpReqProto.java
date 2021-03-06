// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: pet/PetLevelUpReqMsg.proto

package com.chuangyou.common.protobuf.pb.pet;

public final class PetLevelUpReqProto {
  private PetLevelUpReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PetLevelUpReqMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PetLevelUpReqMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 petId = 1;</code>
     *
     * <pre>
     * 宠物ID
     * </pre>
     */
    boolean hasPetId();
    /**
     * <code>optional int32 petId = 1;</code>
     *
     * <pre>
     * 宠物ID
     * </pre>
     */
    int getPetId();

    /**
     * <code>optional int32 useItem = 2;</code>
     *
     * <pre>
     * 升级使用的物品
     * </pre>
     */
    boolean hasUseItem();
    /**
     * <code>optional int32 useItem = 2;</code>
     *
     * <pre>
     * 升级使用的物品
     * </pre>
     */
    int getUseItem();
  }
  /**
   * Protobuf type {@code PetLevelUpReqMsg}
   */
  public static final class PetLevelUpReqMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:PetLevelUpReqMsg)
      PetLevelUpReqMsgOrBuilder {
    // Use PetLevelUpReqMsg.newBuilder() to construct.
    private PetLevelUpReqMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PetLevelUpReqMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PetLevelUpReqMsg defaultInstance;
    public static PetLevelUpReqMsg getDefaultInstance() {
      return defaultInstance;
    }

    public PetLevelUpReqMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PetLevelUpReqMsg(
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
              petId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              useItem_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.internal_static_PetLevelUpReqMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.internal_static_PetLevelUpReqMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg.class, com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<PetLevelUpReqMsg> PARSER =
        new com.google.protobuf.AbstractParser<PetLevelUpReqMsg>() {
      public PetLevelUpReqMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PetLevelUpReqMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PetLevelUpReqMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int PETID_FIELD_NUMBER = 1;
    private int petId_;
    /**
     * <code>optional int32 petId = 1;</code>
     *
     * <pre>
     * 宠物ID
     * </pre>
     */
    public boolean hasPetId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 petId = 1;</code>
     *
     * <pre>
     * 宠物ID
     * </pre>
     */
    public int getPetId() {
      return petId_;
    }

    public static final int USEITEM_FIELD_NUMBER = 2;
    private int useItem_;
    /**
     * <code>optional int32 useItem = 2;</code>
     *
     * <pre>
     * 升级使用的物品
     * </pre>
     */
    public boolean hasUseItem() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 useItem = 2;</code>
     *
     * <pre>
     * 升级使用的物品
     * </pre>
     */
    public int getUseItem() {
      return useItem_;
    }

    private void initFields() {
      petId_ = 0;
      useItem_ = 0;
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
        output.writeInt32(1, petId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, useItem_);
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
          .computeInt32Size(1, petId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, useItem_);
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

    public static com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg prototype) {
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
     * Protobuf type {@code PetLevelUpReqMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PetLevelUpReqMsg)
        com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.internal_static_PetLevelUpReqMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.internal_static_PetLevelUpReqMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg.class, com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg.newBuilder()
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
        petId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        useItem_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.internal_static_PetLevelUpReqMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg build() {
        com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg result = new com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.petId_ = petId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.useItem_ = useItem_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg.getDefaultInstance()) return this;
        if (other.hasPetId()) {
          setPetId(other.getPetId());
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
        com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.pet.PetLevelUpReqProto.PetLevelUpReqMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int petId_ ;
      /**
       * <code>optional int32 petId = 1;</code>
       *
       * <pre>
       * 宠物ID
       * </pre>
       */
      public boolean hasPetId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 petId = 1;</code>
       *
       * <pre>
       * 宠物ID
       * </pre>
       */
      public int getPetId() {
        return petId_;
      }
      /**
       * <code>optional int32 petId = 1;</code>
       *
       * <pre>
       * 宠物ID
       * </pre>
       */
      public Builder setPetId(int value) {
        bitField0_ |= 0x00000001;
        petId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 petId = 1;</code>
       *
       * <pre>
       * 宠物ID
       * </pre>
       */
      public Builder clearPetId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        petId_ = 0;
        onChanged();
        return this;
      }

      private int useItem_ ;
      /**
       * <code>optional int32 useItem = 2;</code>
       *
       * <pre>
       * 升级使用的物品
       * </pre>
       */
      public boolean hasUseItem() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 useItem = 2;</code>
       *
       * <pre>
       * 升级使用的物品
       * </pre>
       */
      public int getUseItem() {
        return useItem_;
      }
      /**
       * <code>optional int32 useItem = 2;</code>
       *
       * <pre>
       * 升级使用的物品
       * </pre>
       */
      public Builder setUseItem(int value) {
        bitField0_ |= 0x00000002;
        useItem_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 useItem = 2;</code>
       *
       * <pre>
       * 升级使用的物品
       * </pre>
       */
      public Builder clearUseItem() {
        bitField0_ = (bitField0_ & ~0x00000002);
        useItem_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:PetLevelUpReqMsg)
    }

    static {
      defaultInstance = new PetLevelUpReqMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:PetLevelUpReqMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PetLevelUpReqMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PetLevelUpReqMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032pet/PetLevelUpReqMsg.proto\"2\n\020PetLevel" +
      "UpReqMsg\022\r\n\005petId\030\001 \001(\005\022\017\n\007useItem\030\002 \001(\005" +
      "B:\n$com.chuangyou.common.protobuf.pb.pet" +
      "B\022PetLevelUpReqProto"
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
    internal_static_PetLevelUpReqMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PetLevelUpReqMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_PetLevelUpReqMsg_descriptor,
        new java.lang.String[] { "PetId", "UseItem", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
