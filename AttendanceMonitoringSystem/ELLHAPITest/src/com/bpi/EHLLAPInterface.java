package com.bpi;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/**
 * Created by Bear on 16/09/2016.
 */
public interface EHLLAPInterface extends Library {

	EHLLAPInterface INSTANCE = null;

	NativeLong hllapi(IntBuffer functionNumber, ByteBuffer dataBuffer, IntBuffer bufferLength, IntBuffer returnCode);
}
