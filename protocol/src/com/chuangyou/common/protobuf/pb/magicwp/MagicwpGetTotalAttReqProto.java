// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: magicwp/MagicwpGetTotalAttReqMsg.proto

package com.chuangyou.common.protobuf.pb.magicwp;

public final class MagicwpGetTotalAttReqProto {
  private MagicwpGetTotalAttReqProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MagicwpGetTotalAttReqMsgOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MagicwpGetTotalAttReqMsg)
      com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code MagicwpGetTotalAttReqMsg}
   */
  public static final class MagicwpGetTotalAttReqMsg extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:MagicwpGetTotalAttReqMsg)
      MagicwpGetTotalAttReqMsgOrBuilder {
    // Use MagicwpGetTotalAttReqMsg.newBuilder() to construct.
    private MagicwpGetTotalAttReqMsg(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MagicwpGetTotalAttReqMsg(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MagicwpGetTotalAttReqMsg defaultInstance;
    public static MagicwpGetTotalAttReqMsg getDefaultInstance() {
      return defaultInstance;
    }

    public MagicwpGetTotalAttReqMsg getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MagicwpGetTotalAttReqMsg(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
      return com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.internal_static_MagicwpGetTotalAttReqMsg_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.internal_static_MagicwpGetTotalAttReqMsg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg.class, com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg.Builder.class);
    }

    public static com.google.protobuf.Parser<MagicwpGetTotalAttReqMsg> PARSER =
        new com.google.protobuf.AbstractParser<MagicwpGetTotalAttReqMsg>() {
      public MagicwpGetTotalAttReqMsg parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MagicwpGetTotalAttReqMsg(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MagicwpGetTotalAttReqMsg> getParserForType() {
      return PARSER;
    }

    private void initFields() {
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
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
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

    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg prototype) {
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
     * Protobuf type {@code MagicwpGetTotalAttReqMsg}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MagicwpGetTotalAttReqMsg)
        com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsgOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.internal_static_MagicwpGetTotalAttReqMsg_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.internal_static_MagicwpGetTotalAttReqMsg_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg.class, com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg.Builder.class);
      }

      // Construct using com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg.newBuilder()
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
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.internal_static_MagicwpGetTotalAttReqMsg_descriptor;
      }

      public com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg getDefaultInstanceForType() {
        return com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg.getDefaultInstance();
      }

      public com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg build() {
        com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg buildPartial() {
        com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg result = new com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg) {
          return mergeFrom((com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg other) {
        if (other == com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg.getDefaultInstance()) return this;
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
        com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.chuangyou.common.protobuf.pb.magicwp.MagicwpGetTotalAttReqProto.MagicwpGetTotalAttReqMsg) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MagicwpGetTotalAttReqMsg)
    }

    static {
      defaultInstance = new MagicwpGetTotalAttReqMsg(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:MagicwpGetTotalAttReqMsg)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MagicwpGetTotalAttReqMsg_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_MagicwpGetTotalAttReqMsg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&magicwp/MagicwpGetTotalAttReqMsg.proto" +
      "\"\032\n\030MagicwpGetTotalAttReqMsgBF\n(com.chua" +
      "ngyou.common.protobuf.pb.magicwpB\032Magicw" +
      "pGetTotalAttReqProto"
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
    internal_static_MagicwpGetTotalAttReqMsg_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MagicwpGetTotalAttReqMsg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_MagicwpGetTotalAttReqMsg_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
