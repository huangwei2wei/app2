// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TeamOptionMsg.proto

package com.chuangyou.common.protobuf.pb.team;

public final class TeamOptionMsgProto {
  private TeamOptionMsgProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TeamOptionMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TeamOptionMsg)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 option = 1;</code>
     *
     * <pre>
     * 101 前往目标  ，102 准备  103 取消准备
     * </pre>
     */
    boolean hasOption();
    /**
     * <code>optional int32 option = 1;</code>
     *
     * <pre>
     * 101 前往目标  ，102 准备  103 取消准备
     * </pre>
     */
    int getOption();

    /**
     * <code>optional int32 param = 2;</code>
     *
     * <pre>
     *参数
     * </pre>
     */
    boolean hasParam();
    /**
     * <code>optional int32 param = 2;</code>
     *
     * <pre>
     *参数
     * </pre>
     */
    int getParam();
  }
  /**
   * Protobuf type {@code TeamOptionMsg}
   *
   * <pre>
   *队伍信息
   * </pre>
   */
  public static final class TeamOptionMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:TeamOptionMsg)
      TeamOptionMsgOrBuilder {
    // Use TeamOptionMsg.newBuilder() to construct.
    private TeamOptionMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private TeamOptionMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final TeamOptionMsg defaultInstance;
    public static TeamOptionMsg getDefaultInstance() {
      return defaultInstance;
    }

    public TeamOptionMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private TeamOptionMsg(
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
              option_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              param_ = input.readInt32();
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
      return com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.internal_static_TeamOptionMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.internal_static_TeamOptionMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg.class, com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<TeamOptionMsg> PARSER =
        new com.google.protobuf.AbstractParser<TeamOptionMsg>() {
      public TeamOptionMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TeamOptionMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<TeamOptionMsg> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int OPTION_FIELD_NUMBER = 1;
    private int option_;
    /**
     * <code>optional int32 option = 1;</code>
     *
     * <pre>
     * 101 前往目标  ，102 准备  103 取消准备
     * </pre>
     */
    public boolean hasOption() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 option = 1;</code>
     *
     * <pre>
     * 101 前往目标  ，102 准备  103 取消准备
     * </pre>
     */
    public int getOption() {
      return option_;
    }

    public static final int PARAM_FIELD_NUMBER = 2;
    private int param_;
    /**
     * <code>optional int32 param = 2;</code>
     *
     * <pre>
     *参数
     * </pre>
     */
    public boolean hasParam() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 param = 2;</code>
     *
     * <pre>
     *参数
     * </pre>
     */
    public int getParam() {
      return param_;
    }

    private void initFields() {
      option_ = 0;
      param_ = 0;
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
        output.writeInt32(1, option_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, param_);
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
          .computeInt32Size(1, option_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, param_);
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

    public static com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg prototype) {
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
     * Protobuf type {@code TeamOptionMsg}
     *
     * <pre>
     *队伍信息
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TeamOptionMsg)
        com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.internal_static_TeamOptionMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.internal_static_TeamOptionMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg.class, com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg.newBuilder()
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
        option_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        param_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.internal_static_TeamOptionMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg build() {
        com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg result = new com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.option_ = option_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.param_ = param_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg.getDefaultInstance()) return this;
        if (other.hasOption()) {
          setOption(other.getOption());
        }
        if (other.hasParam()) {
          setParam(other.getParam());
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
        com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.team.TeamOptionMsgProto.TeamOptionMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int option_ ;
      /**
       * <code>optional int32 option = 1;</code>
       *
       * <pre>
       * 101 前往目标  ，102 准备  103 取消准备
       * </pre>
       */
      public boolean hasOption() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 option = 1;</code>
       *
       * <pre>
       * 101 前往目标  ，102 准备  103 取消准备
       * </pre>
       */
      public int getOption() {
        return option_;
      }
      /**
       * <code>optional int32 option = 1;</code>
       *
       * <pre>
       * 101 前往目标  ，102 准备  103 取消准备
       * </pre>
       */
      public Builder setOption(int value) {
        bitField0_ |= 0x00000001;
        option_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 option = 1;</code>
       *
       * <pre>
       * 101 前往目标  ，102 准备  103 取消准备
       * </pre>
       */
      public Builder clearOption() {
        bitField0_ = (bitField0_ & ~0x00000001);
        option_ = 0;
        onChanged();
        return this;
      }

      private int param_ ;
      /**
       * <code>optional int32 param = 2;</code>
       *
       * <pre>
       *参数
       * </pre>
       */
      public boolean hasParam() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 param = 2;</code>
       *
       * <pre>
       *参数
       * </pre>
       */
      public int getParam() {
        return param_;
      }
      /**
       * <code>optional int32 param = 2;</code>
       *
       * <pre>
       *参数
       * </pre>
       */
      public Builder setParam(int value) {
        bitField0_ |= 0x00000002;
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 param = 2;</code>
       *
       * <pre>
       *参数
       * </pre>
       */
      public Builder clearParam() {
        bitField0_ = (bitField0_ & ~0x00000002);
        param_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:TeamOptionMsg)
    }

    static {
      defaultInstance = new TeamOptionMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:TeamOptionMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TeamOptionMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TeamOptionMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023TeamOptionMsg.proto\".\n\rTeamOptionMsg\022\016" +
      "\n\006option\030\001 \001(\005\022\r\n\005param\030\002 \001(\005B;\n%com.chu" +
      "angyou.common.protobuf.pb.teamB\022TeamOpti" +
      "onMsgProto"
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
    internal_static_TeamOptionMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TeamOptionMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_TeamOptionMsg_descriptor,
        new java.lang.String[] { "Option", "Param", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
