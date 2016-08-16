// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: soul/MakeSoulReqMsg.proto

package com.chuangyou.common.protobuf.pb.soul;

public final class MakeSoulReqProto {
  private MakeSoulReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MakeSoulReqMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MakeSoulReqMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 op = 1;</code>
     *
     * <pre>
     *操作 1：QTE  2:接受任务(开始制作)    3：制作完成
     * </pre>
     */
    boolean hasOp();
    /**
     * <code>required int32 op = 1;</code>
     *
     * <pre>
     *操作 1：QTE  2:接受任务(开始制作)    3：制作完成
     * </pre>
     */
    int getOp();

    /**
     * <code>optional int32 index = 2;</code>
     *
     * <pre>
     *材料位置(当op=1时使用)
     * </pre>
     */
    boolean hasIndex();
    /**
     * <code>optional int32 index = 2;</code>
     *
     * <pre>
     *材料位置(当op=1时使用)
     * </pre>
     */
    int getIndex();

    /**
     * <code>optional int32 qte = 3;</code>
     *
     * <pre>
     * OTE：结果(当op=1时使用) 1:低  2：中 3：高
     * </pre>
     */
    boolean hasQte();
    /**
     * <code>optional int32 qte = 3;</code>
     *
     * <pre>
     * OTE：结果(当op=1时使用) 1:低  2：中 3：高
     * </pre>
     */
    int getQte();
  }
  /**
   * Protobuf type {@code MakeSoulReqMsg}
   *
   * <pre>
   *材料制作
   * </pre>
   */
  public static final class MakeSoulReqMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:MakeSoulReqMsg)
      MakeSoulReqMsgOrBuilder {
    // Use MakeSoulReqMsg.newBuilder() to construct.
    private MakeSoulReqMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MakeSoulReqMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MakeSoulReqMsg defaultInstance;
    public static MakeSoulReqMsg getDefaultInstance() {
      return defaultInstance;
    }

    public MakeSoulReqMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MakeSoulReqMsg(
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
              op_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              index_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              qte_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.internal_static_MakeSoulReqMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.internal_static_MakeSoulReqMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg.class, com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<MakeSoulReqMsg> PARSER =
        new com.google.protobuf.AbstractParser<MakeSoulReqMsg>() {
      public MakeSoulReqMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MakeSoulReqMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MakeSoulReqMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int OP_FIELD_NUMBER = 1;
    private int op_;
    /**
     * <code>required int32 op = 1;</code>
     *
     * <pre>
     *操作 1：QTE  2:接受任务(开始制作)    3：制作完成
     * </pre>
     */
    public boolean hasOp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 op = 1;</code>
     *
     * <pre>
     *操作 1：QTE  2:接受任务(开始制作)    3：制作完成
     * </pre>
     */
    public int getOp() {
      return op_;
    }

    public static final int INDEX_FIELD_NUMBER = 2;
    private int index_;
    /**
     * <code>optional int32 index = 2;</code>
     *
     * <pre>
     *材料位置(当op=1时使用)
     * </pre>
     */
    public boolean hasIndex() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 index = 2;</code>
     *
     * <pre>
     *材料位置(当op=1时使用)
     * </pre>
     */
    public int getIndex() {
      return index_;
    }

    public static final int QTE_FIELD_NUMBER = 3;
    private int qte_;
    /**
     * <code>optional int32 qte = 3;</code>
     *
     * <pre>
     * OTE：结果(当op=1时使用) 1:低  2：中 3：高
     * </pre>
     */
    public boolean hasQte() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 qte = 3;</code>
     *
     * <pre>
     * OTE：结果(当op=1时使用) 1:低  2：中 3：高
     * </pre>
     */
    public int getQte() {
      return qte_;
    }

    private void initFields() {
      op_ = 0;
      index_ = 0;
      qte_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasOp()) {
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
        output.writeInt32(1, op_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, index_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, qte_);
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
          .computeInt32Size(1, op_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, index_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, qte_);
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

    public static com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg prototype) {
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
     * Protobuf type {@code MakeSoulReqMsg}
     *
     * <pre>
     *材料制作
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MakeSoulReqMsg)
        com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.internal_static_MakeSoulReqMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.internal_static_MakeSoulReqMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg.class, com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg.newBuilder()
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
        op_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        index_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        qte_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.internal_static_MakeSoulReqMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg build() {
        com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg result = new com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.op_ = op_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.index_ = index_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.qte_ = qte_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg.getDefaultInstance()) return this;
        if (other.hasOp()) {
          setOp(other.getOp());
        }
        if (other.hasIndex()) {
          setIndex(other.getIndex());
        }
        if (other.hasQte()) {
          setQte(other.getQte());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasOp()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.soul.MakeSoulReqProto.MakeSoulReqMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int op_ ;
      /**
       * <code>required int32 op = 1;</code>
       *
       * <pre>
       *操作 1：QTE  2:接受任务(开始制作)    3：制作完成
       * </pre>
       */
      public boolean hasOp() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 op = 1;</code>
       *
       * <pre>
       *操作 1：QTE  2:接受任务(开始制作)    3：制作完成
       * </pre>
       */
      public int getOp() {
        return op_;
      }
      /**
       * <code>required int32 op = 1;</code>
       *
       * <pre>
       *操作 1：QTE  2:接受任务(开始制作)    3：制作完成
       * </pre>
       */
      public Builder setOp(int value) {
        bitField0_ |= 0x00000001;
        op_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 op = 1;</code>
       *
       * <pre>
       *操作 1：QTE  2:接受任务(开始制作)    3：制作完成
       * </pre>
       */
      public Builder clearOp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        op_ = 0;
        onChanged();
        return this;
      }

      private int index_ ;
      /**
       * <code>optional int32 index = 2;</code>
       *
       * <pre>
       *材料位置(当op=1时使用)
       * </pre>
       */
      public boolean hasIndex() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 index = 2;</code>
       *
       * <pre>
       *材料位置(当op=1时使用)
       * </pre>
       */
      public int getIndex() {
        return index_;
      }
      /**
       * <code>optional int32 index = 2;</code>
       *
       * <pre>
       *材料位置(当op=1时使用)
       * </pre>
       */
      public Builder setIndex(int value) {
        bitField0_ |= 0x00000002;
        index_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 index = 2;</code>
       *
       * <pre>
       *材料位置(当op=1时使用)
       * </pre>
       */
      public Builder clearIndex() {
        bitField0_ = (bitField0_ & ~0x00000002);
        index_ = 0;
        onChanged();
        return this;
      }

      private int qte_ ;
      /**
       * <code>optional int32 qte = 3;</code>
       *
       * <pre>
       * OTE：结果(当op=1时使用) 1:低  2：中 3：高
       * </pre>
       */
      public boolean hasQte() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 qte = 3;</code>
       *
       * <pre>
       * OTE：结果(当op=1时使用) 1:低  2：中 3：高
       * </pre>
       */
      public int getQte() {
        return qte_;
      }
      /**
       * <code>optional int32 qte = 3;</code>
       *
       * <pre>
       * OTE：结果(当op=1时使用) 1:低  2：中 3：高
       * </pre>
       */
      public Builder setQte(int value) {
        bitField0_ |= 0x00000004;
        qte_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 qte = 3;</code>
       *
       * <pre>
       * OTE：结果(当op=1时使用) 1:低  2：中 3：高
       * </pre>
       */
      public Builder clearQte() {
        bitField0_ = (bitField0_ & ~0x00000004);
        qte_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MakeSoulReqMsg)
    }

    static {
      defaultInstance = new MakeSoulReqMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MakeSoulReqMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MakeSoulReqMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MakeSoulReqMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031soul/MakeSoulReqMsg.proto\"8\n\016MakeSoulR" +
      "eqMsg\022\n\n\002op\030\001 \002(\005\022\r\n\005index\030\002 \001(\005\022\013\n\003qte\030" +
      "\003 \001(\005B9\n%com.chuangyou.common.protobuf.p" +
      "b.soulB\020MakeSoulReqProto"
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
    internal_static_MakeSoulReqMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MakeSoulReqMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_MakeSoulReqMsg_descriptor,
        new java.lang.String[] { "Op", "Index", "Qte", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
