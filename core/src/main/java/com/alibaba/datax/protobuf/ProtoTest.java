package com.alibaba.datax.protobuf;

import com.google.protobuf.ByteString;

/**
 * @author liuweidong03 <liuweidong03@kuaishou.com>
 * Created on 2021-10-12
 */
public class ProtoTest {

    public static void main(String[] args) {

        BufferOuterClass.ProtobufColumn protobufColumn = BufferOuterClass.ProtobufColumn.newBuilder()
                .setType(BufferOuterClass.ProtobufColumn.ProtobufType.BOOL)
                .setRawData(ByteString.EMPTY)
                .setByteSize(1)
                .build();

        BufferOuterClass.ProtobufRecord protobufRecord = BufferOuterClass.ProtobufRecord.newBuilder()
                .addColumns(protobufColumn)
                .setByteSize(1)
                .setMemorySize(2)
                .build();


        BufferOuterClass.Buffer build = BufferOuterClass.Buffer.newBuilder()
                .addBuffer(protobufRecord)
                .build();

        byte[] bytes = build.toByteArray();
    }
}
