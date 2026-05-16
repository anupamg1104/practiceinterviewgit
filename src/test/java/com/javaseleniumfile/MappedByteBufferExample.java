package com.javaseleniumfile;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedByteBufferExample {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("./src/main/resources/readfile.txt", "r")) {
            FileChannel channel = file.getChannel();
            MappedByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            for (int i = 0; i < buffer.limit(); i++) {
                System.out.print((char) buffer.get());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

