// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inverseBead/SyncMonsterPoolMsg.proto

package com.chuangyou.common.protobuf.pb.inverseBead;

public final class SyncMonsterPoolMsgProto {
  private SyncMonsterPoolMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SyncMonsterPoolMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SyncMonsterPoolMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int32 monsterRefreshId = 1;</code>
     */
    java.util.List<java.lang.Integer> getMonsterRefreshIdList();
    /**
     * <code>repeated int32 monsterRefreshId = 1;</code>
     */
    int getMonsterRefreshIdCount();
    /**
     * <code>repeated int32 monsterRefreshId = 1;</code>
     */
    int getMonsterRefreshId(int index);
  }
  /**
   * Protobuf type {@code SyncMonsterPoolMsg}
   */
  public static final class SyncMonsterPoolMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:SyncMonsterPoolMsg)
      SyncMonsterPoolMsgOrBuilder {
    // Use SyncMonsterPoolMsg.newBuilder() to construct.
    private SyncMonsterPoolMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private SyncMonsterPoolMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final SyncMonsterPoolMsg defaultInstance;
    public static SyncMonsterPoolMsg getDefaultInstance() {
      return defaultInstance;
    }

    public SyncMonsterPoolMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private SyncMonsterPoolMsg(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                monsterRefreshId_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              monsterRefreshId_.add(input.readInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
                monsterRefreshId_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                monsterRefreshId_.add(input.readInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          monsterRefreshId_ = java.util.Collections.unmodifiableList(monsterRefreshId_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.internal_static_SyncMonsterPoolMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.internal_static_SyncMonsterPoolMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg.class, com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<SyncMonsterPoolMsg> PARSER =
        new com.google.protobuf.AbstractParser<SyncMonsterPoolMsg>() {
      public SyncMonsterPoolMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SyncMonsterPoolMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<SyncMonsterPoolMsg> getParserForType() {
      return PARSER;
    }

    public static final int MONSTERREFRESHID_FIELD_NUMBER = 1;
    private java.util.List<java.lang.Integer> monsterRefreshId_;
    /**
     * <code>repeated int32 monsterRefreshId = 1;</code>
     */
    public java.util.List<java.lang.Integer>
        getMonsterRefreshIdList() {
      return monsterRefreshId_;
    }
    /**
     * <code>repeated int32 monsterRefreshId = 1;</code>
     */
    public int getMonsterRefreshIdCount() {
      return monsterRefreshId_.size();
    }
    /**
     * <code>repeated int32 monsterRefreshId = 1;</code>
     */
    public int getMonsterRefreshId(int index) {
      return monsterRefreshId_.get(index);
    }

    private void initFields() {
      monsterRefreshId_ = java.util.Collections.emptyList();
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
      for (int i = 0; i < monsterRefreshId_.size(); i++) {
        output.writeInt32(1, monsterRefreshId_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < monsterRefreshId_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(monsterRefreshId_.get(i));
        }
        size += dataSize;
        size += 1 * getMonsterRefreshIdList().size();
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

    public static com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg prototype) {
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
     * Protobuf type {@code SyncMonsterPoolMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SyncMonsterPoolMsg)
        com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.internal_static_SyncMonsterPoolMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.internal_static_SyncMonsterPoolMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg.class, com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg.newBuilder()
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
        monsterRefreshId_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.internal_static_SyncMonsterPoolMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg build() {
        com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg result = new com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          monsterRefreshId_ = java.util.Collections.unmodifiableList(monsterRefreshId_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.monsterRefreshId_ = monsterRefreshId_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg.getDefaultInstance()) return this;
        if (!other.monsterRefreshId_.isEmpty()) {
          if (monsterRefreshId_.isEmpty()) {
            monsterRefreshId_ = other.monsterRefreshId_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMonsterRefreshIdIsMutable();
            monsterRefreshId_.addAll(other.monsterRefreshId_);
          }
          onChanged();
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
        com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.inverseBead.SyncMonsterPoolMsgProto.SyncMonsterPoolMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<java.lang.Integer> monsterRefreshId_ = java.util.Collections.emptyList();
      private void ensureMonsterRefreshIdIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          monsterRefreshId_ = new java.util.ArrayList<java.lang.Integer>(monsterRefreshId_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated int32 monsterRefreshId = 1;</code>
       */
      public java.util.List<java.lang.Integer>
          getMonsterRefreshIdList() {
        return java.util.Collections.unmodifiableList(monsterRefreshId_);
      }
      /**
       * <code>repeated int32 monsterRefreshId = 1;</code>
       */
      public int getMonsterRefreshIdCount() {
        return monsterRefreshId_.size();
      }
      /**
       * <code>repeated int32 monsterRefreshId = 1;</code>
       */
      public int getMonsterRefreshId(int index) {
        return monsterRefreshId_.get(index);
      }
      /**
       * <code>repeated int32 monsterRefreshId = 1;</code>
       */
      public Builder setMonsterRefreshId(
          int index, int value) {
        ensureMonsterRefreshIdIsMutable();
        monsterRefreshId_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 monsterRefreshId = 1;</code>
       */
      public Builder addMonsterRefreshId(int value) {
        ensureMonsterRefreshIdIsMutable();
        monsterRefreshId_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 monsterRefreshId = 1;</code>
       */
      public Builder addAllMonsterRefreshId(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMonsterRefreshIdIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, monsterRefreshId_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 monsterRefreshId = 1;</code>
       */
      public Builder clearMonsterRefreshId() {
        monsterRefreshId_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:SyncMonsterPoolMsg)
    }

    static {
      defaultInstance = new SyncMonsterPoolMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:SyncMonsterPoolMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SyncMonsterPoolMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_SyncMonsterPoolMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$inverseBead/SyncMonsterPoolMsg.proto\"." +
      "\n\022SyncMonsterPoolMsg\022\030\n\020monsterRefreshId" +
      "\030\001 \003(\005BG\n,com.chuangyou.common.protobuf." +
      "pb.inverseBeadB\027SyncMonsterPoolMsgProto"
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
    internal_static_SyncMonsterPoolMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SyncMonsterPoolMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_SyncMonsterPoolMsg_descriptor,
        new java.lang.String[] { "MonsterRefreshId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
